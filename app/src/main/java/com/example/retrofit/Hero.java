package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Hero {

    @SerializedName("id")
    private String userId;
    private String id;
    private String title;
    private String completed;


    public Hero(String userId, String id, String title, String completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;

    }

    public String getuserId() {
        return userId;
    }

    public String getid() {
        return id;
    }

    public String gettitle() {
        return title;
    }

    public String getcompleted() {
        return completed;
    }

}



