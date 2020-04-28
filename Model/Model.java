package Model;
import java.util.Random;
public class Model {
    private Score score;

    LeftPaddleData leftPaddleData;
    RightPaddleData rightPaddleData;
    BallData ballData;

    public Model(){
        //Code for randomizing starting direction
        Random xran = new Random();
        int x = 5 + (int)(Math.random() * ((10 - 5) + 1));
        Random yran = new Random();
        int y = yran.nextInt(10);

        score = new Score();
        leftPaddleData = new LeftPaddleData(); // Calling empty constructor inits with some default values
        rightPaddleData = new RightPaddleData(); // Prefer to call using getHeight of FieldPanel
        ballData = new BallData(495, 275, x, y, 25, 25); //TODO change this to generate random starting direction values
        /*
        So far, Score works like this: initial scores set to 0,
        then methods will be used to increment scores, checking to see if
        score is higher or equal to max. if it is, set gameOver to true
        */
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