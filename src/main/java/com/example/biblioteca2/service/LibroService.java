package com.example.biblioteca2.service;
///import com.example.model.Libro;
import com.example.biblioteca2.model.Libro;
import com.example.biblioteca2.repository.libroRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class LibroService {


    @Autowired
    private libroRepository libroRepository;

    public List <Libro> getLibros(){

        return libroRepository.obtenerLibros();
    }








}
