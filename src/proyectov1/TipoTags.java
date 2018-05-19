/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectov1;

/**
 *
 * @author panti
 */
public class TipoTags {
    
    int id;
    String nombreTag;

    public TipoTags(int id, String nombreTag) {
        this.id = id;
        this.nombreTag = nombreTag;
    }
    
    public int getId() {
        return id;
    }

    public String getNombreTag() {
        return nombreTag;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombreTag);
        System.out.println("ID: "+ id);
    }
    
}
