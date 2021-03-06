package org.schneppd.android.Business.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.schneppd.android.testui.R;

/**
 * Created by schneppd on 6/8/17.
 */

public abstract class ApplicationWithHeaderAndOmniMenu extends ApplicationWithHeader implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(View v){
        super.setContentView(v);
    }

    protected void SyncEventsWithUI(){
        Button OmniMenuBtnMostImportant = (Button) findViewById(R.id.OmniMenuBtnMostImportant);
        Button OmniMenuBtnSecondMostImportant = (Button) findViewById(R.id.ibtnQuestBoard);
        Button OmniMenuBtnThirdMostImportant = (Button) findViewById(R.id.ibtnQuestJournal);
        Button OmniMenuBtnSecondLessImportant = (Button) findViewById(R.id.ibtnTrophy);
        Button OmniMenuBtnThirdLessImportant = (Button) findViewById(R.id.ibtnSettings);

        OmniMenuBtnMostImportant.setOnClickListener(this);
        OmniMenuBtnSecondMostImportant.setOnClickListener(this);
        OmniMenuBtnThirdMostImportant.setOnClickListener(this);
        OmniMenuBtnSecondLessImportant.setOnClickListener(this);
        OmniMenuBtnThirdLessImportant.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // handle all click events of this activity
        switch (v.getId()) {
            case R.id.OmniMenuBtnMostImportant: ClickOmniMenuBtnMostImportant(v); break;
            case R.id.ibtnQuestBoard: ClickOmniMenuBtnSecondMostImportant(v); break;
            case R.id.ibtnQuestJournal: ClickOmniMenuBtnThirdMostImportant(v); break;
            case R.id.ibtnTrophy: ClickOmniMenuBtnSecondLessImportant(v); break;
            case R.id.ibtnSettings: ClickOmniMenuBtnThirdLessImportant(v); break;
        }
    }

    public abstract void ClickOmniMenuBtnMostImportant(View v);
    public abstract void ClickOmniMenuBtnSecondMostImportant(View v);
    public abstract void ClickOmniMenuBtnThirdMostImportant(View v);
    public abstract void ClickOmniMenuBtnSecondLessImportant(View v);
    public abstract void ClickOmniMenuBtnThirdLessImportant(View v);


}
