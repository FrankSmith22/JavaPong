package View;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridLayout;

public class ScorePanel extends JPanel {
    private JButton P1 = new JButton ("P1");
    private JButton P2 = new JButton ("P2");

    public ScorePanel(){
        super();
        setLayout(new GridLayout(1,2));
        
        P1.setBackground(Color.lightGray);
        add(P1);
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