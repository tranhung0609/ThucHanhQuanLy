package demomenu;

public class Demo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Hết giờ rồi bé êiiii");
    }
}
