package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       public class SharingAResource implements Runnable
        {
            // Each thread will have a different message
            private String message;
            private int pause; // in seconds

            // Each thread gets its message and pause time
            // when its created
            SharingAResource(String m, int p)
            {
                message = m;
                pause = p * 1000;
            }

        }
        public void run()
        {
            // Print the message to the screen 10 times
            for (int i = 0;i < 10;i++)
            {
                try {
                    Thread.sleep(pause);
                } catch(InterruptedException e) {return;}

                System.out.println(message);

            }
        }
    }

}
