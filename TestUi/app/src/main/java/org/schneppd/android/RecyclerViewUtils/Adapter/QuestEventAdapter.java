package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.schneppd.android.Model.QuestEvent;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/9/17.
 */

public class QuestEventAdapter  extends RecyclerView.Adapter<QuestEventAdapter.CustomViewHolder>{
    private List<QuestEvent> model;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public CustomViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.txtTitle);
        }
    }


    public QuestEventAdapter(List<QuestEvent> model) {
        this.model = model;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quest_event_row, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        QuestEvent dt = model.get(position);
        holder.title.setText(dt.getTitle());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
