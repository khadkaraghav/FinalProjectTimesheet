package com.example.demo;

import org.springframework.stereotype.Controller;


import javax.persistence.*;

import java.sql.Time;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;


@Entity
public class TimeSheet {

    private double payRate = 45;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "timeSheet", cascade = CascadeType.REMOVE,
            fetch = FetchType.EAGER)
    public Set<TSTimes> tsTimes;

    @ManyToOne
    private User user;



    public TimeSheet(){

    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<TSTimes> getTsTimes() {
        return tsTimes;
    }

    public void setTsTimes(Set<TSTimes> tsTimes) {
        this.tsTimes = tsTimes;
    }

    //    public LocalDate getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}

