package com.projectManagerApi.projectManagerApi.ws;

import com.projectManagerApi.projectManagerApi.bean.Project;
import com.projectManagerApi.projectManagerApi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/projects")
public class ProjectWs {
    @Autowired
    private ProjectService projectService;
    @GetMapping("")
    public List<Project> findAll(){ return projectService.findAll(); }

    @GetMapping("{id}")
    public Project findById(@PathVariable long id){ return projectService.findById(id);}

    @PostMapping("")
    public Project save(@RequestBody Project project){ return projectService.save(project); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ projectService.DeleteById(id); }

    @PutMapping("{id}")
    public Project update(@PathVariable long id, @RequestBody Project project){
        return projectService.update(id, project);
    }
}
