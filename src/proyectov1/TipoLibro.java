/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import tda.lista.Nodo;

/**
 *
 * @author panti
 */
public class TipoLibro {
    String nombre;
    int id;
    int ano;
    float puntaje;
    int cantidadPuntajes;
    String ISBN;
    Autores listaAutores;
    Tags listaTags;

    public void TipoLibro (String nombre, int id, int ano, float puntaje, int cantPunt, String isbn){
        this.nombre = nombre;
        this.id = id;
        this.ano = ano;
        this.puntaje = puntaje;
        this.cantidadPuntajes = cantPunt;
        this.ISBN = isbn;
        listaAutores = new Autores();
        listaTags = new Tags();
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+ id);
        System.out.println("Año: "+ ano);
        System.out.println("Puntaje: "+ puntaje);
        System.out.println("Cantidad de Calificaciones: "+ cantidadPuntajes);
        System.out.println("ISBN/ISBN13: "+ISBN);
        System.out.println("Autores: ");
        Nodo <TipoAutor> auxiliar = listaAutores.getPrimero();
        while(auxiliar != null){
            auxiliar.getDato().imprimirDatos();
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("Tags: ");
        Nodo <TipoTags> auxiliar2 = listaTags.getPrimero();
        while(auxiliar2 != null){
            auxiliar2.getDato().imprimirDatos();
            auxiliar2 = auxiliar2.getSiguiente();
            
        }
    }
    
    public String getNombre(){
        return this.nombre;               
    }
    
    public int getId(){
        return this.id;
    }

    public int getAno() {
        return ano;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public int getCantidadPuntajes() {
        return cantidadPuntajes;
    }

    public String getISBN() {
        return ISBN;
    }
    
    public Autores getAutores(){
        return listaAutores;
    }
    
    public Tags getTags(){
        return listaTags;
    }
        
}
