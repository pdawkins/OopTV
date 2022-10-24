import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.printInfo();

        System.out.print("Enter a new channel: ");
        int newChannel = input.nextInt();
        tv1.setChannel(newChannel);
        tv1.printInfo();
        tv1.channelUp();
        tv1.volumeUp();
        System.out.println("After a channel up and volume up");
        tv1.printInfo();


        System.out.println();
        TV tv2  = new TV();
        tv2.printInfo();

    }
}