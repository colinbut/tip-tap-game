package com.mycompany.tiptap;

/**
 * Tap app
 *
 * @author colin
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Tap tap = new Tap();
        while(true) {
            Thread.sleep(1000);
            tap.tap();
            System.out.println(tap.getCounter());
        }
    }
}
