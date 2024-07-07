package com.miniapis.blog.model;

import lombok.Getter;
import lombok.Setter;

public class Posteo {
    
    @Getter@Setter
    private Long id;
    private String titulo;
    private String autor;

    public Posteo() {
    }

    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
    
}
