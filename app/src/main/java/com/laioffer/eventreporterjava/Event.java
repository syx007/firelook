package com.laioffer.eventreporterjava;

/**
 * Created by suyux on 2018/3/4.
 */

public class Event {
    public int getLike() {
        return like;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getId() {
        return id;
    }

    public long getTime() {
        return time;
    }

    public String getUsername() {
        return username;
    }

    public String getImgUri() {
        return imgUri;
    }

    /**
     * All data for a event.
     */

    private String title;
    private String address;
    private String description;
    private int CommentNumber;
    private int like;
    private double latitude;
    private double longitude;
    private String id;
    private long time;
    private String username;
    private String imgUri;

    public Event() {}

    /**
     * Constructor
     */
    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */
    public String getTitle() { return this.title; }
    public String getAddress() { return this.address; }
    public String getDescription() { return this.description; }
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getCommentNumber() {
        return CommentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        CommentNumber = commentNumber;
    }

}
