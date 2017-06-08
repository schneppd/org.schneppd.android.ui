package org.schneppd.android.Application;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.schneppd.android.testui.R;

import org.schneppd.android.testui.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;


public class UpdateActivity extends ApplicationWithHeader {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        SetupActivityTextualContent();

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_update);

    }

    public void ExecuteGoToIndex(View v){
        LaunchActivity(PlayerIndex.class);
    }

}
