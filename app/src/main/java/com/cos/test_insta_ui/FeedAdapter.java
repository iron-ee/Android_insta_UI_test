package com.cos.test_insta_ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.MyViewHolder>{

    private List<Integer> feed;

    public FeedAdapter(List<Integer> feed) {
        this.feed = feed;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.feed_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setItem(feed.get(position));
    }

    @Override
    public int getItemCount() {
        return feed.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void setItem(Integer feed) {

        }
    }
}
