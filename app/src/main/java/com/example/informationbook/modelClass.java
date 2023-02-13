package com.example.informationbook;

public class modelClass {

    private String ImageName;

    public String getCategoryName() {
        return CategoryName;
    }

    private String CategoryName;


    public modelClass(String imageName, String categoryName) {
        this.ImageName = imageName;
        this.CategoryName = categoryName;
    }

    public String getImageName() {
        return ImageName;
    }
}

