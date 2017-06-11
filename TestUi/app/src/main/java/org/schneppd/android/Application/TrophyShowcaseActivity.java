package org.schneppd.android.Application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.Model.Trophy;
import org.schneppd.android.RecyclerViewUtils.Adapter.TrophyShowcaseAdapter;
import org.schneppd.android.RecyclerViewUtils.IRecyclerViewClickListener;
import org.schneppd.android.RecyclerViewUtils.RecyclerViewDividerItemDecoration;
import org.schneppd.android.RecyclerViewUtils.RecyclerViewTouchListener;
import org.schneppd.android.testui.R;

import java.util.ArrayList;
import java.util.List;

public class TrophyShowcaseActivity extends ApplicationWithHeader implements IRecyclerViewClickListener {

    private List<Trophy> model = new ArrayList<>();
    private TrophyShowcaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophy_showcase);

        SetupActivityTextualContent();

        adapter = new TrophyShowcaseAdapter(model);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rv = (RecyclerView) findViewById(R.id.rvTrophyShowcase);
        rv.setLayoutManager(mLayoutManager);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.addItemDecoration(new RecyclerViewDividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rv.setAdapter(adapter);

        PrepareSampleData();

        rv.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), rv, this));

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_trophy_showcase);

    }

    private void PrepareSampleData(){
        Trophy dt = new Trophy(1, "Trophy 1 title", (short)50);
        model.add(dt);
        dt = new Trophy(2, "Trophy 2 title", (short)100);
        model.add(dt);
        dt = new Trophy(3, "Trophy 3 title", (short)75);
        model.add(dt);

        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view, int position) {
        Trophy qp = model.get(position);
        int id = qp.getId();

        Bundle b = new Bundle();
        b.putInt("id", id);
        LaunchActivityWithParams(TrophyActivity.class, b);
    }

    @Override
    public void onLongClick(View view, int position) {

    }
}
