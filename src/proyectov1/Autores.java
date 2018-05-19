/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

import Lista.Lista;
import tda.lista.Nodo;

/**
 *
 * @author panti
 */
public class Autores extends Lista {
    
    public void busquedaPorAutor(int id){
        Nodo<TipoAutor> auxiliar = getPrimero();
        while(auxiliar != null){
            if(auxiliar.getDato().id == id){
               auxiliar.getDato().imprimirDatosyLibros();
               break;
            }
        }
    }
    
    public Nodo<TipoAutor> eliminarAutor(int id, Libros listaLibros){
        Nodo <TipoAutor> auxAutor = getPrimero();
        while (auxAutor != null){
            if(auxAutor.getDato().getId() == id){
                Nodo <TipoAutor> autorBorrado = auxAutor.clonar();
                this.eliminar(auxAutor.getEtiqueta());
                Nodo <TipoLibro> auxLibroAutor = autorBorrado.getDato().getLibros().getPrimero();
                Nodo <TipoLibro> auxLibros = listaLibros.getPrimero();
                while(auxLibroAutor != null){
                    while(auxLibros != null){
                        if(auxLibros.equals(auxLibroAutor)){
                            listaLibros.eliminar(auxLibros.getEtiqueta());
                            break;
                        }
                        auxLibros = auxLibros.getSiguiente();
                    }
                    auxLibroAutor = auxLibroAutor.getSiguiente();
                }
                return autorBorrado;
              
            }
            auxAutor = auxAutor.getSiguiente();  
        }
        return null;
    }
}
