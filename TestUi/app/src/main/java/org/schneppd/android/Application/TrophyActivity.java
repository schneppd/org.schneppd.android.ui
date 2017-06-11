package org.schneppd.android.Application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.Model.Trophy;
import org.schneppd.android.RecyclerViewUtils.Adapter.TrophyDetailsAdapter;
import org.schneppd.android.testui.R;

public class TrophyActivity extends ApplicationWithHeader {

    private Trophy model;
    private TrophyDetailsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy);

        Bundle b = getIntent().getExtras();
        int id = b.getInt("id", 0);

        model = Trophy.RestorModelInformations(id);
        model.setDescription(getString(R.string.txt_description_quest_proposal));

        SetupActivityTextualContent();
        adapter = new TrophyDetailsAdapter(model);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvTrophyRequirements);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);

        adapter.notifyDataSetChanged();


    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(model.getTitle());

    }

}
