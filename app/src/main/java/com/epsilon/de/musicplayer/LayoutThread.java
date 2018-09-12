package com.epsilon.de.musicplayer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class LayoutThread implements Runnable {

    private AppCompatActivity activity;

    public LayoutThread(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    public void run() {
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(R.id.musicList);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity.getApplicationContext()));
        recyclerView.setAdapter(new MusicListAdapter(R.layout.musiclist_entry));
    }
}
