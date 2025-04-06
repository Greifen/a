package bGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class AppWindow extends JFrame {

	JLabel      label_dm;
	JTextField 	textfield_dm;
	JTextField 	textfield_euro;

	JButton		button;


	public AppWindow() {
		this.getContentPane().setLayout(null);

		this.initWindow();

		this.addWindowListener(new WindowListener() {

			public void windowClosed(WindowEvent arg0) {


			}

			public void windowActivated(WindowEvent e) {


			}

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

			public void windowDeactivated(WindowEvent e) {


			}

			public void windowDeiconified(WindowEvent e) {


			}

			public void windowIconified(WindowEvent e) {


			}

			public void windowOpened(WindowEvent e) {


			}



		});

	}

	protected void initWindow() 
	{
		// Instanzieren:
		label_dm = new JLabel("DM")
		textfield_dm = new JTextField("1");
		textfield_euro = new JTextField();

		button = new JButton();
		button.setText("DM in Euro 2sksdjfksdjfksj");

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				buttonBerechneClicked();
			}

		});

		// Positionen festlegen
		
		textfield_dm.setBounds(5,10,300,25);
		textfield_euro.setBounds(5,80,500,25);

		button.setBounds(300,110,200,30);

		// Elemente dem Fenster hinzufügen:
		this.getContentPane().add(textfield_dm);
		this.getContentPane().add(textfield_euro);
		this.getContentPane().add(button);


		this.pack();
	}

	public void buttonBerechneClicked()
	{
		// Hole Zahl aus Textfeld:
		double dm = 0;
		try {
			dm = Double.parseDouble(textfield_dm.getText());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			dm = -1;
		}

		// Falls das n Okay ist:

		if (dm>=0) {
		// Rechne:
			double euro = this.dm2euro(dm);

			// Packe a in Ausgabefeld:
			NumberFormat nf = NumberFormat.getInstance();

			nf.setMaximumFractionDigits(2);

			String ausgabe = nf.format(euro);



			textfield_euro.setText(ausgabe);
		} else {
			textfield_euro.setText("Eingabe ist nicht in Ordnung.");
		}
	}

	public double dm2euro(double dm)
	{
		double euro = (dm / 1.95583);



		return euro;
	}
}