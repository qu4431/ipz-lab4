package work4task2;

import java.util.function.Function;

public class Main {
    static void main(String[] args) {
        System.out.println("Default:");
        Function<Double, Double> function = Math::sin;
        MathFunction f1 = new MathFunction(function);
        f1.setCoordinateSystem(new CartesianCoordinateSystem());
        f1.displayGraph(0,Math.PI);
        f1.setCoordinateSystem(new PolarCoordinateSystem());
        f1.displayGraph(0,Math.PI);
        // /\ - def;  \/ - dynamic
        System.out.println("\nDynamic:");
        f1.setCoordinateSystem(new CartesianCoordinateSystem());
        f1.displayGraph(0,100);
        f1.setCoordinateSystem(new PolarCoordinateSystem());
        f1.displayGraph(100,400);
    }
}
