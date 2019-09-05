package com.jetbrains.test5.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Document(indexName = "my_index", type = "user")
public class Details {

    @Id
    public String date;
    public String tweet_id;
    public String screen_name;
    public String created_at;
    public String tweet_text;

    public List<ClassifierInfo> classifier_info ;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(String tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTweet_text() {
        return tweet_text;
    }

    public void setTweet_text(String tweet_text) {
        this.tweet_text = tweet_text;
    }

    public List<ClassifierInfo> getClassifier_info() {
        return classifier_info;
    }

    public void setClassifier_Info(List<ClassifierInfo> classifier_info) {
        this.classifier_info = classifier_info;
    }





}