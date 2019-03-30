import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class TestWindow {

	public static void main(String[] args) {
		System.out.println("hello world!");
		JFrame jFrame= new JFrame("风的影子");
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
		jFrame.setSize(300,240);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar= new JMenuBar();
		JMenu menu= new JMenu();
		menu.setText("menu");
		JMenuItem menuItem= new JMenuItem();
		
		menuItem.setText("item1");
		JMenu menu2= new JMenu();
		menu2.setText("menu2");
		menu.add(menuItem);
		menuBar.add(menu);
		menuBar.add(menu2);
		
		
		//定义容器
		JPanel layoutJPanel= new JPanel();
		layoutJPanel.setLayout(new FlowLayout());
		BoxLayout boxLayout= new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS);
		jFrame.setLayout(boxLayout);
	    jFrame.getContentPane().add(new JLabel("1"));
	    jFrame.getContentPane().add(new JLabel("2"));
	    jFrame.getContentPane().add(new JLabel("3"));
	    JFileChooser fileChooser= new JFileChooser();
	    Container con  = jFrame.getContentPane();
	    JTextField ediTextField= new JTextField();
	    
	    JButton button_conButton= new JButton();
	    button_conButton.setText("开始转换");
	    //con.add(fileChooser);
	    
	    con.add(ediTextField);
	    con.add(button_conButton);
		
		jFrame.setJMenuBar(menuBar);
		JScrollPane scrollPane= new JScrollPane();
//scrollPane.add(layoutJPanel);
		JTextField text_path= new JTextField(15);
		//text_path.setSize(300, 20);
		//在容器中添加布局
		JButton button_select= new JButton();
		button_select.setText("select");
	button_select.setToolTipText("this is a button");
	button_select.setBorder(BorderFactory.createLineBorder(Color.red));
		layoutJPanel.add(text_path);
		layoutJPanel.add(button_select);
		//text_path.setPreferredSize(new Dimension(300, 20));
		jFrame.getContentPane().add(layoutJPanel);
	//	JFileChooser fileChooser= new JFileChooser();
		layoutJPanel.add(fileChooser);
		//jFrame.setContentPane(layoutJPanel);
		jFrame.setVisible(true);
		
	}
}

