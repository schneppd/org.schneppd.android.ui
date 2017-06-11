package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.schneppd.android.Model.Trophy;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/11/17.
 */

public class TrophyShowcaseAdapter  extends RecyclerView.Adapter<TrophyShowcaseAdapter.TrophyShowcaseViewHolder> {
    private List<Trophy> model;

    public class TrophyShowcaseViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivImgTrophy;
        public TextView tvTitleTrophy;

        public TrophyShowcaseViewHolder(View view) {
            super(view);
            ivImgTrophy = (ImageView) view.findViewById(R.id.ivImgTrophy);
            tvTitleTrophy = (TextView) view.findViewById(R.id.tvTitleTrophy);
        }
    }


    public TrophyShowcaseAdapter(List<Trophy> model) {
        this.model = model;
    }

    @Override
    public TrophyShowcaseAdapter.TrophyShowcaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.trophy_showcase_row, parent, false);

        return new TrophyShowcaseAdapter.TrophyShowcaseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TrophyShowcaseAdapter.TrophyShowcaseViewHolder holder, int position) {
        Trophy post = model.get(position);
        holder.ivImgTrophy.setImageResource(R.drawable.ic_mood_black_24dp);
        holder.tvTitleTrophy.setText(post.getTitle());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}