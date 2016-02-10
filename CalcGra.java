import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalcGra extends Calc
{
	private JFrame FRMTASCHENRECHNER;
	private static JTextField txtTextfeld;
	String S = JOptionPane.showInputDialog("Geben Sie Ihren Namen ein :-)");

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					String S1 = JOptionPane
							.showInputDialog("Geben Sie das Passwort ein");
					int PASSWORTEINGABE = Integer.parseInt(S1);
					int PASSWORT = (int)F;
					if (PASSWORT == PASSWORTEINGABE)
					{
						JOptionPane.showMessageDialog(null,
								"Passwort akzeptiert!");
					}
					else
					{
						System.err
								.println("Bitte richtiges Passwort eingeben!");
						JOptionPane.showMessageDialog(null,
								"Falsches Passwort!");
						System.exit(0);
					}
					CalcGra window = new CalcGra();
					window.FRMTASCHENRECHNER.setVisible(true);
				}
				catch (NullPointerException e)
				{
					JOptionPane.showMessageDialog(null, "Fehler!");
				}
				catch (NumberFormatException e)
				{
					System.err.println("Keine Eingabe getätigt!");
					System.exit(0);
				}
			}
		});
	}

	public CalcGra()
	{
		initialize();
	}

	private void initialize()
	{
		FRMTASCHENRECHNER = new JFrame();
		FRMTASCHENRECHNER.setResizable(false);
		FRMTASCHENRECHNER.setTitle("Berechnungsprogramm " + (char) 169);
		FRMTASCHENRECHNER.setBackground(new Color(255, 69, 0));
		FRMTASCHENRECHNER.getContentPane().setBackground(new Color(255, 69, 0));
		FRMTASCHENRECHNER.setBounds(100, 100, 450, 300);
		FRMTASCHENRECHNER.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button_1 = new JButton("n!");
		button_1.setBounds(149, 235, 49, 25);
		button_1.setBackground(Color.WHITE);
		button_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Fakultät1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().setLayout(null);
		FRMTASCHENRECHNER.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Binomialkoeffizient");
		button_2.setBounds(268, 162, 170, 25);
		button_2.setBackground(Color.WHITE);
		button_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Binomial1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_2);

		JButton button_3 = new JButton("" + ((char) 8730));
		button_3.setBounds(6, 235, 44, 25);
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Wurzel1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_3);

		JButton btnPotenz = new JButton("Potenz");
		btnPotenz.setBounds(210, 235, 100, 25);
		btnPotenz.setBackground(Color.WHITE);
		btnPotenz.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Potenz1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(btnPotenz);

		JButton button_8 = new JButton("/");
		button_8.setBounds(62, 206, 49, 25);
		button_8.setBackground(Color.WHITE);
		button_8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Division1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_8);

		JButton button_9 = new JButton("mod");
		button_9.setBounds(62, 235, 75, 25);
		button_9.setBackground(Color.WHITE);
		button_9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Modulo1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_9);

		JLabel lblFnx = new JLabel("Fn(x)");
		lblFnx.setBounds(16, 130, 34, 15);
		FRMTASCHENRECHNER.getContentPane().add(lblFnx);

		JButton btnLogarithmusNaturalis = new JButton("Logarithmus naturalis");
		btnLogarithmusNaturalis.setBounds(246, 14, 192, 25);
		btnLogarithmusNaturalis.setBackground(Color.WHITE);
		btnLogarithmusNaturalis.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Logar1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(btnLogarithmusNaturalis);

		JButton button_5 = new JButton("+");
		button_5.setBounds(6, 175, 44, 25);
		button_5.setBackground(Color.WHITE);
		button_5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Addition1();
			}
		});

		JButton button_6 = new JButton("-");
		button_6.setBounds(62, 175, 44, 25);
		button_6.setBackground(Color.WHITE);
		button_6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Subtraktion1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_6);

		JButton button_7 = new JButton("*");
		button_7.setBounds(6, 206, 44, 25);
		button_7.setBackground(Color.WHITE);
		button_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Multiplikation1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_7);
		FRMTASCHENRECHNER.getContentPane().add(button_5);

		JButton button = new JButton("FibonacciZahlen");
		button.setBounds(57, 125, 152, 25);
		button.setBackground(new Color(220, 220, 220));
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Fibon1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button);

		JButton button_10 = new JButton("Exit");
		button_10.setBounds(357, 235, 81, 25);
		button_10.setBackground(Color.GRAY);
		button_10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Abbruch();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(button_10);

		JButton btnGausche = new JButton("Gauß'sche " + (char) 425 + "-Formel");
		btnGausche.setBounds(246, 51, 192, 25);
		btnGausche.setBackground(Color.WHITE);
		btnGausche.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Gauß1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(btnGausche);
		txtTextfeld = new JTextField();
		txtTextfeld.setBackground(Color.GRAY);
		txtTextfeld.setText(" Hey " + S + "    :-)");
		txtTextfeld.setBounds(12, 11, 215, 32);
		FRMTASCHENRECHNER.getContentPane().add(txtTextfeld);
		txtTextfeld.setColumns(10);
		
		JButton btnNewButton = new JButton("Obere Gaußklammer");
		btnNewButton.setBounds(246, 88, 192, 25);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Gaußklammer1();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Untere Gaußklammer");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(246, 125, 192, 25);
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Gaußklammer2();
			}
		});
		FRMTASCHENRECHNER.getContentPane().add(btnNewButton_1);

	}
}
