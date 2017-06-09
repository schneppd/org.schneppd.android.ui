package org.schneppd.android.RecyclerViewUtils.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.schneppd.android.Model.QuestProposalStep;
import org.schneppd.android.testui.R;

import java.util.List;

/**
 * Created by schneppd on 6/9/17.
 */

public class QuestProposalStepAdapter extends RecyclerView.Adapter<QuestProposalStepAdapter.QuestProposalStepViewHolder> {
    private List<QuestProposalStep> model;

    public class QuestProposalStepViewHolder extends RecyclerView.ViewHolder {
        public Button ibtnQuestProposalStep;

        public QuestProposalStepViewHolder(View view) {
            super(view);
            ibtnQuestProposalStep = (Button) view.findViewById(R.id.ibtnQuestProposalStep);
        }
    }


    public QuestProposalStepAdapter(List<QuestProposalStep> model) {
        this.model = model;
    }

    @Override
    public QuestProposalStepAdapter.QuestProposalStepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quest_proposal_step_row, parent, false);

        return new QuestProposalStepAdapter.QuestProposalStepViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(QuestProposalStepAdapter.QuestProposalStepViewHolder holder, int position) {
        QuestProposalStep post = model.get(position);
        holder.ibtnQuestProposalStep.setText(post.getTitle());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}
