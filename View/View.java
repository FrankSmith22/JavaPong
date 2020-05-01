package View;
/***************************************
* Filename: View.java
* Short description: This class has the access to the frame and panels
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
public class View {
    private InitialFrame iF; //Frame for holding the InitialPanel
    private InitialPanel iP; //Panel for holding the ScorePanel and FieldPanel
    private ScorePanel sP;   //NORTH (grid layout) 50/50 JLabel or JButton to display scores
    private FieldPanel fP;   //CENTER(Null layout) Panel that will contain the components necessary for the game 
    
    public View(){
        iF = new InitialFrame();
        iP = iF.getiP();
        sP = iP.getsP();
        fP = iP.getfP();
    }
    
    public InitialFrame getIF(){
        return iF;
    }

    public InitialPanel getIP(){
        return iP;
	}

    public ScorePanel getSP(){
        return sP;
    }

    public FieldPanel getFP(){
        return fP;
    }
}