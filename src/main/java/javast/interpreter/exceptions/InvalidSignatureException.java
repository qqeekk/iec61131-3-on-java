package javast.interpreter.exceptions;

import javast.sablecc.node.Node;
import javast.sablecc.node.Token;

public class InvalidSignatureException extends RuntimeException
{
    public InvalidSignatureException(String message, Token token) {
        super(format(message, token));
    }

    public InvalidSignatureException(String message, Token token, Throwable cause) {
        super(format(message, token), cause);
    }

    private static String format(String message, Token token){
        return "Line %d, pos %d: %s".formatted(token.getLine(), token.getPos(), message);
    }
}
