package com.codingstuff.retrofitfirst;

import com.google.gson.annotations.SerializedName;

public class Comment {
    private String postId , id, name , email;
    @SerializedName("body")
    private String commentText;

    public String getPostId() {
        return postId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCommentText() {
        return commentText;
    }
}
