package com.stevecaboose.removelog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Removelog extends JFrame implements ActionListener{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {


		new Removelog().setVisible(true);

}
		private void SetSize() {
			setSize(400, 200);
		}
		private Removelog() { //Frame method


			//Misc Frame settings
			super("LOL Logitech Driver Remover");
			SetSize();
			setLocationRelativeTo(null);
			setResizable(false);


			setDefaultCloseOperation(EXIT_ON_CLOSE);


			//Layout

			setLayout(new FlowLayout());


			//Button

			JButton button = new JButton("Delete Logitech drivers");
			button.addActionListener(this);
			add(button);

			JLabel info = new JLabel("This tool is used to delete Logitech dll files ");
			JLabel info2 = new JLabel("which cause the firewall bug when starting a game.");
			add(info);
			add(info2);
			setVisible(true);


		}

		// ActionEvent Method

		@Override
		public void actionPerformed(ActionEvent arg0) {

			//Button debug test

			System.out.println("Button has been clicked");




			//file1 = x && file2 = y delete method

			File x = new File("C:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechLed.dll");
			File y = new File("C:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechGkey.dll");
			//if files on D://
			File q = new File("D:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechLed.dll");
			File r = new File("D:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechGkey.dll");
			//if files on E://
			File a = new File("E:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechLed.dll");
			File b = new File("E:\\Riot Games\\League of Legends\\RADS\\solutions\\lol_game_client_sln\\releases\\0.0.1.96\\deploy\\LogitechGkey.dll");


			if (x.exists() && y.exists()) {

				System.out.println("File name " + x.getName() + " has now been deleted");
				System.out.println("File name " + y.getName() + " has now been deleted");
				x.delete();
				y.delete();

				getContentPane().setLayout(new FlowLayout());
				JLabel label = new JLabel("Files have been deleted :)");
				label.setFont(new Font("Serif", Font.PLAIN, 20));
				getContentPane().add(label);
				SetSize();
				setLocationRelativeTo(null);
				setVisible(true);

			} else if (q.exists() && r.exists()) {
				System.out.println("File name " + x.getName() + " has now been deleted");
				System.out.println("File name " + y.getName() + " has now been deleted");
				q.delete();
				r.delete();

				getContentPane().setLayout(new FlowLayout());
			    JLabel label = new JLabel("Files have been deleted :)");
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    getContentPane().add(label);
			    setSize(460, 460);
			    setLocationRelativeTo(null);
			    setVisible(true);

			} else if (a.exists() && b.exists()) {
				System.out.println("File name " + x.getName() + " has now been deleted");
				System.out.println("File name " + y.getName() + " has now been deleted");
				a.delete();
				b.delete();

				getContentPane().setLayout(new FlowLayout());
			    JLabel label = new JLabel("Files have been deleted :)");
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    getContentPane().add(label);
			    setSize(460, 460);
			    setLocationRelativeTo(null);
			    setVisible(true);

			} else {
				System.out.println("The files cannot be found. Check dir");

				getContentPane().setLayout(new FlowLayout());
			    JLabel label = new JLabel("Files can not be found. Check your dir.");
			    label.setFont(new Font("Serif", Font.PLAIN, 20));
			    getContentPane().add(label);
			    SetSize();
			    setLocationRelativeTo(null);
			    setVisible(true);

			}

		}

}

//END
