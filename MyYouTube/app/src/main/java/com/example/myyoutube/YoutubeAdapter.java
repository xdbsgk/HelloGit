package com.example.myyoutube;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;

import java.util.ArrayList;

class YoutubeAdapter extends RecyclerView.Adapter<YoutubeAdapter.ViewHolder> {

    ArrayList<Youtube> youtubes;

    public YoutubeAdapter(ArrayList<Youtube> youtubeArrayList) {
        this.youtubes = youtubeArrayList;
    }

    @NonNull
    @Override
    public YoutubeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // xml 당겨오기
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_youtube, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YoutubeAdapter.ViewHolder holder, int position) {

        Youtube item = youtubes.get(position);

        Glide.with(holder.itemView.getContext())
                .load(item.mainImageUri)
                .into(holder.imageViewMain);

        holder.runTimeTextView.setText(item.runTime);
        holder.titleTextView.setText(item.title);
        holder.subTitleTextView.setText(item.subtitle);
    }

    @Override
    public int getItemCount() {
        return youtubes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewMain;
        TextView runTimeTextView;
        TextView titleTextView;
        TextView subTitleTextView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewMain = itemView.findViewById(R.id.imageViewMain);
            runTimeTextView = itemView.findViewById(R.id.runTimeTextView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            subTitleTextView = itemView.findViewById(R.id.subTitleTextView);

            itemView.setOnClickListener(view -> {
                Toast.makeText(itemView.getContext(), "이동합니다.", Toast.LENGTH_SHORT).show();
            });
        }
    }
}
