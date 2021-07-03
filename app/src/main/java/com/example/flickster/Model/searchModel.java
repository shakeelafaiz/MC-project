package com.example.flickster.Model;

import android.widget.Button;

public class searchModel {

    int  profile;
    String search;


    public searchModel(int profile, String search) {
        this.profile = profile;
        this.search = search;

    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    }

