package org.schneppd.android.Business.Activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import org.schneppd.android.testui.R;

import org.schneppd.android.Framework.Activity.Application;

/**
 * Created by cdsm07 on 17/05/2017.
 */

public abstract class ApplicationWithHeader extends Application {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetupHeader();
    }

    protected void SetupHeader(){
        // set ToolbarActivityTitle as activity's actionbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarActivityTitle);
        setSupportActionBar(toolbar);
        // remove default behaviours
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }
}
