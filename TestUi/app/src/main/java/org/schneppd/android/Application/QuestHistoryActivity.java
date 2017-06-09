package org.schneppd.android.Application;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.Model.QuestEvent;
import org.schneppd.android.Model.QuestPostDetails;
import org.schneppd.android.RecyclerViewUtils.Adapter.QuestEventAdapter;
import org.schneppd.android.testui.R;

import java.util.ArrayList;
import java.util.List;

public class QuestHistoryActivity extends ApplicationWithHeader {

    private List<QuestEvent> steps= new ArrayList<>();

    private QuestEvent qe;
    private QuestPostDetails qpd;
    private QuestEventAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_history);

        Bundle b = getIntent().getExtras();
        int id_model = b.getInt("id", 0);

        qe = QuestEvent.RestorModelInformations(id_model);
        qpd = QuestPostDetails.RestorModelInformations(id_model);

        SetupActivityTextualContent();

        adapter = new QuestEventAdapter(steps);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvQuestHistory);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);

        PrepareQuestInformations();

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(qpd.getTitle());

    }

    private void PrepareQuestInformations(){
        QuestEvent dt = new QuestEvent(1, "03/03/2017 An event occurred");
        steps.add(dt);

        dt = new QuestEvent(2, "05/03/2017 An event occurred");
        steps.add(dt);

        dt = new QuestEvent(3, "09/03/2017 An event occurred");
        steps.add(dt);

        adapter.notifyDataSetChanged();

    }
}
