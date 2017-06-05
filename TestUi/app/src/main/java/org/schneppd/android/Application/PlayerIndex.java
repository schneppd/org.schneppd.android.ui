package org.schneppd.android.Application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

import org.schneppd.android.testui.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayerIndex extends ApplicationWithHeader {

    @BindView(R2.id.OmniMenuBtnMostImportant)
    Button BtnOmniMenuBtnMostImportant;
    @BindView(R2.id.OmniMenuBtnSecondMostImportant)
    Button BtnOmniMenuBtnSecondMostImportant;
    @BindView(R2.id.OmniMenuBtnThirdMostImportant)
    Button BtnOmniMenuBtnThirdMostImportant;
    @BindView(R2.id.OmniMenuBtnSecondLessImportant)
    Button BtnOmniMenuBtnSecondLessImportant;
    @BindView(R2.id.OmniMenuBtnThirdLessImportant)
    Button BtnOmniMenuBtnThirdLessImportant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityView(R.layout.activity_player_index);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        SetupActivityTextualContent();

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_index);

    }

    @OnClick(R2.id.OmniMenuBtnMostImportant)
    public void ActionNavigationGoToHome(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.OmniMenuBtnSecondMostImportant)
    public void ActionNavigationGoToQuestBoard(View v){
        LaunchActivity(QuestBoardActivity.class);
    }

    @OnClick(R2.id.OmniMenuBtnThirdMostImportant)
    public void ActionNavigationGoToJournal(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.OmniMenuBtnSecondLessImportant)
    public void ActionNavigationGoToAchievements(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.OmniMenuBtnThirdLessImportant)
    public void ActionNavigationGoToSettings(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.IndexBackgroundImage)
    public void ActionNavigationGoToChangeIndexBackground(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.IndexAvatarImage)
    public void ActionNavigationGoToChangeAvatar(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.ButtonTryValidateQuests)
    public void ActionNavigationGoToTryValidateQuests(View v){
        LaunchActivity(UpdateActivity.class);
    }

}
