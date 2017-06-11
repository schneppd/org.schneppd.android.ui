package org.schneppd.android.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by schneppd on 6/11/17.
 */

public class Trophy {
    private int id;
    private String title;
    private String description;
    private Date creation;
    private short completion = 0;
    private List<QuestPost> requirements = new ArrayList<>();

    public Trophy(int id, String title){
        this.setId(id);
        this.setTitle(title);
        this.setCreation(new Date());
    }

    public Trophy(int id, String title, short completion){
        this.setId(id);
        this.setTitle(title);
        this.setCreation(new Date());
        this.completion = completion;
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

    public void addRequirement(QuestPost dt) {
        requirements.add(dt);
    }

    public List<QuestPost> getRequirement() {
        return requirements;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    static public Trophy RestorModelInformations(int id){
        Trophy dt = new Trophy(id, "Trophy n*1", (short)100);
        QuestPost r = new QuestPost(1, "Requirement 1");
        dt.addRequirement(r);
        r = new QuestPost(2, "Requirement 2");
        dt.addRequirement(r);
        r = new QuestPost(3, "Requirement 3");
        dt.addRequirement(r);
        return dt;
    }

}
