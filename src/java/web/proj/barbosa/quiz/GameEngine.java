/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz;

/**
 *
 * @author Filip Husnjak
 */
public class GameEngine {
   
    private Result result;
    private int life;
    private int score;
    private String answer;
    
    public GameEngine(Long id, String answer){
        result = new Result(id);
        life = 3;
        score = 0;
        this.answer = answer;
    }
    
    // Tid och Score - ska de hålla ihop?
    public void GameRules(String guess){
        if(guess.equals(answer)){
            score += 15;
        }else{
            life--;
        }
        if(life > 0){
            //newGame......
        }
    } 
}
