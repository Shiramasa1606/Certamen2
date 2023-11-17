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
public class TextoPUCV extends Academico {
    private String escuelaOrigen;
    
    
    public TextoPUCV(int codigoLibro, String titulo, String autor, int precio, String areaEnfoque, String escuelaOrigen) {
        super(codigoLibro, titulo, autor, precio, areaEnfoque);
        this.escuelaOrigen = escuelaOrigen;
    }
    
    public TextoPUCV(){
        super();
        this.escuelaOrigen = "";
    }
    
    public String getEscuelaOrigen() {
        return escuelaOrigen;
    }

    public void setEscuelaOrigen(String escuelaOrigen) {
        this.escuelaOrigen = escuelaOrigen;
    }


    @Override
    public void mostrar(){
        super.mostrar();
        System.out.printf("Escuela de Origen: %s\n", this.escuelaOrigen);
    }
    
    @Override
    public void rellenarDatos(){
        Scanner scanner = new Scanner(System.in);
        super.rellenarDatos();
        System.out.print("Ingrese la escuela de origen: ");
        this.escuelaOrigen = scanner.nextLine();
    }
    
}
