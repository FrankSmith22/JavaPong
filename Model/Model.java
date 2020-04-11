package Model;

public class Model {
    Score score;
    public Model(){
        score = new Score();
        /*
        So far, score works like this: initial scores set to 0,
        then methods will be used to increment scores, checking to see if
        score is higher or equal to max. if it is, set gameOver to true
        
        So basically, the game will run in a while loop,
        checking to see if gameOver is equal to true yet
        */
    }
}