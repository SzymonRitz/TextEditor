/**
 *
 *  @author Ritz Szymon S12910
 *
 */

package zad2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {

		JMenuBar menu = new JMenuBar();
		JMenu font = new JMenu("Czcionka");
		JButton backgroundMenu = new JButton("Kolor tła");
		JMenuItem letter = new JMenuItem("Kolor czcionki");
		JMenuItem letterSize = new JMenuItem("Rozmiar czcionki");
		JCheckBox boldBox = new JCheckBox("Pogrubiona");
		JCheckBox italicBox = new JCheckBox("Pochyła");
		JCheckBox underlinedBox = new JCheckBox("Podkreślona");

		menu.add(font);
		menu.add(backgroundMenu);
		font.add(letter);
		font.add(letterSize);
		font.addSeparator();
		font.add(boldBox);
		font.add(italicBox);
		font.add(underlinedBox);
		JFrame f = new JFrame("JColorChooser Sample");
		f.setJMenuBar(menu);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = f.getContentPane();
		JTextArea area = new JTextArea();

		ActionListener background = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Color initialBackground = area.getBackground();
				Color backgroundColour = JColorChooser.showDialog(null,
						"JColorChooser Sample", initialBackground);
				if (backgroundColour != null) {
					area.setBackground(backgroundColour);
				}
			}
		};

		ActionListener letterColour = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				Color initialBackground = area.getForeground();
				Color colour = JColorChooser.showDialog(null,
						"JColorChooser Sample", initialBackground);
				if (colour != null) {
					area.setForeground(colour);
				}
			}
		};

		ActionListener lettersize = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {

				String tmp = JOptionPane
						.showInputDialog("Podaj rozmiar czcionki");
				int size = Integer.parseInt(tmp);

				Font f = area.getFont();
				Font f2 = new Font(f.getFontName(), f.getStyle(), size);
				area.setFont(f2);
			}
		};

		ItemListener handler = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				JLabel label = new JLabel("Underlined Label");
				Font font = label.getFont();

				Font f = area.getFont();
				if (boldBox.isSelected()) {
					f = new Font(f.getName(), Font.BOLD, f.getSize());
					area.setFont(f);
				} else if (italicBox.isSelected()) {
					f = new Font(f.getName(), Font.ITALIC, f.getSize());
					area.setFont(f);
				} else if (underlinedBox.isSelected()) {
					f = area.getFont();
					Map<TextAttribute, Object> map = new HashMap<TextAttribute, Object>();
					map.put(TextAttribute.FONT, f);
					map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
					f = Font.getFont(map);
					area.setFont(f);

				}

				else if (boldBox.isSelected() && italicBox.isSelected()) {
					f = new Font(f.getName(), Font.BOLD + Font.ITALIC,
							f.getSize());
					area.setFont(f);
				}

				else
					f = new Font(f.getName(), Font.PLAIN, f.getSize());

				area.setFont(f);

			}
		};

		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
		underlinedBox.addItemListener(handler);

		backgroundMenu.addActionListener(background);
		letterSize.addActionListener(lettersize);
		letter.addActionListener(letterColour);
		content.add(area, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

}
