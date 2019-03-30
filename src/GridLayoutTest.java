import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class GridLayoutTest {
	
	public static void main(String[] args) {
		JFrame jFrame= new JFrame();
		//windows风格
		String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		jFrame.setTitle("this is window");
		jFrame.setSize(640, 480);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel= new JPanel();
		GridLayout gridLayout= new GridLayout(3,3);
		
		jPanel.setLayout(gridLayout);
		jFrame.setContentPane(jPanel);
		JButton button_1= new JButton("1");
		JButton button_2= new JButton("2");
		JButton button_3=new JButton("3");
		JButton button_4=new JButton("4");
		JButton button_5=new JButton("5");
		JButton button_6=new JButton("6");
		JButton button_7=new JButton("7");
		JButton button_8=new JButton("8");
		JButton button_9=new JButton("9");
		jPanel.add(button_1);
		jPanel.add(button_2);
		jPanel.add(button_3);
		jPanel.add(button_4);
		jPanel.add(button_5);
		jPanel.add(button_6);
		jPanel.add(button_7);
		jPanel.add(button_8);
		jPanel.add(button_9);
		jFrame.setVisible(true);
		
		
		
	}

}
