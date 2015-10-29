package com.test.swing.threadsafe;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import javax.swing.DefaultListModel;

class WorkerThread extends Thread { 
    public WorkerThread(DefaultListModel aModel) { 
        model = aModel; 
        generator = new Random(); 
    } 

    public void run() {     	
        while (i < 1000) { 
            final Integer i1 = 
                new Integer(i); 
            try {
				EventQueue.invokeAndWait(new Runnable() { 
				    public void run() { 
				    	if (i % 2 ==0) 
				            model.removeElement(i1); 
				        else 
				            model.addElement(i1); 
				    } 
				});
			} catch (InterruptedException e) {				
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} 
            
            i++; 
        } 
    } 
    int i=0;
    private DefaultListModel model; 
    private Random generator; 
} 
