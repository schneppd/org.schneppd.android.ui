package org.schneppd.android.Framework.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;



/**
 * Define common logic for all android application
 */

public abstract class Application extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void LaunchActivity(Class<?> activity){
        Intent i = new Intent(getBaseContext(), activity);
        startActivity(i);
    }


}
