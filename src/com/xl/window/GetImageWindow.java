package com.xl.window;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.net.URL;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import com.xl.swing.util.ImageLoadUtil;
import com.xl.swing.util.UIUtil;
import com.xl.swing.view.DiyJLabel;
import com.xl.swing.view.ImageView;
import com.xl.swing.view.RButton;

public class GetImageWindow extends JFrame{
	
	public GetImageWindow(){
		super();
		
		FlowLayout layout= new FlowLayout(FlowLayout.LEFT, 2, 2);
		Box layout_mainBox= Box.createVerticalBox();
		//setLayout(layout);
		setTitle("获取网络图片 - 风的影子");
		setSize(640, 480);
		Box layout_box= Box.createHorizontalBox();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//
		RButton button_getimgButton= new RButton();
		button_getimgButton.setText("获取图片:");
		final JTextField textField= new JTextField(30);
	    final JButton button_imgButton= new JButton();
	    final ImageView imageView= new ImageView();
	    
	    imageView.setImage(ImageLoadUtil.getImageFromClass("logo.png"));
	    final JLabel label= new JLabel();
	    JLabel picture = new JLabel("New label"){
			protected void paintComponent(Graphics g) {
				ImageIcon icon = new ImageIcon(ImageLoadUtil.getImageFromClass("logo.png"));
				g.drawImage(icon.getImage(), 0, 0, getWidth(),getHeight(),
				icon.getImageObserver());
				System.out.println("paint label");
				super.paintComponent(g);
				}
		};
		
		picture.setLocation(60, 60);


	    imageView.setPreferredSize(new Dimension(60, 60));
	    imageView.setImage(ImageLoadUtil.getImageFromClass("logo.png"));
	   // imageView.setText("test");
	    
	   // imageView.revalidate();
	   // imageView.setLocation(60, 60);
	   // imageView.setSize(60, 60);
	   // imageView.setMaximumSize(new Dimension(70, 90));
	   // imageView.setMinimumSize(new Dimension(70, 90));
	    imageView.setPreferredSize(new Dimension(90, 90));
	   // imageView.setBounds(0, 0, imageView.getWidth(), imageView.getHeight());
	    
	    button_imgButton.setBorderPainted(false);
	    button_imgButton.setFocusPainted(false);
	    button_imgButton.setContentAreaFilled(false);
	    button_imgButton.setFocusable(true);
		button_imgButton.setMargin(new Insets(0, 0, 0, 0));
		button_imgButton.setSize(50, 50);
		
		button_getimgButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SwingWorker<String, Void> worker= new SwingWorker<String, Void>(){
Image image;
					@Override
					protected String doInBackground() throws Exception {
						// TODO Auto-generated method stub
						image = Toolkit.getDefaultToolkit().getImage(new URL(textField.getText()));
						
						
						return null;
					}
					
					protected void done() {
						button_imgButton.setIcon(new ImageIcon(image));
						imageView.setImage(image);
						label.setText("设置成功");
					};
				};
				worker.execute();
			}
		});
		
		
		setLayout(layout);
		add(layout_mainBox);
		layout_box.add(textField);
		layout_box.add(button_getimgButton);
		layout_mainBox.add(layout_box);
		//layout_mainBox.add(button_imgButton);
		//layout_mainBox.add(imageView);
		layout_mainBox.add(label);
		//layout_mainBox.add(picture);
		add(layout_mainBox);
		add(imageView);
		System.out.println("add all");
		imageView.repaint();
	}
	
	public static void main(String[] args) {
		UIUtil.setWindowsStyle();
		GetImageWindow window= new GetImageWindow();
		window.setVisible(true);
	}

}
