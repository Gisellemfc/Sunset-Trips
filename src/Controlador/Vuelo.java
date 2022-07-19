package Controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class Vuelo {
    
    //Atributos de un vuelo o arista
    private String ciudadOrigen;
    private String ciudadDestino;
    private int duracion;
    private int numeroVuelo;
    private String lineaAerea;
    private int costoVuelo;
    private Point p1;
    private Point p2;

    //CONSTRUCTOR de un vuelo
    public Vuelo(String ciudadOrigen, String ciudadDestino, int duracion, int numeroVuelo, String lineaAerea, int costoVuelo, Point p1, Point p2) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracion = duracion;
        this.numeroVuelo = numeroVuelo;
        this.lineaAerea = lineaAerea;
        this.costoVuelo = costoVuelo;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //Metodo para dibujar la flecha del vuelo
    private void drawArrowHead(Graphics2D g2, Point tip, Point tail){
        
        //Establecer valores iniciales y calculos
        double dy = tip.y - tail.y;
        double dx = tip.x - tail.x;
        double theta = Math.atan2(dy, dx);
        double x, y, rho = theta + Math.toRadians(40);
        
        for(int j = 0; j < 2; j++){
            
            //Más calculos
            x = tip.x - 20 * Math.cos(rho);
            y = tip.y - 20 * Math.sin(rho);
            
            //Pintar flecha
            g2.draw(new Line2D.Double(tip.x, tip.y, x, y));
            
            //Otro calculo
            rho = theta - Math.toRadians(40);
            
        }
        
    }
    
    //Metodo para pintar la linea y el numero de vuelo segun la orientacion de las coordenadas
    public void pintar(Graphics g){
        
        //Establecer el color de la línea
        g.setColor(new Color(129,164,205));
        
        //Pintar al linea
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
        
        //Pintar la flecha
        Graphics2D g2 = (Graphics2D) g;
        drawArrowHead(g2, p2, p1);
        
        //Verificaciones para escribir el numero de vuelo 
        g.setColor(new Color(6,28,75));
        if(p1.x > p2.x && p1.y > p2.y){
            g.drawString(Integer.toString(numeroVuelo), p1.x - Math.abs((p1.x- p2.x)/2), p1.y - Math.abs((p1.y- p2.y)/2));
        }
        if(p1.x < p2.x && p1.y < p2.y){
            g.drawString(Integer.toString(numeroVuelo), p2.x - Math.abs((p1.x- p2.x)/2), p2.y - Math.abs((p1.y- p2.y)/2));
        }
        if(p1.x > p2.x && p1.y < p2.y){
            g.drawString(Integer.toString(numeroVuelo), p1.x - Math.abs((p1.x- p2.x)/2), p2.y - Math.abs((p1.y- p2.y)/2));
        }
        if(p1.x < p2.x && p1.y > p2.y){
            g.drawString(Integer.toString(numeroVuelo), p2.x - Math.abs((p1.x- p2.x)/2), p1.y - Math.abs((p1.y- p2.y)/2));
        }
    }

    //GETTERS Y SETTERS
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getLineaAerea() {
        return lineaAerea;
    }

    public void setLineaAerea(String lineaAerea) {
        this.lineaAerea = lineaAerea;
    }

    public int getCostoVuelo() {
        return costoVuelo;
    }

    public void setCostoVuelo(int costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

}
