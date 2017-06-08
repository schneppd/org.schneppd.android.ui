package org.schneppd.android.testui;

import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

import org.schneppd.android.Application.LegalULA;
import org.schneppd.android.Application.PlayerIndex;
import org.schneppd.android.Business.Activity.ApplicationSplashScreen;
import org.schneppd.android.Framework.Activity.Application;


public class Main extends Application {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ExecuteStartGame(View v){
        LaunchActivity(LegalULA.class);
    }

}
