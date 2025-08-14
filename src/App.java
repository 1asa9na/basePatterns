public class App {
    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Runnable inc = new Runnable() {
            @Override
            public void run() {
            for(int i = 0; i < 100; i++)
                try {
                    Thread.sleep(100);
                    counter.handleEvent(Event.INCREASE_STATE);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable dec = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(100);
                        counter.handleEvent(Event.DECREASE_STATE);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            };
        };
        Runnable printer = new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(500);
                        System.out.println("Current count: " + counter.getCount());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        Thread incThread = new Thread(inc);
        Thread decThread = new Thread(dec);
        Thread printerThread = new Thread(printer);

        decThread.start();
        incThread.start();
        printerThread.start();

        incThread.join();
        decThread.join();
        printerThread.interrupt();
    }
}
