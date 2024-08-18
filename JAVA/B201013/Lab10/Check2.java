/*2. Write a program where the consumer thread checks the data production status [ is
over or not ] for every 10 ms.
 */
package B201013.Lab10;

// public class Check2 {
    
// }

import java.util.concurrent.atomic.AtomicBoolean;

class ConsumerThread extends Thread {
    private AtomicBoolean isProductionOver;

    public ConsumerThread(AtomicBoolean isProductionOver) {
        this.isProductionOver = isProductionOver;
    }

    @Override
    public void run() {
        while (!isProductionOver.get()) {
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Checking data production status...");
        }
        System.out.println("Data production is over. Exiting consumer thread.");
    }
}

public class Check2 {
    public static void main(String[] args) {
        AtomicBoolean isProductionOver = new AtomicBoolean(false);
        
        ConsumerThread consumer = new ConsumerThread(isProductionOver);
        consumer.start();

        // Simulate data production being over after some time
        try {
            Thread.sleep(5000); // Simulating 5 seconds of data production
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isProductionOver.set(true);
    }
}
