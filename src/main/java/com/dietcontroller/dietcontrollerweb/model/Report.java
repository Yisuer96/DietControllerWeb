package com.dietcontroller.dietcontrollerweb.model;

import java.util.Date;

public class Report {
    /**
     * 
     */
    private Integer report_id;

    /**
     * 
     */
    private Integer user_id;

    /**
     * 
     */
    private Date create_date;

    /**
     * 
     */
    private String description;

    /**
     * 
     * @return report_id 
     */
    public Integer getReport_id() {
        return report_id;
    }

    /**
     * 
     * @param report_id 
     */
    public void setReport_id(Integer report_id) {
        this.report_id = report_id;
    }

    /**
     * 
     * @return user_id 
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * 
     * @param user_id 
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * 
     * @return create_date 
     */
    public Date getCreate_date() {
        return create_date;
    }

    /**
     * 
     * @param create_date 
     */
    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    /**
     * 
     * @return description 
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}