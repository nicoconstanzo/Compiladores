package compiler;

import compiler.tree.*;
import org.antlr.runtime.RecognitionException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 */
public class Compiler {
    public static void main(String[] args)
        throws IOException, RecognitionException
    {
        Compiler compiler = new Compiler();

        // Validate arguments
        if (args.length == 0) {
            System.out.println("Please, specify some files to compile...");
            System.exit(1);
        }

        // Process each file
        for (String arg : args) {
            FileReader file = new FileReader(arg);
            try {
                Node ast = compiler.parse(file, true);
                System.out.println("TREE:\n" + ast + "\n");
            }
            finally {
                file.close();
            }
        }
    }

    protected Node parse(String code, boolean abortOnError)
        throws IOException, RecognitionException
    {
        return parse(new StringReader(code), abortOnError);
    }

    protected Node parse(Reader reader, boolean abortOnError)
        throws IOException, RecognitionException
    {
        MyParser parser = new MyParser(reader);
        MyParser.program_return program = parser.program();

        if (abortOnError && parser.getError() != null) {
            throw parser.getError();
        }

        return (Node) program.getTree();
    }
}
