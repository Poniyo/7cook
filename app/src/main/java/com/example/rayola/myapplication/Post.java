package com.example.rayola.myapplication;

import android.graphics.drawable.Drawable;

public class Post {
    private int id;
    private Drawable postImage;
    private String title;
    private String content;
    private String date;

    public Post() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getPostImage() {
        return postImage;
    }

    public void setPostImage(Drawable postImage) {
        this.postImage = postImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
