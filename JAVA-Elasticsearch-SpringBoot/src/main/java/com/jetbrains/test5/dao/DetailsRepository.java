package com.jetbrains.test5.dao;

import com.jetbrains.test5.model.Details;
//import com.jetbrains.test5.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepository extends ElasticsearchRepository<Details,String>
{

    Details findByDate(String date);
}
