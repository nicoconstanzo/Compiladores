package compiler.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class Node extends CommonTree {
    public Node(Token token) {
        super(token);
    }

    public Node getChild(int i) {
        return (Node) super.getChild(i);
    }

    public void toString(StringBuilder builder, String indent) {
        builder.append(indent);
        builder.append(getClass().getSimpleName());
        builder.append("<").append(getText()).append(">");
        builder.append('\n');

        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            getChild(i).toString(builder, indent + "   ");
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        toString(builder, "");

        return builder.toString();
    }
}
