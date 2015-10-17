package com.doodeec.boilerdroid.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.doodeec.boilerdroid.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * @author Dusan Bartos
 */
public class PlaceholderViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.name)
    TextView mTextView;

    public PlaceholderViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void setName(String name) {
        mTextView.setText(name);
    }
}
