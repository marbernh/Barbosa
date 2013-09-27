/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz.superbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Filip Husnjak
 */
@Named("guessBean")
@RequestScoped
public class GuessBB {
    
    private String guess;
    //@Inject
    //private GameBean game;
    
    public String validate(){
        if(true){
            System.out.println("Stämmer");
            return "guess";
        }else
            System.out.println("Stämmer ej");
        return "hej";
    }
    
    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
