package com.doodeec.boilerdroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.doodeec.boilerdroid.R;
import com.doodeec.boilerdroid.model.PlaceholderModel;
import com.doodeec.boilerdroid.view.PlaceholderViewHolder;

import java.util.List;

/**
 * @author Dusan Bartos
 */
public class PlaceholderAdapter extends RecyclerView.Adapter<PlaceholderViewHolder> {

    private Context mContext;
    private List<PlaceholderModel> mItems;

    public PlaceholderAdapter(Context context) {
        mContext = context;
    }

    public void setItems(List<PlaceholderModel> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @Override
    public PlaceholderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PlaceholderViewHolder(
                LayoutInflater.from(mContext).inflate(R.layout.holder_placeholder, parent, false));
    }

    @Override
    public void onBindViewHolder(PlaceholderViewHolder holder, int position) {
        holder.setName(mItems.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
