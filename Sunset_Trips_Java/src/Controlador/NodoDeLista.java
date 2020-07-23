
package Controlador;


public class NodoDeLista {
    
    private Object info; //Informacion del nodo
    private NodoDeLista siguiente; //Apuntador al siguiente elemento de la lista

    //Constructor de Nodo que recibe la info del Nodo
    public NodoDeLista(Object info) {
        this.info = info;
        this.siguiente = null;
    }
    
    //GETTERS Y SETTERS
    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
