package org.schneppd.android.Application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import org.schneppd.android.Business.Activity.ApplicationWithHeader;
import org.schneppd.android.testui.R;
import org.schneppd.android.Model.QuestPost;
import org.schneppd.android.Adapter.QuestPostAdapter;

import org.schneppd.android.testui.R2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

//http://www.androidhive.info/2016/01/android-working-with-recycler-view/
public class QuestBoardActivity extends ApplicationWithHeader {

    /*
    @BindView(R2.id.rvQuestBoard)
    RecyclerView rvQuestBoard;
    */
    private List<QuestPost> questPosts = new ArrayList<>();
    private QuestPostAdapter questPostsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest_board);

        ButterKnife.bind(this);
        SetupActivityTextualContent();

        /*
        questPostsAdapter = new QuestPostAdapter(questPosts);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvQuestBoard.setLayoutManager(mLayoutManager);
        rvQuestBoard.setItemAnimator(new DefaultItemAnimator());
        rvQuestBoard.setAdapter(questPostsAdapter);

        PrepareQuestBoard();
        */
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
}
