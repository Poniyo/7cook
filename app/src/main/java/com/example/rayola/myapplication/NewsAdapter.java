package com.example.rayola.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    public Context context;
    public List<Post> posts;
    public NewsAdapter(Context context, List<Post> posts){
        this.context=context;
        this.posts=posts;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_news,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        Post post=posts.get(position);
        holder.newsImage.setImageDrawable(post.getPostImage());
        holder.title.setText(post.getTitle());
        holder.content.setText(post.getContent());
        holder.date.setText(post.getDate());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        private ImageView newsImage;
        private TextView title;
        private TextView content;
        private TextView date;


        public NewsViewHolder(View itemView) {
            super(itemView);
            newsImage = (ImageView) itemView.findViewById(R.id.item_image);
            title = (TextView) itemView.findViewById(R.id.title_post);
            content = (TextView) itemView.findViewById(R.id.content);
            date = (TextView) itemView.findViewById(R.id.date);

        }
    }
}