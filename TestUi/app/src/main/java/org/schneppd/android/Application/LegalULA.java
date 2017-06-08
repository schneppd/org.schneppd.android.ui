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

public class LegalULA extends ApplicationWithHeader {

    @BindView(R2.id.HeaderTitleText)
    TextView TxtHeaderTitleText;
    @BindView(R2.id.Choice1)
    Button BtnAcceptUla;
    @BindView(R2.id.Choice2)
    Button BtnDeclineUla;
    @BindView(R2.id.wvTermsOfServices)
    WebView wvTermsOfServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityView(R.layout.activity_legal_ula);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        SetupActivityTextualContent();
    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_legal_ul);

        final String BtnAcceptUlaText = getResources().getString(R.string.legal_accept_ula);
        BtnAcceptUla.setText(BtnAcceptUlaText);
        final String BtnDeclineUlaText = getResources().getString(R.string.legal_decline_ula);
        BtnDeclineUla.setText(BtnDeclineUlaText);

        wvTermsOfServices.loadUrl("file:///android_asset/html/terms-services.html");
    }

    @OnClick(R2.id.Choice1)
    public void ExecuteAcceptULA(View v){
        LaunchActivity(UpdateActivity.class);
    }

    @OnClick(R2.id.Choice2)
    public void ExecuteDeclineULA(View v){
        LaunchActivity(Main.class);
    }

}
