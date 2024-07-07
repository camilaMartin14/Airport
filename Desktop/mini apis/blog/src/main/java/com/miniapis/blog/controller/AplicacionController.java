package com.miniapis.blog.controller;

import com.miniapis.blog.model.Posteo;
import com.miniapis.blog.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicacionController {
    
    @Autowired
    IPosteoRepository repo;
    
    @GetMapping("/posteos")
    public List <Posteo> traerTodos(){
        return repo.traerTodos();
    }
}
