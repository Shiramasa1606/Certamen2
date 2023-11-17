/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Biblioteca {
    private ArrayList <Libro> libros;
    
    
    public Biblioteca(){
        libros = new ArrayList<>();
    }
    
    public ArrayList <Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList <Libro> libros) {
        this.libros = libros;
    }
    
    public Libro buscar(int codigo){
        for (Libro libro : libros){
            if (libro.getCodigoLibro() == codigo) return libro;
        }
        return null;
    }
    
    public void agregar(Libro libro){
        this.libros.add(libro);
    }
    
    
}
