package org.schneppd.android.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by schneppd on 6/9/17.
 */

public class QuestProposalStep {
    private int id_quest_proposal_step;
    private String title;
    private Date creation;

    public QuestProposalStep(){
        this.id_quest_proposal_step = 0;
        this.setTitle("Placeholder");
        this.setCreation(new Date());
    }

    public QuestProposalStep(int idQuestPost, String title){
        this.id_quest_proposal_step = idQuestPost;
        this.setTitle(title);
        this.setCreation(new Date());
    }

    public QuestProposalStep(int idQuestPost, String title, Date expiration){
        this.id_quest_proposal_step = idQuestPost;
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
        return id_quest_proposal_step;
    }
}
