package com.example.myapplication3;

public class Animal {
    private int image;
    private String name;
    private String info;

    public Animal(int image, String name, String info) {
        this.image = image;
        this.name = name;
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
