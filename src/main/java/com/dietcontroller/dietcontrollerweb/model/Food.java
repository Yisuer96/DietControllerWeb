package com.dietcontroller.dietcontrollerweb.model;

public class Food {
    /**
     * 
     */
    private Integer food_id;

    /**
     * 
     */
    private Integer user_id;

    /**
     * 
     */
    private String food_name;

    /**
     * 
     * @return food_id 
     */
    public Integer getFood_id() {
        return food_id;
    }

    /**
     * 
     * @param food_id 
     */
    public void setFood_id(Integer food_id) {
        this.food_id = food_id;
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
     * @return food_name 
     */
    public String getFood_name() {
        return food_name;
    }

    /**
     * 
     * @param food_name 
     */
    public void setFood_name(String food_name) {
        this.food_name = food_name == null ? null : food_name.trim();
    }
}