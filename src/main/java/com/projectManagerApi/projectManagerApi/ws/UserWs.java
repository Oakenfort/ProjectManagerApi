package com.projectManagerApi.projectManagerApi.ws;

import com.projectManagerApi.projectManagerApi.bean.User;
import com.projectManagerApi.projectManagerApi.service.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/users")
public class UserWs {
    @Autowired
    private UserSevice userService;

    @GetMapping("")
    public List<User> findAll(){ return userService.findAll(); }

    @GetMapping("{id}")
    public User findById(@PathVariable long id){ return userService.findById(id) ; }

    @PostMapping("")
    public User save(@RequestBody User user){ return userService.save(user) ;}

    @DeleteMapping("delete/{id}")
    public void DeleteById(@PathVariable long id){ userService.delete(id);}

    @PutMapping("{id}")
    public User update(@PathVariable long id, @RequestBody User user){
        return userService.update(id, user);
    }


}
