package com.example.rayola.myapplication.cookAppGhesmat13;

import android.app.DownloadManager;
import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.example.rayola.myapplication.cookAppGhesmat13.data.Banner;
import com.example.rayola.myapplication.cookAppGhesmat13.data.Category;
import com.example.rayola.myapplication.cookAppGhesmat13.data.Recipe;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Method;
import java.util.List;

public class ApiService {
    private Context context;

    public ApiService(Context context) {
        this.context = context;
    }


    public void getRecipes(Response.Listener<List<Recipe>> listListener) {
        GsonRequest<List<Recipe>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/n7bxs",
                new TypeToken<List<Recipe>>() {
                }.getType(),
                new Response.Listener<List<Recipe>>() {
                    @Override
                    public void onResponse(List<Recipe> response) {
                        Log.i("TAG", "onResponse: ");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }
        );
        Volley.newRequestQueue(context).add(request);
    }
     /*   GsonRequest<Recipe> recipeGsonRequest=new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/n7bxs",
                Recipe.class,
                new Response.Listener<Recipe>() {
                    @Override
                    public void onResponse(Recipe response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }


        );
        Volley.newRequestQueue(context).add(recipeGsonRequest);
    }*/


    public void getBanners(Response.Listener<List<Banner>> bannersResponse) {
        GsonRequest<List<Banner>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/110sw0",
                new TypeToken<List<Banner>>() {
                }.getType(),
                bannersResponse,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }
        );
        Volley.newRequestQueue(context).add(request);

    }

    public void getCategories(Response.Listener<List<Category>> categoryListener) {
        GsonRequest<List<Category>> request = new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/v0bog",
                new TypeToken<List<Category>>() {
                }.getType(),
                new Response.Listener<List<Category>>() {
                    @Override
                    public void onResponse(List<Category> response) {
                        Log.i("TAG", "onResponse: ");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("TAG", "onErrorResponse: ");
                    }
                }
        );
        Volley.newRequestQueue(context).add(request);
      /*  GsonRequest<Category> CategoryGsonRequest=new GsonRequest<>(
                Request.Method.GET,
                "https://api.myjson.com/bins/v0bog",
                Category.class,
                new Response.Listener<Category>() {
                    @Override
                    public void onResponse(Category response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }


        );
        Volley.newRequestQueue(context).add(CategoryGsonRequest);
    }
    }*/
    }
}
