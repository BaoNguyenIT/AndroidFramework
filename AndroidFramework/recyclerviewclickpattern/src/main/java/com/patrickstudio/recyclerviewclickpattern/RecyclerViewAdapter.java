package com.patrickstudio.recyclerviewclickpattern;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PATRICKLAGGER on 9/6/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    final public ListItemClickListener mOnClickListener;
    private List<Model> data;

    class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.item_text_view);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int postion = getAdapterPosition();
            mOnClickListener.onListItemClickListenter(postion);
        }
    }


    public RecyclerViewAdapter(List<Model> list, ListItemClickListener listener) {
        this.mOnClickListener = listener;
        data = list;
    }

    public interface ListItemClickListener {
        void onListItemClickListenter(int clickedItemIndex);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_holder, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText(data.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
