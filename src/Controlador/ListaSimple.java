
package Controlador;

public class ListaSimple {

    private NodoDeLista cabeza = null;                 //Guarda el primer elemento de la lista
    private int tamaño = 0;                     //Guarda el tamaño de la lista

    //Metodo para saber si la lista está vacia
    public boolean isVacia(){
        return cabeza == null;                  //Si no hay nadie en la cabeza, la lista esta vacia
    }
    
    //Metodo para agregar un NODO al comienzo de la lista
    public void addPrimeroNodo(NodoDeLista n){
        NodoDeLista k = cabeza;                        //Se guarda la cabeza actual
        cabeza = n;                             //Se inserta el nodo en la cabeza 
        cabeza.setSiguiente(k);                 //Se pone a cabeza a apuntar a la anterior cabeza
        tamaño++;                               //Se aumenta el tamaño de la lista
        
    }
    
    //Metodo para agregar al comienzo conociendo la INFO
    public void addPrimeroInfo(Object n){
        NodoDeLista nuevo = new NodoDeLista(n);               //Se crea un nuevo nodo con la información
        nuevo.setSiguiente(cabeza);             //Se establece que cabeza es el siguiente
        cabeza = nuevo;                         //Se pone el nuevo nodo como cabeza
        tamaño++;                               //Se aumenta el tamaño
    }
    
    //Metodo add para agregar un NODO a la lista al final
    public void addFinalNodo(NodoDeLista n){
        NodoDeLista k = cabeza;                        // Apuntador a cabeza
        
        if(isVacia()){                        //Si la lista esta vacia
            
            cabeza = n;                         //El primer elemento de la lista sera el que se quiere agregar
            cabeza.setSiguiente(k);             //Hace que la cabeza apunte a null porque no hay mas nada en la lista
            tamaño++;                           //Para contar que se agrego un nodo a la lista
            
        }else{                                  //En cambio, si ya hay elementos en la lista...
            
            while(k.getSiguiente() != null){    // Mientras el nodo auxiliar no apunte a null
                k = k.getSiguiente();           //Se avanza el nodo auxiliar al siguiente nodo de la lista
            }                                   //Al salir k ya está en el ultimo nodo
            
            k.setSiguiente(n);                  //Se agrega el nodo nuevo al final de la lista
            tamaño ++;                          //Para contar que se agrego un nuevo nodo a la lista
        }
    }
    
    //Metodo para agregar al final sabiendo la INFO
    public void addFinalInfo(Object n){
        NodoDeLista nuevo = new NodoDeLista(n);                       //Se crea un nodo con la información
        NodoDeLista puntero = cabeza;                          //Se crea un puntero a cabeza
        
        if(isVacia()){                                //Si la lista esta vacia
            
            cabeza = nuevo;                             //La cabeza será el nuevo nodo
            tamaño++;                                   //Se aumenta el tamaño de la lista    
            
        }else{                                          //Si la lista no está vacia
            
            while(puntero.getSiguiente() != null ){     //Mientras el puntero no llegue al final
                puntero = puntero.getSiguiente();       //Se mueve el puntero al siguiente nodo
            }                                           //Se está en el final de la lista
            
            puntero.setSiguiente(nuevo);                //Se pone el nuevo nodo al final 
            tamaño++;                                   //Se aumenta el tamaño
            
        }
    }
    
    //Metodo para agregar un NODO luego de una posicion específica de la lista
    public void addLuegoDePosicionNodo(NodoDeLista n, int posicion){
        
        if(isVacia()){                                                //Si está vacia
            
            cabeza = n;                                                 //Se inserta el nodo en la cabeza                             
            tamaño++;                                                   //Se aumenta el tamaño
            
        }else{                                                          //Si no está vacia
            
            NodoDeLista aux = cabeza;                                          //En un nodo auxiliar se guarda la cabeza
            int posAux = 0;                                             //Se inicia la posición de aux en 0
            
            while((aux.getSiguiente() != null) && posAux < posicion){   //Mientras no se llegue al final o a la posicion
                aux = aux.getSiguiente();                               //Se avanza el nodo
                posAux++;                                               //Se aumenta la posicion del nodo
            }                                                           //Al salir se está en el final o en el anterior a la posicion
            
            n.setSiguiente(aux.getSiguiente());                         //Se inserta el nodo en la posicion
            aux.setSiguiente(n);                                        //Manejando apuntadores
            tamaño++;                                                   //Se aumenta el tamaño
        }
    }
    
