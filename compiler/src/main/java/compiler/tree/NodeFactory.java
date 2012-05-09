package compiler.tree;

import compiler.MyLexer;

import org.antlr.runtime.Token;

public class NodeFactory {
    public static Node create(Token token) {
        Node node;

        if (token == null) {
            node = new Node(null);
        }
        else {
            switch (token.getType()) {
//                case MyLexer.ADD:
//                    node = new Add(token);
//                    break;
                case MyLexer.EOF:
                    node = new Program(token);
                    break;
                default:
                    node = new Node(token);
            }
        }


        return node;
    }
}
