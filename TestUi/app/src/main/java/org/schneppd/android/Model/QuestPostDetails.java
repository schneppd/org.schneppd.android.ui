package org.schneppd.android.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by schneppd on 6/9/17.
 */

public class QuestPostDetails {
    private int id_quest_post;
    private String title;
    private Date creation;
    private Date expiration;
    private String expirationWarning;

    public static QuestPostDetails RestorModelInformations(int id){
        Date expiration = new Date();
        QuestPostDetails result = new QuestPostDetails(id, "An epic quest title", expiration);
        return result;

    }

    public QuestPostDetails(){
        this.id_quest_post = 0;
        this.setTitle("Placeholder");
        this.setCreation(new Date());
        this.setExpiration(new Date());
        this.setExpirationWarning("Placeholder warning");
    }

    public QuestPostDetails(int idQuestPost, String title){
        this.id_quest_post = idQuestPost;
        this.setTitle(title);
        this.setCreation(new Date());
        this.setExpiration(new Date());
    }

    public QuestPostDetails(int idQuestPost, String title, Date expiration){
        this.id_quest_post = idQuestPost;
        this.setTitle(title);
        this.setCreation(new Date());
        this.setExpiration(expiration);
        SimpleDateFormat timeParser = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        this.setExpirationWarning("Will expire the " + timeParser.format(expiration));
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

    public int getId() {
        return id_quest_post;
    }
}
