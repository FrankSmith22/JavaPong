package View;
/***************************************
* Filename: ScorePanel.java
* Short description: This class keep track of players' score
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;

public class ScorePanel extends JPanel {
    private JButton P1 = new JButton ("0");
    private JButton P2 = new JButton ("0");

    public ScorePanel(){
        super();
        setLayout(new GridLayout(1,2));
        
        P1.setOpaque(true);
        P1.setBackground(Color.lightGray);
        add(P1);
        P2.setOpaque(true);
        P2.setBackground(Color.lightGray);
        add(P2);
    }
    
    public JButton getP1(){
        return P1;
    }
    
    public JButton getP2(){
        return P2;
    }
    
    public void setP1(JButton P1){
        this.P1 = P1;
    }

    public void setP2(JButton P2){
        this.P2 = P2;
    }
}