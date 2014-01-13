package com.test.swing.mvc;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.text.Document;

public class TestMvcFrame extends JFrame{
	public void launch()
	{
		JTextArea textArea1 = new JTextArea();
		Document model = textArea1.getDocument();
		JTextArea textArea2 = new JTextArea();
		textArea2.setDocument(model);
		JScrollPane panel1 = new JScrollPane(textArea1);
		JScrollPane panel2 = new JScrollPane(textArea2);
		JComboBox jcom = getCombo();
		setLayout(new GridLayout(3,0));
		setSize(300,400);
		Container container = getContentPane();
		container.add(panel1);
		container.add(panel2);
		container.add(jcom);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	private JComboBox getCombo(){
		Object [] obj = new Object[] {"hi","hello"};
		JComboBox jcom = new JComboBox(obj);
		jcom.setBackground(Color.red);
		jcom.setOpaque(true);
		ComboBoxRenderer com = new ComboBoxRenderer();
		jcom.setRenderer(com);
		return jcom;
	}
	private class ComboBoxRenderer extends JLabel implements ListCellRenderer{
		 public ComboBoxRenderer() {
	         setOpaque(true);
	     }
		 
		 public Component getListCellRendererComponent(
		         JList list,
		         Object value,
		         int index,
		         boolean isSelected,
		         boolean cellHasFocus)
	     {
	         setText(value.toString());
	         setBackground(isSelected ? Color.red : Color.white);
	         setForeground(isSelected ? Color.white : Color.black);
	         return this;
	     }
	}
}
