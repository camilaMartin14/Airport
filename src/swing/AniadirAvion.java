/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import Classes.Airplane;
import Classes.Airport;
import Classes.PrivateAirport;
import Utilidades.VariablesGlobales;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 *
 * @author 2004c
 */
public class AniadirAvion extends javax.swing.JDialog {

    /**
     * Creates new form AniadirAvion
     * @param parent
     */
    public AniadirAvion(java.awt.Frame parent, boolean modal) {
        super (parent, modal);
        initComponents();
        this.buttonGroup1.add(this.rdbAvionActivado);
        this.buttonGroup1.add(this.rdbAvionDesactivado);
    }
    
   public void cargarAeropuertos(){
   
        String estado = "";

        for (Airport aux: VariablesGlobales.airports){
            estado = aux.getNombre();

            if(aux instanceof PrivateAirport){
                estado += "(Privado)";
           }else{
                estado += "(Público)";
            }
            this.cmbAeropuerto.addItem(estado);
        }
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtModelo = new javax.swing.JTextField();
        txtVelocidadMaxima = new javax.swing.JTextField();
        txtAsientos = new javax.swing.JTextField();
        rdbAvionActivado = new javax.swing.JRadioButton();
        rdbAvionDesactivado = new javax.swing.JRadioButton();
        cmbAeropuerto = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rdbAvionActivado.setSelected(true);
        rdbAvionActivado.setText("Activado");
        rdbAvionActivado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAvionActivadoActionPerformed(evt);
            }
        });

        rdbAvionDesactivado.setText("Desactivado");

        cmbAeropuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");

        jLabel1.setText("Modelo");

        jLabel2.setText("Asientos");

        jLabel3.setText("Vel. Max.");

        jLabel4.setText("Aeropuerto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbAvionActivado)
                        .addGap(18, 18, 18)
                        .addComponent(rdbAvionDesactivado))
                    .addComponent(txtVelocidadMaxima)
                    .addComponent(txtAsientos)
                    .addComponent(txtModelo)
                    .addComponent(cmbAeropuerto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVelocidadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbAvionActivado)
                    .addComponent(rdbAvionDesactivado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(jButton2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbAvionActivadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAvionActivadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAvionActivadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String errores = "";
        
        String modelo = this.txtModelo.getText();
        String asientos = this.txtAsientos.getText();
        String velMax = this.txtVelocidadMaxima.getText();
        
        boolean activado = this.rdbAvionActivado.isSelected();
        
        if (modelo.isEmpty()) {
            errores+= "- El modelo no puede estar vacío \n"; 
        }
        if (asientos.isEmpty()) {
            errores+= "- Los asientos no pueden estar vacíos \n"; 
                }
        if (velMax.isEmpty()) {
            errores+= "- La velocidad no puede estar vacía \n"; 
                }
        
        
        
        if (errores.isEmpty()) {
            
            int numAsientos = Integer.parseInt(asientos);
            double velocidad = Double.parseDouble(velMax);
            
            Airplane a = new Airplane(modelo, numAsientos, velocidad);
            a.setActivado(activado);
            
            boolean existe= false;
            
            Airport auxAero = VariablesGlobales.airports.get(this.cmbAeropuerto.getSelectedIndex());
            
            
            
            for (Airport aux: auxAero.getAirplanes()){
                if (aux.equals(a)) {
                    existe = true;
                }
            }
         
            if (!existe) {
                auxAero.aniadirAvion(a);
                
                JOptionPane.showMessageDialog(this,
                    "El avion se ha creado correctamente",
                    "Exito",
                    JOptionPane.INFORMATION_MESSAGE); 
                
            }else{
              JOptionPane.showMessageDialog(this,
                    "El avion ya existe en este aeropuerto",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);  
            }
         
        }else{
            JOptionPane.showMessageDialog(this,
                    errores,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAeropuerto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rdbAvionActivado;
    private javax.swing.JRadioButton rdbAvionDesactivado;
    private javax.swing.JTextField txtAsientos;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtVelocidadMaxima;
    // End of variables declaration//GEN-END:variables
}
