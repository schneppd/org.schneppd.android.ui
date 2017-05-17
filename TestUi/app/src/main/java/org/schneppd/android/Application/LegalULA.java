package org.schneppd.android.Application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;

import org.schneppd.android.testui.R2;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import org.schneppd.android.Application.PlayerIndex;

public class LegalULA extends ApplicationWithHeader {

    @BindView(R2.id.HeaderTitleText)
    TextView TxtHeaderTitleText;
    @BindView(R2.id.Choice1)
    Button BtnAcceptUla;
    @BindView(R2.id.Choice2)
    Button BtnDeclineUla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setActivityView(R.layout.activity_legal_ula);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        SetupActivityTextualContent();
    }

    protected void SetupActivityTextualContent(){
        final String legalActivityTitle = getResources().getString(R.string.title_activity_legal_ul);
        TxtHeaderTitleText.setText(legalActivityTitle);

        final String BtnAcceptUlaText = getResources().getString(R.string.legal_accept_ula);
        BtnAcceptUla.setText(BtnAcceptUlaText);
        final String BtnDeclineUlaText = getResources().getString(R.string.legal_decline_ula);
        BtnDeclineUla.setText(BtnDeclineUlaText);
    }

    @OnClick(R2.id.Choice1)
    public void ExecuteAcceptULA(View v){
        LaunchActivity(PlayerIndex.class);
    }

    @OnClick(R2.id.Choice2)
    public void ExecuteDeclineULA(View v){
        LaunchActivity(PlayerIndex.class);
    }

}
