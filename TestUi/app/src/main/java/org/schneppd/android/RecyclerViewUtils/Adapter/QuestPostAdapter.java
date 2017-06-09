package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.schneppd.android.Model.QuestPost;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/5/17.
 */

public class QuestPostAdapter extends RecyclerView.Adapter<QuestPostAdapter.QuestPostViewHolder>{
    private List<QuestPost> questPosts;

    public class QuestPostViewHolder extends RecyclerView.ViewHolder {
        public TextView title, warning;
        public ImageView icon;

        public QuestPostViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.TxtQuestBoardPostTitle);
            warning = (TextView) view.findViewById(R.id.TxtQuestBoardPostWarning);
            icon = (ImageView) view.findViewById(R.id.ImgQuestBoardPost);
        }
    }


    public QuestPostAdapter(List<QuestPost> questPosts) {
        this.questPosts = questPosts;
    }

    @Override
    public QuestPostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quest_board_row, parent, false);

        return new QuestPostViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(QuestPostViewHolder holder, int position) {
        QuestPost post = questPosts.get(position);
        holder.title.setText(post.getTitle());
        if(post.HasExpirationDate()){
            holder.warning.setText(post.getExpirationWarning());
        }
        else
            holder.warning.setVisibility(View.GONE);
        holder.icon.setImageResource(R.drawable.ic_quest_board_1);

    }

    @Override
    public int getItemCount() {
        return questPosts.size();
    }
}
