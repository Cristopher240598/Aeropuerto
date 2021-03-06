/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristopher y Javier
 */
public class VentanaBusquedaCompania extends javax.swing.JFrame
{

    public Nodo n2;

    /**
     * Creates new form VentanaAltasAeropuerto
     */
    public VentanaBusquedaCompania()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Compania.jpg")).getImage());
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

        nombreCompania = new javax.swing.JLabel();
        nomCompania = new javax.swing.JTextField();
        urlCompania = new javax.swing.JLabel();
        url = new javax.swing.JTextField();
        telefono1 = new javax.swing.JTextField();
        telefono2 = new javax.swing.JTextField();
        telefonoCompania = new javax.swing.JLabel();
        correoElectronico = new javax.swing.JLabel();
        correoElec = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        ftCompania = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Compañias");
        setMinimumSize(new java.awt.Dimension(925, 420));
        getContentPane().setLayout(null);

        nombreCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        nombreCompania.setForeground(new java.awt.Color(0, 0, 102));
        nombreCompania.setText("Nombre de la compañia:");
        getContentPane().add(nombreCompania);
        nombreCompania.setBounds(50, 60, 230, 38);

        nomCompania.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        nomCompania.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nomCompaniaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                nomCompaniaKeyTyped(evt);
            }
        });
        getContentPane().add(nomCompania);
        nomCompania.setBounds(50, 100, 260, 38);

        urlCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        urlCompania.setForeground(new java.awt.Color(0, 0, 102));
        urlCompania.setText("URL:");
        getContentPane().add(urlCompania);
        urlCompania.setBounds(50, 220, 80, 38);

        url.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(url);
        url.setBounds(50, 260, 260, 38);

        telefono1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(telefono1);
        telefono1.setBounds(350, 100, 50, 39);

        telefono2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(telefono2);
        telefono2.setBounds(410, 100, 200, 39);

        telefonoCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        telefonoCompania.setForeground(new java.awt.Color(0, 0, 102));
        telefonoCompania.setText("Teléfono:");
        getContentPane().add(telefonoCompania);
        telefonoCompania.setBounds(350, 60, 120, 39);

        correoElectronico.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        correoElectronico.setForeground(new java.awt.Color(0, 0, 102));
        correoElectronico.setText("Correo electrónico:");
        getContentPane().add(correoElectronico);
        correoElectronico.setBounds(350, 220, 180, 39);

        correoElec.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        getContentPane().add(correoElec);
        correoElec.setBounds(350, 260, 260, 39);

        buscar.setBackground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        buscar.setForeground(new java.awt.Color(0, 0, 102));
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                buscarKeyPressed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(800, 340, 90, 23);

        ftCompania.setBackground(new java.awt.Color(255, 255, 255));
        ftCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        ftCompania.setForeground(new java.awt.Color(0, 0, 102));
        ftCompania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ftCompania.setText("FOTO");
        ftCompania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));
        getContentPane().add(ftCompania);
        ftCompania.setBounds(650, 30, 220, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 910, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_buscarKeyPressed
    {//GEN-HEADEREND:event_buscarKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            buscarActionPerformed(null);
        }
    }//GEN-LAST:event_buscarKeyPressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_buscarActionPerformed
    {//GEN-HEADEREND:event_buscarActionPerformed
        try
        {
            NodoArbol b;
            b = VentanaPrincipal.aR3.busca(VentanaPrincipal.aR3.getR(), nomCompania.getText());
            if (b != null)
            {
                url.setText(((Compania) b.getHh().getObj()).getuRL());
                telefono1.setText(String.valueOf(((Compania) b.getHh().getObj()).getTelefono1()));
                telefono2.setText(String.valueOf(((Compania) b.getHh().getObj()).getTelefono2()));
                correoElec.setText(((Compania) b.getHh().getObj()).getCorreoElectronico());
                ftCompania.setIcon(((Compania) b.getHh().getObj()).getImagenCom());
            } else
            {
                JOptionPane.showMessageDialog(this, "Dato no registrado", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            CtrlInterfaz.limpia(nomCompania, url, telefono2, correoElec);
            CtrlInterfaz.habilita(false, url, telefono2, correoElec);
            CtrlInterfaz.cambia(nomCompania);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void nomCompaniaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomCompaniaKeyTyped
    {//GEN-HEADEREND:event_nomCompaniaKeyTyped
        // KeyTyped es para validar entrada de datos
        Validaciones.validaAlfabeticos(evt);
    }//GEN-LAST:event_nomCompaniaKeyTyped

    private void nomCompaniaKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nomCompaniaKeyPressed
    {//GEN-HEADEREND:event_nomCompaniaKeyPressed
        // KeyPressed es para validar el enter
        Validaciones.enter(this, evt, buscar);
        Validaciones.limite(nomCompania, 30);
    }//GEN-LAST:event_nomCompaniaKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaBusquedaCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBusquedaCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBusquedaCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaBusquedaCompania.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VentanaBusquedaCompania().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField correoElec;
    private javax.swing.JLabel correoElectronico;
    private javax.swing.JLabel ftCompania;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField nomCompania;
    private javax.swing.JLabel nombreCompania;
    private javax.swing.JTextField telefono1;
    private javax.swing.JTextField telefono2;
    private javax.swing.JLabel telefonoCompania;
    private javax.swing.JTextField url;
    private javax.swing.JLabel urlCompania;
    // End of variables declaration//GEN-END:variables
}
