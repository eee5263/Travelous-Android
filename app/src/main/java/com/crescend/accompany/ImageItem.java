package com.crescend.accompany;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class ImageItem {
    public String key;
    public String userId;
    public String downloadUrl;

    // these properties will not be saved to the database
    @Exclude
    public User user;

    @Exclude
    public int likes = 0;

    @Exclude
    public boolean hasLiked = false;

    @Exclude
    public String userLike;

    public ImageItem() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public ImageItem(String key, String userId, String downloadUrl) {
        this.key = key;
        this.userId = userId;
        this.downloadUrl = downloadUrl;
    }

    public void addLike() {
        this.likes++;
    }

    public void removeLike() {
        this.likes--;
    }
}
