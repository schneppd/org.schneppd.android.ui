package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.schneppd.android.Model.QuestPost;
import org.schneppd.android.Model.Trophy;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/11/17.
 */

public class TrophyDetailsAdapter  extends RecyclerView.Adapter<TrophyDetailsAdapter.TrophyDetailsViewHolder> {
    private List<QuestPost> model;

    public class TrophyDetailsViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivImageTrophy;
        public TextView tvTrophyTitle;

        public TrophyDetailsViewHolder(View view) {
            super(view);
            ivImageTrophy = (ImageView) view.findViewById(R.id.ivImageTrophy);
            tvTrophyTitle = (TextView) view.findViewById(R.id.tvTrophyTitle);
        }
    }


    public TrophyDetailsAdapter(Trophy model) {
        this.model = model.getRequirement();
    }

    @Override
    public TrophyDetailsAdapter.TrophyDetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trophy_requirement_row, parent, false);

        return new TrophyDetailsAdapter.TrophyDetailsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TrophyDetailsAdapter.TrophyDetailsViewHolder holder, int position) {
        QuestPost post = model.get(position);
        holder.ivImageTrophy.setImageResource(R.drawable.ic_mood_black_24dp);
        holder.tvTrophyTitle.setText(post.getTitle());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}