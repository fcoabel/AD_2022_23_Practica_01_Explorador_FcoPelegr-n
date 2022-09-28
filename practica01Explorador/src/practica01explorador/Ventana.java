package practica01explorador;

import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FranciscoAbel
 */
public class Ventana extends javax.swing.JFrame {

    String dir = null;
    String ext = null;
    File mifile = null;
    DefaultTableModel modeloTabla = new DefaultTableModel();
    File[] arrayFiles = null;
    
    public Ventana() {
        
        initComponents();
        
        lRuta.setText("Ruta: ");
        lExt.setText("Extensión: ");
        tfRuta.setText("");
        tfExt.setText("");
        bRuta.setText("");
        bExt.setText("");
        bRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica01Explorador/lupa.png")));
        bExt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica01Explorador/lupa.png")));
        bLimpiar.setText("Limpiar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lRuta = new javax.swing.JLabel();
        lExt = new javax.swing.JLabel();
        tfRuta = new javax.swing.JTextField();
        tfExt = new javax.swing.JTextField();
        bRuta = new javax.swing.JButton();
        bExt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lRuta.setText("jLabel1");

        lExt.setText("jLabel2");

        tfRuta.setText("jTextField1");
        tfRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfRutaKeyPressed(evt);
            }
        });

        tfExt.setText("jTextField2");
        tfExt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfExtKeyPressed(evt);
            }
        });

        bRuta.setText("jButton1");
        bRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRutaActionPerformed(evt);
            }
        });

        bExt.setText("jButton2");
        bExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExtActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extension", "Tamaño", "F / D"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        bLimpiar.setText("jButton1");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lRuta)
                            .addComponent(lExt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfExt)
                                .addGap(18, 18, 18)
                                .addComponent(bExt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfRuta)
                                .addGap(18, 18, 18)
                                .addComponent(bRuta)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLimpiar)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lRuta)
                    .addComponent(tfRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRuta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lExt)
                    .addComponent(tfExt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExt))
                .addGap(32, 32, 32)
                .addComponent(bLimpiar)
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRutaActionPerformed
        getFiles();
    }//GEN-LAST:event_bRutaActionPerformed
    
    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        limpiarTabla();
    }//GEN-LAST:event_bLimpiarActionPerformed
    
    private void bExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExtActionPerformed
        filtrarExt();
    }//GEN-LAST:event_bExtActionPerformed

    private void tfRutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRutaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getFiles();
        }
    }//GEN-LAST:event_tfRutaKeyPressed

    private void tfExtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfExtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filtrarExt();
        }
    }//GEN-LAST:event_tfExtKeyPressed

    private void getFiles(){
    limpiarTabla();
        
        // obtenemos el contenido del textField
        dir = tfRuta.getText();
        
        //comprobamos si está vacio
        if (dir.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduce un directorio.");
        } else {
            
            mifile = new File(dir);
            modeloTabla = (DefaultTableModel) tabla.getModel();
            // comprobamos si existe
            if (mifile.exists()) {
                
                if (mifile.isDirectory()) {
                    
                    arrayFiles = mifile.listFiles();
                    // añadimos al modelo de la tabla cada objeto file
                    if (arrayFiles.length > 0) {
                        for (int i = 0; i < arrayFiles.length; i++) {
                            File arch = arrayFiles[i];
                            String fType = "D";
                            if (arch.isFile()){
                                fType = "F";
                            }
                            modeloTabla.addRow(new Object[]{arch.getName(), getExt(arch), arch.length(), fType});
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Es un Archivo");
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "El fichero o el archivo no existe.", "Atención", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }
    
    //metodo para filtrar por tipo de extensión
    private void filtrarExt(){
        limpiarTabla();
        
        ext = tfExt.getText();
        arrayFiles = mifile.listFiles();
        
        if (!ext.isEmpty()) {
            
            if (ext.charAt(0) == '.') {
                for (int i = 0; i < arrayFiles.length; i++) {
                    File arch = arrayFiles[i];
                    String ext1 = getExt(arch);
                    if (ext1.equals(ext)){
                        modeloTabla.addRow(new Object[]{arch.getName(), getExt(arch), arch.length(), "F"});
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Introduzca una extension. Ej: '.txt'", "Atención", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // con esta otra condición del if podemos filtrar por directorio
            for (int i = 0; i < arrayFiles.length; i++) {
                    File arch = arrayFiles[i];
                    String ext1 = getExt(arch);
                    if (arch.isDirectory()){
                        modeloTabla.addRow(new Object[]{arch.getName(), getExt(arch), arch.length(), "D"});
                    }
                }
        }
        // si la tabla está vacía indica que no ha encontrado ningun archivo con esa extension y salta un mensaje
        if (modeloTabla.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado ningun fichero con esa extensión.", "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //metodo para obtener la extensión del archivo
    private String getExt(File f){
        String ext = f.getName();
        int lastIndexOf = ext.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // extension vacia
        }
        return ext.substring(lastIndexOf);
    }
    
    // metodo para limpiar el jTable
    private void limpiarTabla(){
        modeloTabla.setRowCount(0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bExt;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bRuta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lExt;
    private javax.swing.JLabel lRuta;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfExt;
    private javax.swing.JTextField tfRuta;
    // End of variables declaration//GEN-END:variables
}
