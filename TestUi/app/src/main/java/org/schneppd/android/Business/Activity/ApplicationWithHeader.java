package org.schneppd.android.Business.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.schneppd.android.testui.R;

import org.schneppd.android.Framework.Activity.Application;

import org.schneppd.android.testui.R2;
import butterknife.BindView;

/**
 * Created by cdsm07 on 17/05/2017.
 */

public abstract class ApplicationWithHeader extends Application {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(View v){
        super.setContentView(v);
        // set ToolbarActivityTitle as activity's actionbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarActivityTitle);
        setSupportActionBar(toolbar);
        // remove default behaviours
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }


    protected void SetActivityTitle(final int ressourceId){
        final String legalActivityTitle = getResources().getString(ressourceId);
        TextView TxtHeaderTitleText = (TextView) findViewById(R.id.tvHeaderTitle);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/LibreBaskerville-Bold.ttf");
        TxtHeaderTitleText.setTypeface(tf);

        TxtHeaderTitleText.setText(legalActivityTitle);
    }

    // used to init the content of the activity
    protected abstract void SetupActivityTextualContent();
}
