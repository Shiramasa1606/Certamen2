/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Academico extends Libro {
    private String areaEnfoque;
    
    
    public Academico(int codigoLibro, String titulo, String autor, int precio, String areaEnfoque) {
        super(codigoLibro, titulo, autor, precio);
        this.areaEnfoque = areaEnfoque;
    }
    
    public Academico(){
        super();
        this.areaEnfoque = "";
    }
    
    
    public String getAreaEnfoque() {
        return areaEnfoque;
    }

    public void setAreaEnfoque(String areaEnfoque) {
        this.areaEnfoque = areaEnfoque;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.printf("Area de Enfoque: %s\n", this.areaEnfoque);
    }
    
    @Override
    public void rellenarDatos(){
        Scanner scanner = new Scanner(System.in);
        super.rellenarDatos();
        System.out.print("Ingrese el area de enfoque del libro: ");
        this.areaEnfoque = scanner.nextLine();
    }
    
}
