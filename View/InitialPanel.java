package View;


import java.awt.BorderLayout;
import javax.swing.JPanel;

public class InitialPanel extends JPanel {
    ScorePanel sP;
    FieldPanel fP;

    public InitialPanel() {
        super();
        setLayout(new BorderLayout());

        sP = new ScorePanel();
        fP = new FieldPanel();
        add(sP, "North");
        add(fP, "Center");
    }

    public ScorePanel getsP(){
        return sP;
    }

    public FieldPanel getfP(){
        return fP;
    }
}