package com.example.newlab;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RequestDTO {

    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @NotNull(message = "Age cannot be null")
    private Integer age;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RequestDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
