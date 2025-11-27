import java.util.concurrent.locks.ReentrantLock;

class SharedCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public int getCount() {
        return count;
    }

    // 1. Unsynchronized increment
    public void incrementUnsynchronized() {
        count++; // Not thread-safe
    }

    // 2. Synchronized increment
    public synchronized void incrementSynchronized() {
        count++; // Thread-safe using synchronized
    }

    // 3. Lock-based increment
    public void incrementWithLock() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

public class Locks {
    private static final int NUM_THREADS = 10;
    private static final int INCREMENTS_PER_THREAD = 10000;

    public static void main(String[] args) throws InterruptedException {
        // Scenario 1: Unsynchronized
        SharedCounter counter1 = new SharedCounter();
        runTest(counter1, "unsynchronized");

        // Scenario 2: Synchronized
        SharedCounter counter2 = new SharedCounter();
        runTest(counter2, "synchronized");

        // Scenario 3: Lock-based
        SharedCounter counter3 = new SharedCounter();
        runTest(counter3, "lock");
    }

    private static void runTest(SharedCounter counter, String mode) throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    switch (mode) {
                        case "unsynchronized":
                            counter.incrementUnsynchronized();
                            break;
                        case "synchronized":
                            counter.incrementSynchronized();
                            break;
                        case "lock":
                            counter.incrementWithLock();
                            break;
                    }
                }
            });
        }

        // Start all threads
        for (Thread t : threads) {
            t.start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        int expected = NUM_THREADS * INCREMENTS_PER_THREAD;
        int actual = counter.getCount();

        System.out.println("Mode: " + mode);
        System.out.println("Final count = " + actual);
        if (actual == expected) {
            System.out.println("Correct! Matches expected value: " + expected);
        } else {
            System.out.println(" Incorrect! Expected " + expected + " but got " + actual);
            System.out.println("Reason: Race conditions caused lost updates.");
        }
        System.out.println("-----------------------------------");
    }
}
