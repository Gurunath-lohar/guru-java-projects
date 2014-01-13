package com.test.swing.nonthreadsafe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

class TestFrame extends JFrame { 
    public TestFrame() { 
        setTitle("Bad Thread Example"); 
        setSize(400,300); 
        setDefaultCloseOperation( 
                JFrame.EXIT_ON_CLOSE); 
        model = new DefaultListModel(); 

        JList list = new JList(model); 
        JScrollPane scrollPane = 
                new JScrollPane(list); 

        JPanel p = new JPanel(); 
        p.add(scrollPane); 
        getContentPane().add(p, "Center"); 

        JButton b = new JButton("Fill List"); 
        b.addActionListener(new ActionListener() { 
            public void actionPerformed( 
                    ActionEvent event) { 
                new WorkerThread(model).start(); 
            } 
        }); 
        p = new JPanel(); 
        p.add(b); 
        getContentPane().add(p, "North"); 
    } 

    private DefaultListModel model; 
} 
