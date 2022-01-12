package com.projectManagerApi.projectManagerApi.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String Name;
    private boolean isManager;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public boolean isManager() {
        return isManager;
    }
}
