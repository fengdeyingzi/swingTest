import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridBagLayout extends JFrame {
	
	public GridBagLayout(){
		super();
	}
	
	private void addGridBagPanes() {  
        //上侧的工具选择面板  
        JPanel toolSelectPanel = new JPanel();  
        toolSelectPanel.setBackground(Color.green);  
        this.add(toolSelectPanel, new GBC(0,0,2,1).  
                     setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 0));  
        //左侧的具体工具面板  
        JPanel toolConcretePanel = new JPanel();  
        toolConcretePanel.setBackground(Color.YELLOW);  
        this.add(toolConcretePanel,new GBC(0,1).  
                     setFill(GBC.BOTH).setIpad(70, 90).setWeight(0, 100));  
        //右侧的绘图面板  
        JPanel drawPanel = new JPanel();  
        drawPanel.setBackground(Color.WHITE);  
        this.add(drawPanel,new GBC(1,1).setFill(GBC.BOTH));  
        //下侧的颜色选择面板  
        JPanel colorPanel = new JPanel();  
        colorPanel.setBackground(Color.LIGHT_GRAY);  
        this.add(colorPanel,new GBC(0,2,2,1).  
                     setFill(GBC.BOTH).setIpad(200,50).setWeight(100, 0));  
        //下侧的状态面板  
        JPanel statePanel = new JPanel();  
        statePanel.setBackground(Color.CYAN);  
        this.add(statePanel,new GBC(0,3,2,1).  
                      setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 0));  
    }  
	
	public static void main(String[] args) {
		GridBagLayout layout= new GridBagLayout();
		layout.setTitle("this is GridBagLayout");
		layout.setDefaultCloseOperation(EXIT_ON_CLOSE);
		layout.setSize(new Dimension(480, 320));
		layout.addGridBagPanes();
		layout.setVisible(true);
	}

}
