/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import cjb.ci.Mensaje;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher y Javier
 */
public class VentanaBajasDestino extends javax.swing.JFrame
{

    Nodo n2;

    /**
     * Creates new form VentanaAltasAeropuerto
     */
    public VentanaBajasDestino()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Destino.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        aeropuerto = new javax.swing.JLabel();
        elementosNivel1 = new javax.swing.JComboBox<>();
        elementosNivel2 = new javax.swing.JComboBox<>();
        eliminar = new javax.swing.JButton();
        letreroEliminarN2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bajas Destinos");
        setMinimumSize(new java.awt.Dimension(347, 321));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        aeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        aeropuerto.setForeground(new java.awt.Color(0, 0, 102));
        aeropuerto.setText("Aeropuerto:");
        getContentPane().add(aeropuerto);
        aeropuerto.setBounds(40, 20, 110, 38);

        elementosNivel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elementosNivel1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                elementosNivel1ItemStateChanged(evt);
            }
        });
        getContentPane().add(elementosNivel1);
        elementosNivel1.setBounds(40, 60, 261, 38);

        elementosNivel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(elementosNivel2);
        elementosNivel2.setBounds(40, 160, 260, 38);

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 102));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar);
        eliminar.setBounds(230, 250, 90, 23);

        letreroEliminarN2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroEliminarN2.setForeground(new java.awt.Color(0, 0, 102));
        letreroEliminarN2.setText("Eliminar el destino:");
        getContentPane().add(letreroEliminarN2);
        letreroEliminarN2.setBounds(40, 120, 174, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eliminarActionPerformed
    {//GEN-HEADEREND:event_eliminarActionPerformed
        NodoArbol d[] = new NodoArbol[2];
        try
        {
            Nodo arr[] = null;
            String s[] = new String[2];
            s[0] = (String) elementosNivel1.getSelectedItem();
            s[1] = (String) elementosNivel2.getSelectedItem();
            arr = ManipulaMultista.elimina((String) elementosNivel2.getSelectedItem(), VentanaPrincipal.r, 0, s);
            VentanaPrincipal.r = arr[1];
            VentanaPrincipal.aR2.elimina(VentanaPrincipal.aR2.getR(), (String) elementosNivel2.getSelectedItem(), d);
            VentanaPrincipal.aR2.setR(d[1]);
            Mensaje.exito(this, "Destino eliminado correctamente");
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        ManipulaMultista.cargaCombo(VentanaPrincipal.r, elementosNivel1);
    }//GEN-LAST:event_formWindowOpened

    private void elementosNivel1ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_elementosNivel1ItemStateChanged
    {//GEN-HEADEREND:event_elementosNivel1ItemStateChanged
        n2 = ManipulaMultista.busca(VentanaPrincipal.r, (String) elementosNivel1.getSelectedItem());
        ManipulaMultista.cargaCombo(n2.getAbajo(), elementosNivel2);
    }//GEN-LAST:event_elementosNivel1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasDestino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new VentanaBajasDestino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aeropuerto;
    private javax.swing.JComboBox<String> elementosNivel1;
    private javax.swing.JComboBox<String> elementosNivel2;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letreroEliminarN2;
    // End of variables declaration//GEN-END:variables
}