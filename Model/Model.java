package Model;
/***************************************
* Filename: Model.java
* Short description: This class ...
* @author Frank Smith, Honghao Wei, Luthfi Mohammed, Hunter Jones
* @version  4/30/2020
***************************************/
import java.util.Random;
public class Model {
    private Score score;

    private LeftPaddleData leftPaddleData;
    private RightPaddleData rightPaddleData;
    private BallData ballData;

    public Model(){
        score = new Score();
        leftPaddleData = new LeftPaddleData(); // Calling empty constructor inits with some default values
        rightPaddleData = new RightPaddleData(); // Prefer to call using getHeight of FieldPanel
        ballData = new BallData(495, 275, randomXDir(), randomYDir(), 25, 25);
    }

    private int randomXDir(){
        Random random = new Random();
        int xDir = random.nextInt(7);
        if(xDir == 0 || xDir == 1 || xDir == 2 || xDir == 3){
            randomXDir();
        }
        else if(System.currentTimeMillis() % 2 == 0){
            xDir = -xDir;
        }
        return xDir;
    }

    private int randomYDir(){
        Random random = new Random();
        int yDir = random.nextInt(7);
        if(yDir == 0 || yDir == 1 || yDir == 2){
            randomYDir();
        }
        else if(System.currentTimeMillis() % 2 == 0){
            yDir = -yDir;
        }
        return yDir;
    }

    public Score getScore(){
        return score;
    }

    public LeftPaddleData getLeftPaddle() {
        return leftPaddleData;
    }

    public RightPaddleData getRightPaddle() {
        return rightPaddleData;
    }

    public BallData getBall() {
        return ballData;
    }
}