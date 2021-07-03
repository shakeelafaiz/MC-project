package com.example.flickster.Model;

public class StoryModel {

    int story, storyType;
    int profile;
    String name;

    public StoryModel(int story, int profile, String name, int storyType) {
        this.story = story;
        this.profile = profile;
        this.name = name;
        this.storyType = storyType;
    }

    public int getStory() {
        return story;
    }

    public void setStroy(int story) {
        this.story = story;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoryType() {
        return storyType;
    }

    public void setStoryType(int storyType) {
        this.storyType = storyType;
    }
}