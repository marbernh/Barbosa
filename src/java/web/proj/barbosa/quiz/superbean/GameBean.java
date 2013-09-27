/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz.superbean;

import java.io.Serializable;
import javax.ejb.Singleton;
import web.proj.barbosa.quiz.Leaderboard;
import web.proj.barbosa.quiz.Result;

/**
 *
 * @author Filip Husnjak
 */
@Singleton
public class GameBean implements Serializable {
    
    
    private GameBean(){
        
    }
    
    public Result getResult(Long id){
        return Result(id);
    }

    private Result Result(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
