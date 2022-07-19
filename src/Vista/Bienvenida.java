package Vista;

import Controlador.ArchivoTxt;
import static Vista.SeleccionAdm.mapa;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bienvenida extends javax.swing.JFrame {

    //ATRIBUTOS DE LA BIENVENIDA
    public static Administrador admin;
    public static Cliente client;
    
    //CONSTRUCTOR
    public Bienvenida(Administrador admin, Cliente client) {
        
        initComponents();
        
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        this.setVisible(false); //Visibilidad
        
        //Se establecen el admin y el cliente del programa
        this.admin = admin;
        this.client = client;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelEncabezado = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelInferiorSuperior = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabelSlogan = new javax.swing.JLabel();
        jLabelModoIngreso = new javax.swing.JLabel();
        jSeparador2 = new javax.swing.JLabel();
        jLabelSeparador1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelRueda = new javax.swing.JLabel();
        btnAdministrador = new javax.swing.JButton();
        jLabelMaleta = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 700));
        setSize(new java.awt.Dimension(600, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelEncabezado.setBackground(new java.awt.Color(6, 28, 75));
        jPanelEncabezado.setPreferredSize(new java.awt.Dimension(555, 255));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo1.png"))); // NOI18N

        jLabelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/original (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelEncabezadoLayout = new javax.swing.GroupLayout(jPanelEncabezado);
        jPanelEncabezado.setLayout(jPanelEncabezadoLayout);
        jPanelEncabezadoLayout.setHorizontalGroup(
            jPanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
            .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelEncabezadoLayout.setVerticalGroup(
            jPanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelLogo))
            .addComponent(jLabelImagen)
        );

        getContentPane().add(jPanelEncabezado, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelInferior.setAlignmentX(0.0F);
        jPanelInferior.setAlignmentY(0.0F);
        jPanelInferior.setPreferredSize(new java.awt.Dimension(555, 250));
        jPanelInferior.setLayout(new javax.swing.BoxLayout(jPanelInferior, javax.swing.BoxLayout.Y_AXIS));

        jPanelInferiorSuperior.setBackground(new java.awt.Color(6, 28, 75));
        jPanelInferiorSuperior.setAlignmentY(0.0F);
        jPanelInferiorSuperior.setLayout(new java.awt.GridBagLayout());

        jLabelBienvenida.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(219, 228, 238));
        jLabelBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBienvenida.setText("Bienvenido a SUNSET TRIPS ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 14, 0);
        jPanelInferiorSuperior.add(jLabelBienvenida, gridBagConstraints);

        jLabelSlogan.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelSlogan.setForeground(new java.awt.Color(221, 110, 110));
        jLabelSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSlogan.setText("La plataforma que hace de cada viaje, tu mejor viaje");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        jPanelInferiorSuperior.add(jLabelSlogan, gridBagConstraints);

        jLabelModoIngreso.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabelModoIngreso.setForeground(new java.awt.Color(219, 228, 238));
        jLabelModoIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModoIngreso.setText("¿Cómo desea ingresar a SUNSET TRIPS?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.insets = new java.awt.Insets(21, 8, 0, 8);
        jPanelInferiorSuperior.add(jLabelModoIngreso, gridBagConstraints);

        jSeparador2.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        jSeparador2.setForeground(new java.awt.Color(219, 228, 238));
        jSeparador2.setText("____________________________________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        jPanelInferiorSuperior.add(jSeparador2, gridBagConstraints);

        jLabelSeparador1.setForeground(new java.awt.Color(219, 228, 238));
        jLabelSeparador1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        jPanelInferiorSuperior.add(jLabelSeparador1, gridBagConstraints);

        jPanelInferior.add(jPanelInferiorSuperior);

        jPanel4.setBackground(new java.awt.Color(6, 28, 75));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabelRueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Rueda.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel4.add(jLabelRueda, gridBagConstraints);

        btnAdministrador.setBackground(new java.awt.Color(221, 110, 110));
        btnAdministrador.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(219, 228, 238));
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setBorder(null);
        btnAdministrador.setBorderPainted(false);
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 50);
        jPanel4.add(btnAdministrador, gridBagConstraints);

        jLabelMaleta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMaleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono maleta.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel4.add(jLabelMaleta, gridBagConstraints);

        btnCliente.setBackground(new java.awt.Color(221, 110, 110));
        btnCliente.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(219, 228, 238));
        btnCliente.setText("CLIENTE");
        btnCliente.setBorder(null);
        btnCliente.setBorderPainted(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.ipady = 25;
        jPanel4.add(btnCliente, gridBagConstraints);

        jPanelInferior.add(jPanel4);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        //Si se da click al botón de administrador se activa la ventana de administrador
        
        admin.setVisible(true);
        this.setVisible(false); //Se oculta la ventana bienvenida
        
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //Si se da click al botón de cliente se activa la ventana de cliente

        client.setVisible(true);
        this.setVisible(false); //Se oculta la ventana bienvenida
        
    }//GEN-LAST:event_btnClienteActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnCliente;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelMaleta;
    private javax.swing.JLabel jLabelModoIngreso;
    private javax.swing.JLabel jLabelRueda;
    private javax.swing.JLabel jLabelSeparador1;
    private javax.swing.JLabel jLabelSlogan;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelEncabezado;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInferiorSuperior;
    private javax.swing.JLabel jSeparador2;
    // End of variables declaration//GEN-END:variables
}
