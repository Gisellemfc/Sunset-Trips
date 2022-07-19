package Principal;

import Controlador.Lienzo;
import Controlador.Grafo;
import Vista.Administrador;
import Vista.Bienvenida;
import Vista.Cliente;
import Vista.SeleccionAdm;
import Vista.SeleccionCliente;
import javax.swing.JOptionPane;

public class Principal {
    
    public static void main (String args[]){
        
        //Se inicializa el grafo y el mapa que se va a usar
        Grafo grafo = new Grafo();
        Lienzo mapa = new Lienzo(grafo);
        
        //Se crean las ventanas de panel de control de admin y cliente junto con la asignacion de su mapa común
        SeleccionAdm panelAdmin = new SeleccionAdm(mapa);
        SeleccionCliente panelClient = new SeleccionCliente();
        
        //Se crea el administrador y el cliente
        Administrador admin = new Administrador();
        Cliente cliente = new Cliente();
        
        //Se crea la bienvenida y se le asigna su admin y su cliente
        Bienvenida bienvenidos = new Bienvenida(admin,cliente);
        bienvenidos.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "¡OJO! Para recuperar los datos de su ultima sesión guardada dirijase\na administrador >>> cargar archivo y cargue el archivo ubicado dentro\nde su carpeta del proyecto. ¡OJO!", "¡ALERTA RECUPERAR ULTIMA SESIÓN!", JOptionPane.WARNING_MESSAGE);

        
    }
}
