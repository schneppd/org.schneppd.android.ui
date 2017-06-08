package org.schneppd.android.Application;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

import org.schneppd.android.testui.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import org.schneppd.android.Application.UpdateActivity;
import org.schneppd.android.testui.Main;

public class LegalULA extends ApplicationWithHeader implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal_ula);

        Button BtnAcceptCondition = (Button) findViewById(R.id.Choice1);
        Button BtnDeclineCondition = (Button) findViewById(R.id.Choice2);
        BtnAcceptCondition.setOnClickListener(this);
        BtnDeclineCondition.setOnClickListener(this);

        SetupActivityTextualContent();
    }

    @Override
    public void onClick(View v) {
        // handle all click events of this activity
        switch (v.getId()) {
            case R.id.Choice1: ExecuteAcceptULA(v); break;
            case R.id.Choice2: ExecuteDeclineULA(v); break;
        }
    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_legal_ul);

        Button BtnAcceptCondition = (Button) findViewById(R.id.Choice1);
        Button BtnDeclineCondition = (Button) findViewById(R.id.Choice2);

        final String BtnAcceptUlaText = getResources().getString(R.string.legal_accept_ula);
        BtnAcceptCondition.setText(BtnAcceptUlaText);
        final String BtnDeclineUlaText = getResources().getString(R.string.legal_decline_ula);
        BtnDeclineCondition.setText(BtnDeclineUlaText);

        WebView wvTermsOfServices = (WebView) findViewById(R.id.wvTermsOfServices);
        wvTermsOfServices.loadUrl("file:///android_asset/html/terms-services.html");
    }

    public void ExecuteAcceptULA(View v){
        LaunchActivity(UpdateActivity.class);
    }

    public void ExecuteDeclineULA(View v){
        LaunchActivity(Main.class);
    }

}
