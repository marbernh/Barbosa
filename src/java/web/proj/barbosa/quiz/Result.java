/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz;

/**
 *
 * @author Filip Husnjak
 */
public class Result{
    private Long id;
    private int gamesPlayed, win, lose, score;
    
    public Result(Long id){
        this.id = id;
        gamesPlayed = 0;
        win = 0;
        lose = 0;
    }
    
    public void update(int gamesPlayed, int win, int lose){
        this.gamesPlayed = gamesPlayed;
        this.win = win;
        this.lose = lose;  
        this.score = score;
    }
    
    public int getScore(){
        return score;
    }
}
