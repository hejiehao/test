public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + "Progress: " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
