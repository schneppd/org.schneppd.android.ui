package org.schneppd.android.Application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

public class SetupActivity extends ApplicationWithHeader {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);
        SetupActivityTextualContent();
    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(getString(R.string.title_settings));

    }
}
