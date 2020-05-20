package View;
/***************************************
* Filename: InitialPanel.java
* Short description: This class has access to south and field panel
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class InitialPanel extends JPanel {
    private ScorePanel sP;
    private FieldPanel fP;

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