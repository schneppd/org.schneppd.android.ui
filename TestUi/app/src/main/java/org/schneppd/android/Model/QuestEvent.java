package org.schneppd.android.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by schneppd on 6/9/17.
 */

public class QuestEvent {
    private int id;
    private String title;
    private Date creation;

    public QuestEvent(){
        this.id = 0;
        this.setTitle("Placeholder");
        this.setCreation(new Date());
    }

    public QuestEvent(int id, String title){
        this.id = id;
        this.setTitle(title);
        this.setCreation(new Date());
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

    public int getId() {
        return id;
    }

    public static QuestEvent RestorModelInformations(int id){
        QuestEvent result = new QuestEvent(id, "An event occurred");
        return result;

    }

}
