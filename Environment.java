import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;


public class Environment {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Animal pet = new Animal("Marlon");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Environment window = new Environment();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Environment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(15, 16, 146, 14);
		frame.getContentPane().add(progressBar);
	}
}