    //Metodo para agregar un elemento luego de una posicion específica de la lista sabiendo la INFO
    public void addLuegoDePosicionInfo(Object n, int posicion){
        NodoDeLista nuevo = new  NodoDeLista(n);
        
        if(isVacia()){                                                //Si está vacia
            
            cabeza = nuevo;                                             //Se inserta el nodo en la cabeza                             
            tamaño++;                                                   //Se aumenta el tamaño
            
        }else{                                                          //Si no está vacia
            
            NodoDeLista aux = cabeza;                                          //En un nodo auxiliar se guarda la cabeza
            int posAux = 0;                                             //Se inicia la posición de aux en 0
            
            while((aux.getSiguiente() != null) && posAux < posicion){   //Mientras no se llegue al final o a la posicion
                aux = aux.getSiguiente();                               //Se avanza el nodo
                posAux++;                                               //Se aumenta la posicion del nodo
            }                                                           //Al salir se está en el final o en el anterior a la posicion
            
            nuevo.setSiguiente(aux.getSiguiente());                     //Se inserta el nodo en la posicion
            aux.setSiguiente(nuevo);                                    //Manejando apuntadores
            tamaño++;                                                   //Se aumenta el tamaño
        }
    }
        
    //Metodo para agregar un elemento antes de una posicion específica de la lista
    public void addAntesDePosicionNodo(NodoDeLista n, int posicion){
        
        if(isVacia()){
            
            cabeza = n;
            tamaño++;
            
        }else{
            
            NodoDeLista aux = cabeza;
            int posAux = 0;
            
            while((aux.getSiguiente() != null) && ((posAux + 1) < posicion)){
                aux = aux.getSiguiente();
                posAux++;
            }
            
            n.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(n);
            tamaño++;
        }
    }
    
    //Metodo para agregar un elemento antes de una posicion específica de la lista
    public void addAntesDePosicionInfo(Object n, int posicion){
        NodoDeLista nuevo = new NodoDeLista(n);
        
        if(isVacia()){
            
            cabeza = nuevo;
            tamaño++;
            
        }else{
            
            NodoDeLista aux = cabeza;
            int posAux = 0;
            
            while((aux.getSiguiente() != null) && ((posAux + 1) < posicion)){
                aux = aux.getSiguiente();
                posAux++;
            }
            
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            tamaño++;
        }
    }
    
    //Metodo para obtener el valor de un elemento de la lista en una posicion especifica
    public Object obtenerValorDe(int posicion){
        
        if(cabeza != null){
            
            NodoDeLista aux = cabeza;
            int posAux = 0;
            
            while(aux.getSiguiente() != null && posAux < posicion){
                aux = aux.getSiguiente();
                posAux++;
            }
            
            if(posAux != posicion){
                return null;
            }else{
                return aux.getInfo();
            }
        }else{
            return null;
        }
    }
    
    //Metodo para eliminar el primero de la lista
    public void eliminarPrimero(){
        if(!isVacia()){
            NodoDeLista primero = cabeza;
            cabeza = cabeza.getSiguiente();
            primero.setSiguiente(null);
            tamaño--;
        }
    }
    
    //Metodo para eliminar el ultimo de la lista
    public void eliminarUltimo(){
        
        if(!isVacia()){
            if(cabeza.getSiguiente() == null){
                cabeza = null;
                tamaño--;
            }else{
                NodoDeLista aux = cabeza;

                while(aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }

                aux.setSiguiente(null);
                tamaño--;
            }
        }
    }
    
    //Metodo para eliminar un elemento en una posicion
    public void eliminarPosicion(int posicion){
        
        if(cabeza != null){
            NodoDeLista aux = cabeza;
            int posAux = 0;
            
            if(posicion == 0){
                this.eliminarPrimero();
            }else if(posicion < tamaño){
                while(aux != null && posAux < (posicion - 1)){
                    aux = aux.getSiguiente();
                    posAux++;
                }
                NodoDeLista eliminar = aux.getSiguiente();
                aux.setSiguiente(eliminar.getSiguiente());
                eliminar.setSiguiente(null);
                tamaño--;
            }
        } 
    }
    
    //Metodo para obtener valor el ultimo nodo
    public NodoDeLista getUltimo(){
        NodoDeLista aux = cabeza;
        
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        
        return aux;
    }
    
    //Metodo para verificar si un elemento está en una lista
    public boolean VerificarElemento(Object elemento){ //Parámetro depende del tipo de info
        NodoDeLista aux = cabeza;
          
        if(aux != null){
            while(aux != null){
                if(aux.getInfo().equals(elemento)){
                    return true;
                }else{
                    aux = aux.getSiguiente();
                }
            }
        }
        return false;
    }
 
    //Metodo print para imprimir la lista
    public void print(){
        NodoDeLista k = cabeza;
        
        while(k != null){ //Mientras que hayan elementos en la lista
            System.out.print(k.getInfo() + " / "); //Se imprime el nombre del estudiante
            k = k.getSiguiente(); //Se pasa al siguiente nodo
        }
    }
    
    //Metodo para vacial la lista
    public void vaciarLista(){
        this.cabeza = null;
        this.tamaño = 0;
    }
    
    //GETTERS Y SETTERS
    public NodoDeLista getCabeza() {
        return cabeza;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setCabeza(NodoDeLista cabeza) {
        this.cabeza = cabeza;
    }

    public void setTamaño(int contadorNodo) {
        this.tamaño = contadorNodo;
    }
    
}
