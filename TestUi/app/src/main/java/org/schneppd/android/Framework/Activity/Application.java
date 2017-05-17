package org.schneppd.android.Framework.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Define common logic for all android application
 */

public abstract class Application extends AppCompatActivity {

    private int activityView = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getActivityView());
    }

    protected void LaunchActivity(Class<?> activity){
        Intent i = new Intent(getBaseContext(), activity);
        startActivity(i);
    }


    public int getActivityView() {
        return activityView;
    }

    public void setActivityView(int activityView) {
        this.activityView = activityView;
    }
}
