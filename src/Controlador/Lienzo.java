package Controlador;

import Controlador.Ciudad;
import Controlador.Grafo;
import Controlador.Vuelo;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener{

    //Atributos para el manejo del grafo
    private Grafo grafo;
    private Vuelo nuevoVuelo;
    //Claves para habilitar y deshabilitar edición del mapa
    private int claveEsAdmin = 0, claveDarClick = 0;
    //Atributos auxiliares para recoger la información
    private String nombreCiudad, aeropuerto, pais;
    //Puntos de partida y llegada de los vuelos
    private Point p1, p2;

    //CONSTRUCTOR QUE RECIBE EL GRAFO
    public Lienzo(Grafo grafo) {
        
        this.grafo = grafo;
        this.addMouseListener(this); //Para sentir las acciones del mouse
        this.setBackground(new java.awt.Color(219,228,238));//Fondo del panel lienzo
        
    }
    
    //METODO PARA VERIFICAR SI UN CIRCULO ESTÁ SUPERPUESTO A OTRO
    public boolean estaEncima(Point p){
        
        Rectangle figura = new Rectangle(p.x - (Ciudad.diametro/2), p.y - (Ciudad.diametro/2), Ciudad.diametro, Ciudad.diametro);
        
        //Se recorre la lista de ciudades para verificar que no se superponga ningun circulo
        for(int i = 0; i < grafo.getCiudades().getTamaño(); i++){
            Ciudad verificarCiudad = (Ciudad) grafo.getCiudades().obtenerValorDe(i);
            if((new Rectangle(verificarCiudad.getX() - (Ciudad.diametro/2), verificarCiudad.getY() - (Ciudad.diametro/2), Ciudad.diametro, Ciudad.diametro).intersects(figura))){
                return true;
            }
        }
        
        return false;
        
    }
    
    //METODO PARA PINTAR 
    @Override 
    public void paint(Graphics g){
        
        super.paint(g);
        
        //Se recorre la lista de ciudades pintando cada circulo de cada ciudad
        for(int i = 0; i < grafo.getCiudades().getTamaño(); i++){
            Ciudad nuevaCiudad = (Ciudad) grafo.getCiudades().obtenerValorDe(i);
            nuevaCiudad.pintar(g);
        }
        
        //Se recorre la lista de vuelos pintando cada vuelo
        for(int i = 0; i < grafo.getCiudades().getTamaño(); i++){
            Ciudad ciudadAux = (Ciudad) grafo.getCiudades().obtenerValorDe(i);
            for(int j = 0; j < ciudadAux.getListaVuelos().getTamaño(); j++){
                Vuelo vueloAux = (Vuelo) ciudadAux.getListaVuelos().obtenerValorDe(j);
                vueloAux.pintar(g);
            }
        }
    }
    
    //METODO PARA PINTAR CIRCULOS HACIENDO CLICK
    @Override
    public void mouseClicked(MouseEvent e) { //Método que siente el click del mouse
        
        if(estaEncima(e.getPoint()) && claveDarClick == 1){
            JOptionPane.showMessageDialog(null, "Error, circulo superpuesto, vuelva a dar click en otro sitio", "Error circulo superpuesto", JOptionPane.ERROR_MESSAGE);
        }else{
        
            //Al hacer click izquierdo y que sea un admin que este editando y que la clave para dar click esté activada
            if((e.getButton() == MouseEvent.BUTTON1) && claveEsAdmin == 1 && claveDarClick == 1){ 

                //Agregar nodo al grafo con la información recogida
                this.grafo.agregarCiudad(new Ciudad(nombreCiudad, aeropuerto, pais, e.getX(), e.getY()));
                this.setClaveDarClick(0); //Deshabilitar la posibilidad de dar click despues de dar un click
                repaint(); //Se repintan los circulos con el nuevo agregado
            }
        }
    }

    //Eventos de metodo abstracto, ignorar
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    //Metodo para recoger la información registrada sobre una ciudad
    public void recogerInfoCiudad(String nombre, String aeropuerto, String pais){
        this.nombreCiudad = nombre;
        this.aeropuerto = aeropuerto;
        this.pais = pais;    
        this.setClaveDarClick(1); //Al recoger la información se habilita la posibilidad de dar un click en el panel
    }
    
    //Método para recoger la información registrada sobre un vuelo
    public void establecerNuevoVuelo(String ciudadOrigen, String ciudadDestino, int duracion, int numeroVuelo, String lineaAerea, int costoVuelo) {
     
        //Se recorre la lista y se busca el circulo de origen
        for(int i = 0; i < grafo.getCiudades().getTamaño(); i++){
            Ciudad c1 = (Ciudad) grafo.getCiudades().obtenerValorDe(i); //Circulo auxiliar
            if(c1.getNombreCiudad().equals(ciudadOrigen)){ //Si el nombre de la ciudad del circulo es igual a la ciudad de origen escogida
                p1 = new Point(c1.getX(), c1.getY()); //Crear el punto 1 cuando se encuentra el circulo de origen
                break;
            }
        }
        
        //Se recorre la lista y se busca el circulo de destino
        for(int i = 0; i < grafo.getCiudades().getTamaño(); i++){
            Ciudad c2 = (Ciudad) grafo.getCiudades().obtenerValorDe(i); //Circulo auxiliar
            if(c2.getNombreCiudad().equals(ciudadDestino)){//Si el nombre de la ciudad del circulo es igual a la ciudad de destino escogida
                p2 = new Point(c2.getX(), c2.getY());  //Crear el punto 2 cuando se encuentra el circulo de destino
                break;
            }
        }
        
        nuevoVuelo = new Vuelo(ciudadOrigen, ciudadDestino, duracion, numeroVuelo, lineaAerea, costoVuelo, p1, p2);
        grafo.agregarVuelo(nuevoVuelo);
        
        repaint(); //Repintar el mapa con el nuevo vuelo agregado
    }
    
    //GETTERS Y SETTERS de atributos principales de la clase
    public int getClaveEsAdmin() {
        return claveEsAdmin;
    }

    public void setClaveEsAdmin(int claveEsAdmin) {
        this.claveEsAdmin = claveEsAdmin;
    }

    public int getClaveDarClick() {
        return claveDarClick;
    }

    public void setClaveDarClick(int claveDarClick) {
        this.claveDarClick = claveDarClick;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
    
}
