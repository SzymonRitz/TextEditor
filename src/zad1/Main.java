/**
 *
 *  @author Ritz Szymon S12910
 *
 */

package zad1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Main {

  public static void main(String[] args) {
	  JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout bl = new BorderLayout();

		JPanel p;

		FlowLayout fL = new FlowLayout();

		String tmp = JOptionPane.showInputDialog("podaj layout");

		switch (tmp) {
		case "a":
			p = new JPanel(bl);
			p.setVisible(true);
			JButton button = new JButton("Przycisk 1");
			p.add(button, BorderLayout.PAGE_START);
			button = new JButton("P 2");
			button.setPreferredSize(new Dimension(200, 100));
			p.add(button, BorderLayout.CENTER);
			button = new JButton("Wiêkszy przycisk numer 3");
			p.add(button, BorderLayout.LINE_START);
			button = new JButton("Przycisk 4");
			p.add(button, BorderLayout.PAGE_END);
			button = new JButton("P5");
			p.add(button, BorderLayout.LINE_END);

			frame.add(p);

			break;
		case "b":
			p = new JPanel(fL);
			p.setVisible(true);

			JButton button1 = new JButton("Przycisk 1");
			p.add(button1);
			button1 = new JButton("P 2");
			p.add(button1);
			button1 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button1);
			button1 = new JButton("Przycisk 4");
			p.add(button1);
			button1 = new JButton("P5");
			p.add(button1);
			frame.add(p);
			break;
		case "c":

			p = new JPanel(new FlowLayout(FlowLayout.LEFT));
			p.setVisible(true);
			JButton button2 = new JButton("Przycisk 1");
			p.add(button2);
			button2 = new JButton("P 2");
			p.add(button2);
			button2 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button2);
			button2 = new JButton("Przycisk 4");
			p.add(button2);
			button2 = new JButton("P5");
			p.add(button2);
			frame.add(p);
			break;
		case "d":

			p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			p.setVisible(true);
			JButton button3 = new JButton("Przycisk 1");
			p.add(button3);
			button3 = new JButton("P 2");
			p.add(button3);
			button3 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button3);
			button3 = new JButton("Przycisk 4");
			p.add(button3);
			button3 = new JButton("P5");
			p.add(button3);
			frame.add(p);

			break;
		case "e":

			GridLayout gridLayout = new GridLayout(1, 0);
			p = new JPanel(gridLayout);
			p.setVisible(true);
			JButton button4 = new JButton("Przycisk 1");
			p.add(button4);
			button4 = new JButton("P 2");
			p.add(button4);
			button4 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button4);
			button4 = new JButton("Przycisk 4");
			p.add(button4);
			button4 = new JButton("P5");
			p.add(button4);
			frame.add(p);
			break;

		case "f":

			GridLayout gridLayout1 = new GridLayout(0, 1);
			p = new JPanel(gridLayout1);
			p.setVisible(true);
			JButton button5 = new JButton("Przycisk 1");
			p.add(button5);
			button5 = new JButton("P 2");
			p.add(button5);
			button5 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button5);
			button5 = new JButton("Przycisk 4");
			p.add(button5);
			button5 = new JButton("P5");
			p.add(button5);
			frame.add(p);

			break;
		case "g":
			GridLayout gridLayout2 = new GridLayout(3, 2);
			p = new JPanel(gridLayout2);
			p.setVisible(true);
			JButton button6 = new JButton("Przycisk 1");
			p.add(button6);
			button6 = new JButton("P 2");
			p.add(button6);
			button6 = new JButton("Wiêkszy przycisk numer 3");
			p.add(button6);
			button6 = new JButton("Przycisk 4");
			p.add(button6);
			button6 = new JButton("P5");
			p.add(button6);
			frame.add(p);

			break;

		default:
			break;
		}

		frame.pack();

		frame.setVisible(true);
  }
}
