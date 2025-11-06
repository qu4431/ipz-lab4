package work4;

import java.util.ArrayList;

/**
 * Цей клас слугує видавцем у патерні Observer.
 * Видавець володіє внутрішнім станом, зміни якого цікаво відстежувати підписникам.
 * Видавець містить механізм підписки: список підписників та методи підписки/відписки.
 */
public class NewsPublisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    /**
     * Метод додання підписника.
     * @param subscriber підписник
     */
    public void addSubscriber(Subscriber subscriber){
        if(!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }
    /**
     * Метод видалення підписника.
     * @param subscriber підписник
     */
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    /**
     * Метод публікації новин(и).
     * Містить у собі виклик методу update, що розсилає сповіщення.
     * @param news новина(и)
     */
    public void publish(String news){//published news w auto-notifying subs, *no publish algorithm*
        for(Subscriber subscriber : subscribers){
            subscriber.update(news);
        }
    }
}
