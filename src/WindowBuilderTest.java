import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

public class WindowBuilderTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTest frame = new WindowBuilderTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox);
		
		JButton btnNewButton = new JButton("New button");
		horizontalBox.add(btnNewButton);
		
		Component rigidArea = Box.createRigidArea(new Dimension(10, 20));
		horizontalBox.add(rigidArea);
		
		JButton btnNewButton_1 = new JButton("New button");
		horizontalBox.add(btnNewButton_1);
	}

}
