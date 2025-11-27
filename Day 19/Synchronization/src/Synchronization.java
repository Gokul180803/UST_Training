class SharedCounter {
    private int count = 0;

    // Not synchronized → race condition
    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterTask implements Runnable {
    private SharedCounter counter;

    public CounterTask(SharedCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new CounterTask(counter));
            threads[i].start();
        }

        // Wait for all threads
        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final count (without sync): " + counter.getCount());
    }
}
