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
public class TipoAutor {
    
    int id;
    String nombre;
    Libros listaLibros;
    
    public void TipoAutor(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        listaLibros = new Libros();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Libros getLibros(){
        return listaLibros;
    }
    
    public void imprimirDatosyLibros(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("ID: "+ id);
        System.out.println("Libros: ");
        Nodo <TipoLibro> auxiliar = listaLibros.getPrimero();
        while(auxiliar != null){
            System.out.println("    Nombre: " + auxiliar.getDato().getNombre());
            System.out.println("    ID: " + auxiliar.getDato().getId());
            System.out.println("    Calificacion: " + auxiliar.getDato().getPuntaje());
            System.out.println("    Generos: ");
            Nodo <TipoTags> aux  = auxiliar.getDato().getTags().getPrimero();
            while(aux != null){
                System.out.println("aux.getDato().getNombreTag()");
                aux = aux.getSiguiente();
            }
            auxiliar =  auxiliar.getSiguiente();
        }
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("ID: "+ id);
    }
    
}
