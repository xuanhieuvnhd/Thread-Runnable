public class Main {
    public static void main(String[] args) {
        System.out.println("Main dang chay....... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Luong-1-gui-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Luong-2-gui-Email");
        runnableDemo2.start();

        System.out.println("Luong main da dung");
    }
}
