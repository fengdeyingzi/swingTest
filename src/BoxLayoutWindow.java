import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;


public class BoxLayoutWindow {
	
	
	
	public static void main(String[] args) {
		
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
		
		// 可跨平台的默认风格
		/*
		String lookAndFeel2 = UIManager.getCrossPlatformLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(lookAndFeel2);
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
		*/
		JFrame jFrame= new JFrame("this window");
		//设置icon
		ImageIcon icon= new ImageIcon(jFrame.getClass().getResource("/img/logo.png"));
		jFrame.setIconImage(icon.getImage());
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton button= new JButton();
		 //去掉按钮文字周围的焦点框
        button.setFocusPainted(false);
		button.setText("button01");
		button.setIcon(icon);
		button.setPreferredSize(new Dimension(300, 30));
		button.setBackground(Color.red);
		button.setForeground(Color.black);
		JButton button2 = new JButton();
		button2.setText("button02");
		JButton button3 = new JButton();
		button3.setText("button3");
		
		Box box_h1= Box.createHorizontalBox();
		box_h1.add(button);
		box_h1.add(Box.createHorizontalGlue());
		box_h1.add(button2);
		box_h1.add(button3);
	   jFrame.setContentPane(box_h1);
	   //jFrame.pack();
	   jFrame.setSize(320,400);
	   jFrame.setVisible(true);
		
		
		
	}

}
