package org.schneppd.android.Application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.Model.QuestPost;
import org.schneppd.android.Model.QuestPostDetails;
import org.schneppd.android.Model.QuestProposalStep;
import org.schneppd.android.RecyclerViewUtils.Adapter.QuestProposalStepAdapter;
import org.schneppd.android.testui.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestProposalActivity extends ApplicationWithHeader {

    private List<QuestProposalStep> steps= new ArrayList<>();

    private QuestPostDetails qpd;
    private QuestProposalStepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_proposal);

        Bundle b = getIntent().getExtras();
        int id_model = b.getInt("id_quest_post", 0);

        qpd = QuestPostDetails.RestorModelInformations(id_model);

        SetupActivityTextualContent();

        adapter = new QuestProposalStepAdapter(steps);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvQuestSteps);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);

        PrepareQuestSteps();
    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(qpd.getTitle());

    }

    private void PrepareQuestSteps(){
        SimpleDateFormat questTimeParser = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date expiration = new Date();

        QuestProposalStep dt = new QuestProposalStep(1, "Epic location 1");
        steps.add(dt);

        dt = new QuestProposalStep(2, "Epic location 2");
        steps.add(dt);

        dt = new QuestProposalStep(3, "Epic location 3");
        steps.add(dt);

        adapter.notifyDataSetChanged();

    }
}
