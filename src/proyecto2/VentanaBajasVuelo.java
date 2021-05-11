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
public class VentanaBajasVuelo extends javax.swing.JFrame
{

    Nodo n2, n3, n4;

    /**
     * Creates new form VentanaAltasAeropuerto
     */
    public VentanaBajasVuelo()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Vuelo.png")).getImage());
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

        compania = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        aeropuereto = new javax.swing.JLabel();
        letreroEliminarN4 = new javax.swing.JLabel();
        elementosNivel1 = new javax.swing.JComboBox<>();
        elementosNivel2 = new javax.swing.JComboBox<>();
        elementosNivel3 = new javax.swing.JComboBox<>();
        elementosNivel4 = new javax.swing.JComboBox<>();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bajas Vuelos");
        setMinimumSize(new java.awt.Dimension(347, 508));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        compania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        compania.setForeground(new java.awt.Color(0, 0, 102));
        compania.setText("Compania:");
        getContentPane().add(compania);
        compania.setBounds(40, 220, 100, 38);

        destino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        destino.setForeground(new java.awt.Color(0, 0, 102));
        destino.setText("Destino:");
        getContentPane().add(destino);
        destino.setBounds(40, 120, 80, 38);

        aeropuereto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        aeropuereto.setForeground(new java.awt.Color(0, 0, 102));
        aeropuereto.setText("Aeropuerto:");
        getContentPane().add(aeropuereto);
        aeropuereto.setBounds(40, 20, 110, 38);

        letreroEliminarN4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroEliminarN4.setForeground(new java.awt.Color(0, 0, 102));
        letreroEliminarN4.setText("Eliminar el vuelo:");
        getContentPane().add(letreroEliminarN4);
        letreroEliminarN4.setBounds(40, 320, 174, 38);

        elementosNivel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elementosNivel1.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                elementosNivel1ItemStateChanged(evt);
            }
        });
        getContentPane().add(elementosNivel1);
        elementosNivel1.setBounds(40, 60, 260, 38);

        elementosNivel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elementosNivel2.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                elementosNivel2ItemStateChanged(evt);
            }
        });
        getContentPane().add(elementosNivel2);
        elementosNivel2.setBounds(40, 160, 260, 38);

        elementosNivel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        elementosNivel3.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                elementosNivel3ItemStateChanged(evt);
            }
        });
        getContentPane().add(elementosNivel3);
        elementosNivel3.setBounds(40, 260, 260, 38);

        elementosNivel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(elementosNivel4);
        elementosNivel4.setBounds(40, 360, 260, 38);

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
        eliminar.setBounds(230, 440, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 510);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eliminarActionPerformed
    {//GEN-HEADEREND:event_eliminarActionPerformed
        NodoArbol d[] = new NodoArbol[2];
        try
        {
            Nodo arr[] = null;
            String s[] = new String[4];
            s[0] = (String) elementosNivel1.getSelectedItem();
            s[1] = (String) elementosNivel2.getSelectedItem();
            s[2] = (String) elementosNivel3.getSelectedItem();
            s[3] = (String) elementosNivel4.getSelectedItem();
            arr = ManipulaMultista.elimina((String) elementosNivel4.getSelectedItem(), VentanaPrincipal.r, 0, s);
            VentanaPrincipal.r = arr[1];
            VentanaPrincipal.aR4.elimina(VentanaPrincipal.aR4.getR(), (String) elementosNivel4.getSelectedItem(), d);
            VentanaPrincipal.aR4.setR(d[1]);
            Mensaje.exito(this, "Vuelo eliminado correctamente");
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

    private void elementosNivel2ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_elementosNivel2ItemStateChanged
    {//GEN-HEADEREND:event_elementosNivel2ItemStateChanged
        try
        {
            n3 = ManipulaMultista.busca(n2.getAbajo(), (String) elementosNivel2.getSelectedItem());
            ManipulaMultista.cargaCombo(n3.getAbajo(), elementosNivel3);
        } catch (Exception e)
        {
            ManipulaMultista.cargaCombo(null, elementosNivel3);
        }
    }//GEN-LAST:event_elementosNivel2ItemStateChanged

    private void elementosNivel3ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_elementosNivel3ItemStateChanged
    {//GEN-HEADEREND:event_elementosNivel3ItemStateChanged
        try
        {
            n4 = ManipulaMultista.busca(n3.getAbajo(), (String) elementosNivel3.getSelectedItem());
            ManipulaMultista.cargaCombo(n4.getAbajo(), elementosNivel4);
        } catch (Exception e)
        {
            ManipulaMultista.cargaCombo(null, elementosNivel4);
        }
    }//GEN-LAST:event_elementosNivel3ItemStateChanged

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
            java.util.logging.Logger.getLogger(VentanaBajasVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBajasVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VentanaBajasVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aeropuereto;
    private javax.swing.JLabel compania;
    private javax.swing.JLabel destino;
    private javax.swing.JComboBox<String> elementosNivel1;
    private javax.swing.JComboBox<String> elementosNivel2;
    private javax.swing.JComboBox<String> elementosNivel3;
    private javax.swing.JComboBox<String> elementosNivel4;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letreroEliminarN4;
    // End of variables declaration//GEN-END:variables
}