package com.example.carwatch;



public class ListModel {

    private String company;
    private String model;
    private String image;
    private String year;

    public ListModel()
    {}

    public ListModel(String company, String model, String image, String year) {
        this.company = company;
        this.model = model;
        this.image = image;
        this.year = year;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}

