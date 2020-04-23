package Model;

public class Model {
    private Score score;

    LeftPaddle leftPaddle;
    RightPaddle rightPaddle;
    Ball ball;

    public Model(){
        score = new Score();
        leftPaddle = new LeftPaddle(); // Calling empty constructor inits with some default values
        rightPaddle = new RightPaddle(); // Prefer to call using getHeight of FieldPanel
        ball = new Ball();
        /*
        So far, Score works like this: initial scores set to 0,
        then methods will be used to increment scores, checking to see if
        score is higher or equal to max. if it is, set gameOver to true
        */
    }

    public Score getScore(){
        return score;
    }

    public LeftPaddle getLeftPaddle() {
        return leftPaddle;
    }

    public RightPaddle getRightPaddle() {
        return rightPaddle;
    }

    public Ball getBall() {
        return ball;
    }
}