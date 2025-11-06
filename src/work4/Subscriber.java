package work4;

/**
 * Цей клас слугує підписником у патерні Observer.
 * Підписник визначає інтерфейс, яким користується видавець для надсилання сповіщень.
 */

public interface Subscriber {
    /**
     * Метод update, що розсилає сповіщення.
     * @param news новина(и)
     */
    void update(String news);
}
