public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Dang khoi tao " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Dang chay " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Luong: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Luong " + threadName + " Bi gian doan.");
        }
        System.out.println("Luong " + threadName + " da thoat.");
    }

    public void start() {
        System.out.println("Bat dau " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
