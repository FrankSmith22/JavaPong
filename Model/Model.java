package Model;

public class Model {
    private Score score;

    LeftPaddleData leftPaddleData;
    RightPaddleData rightPaddleData;
    BallData ballData;

    public Model(){
        score = new Score();
        leftPaddleData = new LeftPaddleData(); // Calling empty constructor inits with some default values
        rightPaddleData = new RightPaddleData(); // Prefer to call using getHeight of FieldPanel
        ballData = new BallData();
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