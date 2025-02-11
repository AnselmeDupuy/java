public class Calculatrice {
    
    private int add(int a, int b) {
        return a + b;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private int sous(int a, int b) {
        return a - b;
    }

    private double sous(double a, double b) {
        return a - b;
    }

    private int divid(int a, int b) {
        return a / b;
    }

    private double divid(double a, double b) {
        return a / b;
    }

    private int multi(int a, int b) {
        return a * b;
    }

    private double multi(double a, double b) {
        return a * b;
    }

    public double calculate(String operation, double a, double b) {
        switch (operation) {
            case "+":
                return add(a, b);
            case "-":
                return sous(a,b);
            case "/":
                return divid(a, b);
            case "*":
                return multi(a, b);
            case "!":
                System.out.println("nUll");
            default:
                return 0.0;
        }
    }
}


