package com.jetbrains.test5.controller;

import com.jetbrains.test5.dao.DetailsDAO;

import com.jetbrains.test5.model.Details;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private DetailsDAO DetailsDAO;

    @RequestMapping(value = "/all/details")
    public List<Details> getAllDetails()
    { return DetailsDAO.getAllDetails();
    }

    @RequestMapping(value = "/new/details", method = RequestMethod.POST)
    public Details addNewDetails(@RequestBody Details details) {
        return  DetailsDAO.addNewDetails(details);
    }

    @RequestMapping(value = "/new/{date}", method = RequestMethod.GET)
    public Details getDate(@PathVariable Details date){
        Details Date = DetailsDAO.getDate(date);
        return Date;
    }
    @RequestMapping(value = "new/Date",method =RequestMethod.POST)
    public Details addDate(@PathVariable Details date) {
        return DetailsDAO.addDate(date);
    }

    @RequestMapping(value = "/id/{tweet_id}", method = RequestMethod.GET)
    public Details getTweet_id(@PathVariable String tweet_id) {
        Details tweet = DetailsDAO.getTweet_id(tweet_id);
        return tweet;
    }
    @RequestMapping(value = "/new/tweet_id", method = RequestMethod.POST)
    public Details addTweet_id(@PathVariable  Details tweet_id){
        return DetailsDAO.addTweet_id(tweet_id);
    }
    @RequestMapping(value = "/id/{screen_name}", method = RequestMethod.GET)
    public Details getScreen_name(@PathVariable String screen_name){
        Details screenName = DetailsDAO.getScreen_name(screen_name);
        return screenName;
    }
    @RequestMapping(value = "/new/screen_name", method = RequestMethod.POST)
    public Details addScreen_name(@PathVariable  Details screen_name){
        return DetailsDAO.addScreen_name(screen_name);
    }
    @RequestMapping(value = "/id/{created_at}", method = RequestMethod.GET)
    public Details  getCreated_at(@PathVariable String created_at){
        Details createdAt = DetailsDAO.getCreated_at(created_at);
        return createdAt;
    }
    @RequestMapping(value = "/new/created_at", method = RequestMethod.POST)
    public Details addCreated_at(@PathVariable  Details created_at){
        return DetailsDAO.addCreated(created_at);
    }
    @RequestMapping(value = "/id/{tweet_text}", method = RequestMethod.GET)
    public Details  getTweet_text(@PathVariable String tweet_text){
        Details tweetText = DetailsDAO.getTweet_text(tweet_text);
        return tweetText;
    }
    @RequestMapping(value = "/new/tweet_text", method = RequestMethod.POST)
    public Details addTweet_text(@PathVariable  Details tweet_text){
        return DetailsDAO.addTweet_text(tweet_text);
    }

/////


//    @RequestMapping(value = "/settings/{name}", method = RequestMethod.GET)
//    public Object getAllDetailSettings(@PathVariable String name) {
//        //return userDAO.getAllUserSettings(name);
//        return DetailsDAO.getAllDetailSettings(name);
//    }
//
//    @RequestMapping(value = "/settings/{name}/{key}", method = RequestMethod.GET)
//    public String getUserSetting(@PathVariable String name, @PathVariable String key) {
//        //return userDAO.getUserSetting(name, key);
//        return DetailsDAO.getDetailSetting(name, key);
//    }
//
//    @RequestMapping(value = "/settings/{name}/{key}/{value}", method = RequestMethod.GET)
//    public String addUserSetting(@PathVariable String name, @PathVariable String key, @PathVariable String value) {
//       // return userDAO.addUserSetting(name, key, value);
//        return DetailsDAO.addDetailSetting(name, key, value);






















//   @RequestMapping(value = "/id/tweet_id", method = RequestMethod.POST){
//       public  Details addTweet_id(@PathVariable Double tweet_id){
//       DetailsDAO.addTweet_id(tweet_id)
//               return tweet_id;
//
}







