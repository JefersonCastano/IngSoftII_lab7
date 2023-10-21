package presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import logica.*;

/**
 * @brief Interfaz grafica para el sistema Limitless
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
*/
public class Limitless extends javax.swing.JFrame {
    
    AbstractPaquete paqueteCliente;  //Paquete armado por el cliente
    AbstractPaquete paqueteTemp;   //Paquete usado para mostrar la informacion de un paquete especifico
    
    //Destinos disponibles para armar un paquete
    ArrayList<AbstractPaquete> paquetesDisp = new ArrayList <>();
    
    int contIdx, paisIdx, ciudIdx, tourIdx;
    
    public Limitless(ArrayList<AbstractPaquete> paquetes) {
        paquetesDisp = paquetes;
        initComponents();
        initialState();
    }
    
    /**
    * @brief Inicializa componentes de vista en estados por defecto
    */
    private void initialState(){
        fillCbx(cbxContinentes, paquetesDisp);
        txtAreaDetallesPlan.setEditable(false);
        setLocationRelativeTo(null);
        btnFinalizar.setVisible(false);
        btnAgregarTour.setVisible(false);
    }
    /**
    * @brief Reinicia componentes de vista para agregar un nuevo paquete
    */
    private void reiniciarComponentes(){
        txtAreaDetallesPlan.setText("");
        cbxPaises.removeAllItems();
        cbxCiudades.removeAllItems();
        cbxTours.removeAllItems();
        btnAgregarTour.setVisible(false);
        fillCbx(cbxPaises, paquetesDisp.get(contIdx).getHijos()); 
    }

    /**
    * @brief Llena un comboBox
    * @param cbx ComboBox a llenar
    * @param opciones Lista con la informacion de opciones para el comboBox
    */
    private void fillCbx(javax.swing.JComboBox cbx, List<AbstractPaquete> opciones){
        cbx.removeAllItems();
        cbx.addItem("<Seleccione>");
        
        for(AbstractPaquete opcion: opciones){
            cbx.addItem(opcion.getNombre());
        }
    }
    /**
    * @brief Verificar que una opcion disponible este seleccionada
    * @param cbx ComboBox a verificar
    * @param name Tipo de informacion a verificar
    */
    private boolean isCbxSelected(javax.swing.JComboBox cbx, String name){
        if(cbx.getSelectedIndex() < 1){
            JOptionPane.showMessageDialog(null, "Selecciona un "+ name, "Atención", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbSelCont = new javax.swing.JLabel();
        cbxContinentes = new javax.swing.JComboBox<>();
        btnSelCont = new javax.swing.JButton();
        btnAgregarTour = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDetallesPlan = new javax.swing.JTextArea();
        lbDetallesPlan = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbPrecioPlan = new javax.swing.JLabel();
        lbDuracion = new javax.swing.JLabel();
        lbDuracionPlan = new javax.swing.JLabel();
        lbSelPais = new javax.swing.JLabel();
        cbxPaises = new javax.swing.JComboBox<>();
        btnSelPais = new javax.swing.JButton();
        lbSelCiudad = new javax.swing.JLabel();
        cbxCiudades = new javax.swing.JComboBox<>();
        btnSelCiudad = new javax.swing.JButton();
        lbSelTour = new javax.swing.JLabel();
        cbxTours = new javax.swing.JComboBox<>();
        btnSelTour = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setText("Bienvenido a Limitless");

        lbSelCont.setText("Seleccione el continente al que desea viajar:");

        btnSelCont.setText("Seleccionar");
        btnSelCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelContActionPerformed(evt);
            }
        });

        btnAgregarTour.setText("Agregar Tour");
        btnAgregarTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTourActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar Paquete");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        txtAreaDetallesPlan.setColumns(20);
        txtAreaDetallesPlan.setRows(5);
        jScrollPane1.setViewportView(txtAreaDetallesPlan);

        lbDetallesPlan.setText("Detalles Plan:");

        lbPrecio.setText("Precio: $ ");

        lbDuracion.setText("Duracion (horas): ");

        lbSelPais.setText("Seleccione el pais al que desea viajar:");

