package work4;

import java.util.ArrayList;
/**
 * Цей клас слугує конкретним підписником у патерні Observer.
 * Конкретні підписники виконують щось у відповідь на сповіщення, яке надійшло від видавця.
 */
public class MediaAgency implements Subscriber {
    private ArrayList<String> archive = new ArrayList<>();
    private String name;
    /**
     * Створення обʼєкту читача.
     * @param name імʼя підписника
     */
    public MediaAgency(String name){
        this.name = name;
    }
    @Override
    /**
     * Метод update, що розсилає сповіщення.
     * @param news новина(и)
     */
    public void update(String news){
        System.out.println("+MediaAgency "+ this.name);//check if agency got news
        toArchive(news);//archiving
    }

    /**
     * Метод для архівування новин.
     * @param news новина(и)
     */
    private void toArchive(String news){
        archive.add(news);
        System.out.println("+archive "+ this.name);//check if agency archiving news
    }
}
