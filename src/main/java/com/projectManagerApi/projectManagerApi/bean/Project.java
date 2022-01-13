package com.projectManagerApi.projectManagerApi.bean;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String startDate;
    private String endDate;
    private boolean isFinished;

    public Project() {

    }

}
