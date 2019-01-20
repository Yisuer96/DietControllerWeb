package com.dietcontroller.dietcontrollerweb.model;

public class Component {
    /**
     * 
     */
    private Integer component_id;

    /**
     * 
     */
    private Integer user_id;

    /**
     * 
     */
    private String component_name;

    /**
     * 
     * @return component_id 
     */
    public Integer getComponent_id() {
        return component_id;
    }

    /**
     * 
     * @param component_id 
     */
    public void setComponent_id(Integer component_id) {
        this.component_id = component_id;
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
     * @return component_name 
     */
    public String getComponent_name() {
        return component_name;
    }

    /**
     * 
     * @param component_name 
     */
    public void setComponent_name(String component_name) {
        this.component_name = component_name == null ? null : component_name.trim();
    }
}