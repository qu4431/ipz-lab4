package work4;

/**
 * Цей клас слугує конкретним підписником у патерні Observer.
 * Конкретні підписники виконують щось у відповідь на сповіщення, яке надійшло від видавця.
 */
public class Reader implements Subscriber{
    private String name;

    /**
     * Створення обʼєкту читача.
     * @param name імʼя підписника
     */
    public Reader(String name) {
        this.name = name;
    }
    /**
     * Метод update, що розсилає сповіщення.
     * @param news новина(и)
     */
    @Override
    public void update(String news){
        System.out.println("+reader "+this.name);//check if reader got news
    }
}
