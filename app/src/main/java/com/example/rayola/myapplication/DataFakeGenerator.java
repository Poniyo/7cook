package com.example.rayola.myapplication;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator {
    public static List<Post> getData(Context context){
        List<Post> posts= new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            Post post=new Post();
            post.setId(i);
            post.setTitle("عنوان متن ساختگی");
            post.setContent("عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی عنوان متن ساختگی");
            post.setDate("2 ساعت پیش");

            switch (i){
                case 1:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic1,null));
                    break;
                case 2:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic2,null));
                    break;
                case 3:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic3,null));
                    break;
                case 4:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic4,null));
                    break;
                case 5:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic5,null));
                    break;
                case 6:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic6,null));
                    break;
            }

            posts.add(post);
        }
        return posts;

    }
}
