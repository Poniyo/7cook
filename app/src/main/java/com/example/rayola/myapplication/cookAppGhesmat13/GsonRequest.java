package com.example.rayola.myapplication.cookAppGhesmat13;

import android.support.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GsonRequest<T> extends Request<T> {
    private Gson gson= new Gson();
    private Response.Listener<T> responseListener;
    //private Class<T> clazz;
    private Type type;
    public GsonRequest(int method, String url,Type type, Response.Listener<T> responseListener, @Nullable Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.responseListener=responseListener;
        this.type=type;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String Json =new String(response.data);
            return (Response<T>) Response.success(gson.fromJson(Json,type), HttpHeaderParser.parseCacheHeaders(response));
        }catch (Exception e){
            return Response.error(new VolleyError(e));
        }

    }

    @Override
    protected void deliverResponse(T response) {
        responseListener.onResponse(response);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
      /*  Map<String,String> map=super.getHeaders(); هدر های پیش فرض رو میفرسته
        Map<String,String> map=new HashMap<>(); برای هر خونه از حافظه یه توکن اختصاص میده و پرفورمنس عالی داره و راحت دسترسی پیدا میکنه به خونه حافظه ، مشکلش اینه که ترتیب بندی نداره
        Map<String,String> map=new LinkedHashMap<>();   سرعت کمتری داره اما ترتیب رو رعایت میکنه
        map.put("Authorization","Bearer YOUR TOKEN");
        map.put("KEY","Value");
        return map;*/
      return super.getHeaders();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
/*        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("password","12345678");
            jsonObject.put("email","test@gmail.com");
        } catch (JSONException e) {

        }
return jsonObject.toString().getBytes();*/
        return super.getBody();
    }


}
