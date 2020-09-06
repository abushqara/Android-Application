package com.example.carwatch;

public class Car {
	
	
	
	
	int id;
    String company;
    String model;
    String year;
    Double engine;
    int horsePower;
    String condition;
    String phone;

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public Car()
    {
        
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Car(int id, String company, String model, String year, Double engine, int horsePower, String condition, String phone) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.horsePower = horsePower;
        this.condition = condition;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", engine=" + engine +
                ", horsePower=" + horsePower +
                ", condition='" + condition + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
