package com.example.facelite;


public class Profile {
    String name;
    String status = "No Current Status";
    String picturePath = "NoPicture.png";
    Boolean deleted = false;


    Profile(String name){
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public String getStatus() {
        return status;
    }
}