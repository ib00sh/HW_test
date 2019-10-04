public class Calculator {
//    public Calculator(int precision) {
//        throw new UnsupportedOperationException("You need to implement this method");
//    }

    public double add(double a, double b) {
        return a+b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double div(double a, double b) {
        double result = 0;
        if (b != 0) {
            result = a / b;
        }
        else {
            System.out.println("Attention! division by zero");
        }
        return result;
    }

}
