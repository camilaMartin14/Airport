package com.miniapis.blog.repository;

import com.miniapis.blog.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    
    public List <Posteo> traerTodos();
        
}
