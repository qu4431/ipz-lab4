package work4;

public class Main{
    static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();//creating publisher

        Subscriber reader1 = new Reader("Test reader 1");
        Subscriber reader2 = new Reader("Test reader 2");
        Subscriber reader3 = new Reader("Test reader 3");

        Subscriber agency1 = new MediaAgency("Test agency 1");
        Subscriber agency2 = new MediaAgency("Test agency 2");

        Subscriber portal1 = new OnlinePortal("Test portal 1");
        Subscriber portal2 = new OnlinePortal("Test portal 2");

        publisher.addSubscriber(reader1);
        publisher.addSubscriber(reader2);
        publisher.addSubscriber(reader3);
        publisher.addSubscriber(agency1);
        publisher.addSubscriber(agency2);
        publisher.addSubscriber(portal1);
        publisher.addSubscriber(portal2);

        publisher.publish("NEWS1");

        System.out.println();

        publisher.removeSubscriber(reader1);

        publisher.publish("NEWS2");

    }
}
