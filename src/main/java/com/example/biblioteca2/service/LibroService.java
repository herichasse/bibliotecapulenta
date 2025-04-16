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

    //Dependencia
    @Autowired
    private libroRepository libroRepository;

    public List<Libro> obtenerLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro buscarLibroPorId(int id){
        return libroRepository.buscarLibroPorId(id);
    }

    public Libro buscarLibroPorIsbn(String isbn){
        return libroRepository.buscarLibroPorIsnb(isbn);
    }

    public Libro buscarLibroPorAutor(String autor){
        return libroRepository.buscarLibroPorAutor(autor);
    }

    public Libro guaLibro(Libro lib){
        return libroRepository.guardarLibro(lib);
    }

    public Libro actualizarLibro(Libro lib){
        return libroRepository.actualizarLibro(lib);
    }

    public String eliminarLibro(int id){
        libroRepository.eliminarLibro(id);
        return "Libro eliminado";
    }

}