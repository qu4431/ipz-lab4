package work4task2;

import java.util.function.Function;

/**
 * Клас, що виконує роль контексту у шаблоні Strategy.
 * Контекст зберігає посилання на об’єкт конкретної стратегії, працюючи з ним через загальний інтерфейс стратегій.
 */
public class MathFunction {
    Function<Double, Double> function;
    CoordinateSystem coordinateSystem;

    /**
     * Створення обʼєкту функції
     * @param function функція
     */
    public MathFunction(Function<Double, Double> function) {
        this.function = function;
        this.coordinateSystem = null;
    }

    /**
     * Метод задання системи координат
     * @param coordinateSystem система координат
     */
    public void setCoordinateSystem(CoordinateSystem coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    /**
     * Метод задання функції
     * @param function функція
     */
    public void setFunction(Function<Double, Double> function) {
        this.function = function;
    }

    /**
     * Метод малювання графіку функції
     * @param start координати початку
     * @param end координати кінця
     */
    public void displayGraph(double start, double end) {
        coordinateSystem.plot(function, start, end);
    }

}
