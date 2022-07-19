package Controlador;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Grafo {
    
    private ListaSimple ciudades;
    private JTextArea rutas;
    
    public Grafo() {
        this.ciudades = new ListaSimple();
        this.rutas = new JTextArea();
        this.rutas.setText("");
    }
    
    //METODO PARA AGREGAR UNA CIUDAD AL GRAFO
    public void agregarCiudad(Ciudad ciudad){
        
        //Si la ciudad existe
        if(existeCiudad(ciudad.getNombreCiudad())){
            //Mensaje de error
            JOptionPane.showMessageDialog(null, "La ciudad indicada ya existe.", "Error ciudad repetida", JOptionPane.ERROR_MESSAGE);
        }else{
            //Si la ciudad no existe se agrega a la lista
            this.ciudades.addFinalInfo(ciudad);
        }
        
    }
    
    //METODO PARA AGREGAR UN VUELO AL GRAFO
    public void agregarVuelo(Vuelo nuevoVuelo){
        
        //Veriables auxiliares
        Ciudad origen = null;
        Ciudad destino = null;
        int posO = 0;
        
        //Busco la ciudad de origen
        for(int i = 0; i < this.ciudades.getTamaño(); i++){
            Ciudad aux = (Ciudad) ciudades.obtenerValorDe(i);
            //Si la ciudad es igual al origen del vuelo
            if(aux.getNombreCiudad().equalsIgnoreCase(nuevoVuelo.getCiudadOrigen())){
                origen = aux; //Se guarda la ciudad origen
                posO = i;
                break;
            }
        }
        
        //Busco la ciudad de destino
        for(int i = 0; i < this.ciudades.getTamaño(); i++){
            Ciudad aux = (Ciudad) ciudades.obtenerValorDe(i);
            //Si la ciudad es igual al destino del vuelo
            if(aux.getNombreCiudad().equalsIgnoreCase(nuevoVuelo.getCiudadDestino())){
                destino = aux; //Se guarda la ciudad destino
                break;
            }
        }
        
        if(existeVuelo(origen, destino) || existeVuelo(destino, origen)){ //OJO CORREO PROFESOR
            JOptionPane.showMessageDialog(null, "El vuelo que desea agregar ya existe, intente de nuevo", "Error vuelo repetido", JOptionPane.ERROR_MESSAGE);
        }else{
            
            //Busco la ciudad de origen
            for(int i = 0; i < this.ciudades.getTamaño(); i++){
                Ciudad aux = (Ciudad) ciudades.obtenerValorDe(i);
                //Si es la ciudad de origen
                if(aux.getNombreCiudad().equalsIgnoreCase(origen.getNombreCiudad())){
                    ((Ciudad) this.ciudades.obtenerValorDe(i)).getListaVuelos().addFinalInfo(nuevoVuelo);
                }
            }
            
            JOptionPane.showMessageDialog(null, "El vuelo ha sido agregado correctamente.", "Vuelo agregado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //MÉTODO PARA ELIMINAR UN VUELO ENTRE DOS CIUDADES
    public void eliminarVuelo(String origen, String destino){
        boolean existeCiudad = false;//Revisar si existe ciudad
        boolean existeVuelo = false;//Revisar si existe vuelo
        Ciudad aux=null;
        Vuelo eliminar;
        int posicion = 0;
        
        //Busco si existe la ciudad de origen 
        for (int i = 0; i < this.getCiudades().getTamaño(); i++) {
            if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(origen)){
               existeCiudad=true;
               aux=((Ciudad)this.ciudades.obtenerValorDe(i));
                break;
            }
        }
        
        //Si el vuelo no existe lanza mensaje 
        if(!existeCiudad){
            JOptionPane.showMessageDialog(null, "La ciudad a la que le desea eliminar un vuelo no existe, intente de nuevo", "Error de ciudad inexistente", JOptionPane.ERROR_MESSAGE);
        
        }else {
            
        //Busco si existe el vuelo entre la ciudad origen y destino
         for (int i = 0; i < aux.getListaVuelos().getTamaño(); i++) {
            eliminar = (Vuelo) aux.getListaVuelos().obtenerValorDe(i);
            if(eliminar.getCiudadOrigen().equalsIgnoreCase(origen) && eliminar.getCiudadDestino().equalsIgnoreCase(destino)){
                existeVuelo = true;
                posicion=i;
                break;
            }
        }
            
            if (!existeVuelo){
                JOptionPane.showMessageDialog(null, "El vuelo que desea eliminar no existe, intente de nuevo", "Error de vuelo inexistente", JOptionPane.ERROR_MESSAGE);

            }else{
            // Si existe la ciudad de origen, busco si existe el vuelo al destino indicado 
            aux.getListaVuelos().eliminarPosicion(posicion);
            
             JOptionPane.showMessageDialog(null, "El vuelo ha sido eliminado correctamente.", "Vuelo eliminado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
    
    //METODO PARA ELIMINAR UNA CIUDAD
    public void eliminarCiudad(String ciudadEliminar){
        Ciudad aux = null; //Ciudad aux
        boolean existeCiudad = false; //Revisar si la ciudad existe
        int posicion = 0;//Para guardar la posición de la lista donde se encuntra
        
        //Busco si existe la ciudad de origen 
        for (int i = 0; i < this.getCiudades().getTamaño(); i++) {
            if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(ciudadEliminar)){
               existeCiudad=true;
               posicion=i;
                break;
            }
        }
        
        
        
         //Si el vuelo no existe lanza mensaje 
        if(!existeCiudad){
            JOptionPane.showMessageDialog(null, "La ciudad que desea eliminar no existe, intente de nuevo", "Error de ciudad inexistente", JOptionPane.ERROR_MESSAGE);
        
        }else {
            // Si existe la ciudad, eliminar
             for (int i = 0; i < this.getCiudades().getTamaño(); i++) {
                aux = (Ciudad) this.ciudades.obtenerValorDe(i);
                for (int j = 0; j < aux.getListaVuelos().getTamaño(); j++) {
                    Vuelo aux2 = (Vuelo) aux.getListaVuelos().obtenerValorDe(j);
                    if(aux2.getCiudadDestino().equalsIgnoreCase(ciudadEliminar)){
                        aux.getListaVuelos().eliminarPosicion(j);
                    }
                }
            }
            
            this.ciudades.eliminarPosicion(posicion);//Método eliminar 
            //Mensaje de eliminado correctamente
             JOptionPane.showMessageDialog(null, "La ciudad ha sido eliminada correctamente.", "Ciudad eliminada", JOptionPane.INFORMATION_MESSAGE);
        
    }
        
        
        
        
        
        
    }
    
    //METODO PARA MODIFICAR UN VUELO
    public void modificarVuelo(String ciudadOrigen, String ciudadDestino, int duracion, int numeroVuelo, String lineaAerea, int costoVuelo){
        
        boolean existeCiudad = false;//Revisar si existe ciudad
        boolean existeVuelo = false;//Revisar si existe vuelo
        Ciudad aux=null;//Ciudad aux
        Vuelo modificar;//Vuelo aux 
        int posicion = 0;//Para guardar posición donde está para modificarlo
        
        //Busco si existe la ciudad de origen 
        for (int i = 0; i < this.getCiudades().getTamaño(); i++) {
            if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(ciudadOrigen)){
               existeCiudad=true;
               aux=((Ciudad)this.ciudades.obtenerValorDe(i));
                break;
            }
        }
       
        //Busco si existe el vuelo entre la ciudad origen y destino
         for (int i = 0; i < aux.getListaVuelos().getTamaño(); i++) {
            modificar = (Vuelo) aux.getListaVuelos().obtenerValorDe(i);
            if(modificar.getCiudadOrigen().equals(ciudadOrigen) && modificar.getCiudadDestino().equals(ciudadDestino)){
                existeVuelo = true;
                posicion=i;
                break;
            }
        }
            
        //Si la ciudad no existe lanza mensaje 
        if(!existeCiudad){
            JOptionPane.showMessageDialog(null, "La ciudad a la que le desea modificar un vuelo no existe, intente de nuevo", "Error de ciudad inexistente", JOptionPane.ERROR_MESSAGE);
        
        }else {
            //Si el vuelo no existe lanza mensaje 
            if (!existeVuelo){
                JOptionPane.showMessageDialog(null, "El vuelo que desea modificar no existe, intente de nuevo", "Error de vuelo inexistente", JOptionPane.ERROR_MESSAGE);

            }else{
            //Si existen recorreo lista ciudad y su lista vuelo para luego modificarlo
                for (int i = 0; i < this.ciudades.getTamaño(); i++) {
                    
                    if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(ciudadOrigen)){
                        
                        for (int j = 0; j < ((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().getTamaño(); j++) {
                            
                            if(((Vuelo)((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j)).getCiudadDestino().equals(ciudadDestino)){
                                
                                ((Vuelo)((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j)).setDuracion(duracion);
                                ((Vuelo)((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j)).setNumeroVuelo(numeroVuelo);
                                ((Vuelo)((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j)).setLineaAerea(lineaAerea);
                                ((Vuelo)((Ciudad)this.ciudades.obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j)).setCostoVuelo(costoVuelo);
                                break;
                                
                            }
                            
                            
                        }
                        
                    }
                }
            //Mensaje de vuelo modificado con éxito
             JOptionPane.showMessageDialog(null, "El vuelo ha sido modificado correctamente.", "Vuelo modificado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
        
    }
    
    //METODO PARA OBTENER LA MATRIZ DE ADYACENCIA
    public int[][] matrizAdyacencia(){
        int n = this.ciudades.getTamaño();
        int[][] matrizAdyacencia = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrizAdyacencia[i][j] = 0;
            }
        }
        
        for(int i = 0; i < n; i++){
            
            Ciudad aux1 = (Ciudad) this.ciudades.obtenerValorDe(i);
            
            for(int j = 0; j < n; j++){
                
                Ciudad aux2 = (Ciudad) this.ciudades.obtenerValorDe(j);
                if(existeVuelo(aux1, aux2)){
                    matrizAdyacencia[i][j] = 1;
                }
            }
        }
        
        return matrizAdyacencia;
    }
    
    //METODO PARA OBTENER LA MATRIZ DE PESOS
    public int[][] matrizPesos(int criterio){
        int n = this.ciudades.getTamaño();
        int[][] matrizPesos = new int[n][n];
        
        for(int i = 0; i < n; i++){
            
            Ciudad aux1 = (Ciudad) this.ciudades.obtenerValorDe(i);
            
            for(int j = 0; j < n; j++){
                
                Ciudad aux2 = (Ciudad) this.ciudades.obtenerValorDe(j);
                if(existeVuelo(aux1, aux2)){
                    matrizPesos[i][j] = obtenerPesoVuelo(aux1, aux2, criterio);
                }else{
                    matrizPesos[i][j] = 999999999;
                }
            }
        }
        
        return matrizPesos;
    }
    
    //METODO PARA VER SI EXISTE UNA CIUDAD
    public boolean existeCiudad(String nombreCiudad){
        
        for(int i = 0; i < this.ciudades.getTamaño(); i++){
            if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equals(nombreCiudad)){
                return true;
            }
        }
        
        return false;
    }
    
    //METODO PARA VER SI EXISTE UN VUELO
    public boolean existeVuelo(Ciudad origen, Ciudad destino){
        
        for(int i = 0; i < origen.getListaVuelos().getTamaño(); i++){
            Vuelo aux = (Vuelo) origen.getListaVuelos().obtenerValorDe(i);
            if(aux.getCiudadDestino().equals(destino.getNombreCiudad())){
                return true;
            }
        }
        
        return false;
    }
    
    //METODO PARA OBTENER EL PESO DE UN VUELO SEGUN CRITERIO
    public int obtenerPesoVuelo(Ciudad origen, Ciudad destino, int criterio){
        
        for(int i = 0; i < origen.getListaVuelos().getTamaño(); i++){
            Vuelo aux = (Vuelo) origen.getListaVuelos().obtenerValorDe(i);
            if(aux.getCiudadDestino().equals(destino.getNombreCiudad())){
                if(criterio == 1){
                    return aux.getCostoVuelo();
                }else{
                    return aux.getDuracion();
                }
            }
        }
        
        return 999999999;
    }
    
    public void printAllPaths(String origen, String destino){
        ListaSimple pathList = new ListaSimple();
        boolean[] isVisited = new boolean[this.ciudades.getTamaño()];
        
        pathList.addFinalInfo(origen);
        
        printAllPathUtil(origen, destino, pathList, isVisited);
    }
    
    public void printAllPathUtil(String origen, String destino, ListaSimple localPathList, boolean[] isVisited){
        
        int posO = 0;

            for (int i = 0; i < this.getCiudades().getTamaño(); i++) {
                if (((Ciudad)this.getCiudades().obtenerValorDe(i)) != null) {

                    if (((Ciudad)this.getCiudades().obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(origen)) {
                        posO = i;
                        break;
                    }
                }
            }
        
        if(origen.equals(destino)){
            
            for(int j = 0; j < localPathList.getTamaño(); j++){
                if( j < (localPathList.getTamaño() - 1)){
                    rutas.setText(rutas.getText() + (localPathList.obtenerValorDe(j)) + " >>> ");
                    
                }else{
                    rutas.setText(rutas.getText() + (localPathList.obtenerValorDe(j)) + "\n");
                    
                }
            }
            isVisited[posO] = false;
            return;
        }
        
        int origenPos = -1;
        
        for(int i = 0; i < this.ciudades.getTamaño(); i++){
            if(((Ciudad)this.ciudades.obtenerValorDe(i)).getNombreCiudad().equals(origen)){
                isVisited[i] = true;
                origenPos = i;
                break;
            }
        }
        
        for(int i = 0; i < matrizAdyacencia().length; i++){
            if(matrizAdyacencia()[origenPos][i] != 0 && !isVisited[i]){
                localPathList.addFinalInfo(((Ciudad)ciudades.obtenerValorDe(i)).getNombreCiudad());
                printAllPathUtil(((Ciudad)ciudades.obtenerValorDe(i)).getNombreCiudad(), destino, localPathList, isVisited);
                localPathList.eliminarUltimo();
            }
        }
        
        isVisited[posO] = false;
    }
    
    
    
    
    
    //GETTERS Y SETTERS
    public ListaSimple getCiudades() {
        return ciudades;
    }

    public void setCiudades(ListaSimple ciudades) {
        this.ciudades = ciudades;
    }
    
    public void vaciarGrafo(){
        ciudades.vaciarLista();
    }
    
    public boolean esVacioGrafo(){
        return ciudades.isVacia();
    }
    
    public int tamañoGrafo(){
        return ciudades.getTamaño();
    }

    public JTextArea getRutas() {
        return rutas;
    }

    public void setRutas(JTextArea rutas) {
        this.rutas = rutas;
    }
    
    
    
}
