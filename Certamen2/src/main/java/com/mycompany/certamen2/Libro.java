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
public abstract class Libro {
    private int codigoLibro;
    private String titulo;
    private String autor;
    private int precio;

    public Libro(int codigoLibro, String titulo, String autor, int precio) {
        this.codigoLibro = codigoLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    
    public Libro(){
        this.codigoLibro = 0;
        this.titulo = "";
        this.autor = "";
        this.precio = 0;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }
    
    public void mostrar(){
        System.out.printf("Codigo del Libro: %d\n", this.codigoLibro);
        System.out.printf("Titulo del Libro: %s\n", this.titulo);
        System.out.printf("Autor del Libro: %s\n", this.autor);
        System.out.printf("Precio: %d\n", this.precio);
    }
    
    // Método para rellenar los datos desde el teclado
    public void rellenarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el codigo del libro: ");
        this.codigoLibro = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()

        System.out.print("Ingrese el titulo del libro: ");
        this.titulo = scanner.nextLine();

        System.out.print("Ingrese el nombre del autor: ");
        this.autor = scanner.nextLine();

        System.out.print("Ingrese el precio del libro: ");
        this.precio = scanner.nextInt();
        scanner.nextLine();
        
    }
    
}
