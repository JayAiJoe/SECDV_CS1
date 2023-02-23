/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author beepxD
 */
public class Logs {
    
    private int id;
    private String event;
    private String username;
    private String desc;
    private Timestamp timestamp;

    private SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    
    public Logs(String event, String desc){
        this.event = event;
        this.username = "NONE";
        this.desc = desc;
        this.timestamp = new Timestamp(new Date().getTime());
    }
    
    public Logs(String event, String username, String desc){
        this.event = event;
        this.username = username;
        this.desc = desc;
        this.timestamp = new Timestamp(new Date().getTime());
    }
    
    public Logs(int id, String event, String username, String desc, String timestamp){
        this.id = id;
        this.event = event;
        this.username = username;
        this.desc = desc;
        try {
            this.timestamp = new Timestamp(dateformat.parse(timestamp).getTime());
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    
}
