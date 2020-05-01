package View;
/***************************************
* Filename: FieldComponents.java
* Short description: This class display the components of the field
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import javax.swing.JComponent;
import java.awt.Graphics;

// This class handles painting our components
public class FieldComponents extends JComponent {

    private BallComponent ballComponent;
    private LeftPaddleComponent leftPaddleComponent;
    private RightPaddleComponent rightPaddleComponent;

    public FieldComponents(){
        ballComponent = new BallComponent();
        leftPaddleComponent = new LeftPaddleComponent();
        rightPaddleComponent = new RightPaddleComponent();
    }

    @Override
    public void paintComponent(Graphics g){
        ballComponent.draw(g);
        leftPaddleComponent.draw(g);
        rightPaddleComponent.draw(g);
    }

    public BallComponent getBallComponent() {
        return ballComponent;
    }
    
    public LeftPaddleComponent getLeftPaddleComponent() {
        return leftPaddleComponent;
    }

    public RightPaddleComponent getRightPaddleComponent() {
        return rightPaddleComponent;
    }
}