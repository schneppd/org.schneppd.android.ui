package org.schneppd.android.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by schneppd on 6/9/17.
 */

public class FinishedQuest {
    private int id;
    private String title;
    private Date creation;
    private Date completion;

    public FinishedQuest(){
        this.id = 0;
        this.setTitle("Placeholder");
        this.setCreation(new Date());
        this.setCompletion(new Date());
    }

    public FinishedQuest(int id, String title){
        this.id = id;
        this.setTitle(title);
        this.setCreation(new Date());
        this.setCompletion(new Date());
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


    public Date getCompletion() {
        return completion;
    }

    public void setCompletion(Date completion) {
        this.completion = completion;
    }
}
