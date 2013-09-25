/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filip Husnjak
 */
public class Leaderboard {
    
    private List<Result> resultboard = new ArrayList<Result>();
    
    public Leaderboard(List<Result> resultboard){
        this.resultboard = resultboard;
    }
    
    public void add(Result newResult){
        resultboard.add(newResult);
        sortList();
    }
    
    public void sortList(){
        // sortering algirithm?
    }
}
