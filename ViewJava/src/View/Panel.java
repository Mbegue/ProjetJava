package View;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements KeyListener {
	
	private static final long serialVersionUID = 1L;
	JPanel j = new JPanel();
	Frame f;
	private Image img;
	int x = 0; int y = 0;
	Image bone;	Image horizontal_bone; Image vertical_bone; Image lorann_b; Image path; Image enemy; Image purse; Image crystal_ball; Image gate_closed;
	
String[] pics = new String[] {
		
		//Map 1 : Nektown test
		/*"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/","V","_","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","V","/","V","H","H","H","H","H","H","_","_","_","V","_","_","_","_","_","H","H","H","V","/","V","_","W","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","_","V","/","V","_","_","_","_","_","_","_","_","_","B","_","_","_","_","_","_","_","_","V","/","V","_","B","_","_","_","_","H","H","H","B","H","H","H","_","_","_","H","H","V","/","V","_","V","_","_","_","P","_","_","_","_","_","W","_","_","_","_","_","_","_","_","V","/","V","_","V","_","_","_","_","_","B","H","H","H","H","H","H","H","H","H","H","V","/","V","_","B","_","&","_","_","_","_","_","_","_","_","_","_","_","_","_","W","_","V","/","V","_","P","_","V","_","_","_","_","_","_","H","H","H","_","_","_","_","_","_","V","/","V","_","_","_","_","_","_","_","V","W","_","_","E","V","_","_","_","_","_","_","_","V","/","B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/",*/
		//Map 2 : Hijacked test
		"B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/","V","&","_","_","_","_","_","_","_","_","_","_","_","_","_","V","B","B","B","B","/","V","H","H","H","B","_","H","H","H","H","H","H","H","_","_","B","H","H","H","B","/","V","P","E","P","H","_","_","_","_","_","_","_","_","_","_","_","V","P","_","V","/","V","_","_","_","V","_","_","_","_","_","_","_","H","H","H","B","_","_","_","V","/","V","_","_","_","V","_","_","_","_","_","_","_","_","W","_","_","_","_","_","V","/","V","_","_","_","V","_","_","_","_","_","_","_","_","_","_","_","_","_","_","V","/","V","_","W","_","B","B","_","_","_","_","H","H","H","H","H","H","H","V","W","V","/","V","_","_","_","_","_","_","_","_","V","_","_","_","_","_","_","_","_","P","V","/","B","H","H","H","B","_","_","_","_","V","_","_","_","_","H","H","H","H","H","V","/","B","B","B","B","V","_","_","_","_","V","_","_","_","W","_","_","_","_","|","V","/","B","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","H","B","/"
        };
	// Loading they different images
	public Panel(Frame F_jeu) {
		this.f = F_jeu;
		try {
			this.bone = ImageIO.read(this.getClass().getResourceAsStream("image/bone.png"));
			this.vertical_bone = ImageIO.read(this.getClass().getResourceAsStream("image/vertical_bone.png"));
			this.horizontal_bone = ImageIO.read(this.getClass().getResourceAsStream("image/horizontal_bone.png"));
			this.lorann_b = ImageIO.read(this.getClass().getResourceAsStream("image/lorann_b.png"));
			this.enemy =ImageIO.read(this.getClass().getResourceAsStream("image/monster_2.png"));
			this.purse =ImageIO.read(this.getClass().getResourceAsStream("image/purse.png"));
			this.crystal_ball =ImageIO.read(this.getClass().getResourceAsStream("image/crystal_ball.png"));
			this.gate_closed =ImageIO.read(this.getClass().getResourceAsStream("image/gate_closed.png"));
		}catch (IOException e) {e.printStackTrace();}
		this.setBackground(Color.BLACK);}	
	//Load a good image for one character in the map 
	public void paint(Graphics g) {
		super.paint(g);
		
		for(String test : pics){
		
			switch(test){
			case "H" : 	
					g.drawImage(horizontal_bone, x, y, f);
					x+=32;
					
					break;
					
				case "/" : 
					x=0; 
					y+=32;
					break;
					
				case "B" : 
					g.drawImage(bone, x, y, f);	
					x+=32;
				break;
				
				case "_": 
					g.drawImage(path, x, y, f);
					
					x+=32;
					break;
					
				case "W": 
					g.drawImage(enemy, x, y, f);
					x+=32;
					break;
					
				case "P" : 
					g.drawImage(purse, x, y, f);
					x+=32;
					break;
				
				case "V":
					g.drawImage(vertical_bone, x, y, f); 
					x+=32;
						break;
						
				case "&" : 
					g.drawImage(lorann_b, x, y, f); 
					x+=32;
					break;
					
				case "E" :
					g.drawImage(crystal_ball, x, y, f);
					x+=32;
					break;
				
				case "|" :
					g.drawImage(gate_closed, x, y, f);
					x+=32;
					break;
				}			
		}
	}
	@Override
    public final void keyPressed(final KeyEvent keyEvent) {}
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}
}