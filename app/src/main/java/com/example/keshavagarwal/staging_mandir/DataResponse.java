package com.example.keshavagarwal.staging_mandir;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DataResponse {

    ArrayList<String> xid;
    ArrayList<String> username;
    ArrayList<String> textheading;
    ArrayList<String> posttype;
    ArrayList<String> userimageurl;
    ArrayList<String> postimageurl;
    ArrayList<String> likecount;
    ArrayList<String> sharecount;
    ArrayList<String> reactioncount;
    ArrayList<String> commentcount;

    public ArrayList<String> getCommentcount() {
        return commentcount;
    }

    public ArrayList<String> getXid() {
        return xid;
    }

    public ArrayList<String> getUsername() {
        return username;
    }

    public ArrayList<String> getTextheading() {
        return textheading;
    }

    public ArrayList<String> getPosttype() {
        return posttype;
    }

    public ArrayList<String> getUserimageurl() {
        return userimageurl;
    }

    public ArrayList<String> getPostimageurl() {
        return postimageurl;
    }

    public ArrayList<String> getLikecount() {
        return likecount;
    }

    public ArrayList<String> getSharecount() {
        return sharecount;
    }

    public ArrayList<String> getReactioncount() {
        return reactioncount;
    }
}


class post
{
    private String xid;
    private String username;
    private String textheading;
    private String posttype;
    private String userimageurl;
    private String postimageurl;
    private String likecout;
    private String sharecount;
    private String commentcount;
    private String reactioncount;
}