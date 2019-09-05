package com.jetbrains.test5.model;

public class ClassifierInfo{

private Double confidence;
private String label_description;
private String attribute_name;
private  boolean from_human;
private int source_id;
private String attribute_description;
private String label_name;
private String label_code;
private String attribute_code;

public Double getConfidence() {
        return confidence;
        }

public void setConfidence(Double confidence) {
        this.confidence = confidence;
        }

public String getLabel_description() {
        return label_description;
        }

public void setLabel_description(String label_description) {
        this.label_description = label_description;
        }

public String getAttribute_name() {
        return attribute_name;
        }

public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
        }

public boolean isFrom_human() {
        return from_human;
        }

public void setFrom_human(boolean from_human) {
        this.from_human = from_human;
        }

public int getSource_id() {
        return source_id;
        }

public void setSource_id(int source_id) {
        this.source_id = source_id;
        }

public String getAttribute_description() {
        return attribute_description;
        }

public void setAttribute_description(String attribute_description) {
        this.attribute_description = attribute_description;
        }

public String getLabel_name() {
        return label_name;
        }

public void setLabel_name(String label_name) {
        this.label_name = label_name;
        }

public String getLabel_code() {
        return label_code;
        }

public void setLabel_code(String label_code) {
        this.label_code = label_code;
        }

public String getAttribute_code() {
        return attribute_code;
        }

public void setAttribute_code(String attribute_code) {
        this.attribute_code = attribute_code;
        }


        }