        btnSelPais.setText("Seleccionar");
        btnSelPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelPaisActionPerformed(evt);
            }
        });

        lbSelCiudad.setText("Seleccione la ciudad al que desea viajar:");

        btnSelCiudad.setText("Seleccionar");
        btnSelCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelCiudadActionPerformed(evt);
            }
        });

        lbSelTour.setText("Seleccione el tour:");

        btnSelTour.setText("Seleccionar");
        btnSelTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelTourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPrecioPlan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDuracion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbDuracionPlan))
                            .addComponent(lbDetallesPlan)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSelCiudad)
                                    .addComponent(lbSelTour))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxTours, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSelTour))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSelCiudad)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSelCont)
                                    .addComponent(lbSelPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxContinentes, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelCont)
                            .addComponent(btnSelPais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbTitulo)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSelCont)
                            .addComponent(cbxContinentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelCont)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregarTour)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSelPais)
                            .addComponent(cbxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelPais)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnFinalizar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelCiudad)
                    .addComponent(cbxCiudades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelCiudad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSelTour)
                    .addComponent(cbxTours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelTour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lbDetallesPlan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecio)
                    .addComponent(lbPrecioPlan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuracion)
                    .addComponent(lbDuracionPlan))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelContActionPerformed
        
        if(!isCbxSelected(cbxContinentes, "continentes.")) return;
        //POST: Se ha seleccionado un continente
        contIdx = cbxContinentes.getSelectedIndex() - 1;  
        
        //Llenar el comboBox de paises dependiente el continente seleccionado
        fillCbx(cbxPaises, paquetesDisp.get(contIdx).getHijos()); 
        cbxCiudades.removeAllItems();
        cbxTours.removeAllItems();
        
        //Mostrar informacion del continente seleccionado
        paqueteTemp = (Continente) paquetesDisp.get(contIdx).clonar();
        paqueteTemp.getHijos().clear();
        txtAreaDetallesPlan.setText(paqueteTemp.obtenerPlan());
    }//GEN-LAST:event_btnSelContActionPerformed
    
    /**
     * @brief Agrega un destino al paquete del cliente si no esta
     * @param evt 
     */
    private void btnAgregarTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTourActionPerformed
        
        //Verificar si el paquete ya tiene destinos seleccionados
        if(paqueteCliente != null){  
            for (AbstractPaquete pais: paqueteCliente.getHijos()){
                //Verificar si el nuevo tour esta en un pais ya agregado
                if(paqueteTemp.getHijos().get(0).getNombre().equals(pais.getNombre())){       
                    for (AbstractPaquete ciudad: pais.getHijos()){
                        //Verificar si el nuevo tour esta en una ciudad ya agregada
                        if(paqueteTemp.getHijos().get(0).getHijos().get(0).getNombre().equals(ciudad.getNombre())){
                           for (AbstractPaquete tour: ciudad.getHijos()){
                               //Verificar si el tour ya esta agregado
                                if(paqueteTemp.getHijos().get(0).getHijos().get(0).getHijos().get(0).getNombre().equals(tour.getNombre())){                         
                                    JOptionPane.showMessageDialog(null, "El tour ya ha sido agregado anteriorimente.", "Atención", JOptionPane.INFORMATION_MESSAGE);     
                                    return;
                                }
                            }
                            ciudad.addChild(paqueteTemp.getHijos().get(0).getHijos().get(0).getHijos().get(0).clonar());
                            stateAddedSuccesfully();
                            return;
                        }
                    }
                    pais.addChild(paqueteTemp.getHijos().get(0).getHijos().get(0).clonar());
                    stateAddedSuccesfully();
                    return;
                }
            }
            paqueteCliente.addChild(paqueteTemp.getHijos().get(0).clonar());
        }else {
            //El paquete esta incialmente vacio
            paqueteCliente = paqueteTemp.clonar();
        }  
        stateAddedSuccesfully();
    }//GEN-LAST:event_btnAgregarTourActionPerformed
    /**
     * @brief Establece el estado de tour agregado con exito.
     */
    public void stateAddedSuccesfully(){
        cbxContinentes.setEnabled(false);
        btnSelCont.setEnabled(false);
        reiniciarComponentes();
        JOptionPane.showMessageDialog(null, "Paquete agregado", "Atención", JOptionPane.INFORMATION_MESSAGE);     
        btnFinalizar.setVisible(true);
    }
    /**
     * @brief Mostrar la informacion del paquete final armado por el cliente
     * @param evt 
     */
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
        txtAreaDetallesPlan.setText(paqueteCliente.obtenerPlan());
        lbPrecio.setText("Precio total: $");
        lbDuracion.setText("Duracion final (horas):"); 
        
        lbPrecioPlan.setText(String.valueOf(paqueteCliente.getPrecio()));
        lbDuracionPlan.setText(String.valueOf(paqueteCliente.getDuracion())); 
        
        //Bloquear las opciones
        btnFinalizar.setVisible(false);
        cbxContinentes.setEnabled(false);
        btnSelPais.setVisible(false);
        btnSelCiudad.setVisible(false);
        btnSelTour.setVisible(false);     
        btnAgregarTour.setVisible(false);  
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnSelPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelPaisActionPerformed
        if(!isCbxSelected(cbxPaises, "pais.")) return;
        paisIdx = cbxPaises.getSelectedIndex() - 1;  
        cbxTours.removeAllItems();
        //Llenar el comboBox con las ciudades correspondientes al pais seleccionado
        fillCbx(cbxCiudades, paquetesDisp.get(contIdx).getHijos().get(paisIdx).getHijos());
        
        //Mostrar informacion del pais seleccionado
        paqueteTemp.getHijos().clear();
        paqueteTemp.addChild(paquetesDisp.get(contIdx).getHijos().get(paisIdx).clonar());
        paqueteTemp.getHijos().get(0).getHijos().clear();
        txtAreaDetallesPlan.setText(paqueteTemp.obtenerPlan());
    }//GEN-LAST:event_btnSelPaisActionPerformed

    private void btnSelCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelCiudadActionPerformed
        if(!isCbxSelected(cbxCiudades, "ciudad.")) return;
        ciudIdx = cbxCiudades.getSelectedIndex() - 1;  
         //Llenar el comboBox con los tours correspondientes a la ciudad seleccionada
        fillCbx(cbxTours, paquetesDisp.get(contIdx).getHijos().get(paisIdx).getHijos().get(ciudIdx).getHijos()); 
        
         //Mostrar informacion de la ciudad seleccionado
        paqueteTemp.getHijos().get(0).getHijos().clear();
        paqueteTemp.getHijos().get(0).addChild(paquetesDisp.get(contIdx).getHijos().get(paisIdx).getHijos().get(ciudIdx).clonar());
        paqueteTemp.getHijos().get(0).getHijos().get(0).getHijos().clear();
        txtAreaDetallesPlan.setText(paqueteTemp.obtenerPlan());
    }//GEN-LAST:event_btnSelCiudadActionPerformed

    private void btnSelTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelTourActionPerformed
        if(!isCbxSelected(cbxTours, "tour.")) return;
        tourIdx = cbxTours.getSelectedIndex() - 1;  
        
        //Mostrar informacion del tour seleccionado
        paqueteTemp.getHijos().get(0).getHijos().get(0).getHijos().clear();
        paqueteTemp.getHijos().get(0).getHijos().get(0).addChild(paquetesDisp.get(contIdx).getHijos().get(paisIdx).getHijos().get(ciudIdx).getHijos().get(tourIdx).clonar());
        
        txtAreaDetallesPlan.setText(paqueteTemp.obtenerPlan());
        
        lbPrecioPlan.setText(String.valueOf(paqueteTemp.getPrecio()));
        lbDuracionPlan.setText(String.valueOf(paqueteTemp.getDuracion())); 
        
        btnAgregarTour.setVisible(true);      
    }//GEN-LAST:event_btnSelTourActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTour;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSelCiudad;
    private javax.swing.JButton btnSelCont;
    private javax.swing.JButton btnSelPais;
    private javax.swing.JButton btnSelTour;
    private javax.swing.JComboBox<String> cbxCiudades;
    private javax.swing.JComboBox<String> cbxContinentes;
    private javax.swing.JComboBox<String> cbxPaises;
    private javax.swing.JComboBox<String> cbxTours;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDetallesPlan;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbDuracionPlan;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbPrecioPlan;
    private javax.swing.JLabel lbSelCiudad;
    private javax.swing.JLabel lbSelCont;
    private javax.swing.JLabel lbSelPais;
    private javax.swing.JLabel lbSelTour;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextArea txtAreaDetallesPlan;
    // End of variables declaration//GEN-END:variables
}
