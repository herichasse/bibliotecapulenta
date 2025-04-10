package com.example.biblioteca2.repository;

import com.example.biblioteca2.model.libro;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

public class libroRepository {

        private List <libro> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init(){


        listaLibros.add(new libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2018, "Joshua Bloch"));
        
        listaLibros.add(new libro(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));
        
        listaLibros.add(new libro(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));
        
        listaLibros.add(new libro(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
        
    }

    public List <libro> obtenerLibros (){

        return listaLibros;
    }

    public libro buscarLibroPorId(int id){

        for (libro libro :listaLibros){
            if (libro.getId() == id) return libro;
        }
        return null;
 }

    public libro actualizar (libro lib){
        int id = 0;
        int idPosicion = 0;

        for (int i=0;i <listaLibros.size();i++){
                if (listaLibros.get (i).getId() == lib.getId()){
                    id = lib.getId();
                    idPosicion = i;
                }
        }
        return null;

    }







}
