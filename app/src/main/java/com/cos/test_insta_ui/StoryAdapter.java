package com.cos.test_insta_ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.MyViewHolder>{

    private List<Integer> story;

    public StoryAdapter(List<Integer> story) {
        this.story = story;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.story_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setItem(story.get(position));
    }

    @Override
    public int getItemCount() {
        return story.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void setItem(Integer story) {

        }
    }

}
