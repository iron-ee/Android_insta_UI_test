package com.cos.test_insta_ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvStoryList, rvFeedList;
    private StoryAdapter storyAdapter;
    private FeedAdapter feedAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvStoryList = findViewById(R.id.rv_story_list);
        LinearLayoutManager storyManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvStoryList.setLayoutManager(storyManager);

        rvFeedList = findViewById(R.id.rv_feed_list);
        LinearLayoutManager feedManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvFeedList.setLayoutManager(feedManager);

        List<Integer> story = new ArrayList<>();
        for (int i=1; i<10; i++) {
            story.add(R.layout.story_item);
        }

        storyAdapter = new StoryAdapter(story);
        rvStoryList.setAdapter(storyAdapter);


        List<Integer> feed = new ArrayList<>();
        for (int i=1; i<5; i++) {
            feed.add(R.layout.feed_item);
        }

        feedAdapter = new FeedAdapter(feed);
        rvFeedList.setAdapter(feedAdapter);

    }
}