package Vista;

import Controlador.ArchivoTxt;
import Controlador.Ciudad;
import Controlador.FloydWarshall;
import Controlador.Lienzo;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SeleccionCliente extends javax.swing.JFrame {

    //ATRIBUTO DEL MAPA
    public static Lienzo mapa;
    
    //CONSTRUCTOR QUE RECIBE EL MAPA
    public SeleccionCliente() {
        
        initComponents();
        this.setVisible(false); //Visibilidad
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/airplane-window-open.png")).getImage()); //Poner icono a la ventana
        
        SeleccionCliente.mapa = SeleccionAdm.mapa; //Establecer el mapa que usó el administrador
        SeleccionCliente.mapa.setClaveEsAdmin(0); //Establecer la clave de que está un cliente y no se puede editar (0)
        this.add(mapa); //Agregar lienzo al frame
        
        
        //Se recorre la lista de ciudades del mapa y se agregan los items al combo box de ciudad origen y destino
        for(int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++){
            Ciudad item = (Ciudad) mapa.getGrafo().getCiudades().obtenerValorDe(i);
            cmbCiudadOrigen.addItem(item.getNombreCiudad());
            cmbCiudadDestino.addItem(item.getNombreCiudad());
        }
        
    }

    //GETTERS Y SETTERS
    public Lienzo getMapa() {
        return mapa;
    }

    public void setMapa(Lienzo mapa) {
        this.mapa = mapa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox3 = new javax.swing.JComboBox<>();
        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelIconoCliente = new javax.swing.JLabel();
        jLabelPanelUsuario = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelDerecho = new javax.swing.JPanel();
        jLabePedirlCaracteristicas1 = new javax.swing.JLabel();
        jLabelPedirlCaracteristicas3 = new javax.swing.JLabel();
        cmbCiudadOrigen = new javax.swing.JComboBox<>();
        cmbCiudadDestino = new javax.swing.JComboBox<>();
        jButtonListarRutas = new javax.swing.JButton();
        jLabelPedirlCaracteristicas2 = new javax.swing.JLabel();
        jLabelCiudadOrigen = new javax.swing.JLabel();
        jLabelCiudadDestino = new javax.swing.JLabel();
        cmbCriterio = new javax.swing.JComboBox<>();
        jLabelCriterio = new javax.swing.JLabel();
        jButtonGenerarPlanVuelo = new javax.swing.JButton();
        jLabelSeparador = new javax.swing.JLabel();
        jLabelSinCriterio = new javax.swing.JLabel();

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabelIconoCliente.setForeground(new java.awt.Color(219, 228, 238));
        jLabelIconoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 225, 0, 10);
        jPanelSuperior.add(jLabelIconoCliente, gridBagConstraints);

        jLabelPanelUsuario.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelPanelUsuario.setForeground(new java.awt.Color(219, 228, 238));
        jLabelPanelUsuario.setText("PANEL DE SELECCION DE PLAN DE VUELO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 225);
        jPanelSuperior.add(jLabelPanelUsuario, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeno.png"))); // NOI18N
        jPanelSuperior.add(jLabelLogo, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelDerecho.setBackground(new java.awt.Color(129, 164, 205));
        jPanelDerecho.setPreferredSize(new java.awt.Dimension(400, 550));
        jPanelDerecho.setLayout(new java.awt.GridBagLayout());

        jLabePedirlCaracteristicas1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabePedirlCaracteristicas1.setForeground(new java.awt.Color(6, 28, 75));
        jLabePedirlCaracteristicas1.setText("SELECCIONES LAS");
        jPanelDerecho.add(jLabePedirlCaracteristicas1, new java.awt.GridBagConstraints());

        jLabelPedirlCaracteristicas3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabelPedirlCaracteristicas3.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirlCaracteristicas3.setText("DE SU VIAJE IDEAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        jPanelDerecho.add(jLabelPedirlCaracteristicas3, gridBagConstraints);

        cmbCiudadOrigen.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadOrigen.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCiudadOrigen.setForeground(new java.awt.Color(6, 28, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 60;
        gridBagConstraints.ipadx = 150;
        jPanelDerecho.add(cmbCiudadOrigen, gridBagConstraints);

        cmbCiudadDestino.setBackground(new java.awt.Color(219, 228, 238));
        cmbCiudadDestino.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCiudadDestino.setForeground(new java.awt.Color(6, 28, 75));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 66;
        gridBagConstraints.ipadx = 150;
        jPanelDerecho.add(cmbCiudadDestino, gridBagConstraints);

        jButtonListarRutas.setBackground(new java.awt.Color(221, 110, 110));
        jButtonListarRutas.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButtonListarRutas.setForeground(new java.awt.Color(6, 28, 75));
        jButtonListarRutas.setText("LISTAR POSIBLES RUTAS");
        jButtonListarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarRutasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 73;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelDerecho.add(jButtonListarRutas, gridBagConstraints);

        jLabelPedirlCaracteristicas2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabelPedirlCaracteristicas2.setForeground(new java.awt.Color(6, 28, 75));
        jLabelPedirlCaracteristicas2.setText("CARACTERISTICAS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelDerecho.add(jLabelPedirlCaracteristicas2, gridBagConstraints);

        jLabelCiudadOrigen.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadOrigen.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadOrigen.setText("Ciudad de origen:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 58;
        jPanelDerecho.add(jLabelCiudadOrigen, gridBagConstraints);

        jLabelCiudadDestino.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCiudadDestino.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCiudadDestino.setText("Ciudad de destino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 64;
        jPanelDerecho.add(jLabelCiudadDestino, gridBagConstraints);

        cmbCriterio.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        cmbCriterio.setForeground(new java.awt.Color(6, 28, 75));
        cmbCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menor costo final", "Menor tiempo de viaje" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 78;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanelDerecho.add(cmbCriterio, gridBagConstraints);

        jLabelCriterio.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelCriterio.setForeground(new java.awt.Color(6, 28, 75));
        jLabelCriterio.setText("Rutas de vuelo por criterio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 76;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanelDerecho.add(jLabelCriterio, gridBagConstraints);

        jButtonGenerarPlanVuelo.setBackground(new java.awt.Color(221, 110, 110));
        jButtonGenerarPlanVuelo.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jButtonGenerarPlanVuelo.setForeground(new java.awt.Color(6, 28, 75));
        jButtonGenerarPlanVuelo.setText("GENERAR PLAN DE VUELO");
        jButtonGenerarPlanVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarPlanVueloActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 81;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanelDerecho.add(jButtonGenerarPlanVuelo, gridBagConstraints);

        jLabelSeparador.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelSeparador.setForeground(new java.awt.Color(221, 110, 110));
        jLabelSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 56;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        jPanelDerecho.add(jLabelSeparador, gridBagConstraints);

        jLabelSinCriterio.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabelSinCriterio.setForeground(new java.awt.Color(6, 28, 75));
        jLabelSinCriterio.setText("Rutas de vuelo sin criterio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 71;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 10, 0);
        jPanelDerecho.add(jLabelSinCriterio, gridBagConstraints);

        getContentPane().add(jPanelDerecho, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGenerarPlanVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarPlanVueloActionPerformed

        try{

            if(cmbCiudadDestino.getSelectedItem().equals(cmbCiudadOrigen.getSelectedItem())){
                JOptionPane.showMessageDialog(null, "Error, la ciudad de origen no puede ser igual a la ciudad de destino", "Error ciudades iguales", JOptionPane.ERROR_MESSAGE);
            }else{
                //LUEGO SE COMENTA ESTO PORQUE ESTOY HACIENDO PRUEBAS ATT GISELLE

                String origen = (String) cmbCiudadOrigen.getSelectedItem();
                String destino = (String) cmbCiudadDestino.getSelectedItem();
                boolean existeO = false;
                boolean existeD = false;
                String ruta = "";
                int posO = 0;
                int posD = 0;

                for (int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++) {
                    if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)) != null) {

                        if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(origen)) {
                            existeO = true;
                            posO = i;
                            break;
                        }
                    }
                }

                for (int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++) {
                    if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)) != null) {

                        if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(destino)) {
                            existeD = true;
                            posD = i;
                            break;
                        }
                    }
                }

                if (existeO && existeD) {

                    if(cmbCriterio.getSelectedItem().equals("Menor costo final")){

                        FloydWarshall caminosFloyd = new FloydWarshall();

                        caminosFloyd.imprimir(mapa.getGrafo(), mapa.getGrafo().matrizPesos(1), posO, posD);

                    }else{

                        FloydWarshall caminosFloyd = new FloydWarshall();

                        caminosFloyd.imprimir(mapa.getGrafo(), mapa.getGrafo().matrizPesos(2), posO, posD);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Los datos que ingreso son incorrectos. Vuelva a intentarlo.");
                    this.setVisible(false);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no hay un mapa cargado.", "Error mapa inexistente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGenerarPlanVueloActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        Cliente cliente = new Cliente(); //Crear una ventana de cliente
        cliente.setVisible(true); //Hacer visible la ventana de cliente
        this.setVisible(false); //Ocultar esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

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

    private void jButtonListarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarRutasActionPerformed
        
        try{

            if(cmbCiudadDestino.getSelectedItem().equals(cmbCiudadOrigen.getSelectedItem())){
                JOptionPane.showMessageDialog(null, "Error, la ciudad de origen no puede ser igual a la ciudad de destino", "Error ciudades iguales", JOptionPane.ERROR_MESSAGE);
            }else{
                    String origen = (String) cmbCiudadOrigen.getSelectedItem();
                    String destino = (String) cmbCiudadDestino.getSelectedItem();
                    boolean existeO = false;
                    boolean existeD = false;
                    String ruta;
                    int posO = 0;
                    int posD = 0;

                    for (int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++) {
                        if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)) != null) {

                            if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(origen)) {
                                existeO = true;
                                posO = i;
                                break;
                            }
                        }
                    }

                    for (int i = 0; i < mapa.getGrafo().getCiudades().getTamaño(); i++) {
                        if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)) != null) {

                            if (((Ciudad)mapa.getGrafo().getCiudades().obtenerValorDe(i)).getNombreCiudad().equalsIgnoreCase(destino)) {
                                existeD = true;
                                posD = i;
                                break;
                            }
                        }
                    }

                    if(existeO && existeD){

                        mapa.getGrafo().printAllPaths(origen, destino);
                        ruta = mapa.getGrafo().getRutas().getText();
                        mapa.getGrafo().getRutas().setText("");
                        JOptionPane.showMessageDialog(null, "Estas son las posibles rutas para ir de " + origen + " hasta " + destino + "\n" + ruta, "Lista de rutas posibles", JOptionPane.INFORMATION_MESSAGE);

                    }

            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error no hay un mapa cargado.", "Error mapa inexistente", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonListarRutasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCiudadDestino;
    private javax.swing.JComboBox<String> cmbCiudadOrigen;
    private javax.swing.JComboBox<String> cmbCriterio;
    private javax.swing.JButton jButtonGenerarPlanVuelo;
    private javax.swing.JButton jButtonListarRutas;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabePedirlCaracteristicas1;
    private javax.swing.JLabel jLabelCiudadDestino;
    private javax.swing.JLabel jLabelCiudadOrigen;
    private javax.swing.JLabel jLabelCriterio;
    private javax.swing.JLabel jLabelIconoCliente;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPanelUsuario;
    private javax.swing.JLabel jLabelPedirlCaracteristicas2;
    private javax.swing.JLabel jLabelPedirlCaracteristicas3;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelSinCriterio;
    private javax.swing.JPanel jPanelDerecho;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
