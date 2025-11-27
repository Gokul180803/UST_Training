class WorkerThread extends Thread {
    private String threadName;

    public WorkerThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        System.out.println(threadName + " has started.");

        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " is performing part " + i + " of 3");

            try {
                Thread.sleep(500); // simulate work for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }

            // Yield after second iteration for Processor A
            if (i == 2 && threadName.equals("Processor A")) {
                System.out.println(threadName + " is yielding...");
                Thread.yield();
            }
        }

        System.out.println(threadName + " has finished.");
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
        WorkerThread threadA = new WorkerThread("Processor A");
        WorkerThread threadB = new WorkerThread("Processor B");
        WorkerThread threadC = new WorkerThread("Processor C");

        // Start all threads
        threadA.start();
        threadB.start();
        threadC.start();

        try {
            System.out.println("Main thread waiting for Processor A...");
            threadA.join();
            System.out.println("Processor A has completed. Main thread resumes.");

            System.out.println("Main thread waiting for Processor B...");
            threadB.join();
            System.out.println("Processor B has completed. Main thread resumes.");

            // Introduce 2-second delay after A and B are done
            System.out.println("Main thread introducing a 2-second delay...");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("All critical processors (A and B) have finished, and the main thread is continuing.");
    }
}
