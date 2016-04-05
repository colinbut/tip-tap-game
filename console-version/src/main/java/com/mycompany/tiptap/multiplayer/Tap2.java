/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.tiptap.multiplayer;

/**
 * @author colin
 */
public class Tap2 {

    private int counter;

    public synchronized void tap() {
        counter++;
    }

    public synchronized int getCounter() {
        return counter;
    }

    public int getTapCount() {
        synchronized (this) {
            return counter;
        }
    }
}
