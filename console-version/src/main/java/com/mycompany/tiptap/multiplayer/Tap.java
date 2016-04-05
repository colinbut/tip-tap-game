/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.tiptap.multiplayer;

/**
 * @author colin
 */
public class Tap {

    private volatile int counter;

    public void tap(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
