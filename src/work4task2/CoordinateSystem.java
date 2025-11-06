package work4task2;

import java.util.function.Function;

/**
 * Інтерфейс, що виконує роль стратегії у шаблоні Strategy.
 * Стратегія визначає інтерфейс, спільний для всіх варіацій алгоритму.
 * Контекст використовує цей інтерфейс для виклику алгоритму.
 */
public interface CoordinateSystem {
    /**
     * Алгоритм малювання графіку функції
     */
    void plot(Function<Double, Double> function, double start, double end);
}
