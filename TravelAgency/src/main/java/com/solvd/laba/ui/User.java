package com.solvd.laba.ui;

import com.solvd.laba.travel.Travel;

import java.util.Objects;

public class User {
    private String name;
    private String lastName;
    private int age;
    private String email;
    private Travel travel;

    public User(String name, String lastName, int age, String email) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + lastName + ' ' +
                ", age: " + age +
                ", email: " + email + '\'' + travel.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && name.equals(user.name) && lastName.equals(user.lastName) && email.equals(user.email) && Objects.equals(travel, user.travel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, email, travel);
    }
}
