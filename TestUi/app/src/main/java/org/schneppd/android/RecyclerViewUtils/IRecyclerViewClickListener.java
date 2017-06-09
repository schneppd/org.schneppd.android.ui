package org.schneppd.android.RecyclerViewUtils;

import android.view.View;

/**
 * Created by schneppd on 6/9/17.
 */

public interface IRecyclerViewClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}