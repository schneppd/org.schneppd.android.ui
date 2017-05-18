package org.schneppd.android.Application;

import android.os.Bundle;
import android.widget.TextView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

import org.schneppd.android.testui.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayerIndex extends ApplicationWithHeader {


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

}
