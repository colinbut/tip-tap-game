package com.mycompany.tiptap;

import com.mycompany.tiptap.multiplayer.Tap2;
import com.mycompany.tiptap.singleplayer.Tap;

/**
 * Tap app
 *
 * @author colin
 */
public class App {

    public void singlePlayerMode() {
        Tap tap = new Tap();
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tap.tap();
            System.out.println(tap.getCounter());
        }
    }

    public void multiPlayerMode() {
        Tap2 tap2 = new Tap2();

        class TappingTask implements Runnable {

            private Tap2 tap2;
            private String playerName;

            TappingTask(Tap2 tap2, String name){
                this.tap2 = tap2;
                playerName = name;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tap2.tap();
                    System.out.println(playerName + ":" + tap2.getCounter());
                }
            }
        }

        Thread player1 = new Thread(new TappingTask(tap2, "Joe"));
        Thread player2 = new Thread(new TappingTask(tap2, "Rebecca"));
        Thread player3 = new Thread(new TappingTask(tap2, "Allison"));
        Thread player4 = new Thread(new TappingTask(tap2, "Paul"));

        player1.start();
        player2.start();
        player3.start();
        player4.start();
    }



    public static void main( String[] args ) {
        App app = new App();
        app.multiPlayerMode();
    }
}
