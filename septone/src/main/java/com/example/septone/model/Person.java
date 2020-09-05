package com.example.septone.model;

public class Person {
    private String hairColor;
    private String eyeColor;
    private String age;
    private String height;

    public Person(String hairParam, String eyeParam, String ageParam, String heightParam) {
        this.hairColor = hairParam;
        this.eyeColor = eyeParam;
        this.age = ageParam;
        this.height = heightParam;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}


