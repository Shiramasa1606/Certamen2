/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.certamen2;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Novela extends Libro {
    private String genero;

    public Novela(int codigoLibro, String titulo, String autor, int precio, String genero) {
        super(codigoLibro, titulo, autor, precio);
        this.genero = genero;
    }
    
    public Novela(){
        super();
        this.genero = "";
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.printf("Genero: %s\n", this.genero);
    }
    
    @Override
    public void rellenarDatos(){
        Scanner scanner = new Scanner(System.in);
        super.rellenarDatos();
        
        boolean generoValido = false;
        do {
            try {
                System.out.print("Ingrese el genero del libro (Historica, Romantica, Policiaca, Realista, Ciencia Ficcion o Aventuras): ");
                String inputGenero = scanner.nextLine().toLowerCase();

                // Quitar acentos de la entrada y capitalizar
                inputGenero = Normalizer.normalize(inputGenero, Normalizer.Form.NFD)
                        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                        .substring(0, 1).toUpperCase() + inputGenero.substring(1);

                // Validar si el género ingresado es válido
                if (inputGenero.equals("Historica") || inputGenero.equals("Romantica") ||
                    inputGenero.equals("Policiaca") || inputGenero.equals("Realista") ||
                    inputGenero.equals("Ciencia Ficcion") || inputGenero.equals("Aventuras")) {

                    this.genero = inputGenero;
                    generoValido = true;
                } else {
                    System.out.println("Error: Ingrese un género válido.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un género válido.");
            }
        } while (!generoValido);
    }

}
