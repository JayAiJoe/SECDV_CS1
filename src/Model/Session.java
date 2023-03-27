/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jay-ai
 */
public class Session {
    
    private final String username;
    private final int role;
    
    public Session(String username, int role){
        this.username = username;
        this.role = role;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public int getRole(){
        return this.role;
    }
    
}
