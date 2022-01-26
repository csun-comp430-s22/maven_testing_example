package maven_testing_example;

public class InvalidOpCodeException extends Exception {
    // ---BEGIN INSTANCE VARIABLES---
    public final int opCode;
    // ---END INSTANCE VARIABLES---
    
    public InvalidOpCodeException(final int opCode) {
        super("Invalid op code: " + opCode);
        this.opCode = opCode;
    }
} // InvalidOpCodeException

