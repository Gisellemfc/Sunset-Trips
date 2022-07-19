package Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

public class Ciudad {
       
    //ATRIBUTOS de la ciudad
    private String nombreCiudad;
    private String aeropuerto;
    private String pais;
    private int x;
    private int y;
    public static final int diametro = 60;
    private ListaSimple listaVuelos;

    //CONSTRUCTOR de la ciudad
    public Ciudad(String nombreCiudad, String aeropuerto, String pais, int x, int y) {
        this.nombreCiudad = nombreCiudad;
        this.aeropuerto = aeropuerto;
        this.pais = pais;
        this.x = x;
        this.y = y;
        this.listaVuelos = new ListaSimple();
    }
    
    //Escribir el nombre de la ciudad centrado en el circulo
    public void drawCenteredString(Graphics g, String text, Rectangle rect, Font font){

        //Se crea objeto de tipo FontRenderContext
        FontRenderContext frc = new FontRenderContext(null, true, true);

        //Se crea objeto rectangulo
        Rectangle2D r2D = font.getStringBounds(text, frc);
        
        //Se guardan las medidas para centrar
        int rWidth = (int) Math.round(r2D.getWidth());
        int rHeight = (int) Math.round(r2D.getHeight());
        int rX = (int) Math.round(r2D.getX());
        int rY = (int) Math.round(r2D.getY());
        int a = (rect.width / 2) - (rWidth / 2) - rX;
        int b = (rect.height / 2) - (rHeight / 2) - rY;

        //Se asigna la fuente de la letra
        g.setFont(font);
        
        //Se escribe el texto centrado
        g.drawString(text, rect.x + a, rect.y + b);
        
}
    
    //Método para graficar los vertices en el lienzo
    public void pintar(Graphics g){
        
        //Se asigna el color de los circulos
        g.setColor(new Color(221,110,110)); 
        
        //Se pinta el circulo relleno con sus medidas
        g.fillOval(this.x - (diametro/2), this.y - (diametro/2), diametro, diametro);
        
        //Se asigna el color de la fuente
        g.setColor(new Color(6, 28, 75));
        
        //Se crea el rectangulo para centrar las medidas
        Rectangle circulo = new Rectangle(this.getX() - (this.diametro/2), this.getY() - (this.diametro/2), this.diametro, this.diametro);
        
        //Se llama al metodo para escribir el texto centrado
        drawCenteredString(g, this.getNombreCiudad(), circulo, new Font("Rockwell", Font.BOLD, 18));
        
    }

    //GETTER Y SETTERS de los atributos del circulo
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //GETTERS Y SETTERS de los atributos de la ciudad
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ListaSimple getListaVuelos() {
        return listaVuelos;
    }

    public void setListaVuelos(ListaSimple listaVuelos) {
        this.listaVuelos = listaVuelos;
    }
    
}
