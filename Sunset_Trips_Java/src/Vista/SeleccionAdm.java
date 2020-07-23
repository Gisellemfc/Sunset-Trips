package Vista;

import Controlador.ArchivoTxt;
import Controlador.Ciudad;
import Controlador.Grafo;
import Controlador.Lienzo;
import Controlador.ListaSimple;
import Controlador.Vuelo;
import java.awt.Point;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class SeleccionAdm extends javax.swing.JFrame {
    
    //Mapa con el que se maneja todo el programa
    public static Lienzo mapa;
    private JFileChooser seleccionado = new JFileChooser();
    private File archivo;
    private ArchivoTxt a = new ArchivoTxt();
   
    //CONSTRUCTOR que recibe el mapa a usar
    public SeleccionAdm(Lienzo mapa){
        
        initComponents();
        this.setVisible(false); //Visibilidad
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
     
        SeleccionAdm.mapa = mapa; //Establecer el mapa recibido por parametro
        SeleccionAdm.mapa.setClaveEsAdmin(1);  //Establecer la clave de que está modificando un admin (1)
        this.add(mapa); //Agregar el panel del mapa al frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelIconoAdministrador = new javax.swing.JLabel();
        jLabelPanelDeControlAdministrador = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelIzquierdo = new javax.swing.JPanel();
        jLabelFunciones = new javax.swing.JLabel();
        jLabelDisponibles = new javax.swing.JLabel();
        btnAgregarCiudad = new javax.swing.JButton();
        btnAgregarVuelo = new javax.swing.JButton();
        btnEliminarCiudad = new javax.swing.JButton();
        btnEliminarVuelo = new javax.swing.JButton();
        btnModificarVuelo = new javax.swing.JButton();
        btnCargarArchivo = new javax.swing.JButton();
        btnActualizarRepositorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1200, 600));
        setSize(new java.awt.Dimension(1200, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelSuperior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(1200, 50));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        btnVolver.setBackground(new java.awt.Color(221, 110, 110));
        btnVolver.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(219, 228, 238));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelIconoAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AdministradorPequeno_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 225, 0, 10);
        jPanelSuperior.add(jLabelIconoAdministrador, gridBagConstraints);

        jLabelPanelDeControlAdministrador.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelPanelDeControlAdministrador.setForeground(new java.awt.Color(219, 228, 238));
        jLabelPanelDeControlAdministrador.setText("PANEL DE CONTROL DE ADMINISTRADOR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 225);
        jPanelSuperior.add(jLabelPanelDeControlAdministrador, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelIzquierdo.setBackground(new java.awt.Color(129, 164, 205));
        jPanelIzquierdo.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanelIzquierdo.setLayout(new java.awt.GridBagLayout());

        jLabelFunciones.setBackground(new java.awt.Color(6, 28, 75));
        jLabelFunciones.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabelFunciones.setForeground(new java.awt.Color(6, 28, 75));
        jLabelFunciones.setText("FUNCIONES");
        jPanelIzquierdo.add(jLabelFunciones, new java.awt.GridBagConstraints());

        jLabelDisponibles.setBackground(new java.awt.Color(6, 28, 75));
        jLabelDisponibles.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabelDisponibles.setForeground(new java.awt.Color(6, 28, 75));
        jLabelDisponibles.setText("DISPONIBLES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 2, 0);
        jPanelIzquierdo.add(jLabelDisponibles, gridBagConstraints);

        btnAgregarCiudad.setBackground(new java.awt.Color(221, 110, 110));
        btnAgregarCiudad.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnAgregarCiudad.setForeground(new java.awt.Color(6, 28, 75));
        btnAgregarCiudad.setText("AGREGAR CIUDAD");
        btnAgregarCiudad.setBorder(null);
        btnAgregarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCiudadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 40;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnAgregarCiudad, gridBagConstraints);

        btnAgregarVuelo.setBackground(new java.awt.Color(221, 110, 110));
        btnAgregarVuelo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnAgregarVuelo.setForeground(new java.awt.Color(6, 28, 75));
        btnAgregarVuelo.setText("AGREGAR VUELO");
        btnAgregarVuelo.setBorder(null);
        btnAgregarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVueloActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 45;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnAgregarVuelo, gridBagConstraints);

        btnEliminarCiudad.setBackground(new java.awt.Color(221, 110, 110));
        btnEliminarCiudad.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnEliminarCiudad.setForeground(new java.awt.Color(6, 28, 75));
        btnEliminarCiudad.setText("ELIMINAR CIUDAD");
        btnEliminarCiudad.setBorder(null);
        btnEliminarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCiudadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 53;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnEliminarCiudad, gridBagConstraints);

        btnEliminarVuelo.setBackground(new java.awt.Color(221, 110, 110));
        btnEliminarVuelo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnEliminarVuelo.setForeground(new java.awt.Color(6, 28, 75));
        btnEliminarVuelo.setText("ELIMINAR VUELO");
        btnEliminarVuelo.setBorder(null);
        btnEliminarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVueloActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 58;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnEliminarVuelo, gridBagConstraints);

        btnModificarVuelo.setBackground(new java.awt.Color(221, 110, 110));
        btnModificarVuelo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnModificarVuelo.setForeground(new java.awt.Color(6, 28, 75));
        btnModificarVuelo.setText("MODIFICAR VUELO");
        btnModificarVuelo.setBorder(null);
        btnModificarVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVueloActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 63;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnModificarVuelo, gridBagConstraints);

        btnCargarArchivo.setBackground(new java.awt.Color(221, 110, 110));
        btnCargarArchivo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnCargarArchivo.setForeground(new java.awt.Color(6, 28, 75));
        btnCargarArchivo.setText("CARGAR ARCHIVO");
        btnCargarArchivo.setBorder(null);
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 71;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnCargarArchivo, gridBagConstraints);

        btnActualizarRepositorio.setBackground(new java.awt.Color(221, 110, 110));
        btnActualizarRepositorio.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnActualizarRepositorio.setForeground(new java.awt.Color(6, 28, 75));
        btnActualizarRepositorio.setText("ACTUALIZAR REPOSITORIO");
        btnActualizarRepositorio.setBorder(null);
        btnActualizarRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarRepositorioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 74;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        jPanelIzquierdo.add(btnActualizarRepositorio, gridBagConstraints);

        jLabel1.setForeground(new java.awt.Color(221, 110, 110));
        jLabel1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelIzquierdo.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        Administrador admin = new Administrador(); //Crear una ventana de administrador
        admin.setVisible(true); //Hacer visible la ventana de administrador
        this.setVisible(false); //Ocultar esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVueloActionPerformed
        
        //Crea una ventana de agregar vuelo
        new AgregarVuelo(mapa);
        
    }//GEN-LAST:event_btnAgregarVueloActionPerformed

    private void btnAgregarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCiudadActionPerformed

        //Crea una nueva ventana agregar ciudad
        new AgregarCiudad(mapa);
    
    }//GEN-LAST:event_btnAgregarCiudadActionPerformed

    private void btnEliminarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVueloActionPerformed
       
        //Se abre una nueva ventana de eliminar vuelo
        new EliminarVuelo(mapa);
        
    }//GEN-LAST:event_btnEliminarVueloActionPerformed

    private void btnEliminarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCiudadActionPerformed
       
        //Se abre una nueva ventana de eliminar ciudad
        new EliminarCiudad(mapa);
        
    }//GEN-LAST:event_btnEliminarCiudadActionPerformed

    private void btnModificarVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVueloActionPerformed
        
        //Se abre una nueva ventana de modificar vuelo
        new ModificarVuelo(mapa);
        
    }//GEN-LAST:event_btnModificarVueloActionPerformed

    private void btnActualizarRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarRepositorioActionPerformed
        
        
        ArchivoTxt at = new ArchivoTxt();
        
        //Se llama al metodo actualizar repositorio del archivo
        at.actualizarRepositorio(new File("Archivo.txt"),mapa.getGrafo());
        
    }//GEN-LAST:event_btnActualizarRepositorioActionPerformed

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
        
        if(mapa.getGrafo().getCiudades().getCabeza() != null){
        
            try {
                        JOptionPane.showMessageDialog(this, "Para continuar cargando su archivo procederemos a guardar el actual en su carpeta del proyecto.", "ALERTA GUARDADO AUTOMATICO", JOptionPane.WARNING_MESSAGE);
                        ArchivoTxt at = new ArchivoTxt();
                        at.actualizarRepositorio(new File("Archivo.txt"),mapa.getGrafo());

            } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "No hay mapa que guardar.");
            }
            
        }
        
        mapa.setGrafo(new Grafo());
        
        if (seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {

            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {

                    String contenido = a.Abrir(archivo);
                   
                    try {

                        BufferedReader bf = new BufferedReader(new FileReader(seleccionado.getSelectedFile().toString()));
                        String aux;
                        String bfRead = bf.readLine();
                        aux = bfRead;

                        a.cargar(mapa, aux, bf);

                    } catch (Exception e) {
                        System.out.println("No se pudo leer el archivo. Intente más tarde");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione un archivo de texto");
                }

            }

        }

    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        int seleccion = JOptionPane.showOptionDialog(
                        null, "¿Desea guardar los datos antes de salir?", "Atención!", 1, 2, null, new Object[]{"Si", "No"}, "Si");
            
                        ArchivoTxt at = new ArchivoTxt();
                switch(seleccion){
                    case 0://Si elegimos "Si"
                        at.actualizarRepositorio(new File("Archivo.txt"), mapa.getGrafo());//Llamamos al método que escribe los datos
                        System.exit(0);//Y cerramos el programa
                        break;
                    case 1://Si elegimos "No"
                         System.exit(0);//Cerramos el programa
                        break;
                           //Si elegimos "Cancelar", pues nada...
                }
        
    }//GEN-LAST:event_formWindowClosing

    //GETTERS Y SETTERS
    public Lienzo getMapa() {
        return mapa;
    }

    public void setMapa(Lienzo mapa) {
        this.mapa = mapa;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarRepositorio;
    private javax.swing.JButton btnAgregarCiudad;
    private javax.swing.JButton btnAgregarVuelo;
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnEliminarCiudad;
    private javax.swing.JButton btnEliminarVuelo;
    private javax.swing.JButton btnModificarVuelo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDisponibles;
    private javax.swing.JLabel jLabelFunciones;
    private javax.swing.JLabel jLabelIconoAdministrador;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPanelDeControlAdministrador;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables

}
