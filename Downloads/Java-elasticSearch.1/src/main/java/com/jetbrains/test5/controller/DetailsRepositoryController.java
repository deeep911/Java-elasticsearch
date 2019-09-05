package com.jetbrains.test5.controller;

import com.jetbrains.test5.dao.DetailsRepository;
import com.jetbrains.test5.model.Details;
//import com.jetbrains.test5.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/repo")
public class DetailsRepositoryController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private DetailsRepository detailsRepository;

    @RequestMapping(value = "/all/details")
    public List<Details> getAllDetails() {
        List<Details> details = new ArrayList<>();
        detailsRepository.findAll().forEach(details::add);
        return details;
    }

    @RequestMapping(value = "/new/details", method = RequestMethod.POST)
    public Details addNewDetails(@RequestBody Details details) {
        LOG.info("Adding details : {}", details);
        detailsRepository.save(details);
        LOG.info("Added details : {}", details);
        return details;
    }

    @RequestMapping(value = "/all/{date}",method = RequestMethod.GET)
    public String getDate(@PathVariable String date){
        Details detail = detailsRepository.findByDate(date);
        if (detail != null) {
            return detail.getDate();
        }else{
            return "does not exist";
        }  }


    }






