package com.crescend.accompany;

public class Post {
    private String username;
    private String title;
    private String imageUrl;
    private String desc; //description

    public Post(String username, String title, String imageUrl, String desc) {
        this.username = username;
        this.title = title;
        this.desc = desc;
        this.imageUrl = imageUrl;

    }

    public Post() {}
    public void setUsername(String username) {
        this.username = username;
    }

}
