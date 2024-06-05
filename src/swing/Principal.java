package swing;

import Classes.Airport;
import Classes.PrivateAirport;
import Classes.PublicAirport;
import Utilidades.MetodosSueltos;
import Utilidades.VariablesGlobales;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {
    
    private DefaultTableModel modeloTabla;
    
    private final int PRIVADO = 1;
    private final int  PUBLICO = 2;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodosSueltos.leerAeropuertos();
        
        this.cargarDatos(PRIVADO, "");
    }
    
    public void cargarDatos(int tipo, String coincidenciaNombre) {
        
        this.modeloTabla = new DefaultTableModel () {
            
            @Override
            public boolean isCellEditable (int row, int column) {
                return false;
            }
        };
    
        this.tblAeropuertos.setModel(modeloTabla);
        
        int numColumnas = 0;
        
        modeloTabla.addColumn("Id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Pais");
        modeloTabla.addColumn("Numero");
        modeloTabla.addColumn("Calle");
        modeloTabla.addColumn("Coiudad");
        modeloTabla.addColumn("Año");
        modeloTabla.addColumn("Capacidad");
        
        if (tipo == PRIVADO) {
            modeloTabla.addColumn("Socios");
            numColumnas = 9;
        }else{
            modeloTabla.addColumn("Financiación");
            modeloTabla.addColumn("Discapacitados");
            numColumnas = 10;
        }
        
        this.tblAeropuertos.getColumnModel().getColumn(0).setPreferredWidth(20);
        
        
        Object[] fila;
        for (Airport aux : VariablesGlobales.airports) {
            
            if (aux.getNombre().toLowerCase().contains(coincidenciaNombre.toLowerCase())){
                fila = new Object[numColumnas];

                fila[0] = aux.getId();
                fila[1] = aux.getNombre();
                fila[2] = aux.getAddress().getPais();
                fila[3] = aux.getAddress().getCiudad();
                fila[4] = aux.getAddress().getCalle();
                fila[5] = aux.getAddress().getNumero();
                fila[6] = aux.getAnioInauguracion();
                fila[7] = aux.getCapacidad();

                if (tipo == PRIVADO && aux instanceof PrivateAirport){
                    PrivateAirport pa = (PrivateAirport) aux;
                    fila[8] = pa.getNumSocios();
                    modeloTabla.addRow(fila);
                }else if (tipo == PUBLICO && aux instanceof PublicAirport){
                    PublicAirport pa = (PublicAirport) aux;
                    fila[8] = pa.getFinanciacion();
                    fila[9] = pa.getNumTrabajadoresDiscapacitados();
                    modeloTabla.addRow(fila);
                }
            }       
        }
    }
    
    public Airport buscarAeropurto (int id){
        
        Airport airport = null;
        for(Airport aux : VariablesGlobales.airports){
            if (aux.getId()==id) {
                airport = aux;
            }
        }
        
        return airport;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAeropuertos = new javax.swing.JTable();
        rdbPrivado = new javax.swing.JRadioButton();
        rdbPublico = new javax.swing.JRadioButton();
        txtFiltroNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addAirport = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenuItem();
        deleteAirport = new javax.swing.JMenuItem();
        ganancias = new javax.swing.JMenuItem();
        showtxt = new javax.swing.JMenuItem();
        activ = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        deleteAirplane = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAeropuertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAeropuertos);

        rdbPrivado.setSelected(true);
        rdbPrivado.setText("Privado");
        rdbPrivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPrivadoActionPerformed(evt);
            }
        });

        rdbPublico.setText("Público");
        rdbPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPublicoActionPerformed(evt);
            }
        });

        txtFiltroNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroNombreActionPerformed(evt);
            }
        });
        txtFiltroNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltroNombreKeyReleased(evt);
            }
        });

        jLabel1.setText("Escribe un nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbPrivado)
                        .addGap(18, 18, 18)
                        .addComponent(rdbPublico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPrivado)
                    .addComponent(rdbPublico)
                    .addComponent(txtFiltroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Aeropuertos");

        addAirport.setText("Añadir...");
        addAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirportActionPerformed(evt);
            }
        });
        jMenu1.add(addAirport);

        edit.setText("Editar...");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jMenu1.add(edit);

        deleteAirport.setText("Borrar");
        deleteAirport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirportActionPerformed(evt);
            }
        });
        jMenu1.add(deleteAirport);

        ganancias.setText("Ganancias");
        ganancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gananciasActionPerformed(evt);
            }
        });
        jMenu1.add(ganancias);

        showtxt.setText("Mostrar información");
        showtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showtxtActionPerformed(evt);
            }
        });
        jMenu1.add(showtxt);

        jMenuBar1.add(jMenu1);

        activ.setText("Aviones");

        jMenuItem8.setText("Añadir...");
        activ.add(jMenuItem8);

        jMenuItem9.setText("Activar/Desactivar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        activ.add(jMenuItem9);

        deleteAirplane.setText("Borrar...");
        activ.add(deleteAirplane);

        jMenuBar1.add(activ);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        if (this.tblAeropuertos.getSelectedRow()!= -1) {
            
            int fila = this.tblAeropuertos.getSelectedRow();
            
            int id = (int) this.tblAeropuertos.getValueAt(fila, 0);
            
            Airport aeropuertoEditar = null;
            for(Airport aux: VariablesGlobales.airports){
                if (aux.getId()== id) {
                    aeropuertoEditar = aux;
                }
            }
            
            AniadirEditarAeropuerto ventana = new AniadirEditarAeropuerto(this, true, aeropuertoEditar);
            ventana.setVisible(true);
            if (this.rdbPrivado.isSelected()) {
                this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
            }else{
                this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
            }   
        }else{
            JOptionPane.showMessageDialog(this,
                    "No hay filas seleccionadas",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirportActionPerformed

        if(this.tblAeropuertos.getSelectedRow()!=-1){
            int eleccion = JOptionPane.showConfirmDialog(this,
                    "¿Quieres borrar el aeropuerto?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION);
            
                    if(eleccion == JOptionPane.YES_OPTION){
                        int fila = this.tblAeropuertos.getSelectedRow();
                        
                        int id = (int) this.tblAeropuertos.getValueAt(fila, 0);
                        
                        Airport airport = null;
                        for(Airport aux : VariablesGlobales.airports){
                            if (aux.getId() == id) {
                                airport = aux;
                            }
                        }
                        VariablesGlobales.airports.remove(airport);
                        
                        try{
                            MetodosSueltos.actualizarFichero();
                            
                            if (this.rdbPrivado.isSelected()){
                                this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
                            }else{
                                this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
                            }
                        }catch(IOException ex){
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
        }else{
            JOptionPane.showMessageDialog(this,
                    "No hay filas seleccionadas",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteAirportActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void addAirportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirportActionPerformed
        AniadirEditarAeropuerto ventana = new AniadirEditarAeropuerto(this, true);
        ventana.setVisible(true);
        if (this.rdbPrivado.isSelected()){
            this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
        }else{
            this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_addAirportActionPerformed

    private void rdbPrivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPrivadoActionPerformed
        this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
    }//GEN-LAST:event_rdbPrivadoActionPerformed

    private void rdbPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPublicoActionPerformed
        this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
    }//GEN-LAST:event_rdbPublicoActionPerformed

    private void txtFiltroNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroNombreKeyReleased
        if (this.rdbPrivado.isSelected()){
            this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
        }else{
            this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_txtFiltroNombreKeyReleased

    private void showtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtxtActionPerformed

        if (this.tblAeropuertos.getSelectedRow()!=-1){
           
            int fila = this.tblAeropuertos.getSelectedRow();
            
            int id = (int) this.tblAeropuertos.getValueAt(fila, 0);
            
            Airport airport = null;
            for(Airport aux: VariablesGlobales.airports){
                if (aux.getId() == id) {
                    airport = aux;
                }
            }
            
            JOptionPane.showMessageDialog(this,
                    airport.toString(),
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,
                    "No hay fila seleccionada",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_showtxtActionPerformed

    private void gananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gananciasActionPerformed

        if (this.tblAeropuertos.getSelectedRow()!=-1) {
            
            int fila = this.tblAeropuertos.getSelectedRow();
                    
            int id = (int) this.tblAeropuertos.getValueAt(fila, 0);
                    
            Airport aeropuerto = buscarAeropuerto(id);
                    
            String gananciasText = JOptionPane.showMessageDialog(this,
                                                        "Introduce las ganancias",
                                                        "Introducir",
                                                        JOptionPane.INFORMATION_MESSAGE);
                    if (MetodosSueltos.validaNumeroReal_Exp(gananciasText)) {
                        double ganancia = Double.parseDouble(gananciasText);
                        JOptionPane.showMessageDialog(this,
                                aeropuerto.gananciasTotales(ganancia),
                                "Ganancia",
                                JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,
                                "La ganancia introducida no tiene el formato correcto",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

        }else{

        }




    }//GEN-LAST:event_gananciasActionPerformed

    private void txtFiltroNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroNombreActionPerformed
        if (this.rdbPrivado.isSelected()){
            this.cargarDatos(PRIVADO, this.txtFiltroNombre.getText());
        }else{
            this.cargarDatos(PUBLICO, this.txtFiltroNombre.getText());
        }
    }//GEN-LAST:event_txtFiltroNombreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu activ;
    private javax.swing.JMenuItem addAirport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem deleteAirplane;
    private javax.swing.JMenuItem deleteAirport;
    private javax.swing.JMenuItem edit;
    private javax.swing.JMenuItem ganancias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbPrivado;
    private javax.swing.JRadioButton rdbPublico;
    private javax.swing.JMenuItem showtxt;
    private javax.swing.JTable tblAeropuertos;
    private javax.swing.JTextField txtFiltroNombre;
    // End of variables declaration//GEN-END:variables

    private Airport buscarAeropuerto(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
