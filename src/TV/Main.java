package TV;

public class Main {
    public static void main(String[] args) {
        System.out.println("TV.TV 1");
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        System.out.println("TV.TV 2");
        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();
    }
}