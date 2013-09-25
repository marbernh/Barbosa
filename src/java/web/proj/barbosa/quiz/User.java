/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.proj.barbosa.quiz;

/**
 *
 * @author Filip Husnjak
 */
public class User {

    private String name, userName, password;
    private int gamesPlayed, win, lose, score;
    private Long id;
    public Result result;

    public User(Long id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        gamesPlayed = 0;
        win = 0;
        lose = 0;
        score = 0;
        result = new Result(id);
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    /*
     * vill vi ha ett mer komplicerat lösen?
     */
    public void setPassword(String password) {
        this.password = password;        
    }
    
    public void gameStat(Boolean winGame){
        if(winGame)
            win++;
        else
            lose++;
        
        result.update(gamesPlayed++, win, lose);
    }
}
