package Lista;


import tda.lista.Nodo;


public class Lista<T> implements ILista<T> {

    private Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    public Lista(Nodo<T> unNodo) {
        this.primero = unNodo;
    }

    @Override
    public void insertar(Nodo<T> unNodo) {
        if (esVacia()) {
            setPrimero(unNodo);
        } else {
            Nodo<T> aux = getPrimero();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = getPrimero();
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            Nodo aux = getPrimero();
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return getPrimero() == null;
    }

    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    @Override
    public boolean eliminar(Comparable clave) {
       Nodo<T> aux = this.getPrimero();
       Nodo<T> previoAux = this.getPrimero();
       while(aux != null){
           if(aux.getEtiqueta() == clave && this.cantElementos() > 1){
               previoAux.setSiguiente(aux.getSiguiente());
               aux.setSiguiente(null);
               return true;
           }else if(aux.getEtiqueta() == clave && this.cantElementos() == 1){
               Nodo<T> nodo = quitarPrimero();
               return true;
           }
           previoAux = aux;
           aux = aux.getSiguiente();
       }
       return false;
    }

    @Override
    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            Nodo<T> temp = getPrimero();
            while (temp != null) {
                temp.imprimirEtiqueta();
                aux += temp.getEtiqueta() + " ";
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    @Override
    public String imprimir(String separador) {
        String aux;
        if (esVacia()) {
            return "";
        } else {
            Nodo<T> temp = getPrimero();
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    @Override
    public Nodo<T> quitarPrimero() {
        Nodo <T> aux = this.primero;
        this.setPrimero(aux.getSiguiente());
        aux.setSiguiente(null);
        return aux;
    }

}
