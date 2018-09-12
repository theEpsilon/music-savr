package com.epsilon.de.musicplayer;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.MusicViewHolder> {

    int layoutRes;
    List<String> testList =  new ArrayList<>();

    public MusicListAdapter(int layoutRes) {
        this.layoutRes = layoutRes;

        for(int i = 0; i < 11; i++) {
            testList.add("Title-" + i);
        }
    }

    @Override
    public MusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new MusicViewHolder(layoutInflater.inflate(layoutRes, null));
    }

    @Override
    public void onBindViewHolder(MusicViewHolder holder, int position) {
        holder.title.setText(testList.get(position));
        holder.artist.setText(testList.get(position));
    }

    @Override
    public int getItemCount() {
        return testList == null ? 0 : testList.size();
    }

    class MusicViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView artist;

        public MusicViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.music_title);
            artist = (TextView) view.findViewById(R.id.music_artist);
        }
    }
}
