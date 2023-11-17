/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.certamen2;



/**
 *
 * @author Estudiante
 */
public class Certamen2 {

    public static void main(String[] args) {
        
        Biblioteca prueba = new Biblioteca();
        
        Academico libroAcademico = new Academico();
        Novela novela = new Novela();
        TextoPUCV pucv = new TextoPUCV();
        
        libroAcademico.rellenarDatos();
        System.out.println("");
        novela.rellenarDatos();
        System.out.println("");
        pucv.rellenarDatos();
        System.out.println("");
        
        prueba.agregar(libroAcademico);
        prueba.agregar(novela);
        prueba.agregar(pucv);
        
        Libro buscado = prueba.buscar(1);
        buscado.mostrar();
        System.out.println("");
        
        buscado = prueba.buscar(2);
        buscado.mostrar();
        System.out.println("");
        
        buscado = prueba.buscar(3);
        buscado.mostrar();
        System.out.println("");
    }
}
