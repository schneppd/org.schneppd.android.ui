package org.schneppd.android.testui;

import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

import org.schneppd.android.Application.LegalULA;
import org.schneppd.android.Application.PlayerIndex;
import org.schneppd.android.Business.Activity.ApplicationSplashScreen;



public class Main extends ApplicationSplashScreen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.StartGameButton)
    public void ExecuteStartGame(View v){
        LaunchActivity(LegalULA.class);
    }

}
