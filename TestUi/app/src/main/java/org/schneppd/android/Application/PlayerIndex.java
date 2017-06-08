package org.schneppd.android.Application;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.schneppd.android.Business.Activity.ApplicationWithHeaderAndOmniMenu;
import org.schneppd.android.testui.R;

public class PlayerIndex extends ApplicationWithHeaderAndOmniMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_index);

        SetupActivityTextualContent();

        SyncEventsWithUI();

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_index);
    }

    @Override
    public void ClickOmniMenuBtnMostImportant(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @Override
    public void ClickOmniMenuBtnSecondMostImportant(View v){ LaunchActivity(QuestBoardActivity.class); }

    @Override
    public void ClickOmniMenuBtnThirdMostImportant(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @Override
    public void ClickOmniMenuBtnSecondLessImportant(View v){ LaunchActivity(UpdateActivity.class); }

    @Override
    public void ClickOmniMenuBtnThirdLessImportant(View v){
        LaunchActivity(UpdateActivity.class);
    }


    public void ActionNavigationGoToChangeIndexBackground(View v){ LaunchActivity(UpdateActivity.class); }


    public void ActionNavigationGoToChangeAvatar(View v){
        LaunchActivity(UpdateActivity.class);
    }


    public void ActionNavigationGoToTryValidateQuests(View v){ LaunchActivity(UpdateActivity.class); }

}
