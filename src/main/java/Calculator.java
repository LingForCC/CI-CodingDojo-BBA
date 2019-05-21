

public class Calculator {

    public int calculate(String operation, int i, int j) {
        if(operation.equals("add")) {
            return i + j;
        }
        if(operation.equals("substract")) {
            return i - j;
        }

        if(operation.equals("multiply")) {
            return i * j;
        }

        if(operation.equals("divide")) {
            if(j == 0) {
                throw new RuntimeException("The second parameter can not be 0!");
            }
            return i/j;
        }

        throw new RuntimeException("Unsupported Operation" + operation);
    }

}
