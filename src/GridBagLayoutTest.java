import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * GridBagLayoutTest.java,source code from java核心技术 卷1 基础知识,P379
 */

public class GridBagLayoutTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FontFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class FontFrame extends JFrame {
    int DEUAULT_WIDTH = 640;
    int DEUAULT_HEIGHT = 480;
    private JComboBox face;
    private JComboBox size;
    private JCheckBox bold;
    private JCheckBox italic;
    private JTextArea sample;

    public FontFrame() {
        setTitle("GridBagLayoutTest");
        setSize(DEUAULT_WIDTH, DEUAULT_HEIGHT);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        ActionListener listener = new FontAction();
        JLabel faceLabel = new JLabel("face:");
        face = new JComboBox(new String[] { "serif", "sansSerif", "Monospaced",
                "Dialog", "DialogInput", });
        face.addActionListener(listener);

        JLabel sizeLabel = new JLabel("Size:");
        size = new JComboBox(new String[] { "8", "10", "12", "15", "18", "24",
                "36", "48" });
        size.addActionListener(listener);

        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);

        sample = new JTextArea();
        sample.setText("The quick brown fox jump over the lazy dog.");
        sample.setEditable(false);
        sample.setLineWrap(true);
        sample.setBorder(BorderFactory.createEtchedBorder());
        
        //添加编辑框
        JTextField editviewField= new JTextField();
        //editviewField.setHorizontalAlignment(JTextField.TOP);
        
        //添加按钮
        JButton button = new JButton();
        button.setText("button click");
        
        //添加表格
        JTable table= new JTable();
        
        //添加滑动条
        JSlider seekbarJSlider= new JSlider();
        
        //添加进度条
        JProgressBar progressBar= new JProgressBar();
       
        
        //添加标签
        JLabel label= new JLabel();
        label.setText("lable");
        
        //
        
        add(faceLabel, new GBC(0, 0).setAnchor(GBC.EAST));
        add(face, new GBC(1, 0,3,1).setFill(GBC.BOTH).setWeight(400, 0).setIpad(200, 0)
                .setInsets(1));
        add(sizeLabel, new GBC(0, 1).setAnchor(GBC.EAST));
        add(size, new GBC(1, 1).setFill(GBC.HORIZONTAL).setWeight(100, 0)
                .setInsets(1));
        add(bold, new GBC(0, 2, 1, 1).setAnchor(GBC.NORTH).setWeight(100, 100));
        add(italic,
                new GBC(0, 3, 2, 1).setAnchor(GBC.CENTER).setWeight(100, 100));
        add(sample, new GBC(4, 0, 4, 2).setFill(GBC.BOTH).setWeight(300, 100));
        add(editviewField,new GBC(4, 2).setFill(GBC.BOTH).setIpad(20, 0).setWeight(20, 100));
        editviewField.setHorizontalAlignment(JTextField.LEFT);
        add(button,new GBC(4, 3,4,1).setFill(GBC.CENTER));
        add(table,new GBC(4, 4,4,1));
        add(seekbarJSlider,new GBC(4, 5,4,1).setFill(GBC.BOTH));
        add(progressBar,new GBC(4, 6,4,1).setFill(GBC.BOTH));
        
    }

    private class FontAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String fontFace = face.getSelectedItem().toString();
            int fontStyle = (bold.isSelected() ? Font.BOLD : 0)
                    + (italic.isSelected() ? Font.ITALIC : 0);
            int fontSize = Integer.parseInt(size.getSelectedItem().toString());
            Font font = new Font(fontFace, fontStyle, fontSize);
            sample.setFont(font);
            sample.repaint();
        }
    }
}