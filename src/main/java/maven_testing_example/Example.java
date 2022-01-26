package maven_testing_example;

public class Example {
    public static int doOperation(final int opCode,
                                  final int operand1,
                                  final int operand2) throws InvalidOpCodeException {
        if (opCode == 0) {
            // addition
            return operand1 + operand2;
        } else if (opCode == 1) {
            return operand1 - operand2;
        } else if (opCode == 2) {
            return operand1 * operand2;
        } else if (opCode == 3) {
            return operand1 / operand2;
        } else {
            throw new InvalidOpCodeException(opCode);
        }
    } // doOperation
} // Example

