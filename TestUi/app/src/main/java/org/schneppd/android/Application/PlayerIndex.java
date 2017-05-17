package org.schneppd.android.Application;

import android.os.Bundle;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

public class PlayerIndex extends ApplicationWithHeader {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityView(R.layout.activity_player_index);
        super.onCreate(savedInstanceState);
    }

}
