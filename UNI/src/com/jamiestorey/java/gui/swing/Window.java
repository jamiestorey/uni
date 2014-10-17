
package com.jamiestorey.java.gui.swing;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public Window() {
		JFrame frame = new JFrame("A Window");
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
