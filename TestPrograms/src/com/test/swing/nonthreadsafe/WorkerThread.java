package com.test.swing.nonthreadsafe;

import java.util.Random;

import javax.swing.DefaultListModel;

class WorkerThread extends Thread { 
    public WorkerThread(DefaultListModel aModel) { 
        model = aModel; 
        generator = new Random(); 
    } 

    /*public void run() { 
        while (true) { 
            Integer i = 
                new Integer(generator.nextInt(10)); 

            if (model.contains(i)) 
                model.removeElement(i); 
            else 
                model.addElement(i); 

            yield(); 
        } 
    } */
    public void run() { 
    	int i=0;
        while (i < 1000) { 
            Integer i1 = 
                new Integer(i); 

            if (i % 2 ==0) 
                model.removeElement(i1); 
            else 
                model.addElement(i1); 
            i++; 
        } 
    } 
    private DefaultListModel model; 
    private Random generator; 
} 

