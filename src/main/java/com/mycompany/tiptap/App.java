package com.mycompany.tiptap;

/**
 * Tap
 *
 */
public class App {

    private int tapCounter = 1;

    public int tap() {
        return tapCounter++;
    }


    /**
     * Main method
     *
     * @param args
     */
    public static void main( String[] args ) throws InterruptedException {
        App app = new App();
        while (true) {
            Thread.sleep(1000);
            System.out.println(app.tap());
        }
    }
}
