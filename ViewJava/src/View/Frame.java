package View;

import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	Panel jeu = new Panel(this);


	public Frame () {
		//Create windows
		JFrame f = new JFrame();
		f.setTitle("Lorann Game");
		f.setSize(650,420);
		//f.getContentPane().setBackground(Color.WHITE);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(jeu);
		// Add one image
		//f.add(new JLabel(new ImageIcon("image/lorann_b.png")));


		f.setVisible(true);
	}
}