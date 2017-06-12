package org.schneppd.android.Application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

public class PlayerDashboard extends ApplicationWithHeader implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_dashboard);

        SetupActivityTextualContent();

        SyncEventsWithUI();

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_index);
    }

    private void SyncEventsWithUI(){
        ImageButton ibtnRecordPosition = (ImageButton) findViewById(R.id.ibtnRecordPosition);
        ImageButton ibtnQuestBoard = (ImageButton) findViewById(R.id.ibtnQuestBoard);
        ImageButton ibtnQuestJournal = (ImageButton) findViewById(R.id.ibtnQuestJournal);
        ImageButton ibtnTrophy = (ImageButton) findViewById(R.id.ibtnTrophy);
        ImageButton ibtnSettings = (ImageButton) findViewById(R.id.ibtnSettings);

        ibtnRecordPosition.setOnClickListener(this);
        ibtnQuestBoard.setOnClickListener(this);
        ibtnQuestJournal.setOnClickListener(this);
        ibtnTrophy.setOnClickListener(this);
        ibtnSettings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // handle all click events of this activity
        switch (v.getId()) {
            case R.id.ibtnRecordPosition: Click_ibtnRecordPosition(v); break;
            case R.id.ibtnQuestBoard: Click_ibtnQuestBoard(v); break;
            case R.id.ibtnQuestJournal: Click_ibtnQuestJournal(v); break;
            case R.id.ibtnTrophy: Click_ibtnTrophy(v); break;
            case R.id.ibtnSettings: Click_ibtnSettings(v); break;
        }
    }


    public void Click_ibtnRecordPosition(View v){
        Toast.makeText(getApplicationContext(), "Sorry but your position doesn't validate any quests", Toast.LENGTH_SHORT).show();
    }

    public void Click_ibtnQuestBoard(View v){ LaunchActivity(QuestBoardActivity.class); }

    public void Click_ibtnQuestJournal(View v){
        LaunchActivity(QuestJournalActivity.class);
    }

    public void Click_ibtnTrophy(View v){ LaunchActivity(TrophyShowcaseActivity.class); }

    public void Click_ibtnSettings(View v){
        LaunchActivity(SetupActivity.class);
    }


    public void ActionNavigationGoToChangeAvatar(View v){
        LaunchActivity(AvatarCustomizationActivity.class);
    }


}
