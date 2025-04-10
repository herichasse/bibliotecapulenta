package com.example.biblioteca2.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@NoArgsConstructor
@Data
public class libro {
    private int id;
    private String iString;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
