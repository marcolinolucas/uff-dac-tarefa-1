package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String msg;
        
    public MessageBean() {
    }
    
    public String getMsg() {
        return msg;
    }
    
    private String getTimeState() {
        int currentHour = LocalDateTime.now().getHour() - 3;
        if (currentHour >= 1 && currentHour <= 11) return "morning";
        if (currentHour >= 12 && currentHour <= 17) return "evening";
        return "night";
    }
    
    public void setMsg(String value) {
        switch (value){
            case "":
            case "pt":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Bom dia";
                        break;
                    case "evening":
                        msg = "Boa tarde";
                        break;
                    case "night":
                        msg = "Boa noite";
                        break;
                }
            break;
            case "en":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Good morning";
                        break;
                    case "evening":
                        msg = "Good afternoon";
                        break;
                    case "night":
                        msg = "Good night";
                        break;
                }
            break;
            case "de":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Guten morgen";
                        break;
                    case "evening":
                        msg = "Guten Tag";
                        break;
                    case "night":
                        msg = "Gute nacht";
                        break;
                }
            break;
            case "fr":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Bonjour";
                        break;
                    case "evening":
                        msg = "Bon après-midi";
                        break;
                    case "night":
                        msg = "Bonne nuit";
                        break;
                }
            break;
            case "es":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Buen día";
                        break;
                    case "evening":
                        msg = "Buenas tardes";
                        break;
                    case "night":
                        msg = "Buenas noches";
                        break;
                }
            break;
            case "tr":
                switch (getTimeState()){
                    case "":
                    case "morning":
                        msg = "Günaydın";
                        break;
                    case "evening":
                        msg = "Tünaydın";
                        break;
                    case "night":
                        msg = "Iyi geceler";
                        break;
                }
            break;
        }
    }
}
