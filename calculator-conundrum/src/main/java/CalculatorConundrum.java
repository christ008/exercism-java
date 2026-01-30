class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");

        if (operation.equals("")) throw new IllegalArgumentException("Operation cannot be empty");

        var result = switch (operation) {
            case "+" -> operand1 + operand2;
            case "*" -> operand1 * operand2;
            case "/" -> {
                try {
                    yield operand1 / operand2;    
                } catch (ArithmeticException ex) {
                    throw new IllegalOperationException("Division by zero is not allowed", ex);
                }
            }
            default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        };

        return String.format("%d %s %d = %s", operand1, operation, operand2, result);
    }
}
