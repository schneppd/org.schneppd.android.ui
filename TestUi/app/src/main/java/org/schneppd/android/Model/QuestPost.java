package org.schneppd.android.Model;

import java.util.Date;

/**
 * Created by schneppd on 6/5/17.
 */

public class QuestPost {
    private String title;
    private Date creation;
    private Date expiration;
    private String expirationWarning;

    public QuestPost(){
        this.setTitle("Placeholder");
        this.setCreation(new Date());
        this.setExpiration(new Date());
        this.setExpirationWarning("Placeholder warning");
    }

    public QuestPost(String title){
        this.setTitle(title);
        this.setCreation(new Date());
        this.setExpiration(new Date());
    }

    public QuestPost(String title, Date expiration){
        this.setTitle(title);
        this.setCreation(new Date());
        this.setExpiration(expiration);
        this.setExpirationWarning("Placeholder warning");
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    public boolean HasExpirationDate(){
        if(creation == expiration)
            return false;
        return true;
    }

    public String getExpirationWarning() {
        return expirationWarning;
    }

    public void setExpirationWarning(String expirationWarning) {
        this.expirationWarning = expirationWarning;
    }
}
