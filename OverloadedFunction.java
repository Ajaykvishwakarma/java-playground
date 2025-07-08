// Overloaded Function sum() for Integers and Floats

public class SumOverload {
    static int sum(int a, int b) {
        return a + b;
    }

    static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Integer sum: " + sum(10, 20));
        System.out.println("Float sum: " + sum(10.5f, 5.5f));
    }
}
