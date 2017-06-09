package org.schneppd.android.Application;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.Model.FinishedQuest;
import org.schneppd.android.RecyclerViewUtils.Adapter.FinishedQuestJournalAdapter;
import org.schneppd.android.RecyclerViewUtils.IRecyclerViewClickListener;
import org.schneppd.android.RecyclerViewUtils.RecyclerViewDividerItemDecoration;
import org.schneppd.android.RecyclerViewUtils.RecyclerViewTouchListener;
import org.schneppd.android.testui.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestJournalActivity extends ApplicationWithHeader implements IRecyclerViewClickListener {

    private List<FinishedQuest> model = new ArrayList<>();
    private FinishedQuestJournalAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_journal);

        SetupActivityTextualContent();

        adapter = new FinishedQuestJournalAdapter(model);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvQuestJournal);;
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.addItemDecoration(new RecyclerViewDividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rv.setAdapter(adapter);

        PrepareJournal();

        rv.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), rv, this));
    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_quest_journal_activity);

    }

    private void PrepareJournal(){
        FinishedQuest qp = new FinishedQuest(1, "Old quest 1");
        model.add(qp);

        qp = new FinishedQuest(2, "Old quest 2");
        model.add(qp);

        qp = new FinishedQuest(3, "Old quest 3");
        model.add(qp);

        adapter.notifyDataSetChanged();
    }

    //manages click on the RecyclerView's items
    @Override
    public void onClick(View view, int position) {
        FinishedQuest qp = model.get(position);
        int id = qp.getId();

        Bundle b = new Bundle();
        b.putInt("id", id);
        LaunchActivityWithParams(QuestProposalActivity.class, b);

        //Toast.makeText(getApplicationContext(), qp.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongClick(View view, int position) {

    }
}
