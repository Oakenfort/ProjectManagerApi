package com.projectManagerApi.projectManagerApi.service;

import com.projectManagerApi.projectManagerApi.bean.Project;
import com.projectManagerApi.projectManagerApi.dao.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;

    public Project save(Project project){
        return projectDao.save(project);
    }

    public Project findById(long along){
        return projectDao.findById(along).get();
    }

    public void DeleteById(Long along){
        projectDao.deleteById(along);
    }
    public List<Project> findAll(){
        return projectDao.findAll();

    }

    public Project update(long id, Project p){
        Project p1 = new Project();
        p1 = this.findById(id);
        p1.setTitle(p.getTitle());
        p1.setStartDate(p.getStartDate());
        p1.setEndDate(p.getEndDate());
        p1.setFinished(p.isFinished());
        this.save(p1);
        return p1;
    }


}
