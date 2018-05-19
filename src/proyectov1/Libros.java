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
public class Libros extends Lista {
    
    public void mostrarUltimasEdiciones(int ano){
        Nodo<TipoLibro> auxiliar = this.getPrimero();
        while (auxiliar != null){
            if (auxiliar.getDato().ano >= ano){
                auxiliar.getDato().imprimirDatos();
            }
            auxiliar = auxiliar.getSiguiente();
            
        }
   
    }
     public void busquedaPorNombre(String nombre){
        Nodo<TipoLibro> auxiliar = this.getPrimero();
        while (auxiliar != null){
            if(auxiliar.getDato().getNombre().equals(nombre)){
                auxiliar.getDato().imprimirDatos();
            }
            auxiliar = auxiliar.getSiguiente();
        }
        
    }
    public void busquedaPorAno (int ano){
        Nodo<TipoLibro> auxiliar = this.getPrimero();
        while (auxiliar != null){
            if (auxiliar.getDato().getAno() == ano){
                auxiliar.getDato().imprimirDatos();
            }
            auxiliar = auxiliar.getSiguiente();
        }
        
    }
    
    public void busquedaPorIsbn(String isbn){
        Nodo <TipoLibro> aux = this.getPrimero();
        while(aux != null){
            if(aux.getDato().getISBN().equals((isbn))){
                aux.getDato().imprimirDatos();
                break;
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void busquedaPorGenero(int idGen){
        Nodo <TipoLibro> auxLibro = getPrimero();
        while(auxLibro != null){
            Nodo <TipoTags> auxTag = auxLibro.getDato().listaTags.getPrimero();
            while(auxTag != null){
                if(auxTag.getDato().getId() == idGen){
                    auxLibro.getDato().imprimirDatos();
                    break;
                }
                auxTag = auxTag.getSiguiente();
            }
            auxLibro = auxLibro.getSiguiente();
        }
        
    }
    
}
