import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

	public class Imagem extends JFrame {
	
			
			/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
			ImageIcon imagem = new ImageIcon(getClass().getResource("java.png"));
			JLabel label = new JLabel(imagem);
		
			public Imagem() {
				
				add(label);
				
				setSize(800,600);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setLocationRelativeTo(this);
				setVisible(true);	
			}
			
			public static void main(String[] args) {
				new Imagem();
				
			}
	}

