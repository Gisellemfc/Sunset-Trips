package Controlador;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class ArchivoTxt {

    //ATRIBUTO de la clase
    private File fl;
    
    //CONSTRUCTOR del archivo
    public ArchivoTxt(){
        
        //Se crea un nuevo archivo de texto plano
        File fl = new File("Archivo.txt");
        
        try {
            
            if (!fl.exists()) {//Valida que el archivo exista
                fl.createNewFile();//crea el nuevo archivo
            }
            
            //Si el archivo existe, sobreescribe directamente sobre el
            
        } catch (Exception e) {

            //Error en creación
            JOptionPane.showMessageDialog(null, "El archivo no pudo ser creado", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    //METODO PARA ABRIR UN ARCHIVO
    public String Abrir(File archivo) {
        
        //Variable auxiliar
        String contenido = "";
        
        try {
            
            //Proceso para leer el archivo letra a letra
            FileInputStream entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                contenido += caracter;
            }
            
        } catch (Exception e) {

        }
        
        //Devuelve lo que tiene escrito el archivo
        return contenido;
        
    }
    
    public void cargar(Lienzo mapa, String aux, BufferedReader bf) throws FileNotFoundException, IOException{
    
        //Variables auxiliares
        String aux_ciudades = "";
        String aux_aeropuertos = "";
        String aux_paises = "";
        int aux_nVuelo = 0;
        String aux_aerolinea = "";
        int aux_costo = 0;
        int aux_duracion = 0;
        String aux_cDestino = "";
        String aux_cOrigen = "";
        int aux_posX = 0;
        int aux_posY = 0;
        ListaSimple vuelos = new ListaSimple();
               
        //Mientras no se haya terminado de leer el archivo
        while (aux != null) {

        //Si se lee ciudades
        if (aux.equals("ciudades")) {
            
            do { 
                
                aux = bf.readLine(); //Se lee la siguiente linea
                
                //Si aux es distinto a fciudades
                if (!aux.equals("fciudades")) {

                    //Guardar datos de las ciudades en variables auxiliares
                    String[] arreglo = aux.split(",", 3);
                    aux_ciudades = arreglo[0];
                    aux_aeropuertos = arreglo[1];
                    aux_paises = arreglo[2];
                    
                    do{
                        
                        //Hallar coordenadar random dentro del lienzo para pintar las ciudades
                        aux_posX = ThreadLocalRandom.current().nextInt(30, mapa.getBounds().width - 30);
                        aux_posY = ThreadLocalRandom.current().nextInt(30, mapa.getBounds().height - 30);
                                            
                    }while(mapa.estaEncima(new Point(aux_posX, aux_posY))); //Repetir la busqueda de coordenadas hasta no obtener una coordenada superpuesta a otra ciudad
                    
                    //Se crea una nueva ciudad con los datos recopilados
                    Ciudad nueva = new Ciudad(aux_ciudades, aux_aeropuertos, aux_paises, aux_posX, aux_posY);
                    
                    //Se agrega la ciudad al grafo
                    mapa.getGrafo().agregarCiudad(nueva);
                    
                    }
                
                    mapa.repaint(); //Repintar el mapa

            }while (!aux.equals("fciudades")); //Se repite este proceso mientras aux no lea fciudades

        }
        
        //Si aux es igual a fciudades
        if (aux.equalsIgnoreCase("fciudades")) {
                                
            do {

                
                aux = bf.readLine();
                if (!aux.equals("fvuelos")) {
                                        
                                        
                                        String[] arreglo2 = aux.split(",", 4);
                                        aux_nVuelo = Integer.parseInt(arreglo2[0]);
                                        aux_aerolinea = arreglo2[1];
                                        aux_costo = Integer.parseInt(arreglo2[2]);
                                        aux_duracion = Integer.parseInt(arreglo2[3]);
                                        
                                        Vuelo nuevoVuelo = new Vuelo("", "", aux_duracion, aux_nVuelo, aux_aerolinea, aux_costo, null, null);
                                        vuelos.addFinalInfo(nuevoVuelo);
                                        
                                    }
                                    
                                } while (!aux.equals("fvuelos"));

                            }
                            if (aux.equalsIgnoreCase("fvuelos")) {
                                
                                int j = 0;
                                
                                
                                do {
                                    aux = bf.readLine();
                                    if (aux != null) {
                                        
                                        String[] arreglo = aux.split(",", 3);
                                        aux_cOrigen = (arreglo[0]);
                                        aux_cDestino = (arreglo[1]);
                                        
                                        ((Vuelo) vuelos.obtenerValorDe(j)).setCiudadOrigen(aux_cOrigen);
                                        ((Vuelo) vuelos.obtenerValorDe(j)).setCiudadDestino(aux_cDestino);
                                        
                                        Ciudad origen = null;
                                        Ciudad destino = null;
                                        
                                    //Busco la ciudad de origen
                                    for(int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++){
                                        Ciudad auxC = (Ciudad) mapa.getGrafo().getCiudades().obtenerValorDe(i);
                                        //Si la ciudad es igual al origen del vuelo
                                        if(auxC.getNombreCiudad().equalsIgnoreCase(aux_cOrigen)){
                                            origen = auxC; //Se guarda la ciudad origen
                                            break;
                                        }
                                    }

                                    //Busco la ciudad de destino
                                    for(int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++){
                                        Ciudad auxC = (Ciudad) mapa.getGrafo().getCiudades().obtenerValorDe(i);
                                        //Si la ciudad es igual al destino del vuelo
                                        if(auxC.getNombreCiudad().equalsIgnoreCase(aux_cDestino)){
                                            destino = auxC; //Se guarda la ciudad destino
                                            break;
                                        }
                                    }
                                    
                                    ((Vuelo) vuelos.obtenerValorDe(j)).setP1(new Point(origen.getX(), origen.getY()));
                                    ((Vuelo) vuelos.obtenerValorDe(j)).setP2(new Point(destino.getX(), destino.getY()));
                                        
                                    mapa.getGrafo().agregarVuelo((Vuelo) vuelos.obtenerValorDe(j));
                                    j++;

                                    }
                                    
                                    mapa.repaint();
                                    
                                } while (aux != null);
                            }
                            aux = bf.readLine();
                        }
    }
    
    
    //METODO ACTUALIZAR REPOSITORIO EN EL ARCHIVO TXT
    public void actualizarRepositorio(File fl, Grafo g){
        
        try{//Recolectar información de ciudades y actualizar
            PrintWriter pw = new PrintWriter(fl);
            pw.println("ciudades");
            for (int i = 0; i < g.getCiudades().getTamaño(); i++) {
                Ciudad aux = ((Ciudad) g.getCiudades().obtenerValorDe(i));
                pw.println(aux.getNombreCiudad() + "," + aux.getAeropuerto() + "," + aux.getPais());
            }
            //Recolectar información de vuelo y actualizar
             pw.println("fciudades");
            for (int i = 0; i < (g.getCiudades().getTamaño()); i++) {
                for (int j = 0; j < ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().getTamaño(); j++) {
                    Vuelo aux = ((Vuelo) ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j));
                    pw.println(aux.getNumeroVuelo() + "," + aux.getLineaAerea() + "," + aux.getDuracion() + "," + aux.getCostoVuelo());
                }
            }
            //Recolectar información de relación vuelos con ciudades y actualizar
            pw.println("fvuelos");
            for (int i = 0; i < g.getCiudades().getTamaño(); i++) {
                for (int j = 0; j < ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().getTamaño(); j++) {
                    Vuelo aux = ((Vuelo) ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j));
                    pw.println(aux.getCiudadOrigen() + "," + aux.getCiudadDestino() + "," + aux.getNumeroVuelo());
                }

            }
            pw.close(); //Cierre de ejecución de actualización de repositorio
             JOptionPane.showMessageDialog(null, "Información guardada correctamente\nEl archivo se ha guardado en su carpeta del proyecto", "El archivo ha sido actualizado", JOptionPane.INFORMATION_MESSAGE);//Mensaje de archivo txt actualizado
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo guardar su información correctamente.", "Error en la actualización del repositorio", JOptionPane.ERROR_MESSAGE);//Mensaje de error en actualización
        
        }
    }
    /**
     * Guarda la información recuperada de la clase Vuelo en el archivo.txt
     *
     * @param fl
     * @param g
     */
    
    //METODO DE LA INFORMACION DEL VUELO
    public void informacionVueloTxt(File fl, Grafo g) {
        Ciudad c;
        try {

            //FileWriter fw = new FileWriter(fl, true);
            PrintWriter pw = new PrintWriter(fl);
            pw.println("fciudades");
            for (int i = 0; i < (g.getCiudades().getTamaño()); i++) {
                for (int j = 0; j < ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().getTamaño(); i++) {
                    Vuelo aux = ((Vuelo) ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j));
                    pw.println(aux.getNumeroVuelo() + "," + aux.getLineaAerea() + "," + aux.getDuracion() + "," + aux.getCostoVuelo());
                }
            }
           // fw.close();
            pw.close();
            JOptionPane.showMessageDialog(null, "Vuelos guardados correctamente", "Vuelos", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar su información correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Guarda la información de la clase Ciudad en el archivo.txt
     *
     * @param fl
     * @param g
     */
    
        //METODO DE LA INFORMACION DE LA CIUDAD
    public void informacionCiudadTxt(File fl,Grafo g) {
        
        try {
            
            //FileWriter fw = new FileWriter(fl, true);
            PrintWriter pw = new PrintWriter(fl);
            pw.println("ciudades");
            for (int i = 0; i < g.getCiudades().getTamaño(); i++) {
                Ciudad aux = ((Ciudad) g.getCiudades().obtenerValorDe(i));
                pw.println(aux.getNombreCiudad() + "," + aux.getAeropuerto() + "," + aux.getPais());
            }

            //fw.close();
            pw.close();
            JOptionPane.showMessageDialog(null, "Información de ciudades guardadas correctamente","Ciudades",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar su información correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Recupera de la clase Vuelo la información que relaciona las ciudades con
     * los vuelos
     *
     * @param fl
     * @param g
     */
        //METODO DE LA RELACION VUELO CIUDAD
    public void relacionVueloCiudad(File fl, Grafo g) {
        try {
           // FileWriter fw = new FileWriter(fl, true);
            PrintWriter pw = new PrintWriter(fl);
            pw.println("fvuelos");
            for (int i = 0; i < g.getCiudades().getTamaño(); i++) {
                for (int j = 0; j < ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().getTamaño(); j++) {
                    Vuelo aux = ((Vuelo) ((Ciudad) g.getCiudades().obtenerValorDe(i)).getListaVuelos().obtenerValorDe(j));
                    pw.println(aux.getCiudadOrigen() + "," + aux.getCiudadDestino() + "," + aux.getNumeroVuelo());
                }

            }
            //fw.close();
            pw.close();
            JOptionPane.showMessageDialog(null, "Información de vuelos guardadas correctamente","Relación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar su información correctamente.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Método para recuperar la información almacenada en un archivo.txt
     *
     * @param file
     */
    
    //METODO DE LECTURA DEL ARCHIVO TXT EN JAVA
    public String leerArchivoTxt(String file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String lectura = "";

            while (lectura != null) {//Cuando no lee el archivo
                try {
                    lectura = br.readLine();
                } catch (Exception e) {//Mensaje de error
                    JOptionPane.showMessageDialog(null, "El archivo no existe");
                }
            }
            br.close();//Cerrar
            fr.close();//Cerrar
            return lectura;//Devolver la lectura del txt
        } catch (Exception e) {//Error del archivo, no existe
            JOptionPane.showMessageDialog(null, "El archivo no existe.");
            return null;
        }

    }

    public File getFl() {
        return fl;
    }

    public void setFl(File fl) {
        this.fl = fl;
    }
    
    
}
