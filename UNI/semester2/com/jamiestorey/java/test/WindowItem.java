
package com.jamiestorey.java.test;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowItem extends JFrame
{

	private Dimension size;
	private JPanel panel;
	private static final long serialVersionUID = 1L;

	public WindowItem()
	{
		super("Cookies");
		size = new Dimension(200, 300);
		panel = new JPanel();

		add(panel);
		panel.setBackground(Color.BLUE);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.BLUE);

		setSize(size);
		setPreferredSize(size);
		setLocationRelativeTo(null);
		pack();
		setVisible(true);
	}
}
