package com.projectManagerApi.projectManagerApi.dao;


import com.projectManagerApi.projectManagerApi.bean.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDao extends JpaRepository<Project, Long> {


}
