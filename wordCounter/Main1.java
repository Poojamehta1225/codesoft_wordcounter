import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


class Main1 {
	public static void main(String args[]) {
		JFrame f = new JFrame("Word Counter");
		JLabel title;
		JLabel l1, l2, l3, l4;
		JTextArea textarea;
		JButton submit, clear;
		title = new JLabel("WORD COUNTER");
		textarea = new JTextArea("");
		submit = new JButton("COUNT");
		clear = new JButton("CLEAR");
		l1 = new JLabel("Enter Your message Here :  ");
		l2 = new JLabel("Number of Words : ");
		l3 = new JLabel("Character Without Spaces :  ");
		l4 = new JLabel( "Character with Spaces :  ");

		submit.setBackground(Color.green);
		clear.setBackground(Color.orange);

		title.setFont(new Font("monospaced",Font.BOLD,35));
		title.setForeground(Color.DARK_GRAY);

		textarea.setFont(new Font("Arial", Font.PLAIN,18));
		l1.setFont(new Font("Arial", Font.BOLD,20));
		Font txtFont = new Font("Arial", Font.BOLD, 18);
		

		l2.setFont(txtFont);
        l2.setForeground(Color.cyan);

		l3.setFont(txtFont);
        l3.setForeground(Color.blue);

		l4.setFont(txtFont);
        l4.setForeground(Color.red);


		title.setBounds(160, 2, 400, 40);
		l1.setBounds(10, 80, 300, 30);
		textarea.setBounds(18, 120, 550, 330);
		l2.setBounds(10, 470, 400, 30);
		l3.setBounds(10, 500, 400, 30);
		l4.setBounds(10, 530, 400, 30);
		submit.setBounds(90, 575, 100, 50);
		clear.setBounds(375, 575, 100, 50);


		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);


		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textarea.getText().strip();
				int count = 0, i, word = 0;
				l4.setText("Character with Spaces : " + str.length());
				for (i = 0; i < str.length(); i++) {
					if (str.charAt(i) != ' ')
						count++;
					else
						word++;
				}
				l3.setText("Character Without Spaces : " + count);
				l2.setText("Number of Words : " + (word + 1));
			}
		});
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textarea.setText("");
				l2.setText("Number of Words : ");
				l3.setText("Character Without Spaces : ");
				l4.setText("Character with Spaces : ");
				
			}
		});
		f.add(title);
		f.add(l1);
		f.add(textarea);
		f.add(l2);
		f.add(l3);
        f.add(l4);
		f.add(submit);
		f.add(clear);
		f.setSize(600, 670);
		f.setResizable(false);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
        f.getContentPane().setBackground(Color.gray);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}