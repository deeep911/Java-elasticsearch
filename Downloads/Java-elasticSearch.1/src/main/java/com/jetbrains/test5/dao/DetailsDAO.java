package com.jetbrains.test5.dao;

import com.jetbrains.test5.model.Details;
import java.util.List;

public interface DetailsDAO {


    //Details getDate(String Date);
    List<Details> getAllDetails();
    Details getDate(Details date);
    Details getTweet_id(String tweet_id);
    Details getScreen_name(String screen_name);
    Details getCreated_at(String created_at);
    Details getTweet_text(String tweet_text);

    Details addNewDetails(Details details);
    Details addTweet_id(Details tweet_id);
    Details addDate(Details date);
    Details addScreen_name(Details screen_name);
    Details addCreated(Details created_at);
    Details addTweet_text(Details tweet_text);

//



}
