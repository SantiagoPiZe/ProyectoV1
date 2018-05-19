package Lista;

import tda.lista.Nodo;

/*public void insertarOrdenado(Nodo<T> unNodo){
        Nodo<T> aux1;
        Nodo<T> aux2;
        if (esVacia()){
            setPrimero(unNodo);
        }else{
            aux1 = primero;
            while(aux1!=null){
                aux2 = aux1.getSiguiente();
                //el nodo va al comienzo
                if(unNodo.getEtiqueta().compareTo(aux1.getEtiqueta()) <= 0){
                    unNodo.setSiguiente(primero);
                    primero = unNodo;
                    break;
                }else{
                    //el nodo va al final
                    if(unNodo.getEtiqueta().compareTo(aux1.getEtiqueta()) > 0 && aux2==null){
                        aux1.setSiguiente(unNodo);
                        unNodo.setSiguiente(null);
                        break;
                    }else{
                        //el nodo va al medio
                        if(aux1.getEtiqueta().compareTo(unNodo.getEtiqueta())<0 && aux2.getEtiqueta().compareTo(unNodo.getEtiqueta()) >=0){
                            aux1.setSiguiente(unNodo);
                            unNodo.setSiguiente(aux2);
                            break;
                        }else{
                            aux1 = aux1.getSiguiente();
                        }
                    }
                }
            }
        }
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 * @param <T>
 */
public class ListaOrdenada<T> extends Lista<T> {

    @Override
    public void insertar(Nodo<T> unNodo) {
        if (this.esVacia()) {
            this.setPrimero(unNodo);
            unNodo.setSiguiente(null);
        } else if (this.cantElementos() == 1 && (this.getPrimero().compareTo(unNodo.getEtiqueta())) > 0) {
            unNodo.setSiguiente(this.getPrimero());
            this.setPrimero(unNodo);

        } else if (this.cantElementos() == 1 && (this.getPrimero().compareTo(unNodo.getEtiqueta())) < 0) {
            this.getPrimero().setSiguiente(unNodo);
        } else {
            Nodo aux = this.getPrimero();
            Nodo auxAnt = this.getPrimero();
            if ((this.getPrimero().compareTo(unNodo.getEtiqueta())) > 0) {
                unNodo.setSiguiente((this.getPrimero()));
                this.setPrimero(unNodo);
            } else {
                while (aux != null && (aux.compareTo(unNodo.getEtiqueta())) < 0) {
                    auxAnt = aux;
                    aux = aux.getSiguiente();
                }
                auxAnt.setSiguiente(unNodo);
                unNodo.setSiguiente(aux);
            }
        }
    }

}
