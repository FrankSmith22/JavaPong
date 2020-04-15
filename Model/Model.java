package Model;

public class Model {
    private Score score;
    public Model(){
        score = new Score();
        /*
        So far, Score works like this: initial scores set to 0,
        then methods will be used to increment scores, checking to see if
        score is higher or equal to max. if it is, set gameOver to true
        */
    }

    public Score getScore(){
        return score;
    }
}