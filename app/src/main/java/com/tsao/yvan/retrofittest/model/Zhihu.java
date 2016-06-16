package com.tsao.yvan.retrofittest.model;

/**
 * Created by Yvan on 2016/6/1.
 */
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Zhihu {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("stories")
    @Expose
    private List<Story> stories = new ArrayList<Story>();
    @SerializedName("top_stories")
    @Expose
    private List<TopStory> topStories = new ArrayList<TopStory>();

    /**
     *
     * @return
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     *
     * @return
     * The stories
     */
    public List<Story> getStories() {
        return stories;
    }

    /**
     *
     * @param stories
     * The stories
     */
    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    /**
     *
     * @return
     * The topStories
     */
    public List<TopStory> getTopStories() {
        return topStories;
    }

    /**
     *
     * @param topStories
     * The top_stories
     */
    public void setTopStories(List<TopStory> topStories) {
        this.topStories = topStories;
    }

}
