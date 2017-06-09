package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.schneppd.android.Model.FinishedQuest;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/9/17.
 */

public class FinishedQuestJournalAdapter extends RecyclerView.Adapter<FinishedQuestJournalAdapter.FinishedQuestViewHolder>{
    private List<FinishedQuest> model;

    public class FinishedQuestViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView icon;

        public FinishedQuestViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.TxtQuestTitle);
            icon = (ImageView) view.findViewById(R.id.ImgImageQuest);
        }
    }


    public FinishedQuestJournalAdapter(List<FinishedQuest> model) {
        this.model = model;
    }

    @Override
    public FinishedQuestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.finished_quest_journal_row, parent, false);

        return new FinishedQuestViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FinishedQuestViewHolder holder, int position) {
        FinishedQuest dt = model.get(position);
        holder.title.setText(dt.getTitle());
        holder.icon.setImageResource(R.drawable.ic_quest_board_1);

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
