package org.schneppd.android.Application;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.RecyclerViewUtils.IRecyclerViewClickListener;
import org.schneppd.android.RecyclerViewUtils.RecyclerViewTouchListener;
import org.schneppd.android.testui.R;
import org.schneppd.android.Model.QuestPost;
import org.schneppd.android.Adapter.QuestPostAdapter;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.schneppd.android.RecyclerViewUtils.RecyclerViewDividerItemDecoration;

//http://www.androidhive.info/2016/01/android-working-with-recycler-view/
public class QuestBoardActivity extends ApplicationWithHeader implements IRecyclerViewClickListener {

    private List<QuestPost> questPosts = new ArrayList<>();
    private QuestPostAdapter questPostsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_board);



        SetupActivityTextualContent();


        questPostsAdapter = new QuestPostAdapter(questPosts);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView rvQuestBoard = (RecyclerView) findViewById(R.id.rvQuestBoard);;
        rvQuestBoard.setLayoutManager(mLayoutManager);
        rvQuestBoard.setItemAnimator(new DefaultItemAnimator());
        rvQuestBoard.addItemDecoration(new RecyclerViewDividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        rvQuestBoard.setAdapter(questPostsAdapter);

        PrepareQuestBoard();

        rvQuestBoard.addOnItemTouchListener(new RecyclerViewTouchListener(getApplicationContext(), rvQuestBoard, this));

    }

    protected void SetupActivityTextualContent(){
        SetActivityTitle(R.string.title_activity_quest_board);

    }

    private void PrepareQuestBoard(){
        SimpleDateFormat questTimeParser = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date expiration = new Date();

        QuestPost qp = new QuestPost("epic quest 1");
        questPosts.add(qp);

        try {
            expiration = questTimeParser.parse("2017-07-25 15:00");
        }
        catch (ParseException e){
            // log e
        }
        qp = new QuestPost("epic quest 2", expiration);
        questPosts.add(qp);

        try {
            expiration = questTimeParser.parse("2017-08-28 15:00");
        }
        catch (ParseException e){
            // log e
        }
        qp = new QuestPost("epic quest 3", expiration);
        questPosts.add(qp);

        questPostsAdapter.notifyDataSetChanged();
    }

    //manages click on the RecyclerView's items
    @Override
    public void onClick(View view, int position) {
        QuestPost qp = questPosts.get(position);
        Toast.makeText(getApplicationContext(), qp.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongClick(View view, int position) {

    }
}
