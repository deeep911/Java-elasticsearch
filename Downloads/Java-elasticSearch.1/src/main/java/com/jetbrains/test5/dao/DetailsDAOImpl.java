package com.jetbrains.test5.dao;

import com.jetbrains.test5.model.Details;
//import com.jetbrains.test5.model.User;
import org.elasticsearch.index.query.QueryBuilders;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@Repository
public class DetailsDAOImpl implements DetailsDAO {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Value("${elasticsearch.index.name}")
    private String indexName;

    @Value("${elasticsearch.user.type}")
    private String userTypeName;


    @Autowired
    private ElasticsearchTemplate esTemplate;

    @Override
    public List<Details> getAllDetails() {
        SearchQuery getAllQuery = new NativeSearchQueryBuilder()
                .withQuery(matchAllQuery()).build();
        return esTemplate.queryForList(getAllQuery, Details.class);
    }

    @Override
    public Details getDate(Details date) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withFilter(QueryBuilders.matchQuery("Date", date)).build();
        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
        if (!details.isEmpty()) {
            return (details.get(0));
        }
        return null;
    }

    @Override
    public Details getTweet_id(String tweet_id) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withFilter(QueryBuilders.matchQuery("tweet_id", tweet_id)).build();
        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
        if (!details.isEmpty()) {
            return details.get(0);
        }
        return null;
    }

    @Override
    public Details getScreen_name(String Screen_name) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withFilter(QueryBuilders.matchQuery("screen_name", Screen_name)).build();
        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
        if (!details.isEmpty()) {
            return details.get(0);
        }
        return null;
    }

    @Override
    public Details getCreated_at(String created_at) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withFilter(QueryBuilders.matchQuery("created_at", created_at)).build();
        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
        if (!details.isEmpty()) {
            return details.get(0);
        }
        return null;
    }

    @Override
    public Details getTweet_text(String tweet_text) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withFilter(QueryBuilders.matchQuery("tweet_text", tweet_text)).build();
        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
        if (!details.isEmpty()) {
            return details.get(0);
        }
        return null;
    }

    @Override
    public Details addNewDetails(Details details) {

        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(details);

        LOG.info("Details indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);

        return details;
    }

    @Override
    public Details addTweet_id(Details tweet_id) {

        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(tweet_id);

        LOG.info("tweet_id indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);


        return tweet_id;
    }

    @Override
    public Details addDate(Details date) {

        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(date);

        LOG.info("Date indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);

        return date;

    }

    @Override
    public Details addScreen_name(Details screen_name) {


        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(screen_name);

        LOG.info("Date indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);

        return screen_name;

    }

    @Override
    public Details addCreated(Details created_at) {

        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(created_at);

        LOG.info("Date indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);

        return created_at;

    }

    @Override
    public Details addTweet_text(Details tweet_text){
        IndexQuery userQuery = new IndexQuery();
        userQuery.setIndexName(indexName);
        userQuery.setType(userTypeName);
        userQuery.setObject(tweet_text);

        LOG.info("Date indexed: {}", esTemplate.index(userQuery));
        esTemplate.refresh(indexName);

        return tweet_text;

    }

//    @Override
//    public Details getDetails(Details details)


//    @Override
//    public Object getAllDetailSettings(String name) {
//
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(QueryBuilders.matchQuery("name", name)).build();
//
//        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
//        if(!details.isEmpty()) {
//            System.out.println("settings: "+details.get(0).getDetailSettings().toString());
//            return details.get(0).getDetailSettings();
//        }
//
//        return null;
//    }
//
//
//    @Override
//    public String getDetailSetting(String name, String key) {
//
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(QueryBuilders.matchQuery("name", name)).build();
//        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
//        if(!details.isEmpty()) {
//            return details.get(0).getDetailSettings().get(key);
//        }
//
//        return null;
//    }
//
//    @Override
//    public String  addDetailSetting(String name, String key, String value) {
//
//        SearchQuery searchQuery = new NativeSearchQueryBuilder()
//                .withQuery(QueryBuilders.matchQuery("name", name)).build();
//        List<Details> details = esTemplate.queryForList(searchQuery, Details.class);
//        if (!details.isEmpty()) {
//
//            Details detail = details.get(0);
//            detail.getDetailSettings().put(key, value);
//
//            IndexQuery userQuery = new IndexQuery();
//            userQuery.setIndexName(indexName);
//            userQuery.setType(userTypeName);
//            userQuery.setId(detail.getDate());
//            userQuery.setObject(detail);
//            esTemplate.index(userQuery);
//            return "Setting added.";
//        }
//
//        return null;
//    }



}




