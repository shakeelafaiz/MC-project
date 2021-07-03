package com.example.flickster.Model;

public class Dashboard {
    int profile, dashboardImage;
    String user_name, about, like_post, feedback, share;

    public Dashboard(int profile, int dashboardImage, String user_name, String about, String like_post, String feedback, String share) {
        this.profile = profile;
        this.dashboardImage = dashboardImage;
        this.user_name = user_name;
        this.about = about;
        this.like_post = like_post;
        this.feedback = feedback;
        this.share = share;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getDashboardImage() {
        return dashboardImage;
    }

    public void setDashboardImage(int dashboardImage) {
        this.dashboardImage = dashboardImage;
    }

    public String getuser_name() {
        return user_name;
    }

    public void setuser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLike_post() {
        return like_post;
    }

    public void setLike_post(String like_post)
    {
        this.like_post = like_post;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }


}
