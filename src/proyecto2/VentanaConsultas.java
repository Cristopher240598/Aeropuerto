/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.ImageIcon;

/**
 *
 * @author Cristopher y Javier
 */
public class VentanaConsultas extends javax.swing.JFrame
{

    public static Nodo nivel1, nivel2, nivel3, nivel4;
    public static String cadenaNivel1 = "", cadenaNivel2 = "", cadenaNivel3 = "", cadenaNivel4 = "";

    /**
     * Creates new form Consultas
     */
    public VentanaConsultas()
    {
        initComponents();
        this.setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Consulta.jpg")).getImage());
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

        atras1 = new javax.swing.JButton();
        letreroVuelo = new javax.swing.JLabel();
        letreroCompania = new javax.swing.JLabel();
        letreroDestino = new javax.swing.JLabel();
        letreroAeropuereto = new javax.swing.JLabel();
        aeropuerto = new javax.swing.JTextField();
        adelante1 = new javax.swing.JButton();
        atras2 = new javax.swing.JButton();
        destino = new javax.swing.JTextField();
        adelante2 = new javax.swing.JButton();
        compania = new javax.swing.JTextField();
        atras3 = new javax.swing.JButton();
        adelante3 = new javax.swing.JButton();
        atras4 = new javax.swing.JButton();
        vuelo = new javax.swing.JTextField();
        adelante4 = new javax.swing.JButton();
        fotoAeropuerto = new javax.swing.JLabel();
        fotoCompania = new javax.swing.JLabel();
        fotoVuelo = new javax.swing.JLabel();
        fotoDestino = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");
        setMinimumSize(new java.awt.Dimension(1147, 478));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        atras1.setBackground(new java.awt.Color(255, 255, 255));
        atras1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        atras1.setForeground(new java.awt.Color(0, 0, 102));
        atras1.setText("<");
        atras1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                atras1ActionPerformed(evt);
            }
        });
        getContentPane().add(atras1);
        atras1.setBounds(90, 140, 45, 37);

        letreroVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroVuelo.setForeground(new java.awt.Color(0, 0, 102));
        letreroVuelo.setText("Vuelo");
        getContentPane().add(letreroVuelo);
        letreroVuelo.setBounds(970, 20, 60, 38);

        letreroCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroCompania.setForeground(new java.awt.Color(0, 0, 102));
        letreroCompania.setText("Compañia");
        getContentPane().add(letreroCompania);
        letreroCompania.setBounds(670, 20, 90, 38);

        letreroDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroDestino.setForeground(new java.awt.Color(0, 0, 102));
        letreroDestino.setText("Destino");
        getContentPane().add(letreroDestino);
        letreroDestino.setBounds(400, 20, 70, 38);

        letreroAeropuereto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        letreroAeropuereto.setForeground(new java.awt.Color(0, 0, 102));
        letreroAeropuereto.setText("Aeropuerto");
        getContentPane().add(letreroAeropuereto);
        letreroAeropuereto.setBounds(110, 20, 100, 38);

        aeropuerto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aeropuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(aeropuerto);
        aeropuerto.setBounds(20, 70, 260, 37);

        adelante1.setBackground(new java.awt.Color(255, 255, 255));
        adelante1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        adelante1.setForeground(new java.awt.Color(0, 0, 102));
        adelante1.setText(">");
        adelante1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                adelante1ActionPerformed(evt);
            }
        });
        getContentPane().add(adelante1);
        adelante1.setBounds(160, 140, 45, 38);

        atras2.setBackground(new java.awt.Color(255, 255, 255));
        atras2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        atras2.setForeground(new java.awt.Color(0, 0, 102));
        atras2.setText("<");
        atras2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                atras2ActionPerformed(evt);
            }
        });
        getContentPane().add(atras2);
        atras2.setBounds(370, 140, 45, 37);

        destino.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        destino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(destino);
        destino.setBounds(300, 70, 260, 37);

        adelante2.setBackground(new java.awt.Color(255, 255, 255));
        adelante2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        adelante2.setForeground(new java.awt.Color(0, 0, 102));
        adelante2.setText(">");
        adelante2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                adelante2ActionPerformed(evt);
            }
        });
        getContentPane().add(adelante2);
        adelante2.setBounds(440, 140, 45, 38);

        compania.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        compania.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(compania);
        compania.setBounds(580, 70, 260, 37);

        atras3.setBackground(new java.awt.Color(255, 255, 255));
        atras3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        atras3.setForeground(new java.awt.Color(0, 0, 102));
        atras3.setText("<");
        atras3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                atras3ActionPerformed(evt);
            }
        });
        getContentPane().add(atras3);
        atras3.setBounds(650, 140, 45, 37);

        adelante3.setBackground(new java.awt.Color(255, 255, 255));
        adelante3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        adelante3.setForeground(new java.awt.Color(0, 0, 102));
        adelante3.setText(">");
        adelante3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                adelante3ActionPerformed(evt);
            }
        });
        getContentPane().add(adelante3);
        adelante3.setBounds(720, 140, 45, 38);

        atras4.setBackground(new java.awt.Color(255, 255, 255));
        atras4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        atras4.setForeground(new java.awt.Color(0, 0, 102));
        atras4.setText("<");
        atras4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                atras4ActionPerformed(evt);
            }
        });
        getContentPane().add(atras4);
        atras4.setBounds(930, 140, 45, 37);

        vuelo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        vuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(vuelo);
        vuelo.setBounds(860, 70, 260, 37);

        adelante4.setBackground(new java.awt.Color(255, 255, 255));
        adelante4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        adelante4.setForeground(new java.awt.Color(0, 0, 102));
        adelante4.setText(">");
        adelante4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                adelante4ActionPerformed(evt);
            }
        });
        getContentPane().add(adelante4);
        adelante4.setBounds(1000, 140, 45, 38);

        fotoAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        fotoAeropuerto.setForeground(new java.awt.Color(0, 0, 102));
        fotoAeropuerto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoAeropuerto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(fotoAeropuerto);
        fotoAeropuerto.setBounds(40, 210, 220, 200);

        fotoCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        fotoCompania.setForeground(new java.awt.Color(0, 0, 102));
        fotoCompania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoCompania.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(fotoCompania);
        fotoCompania.setBounds(600, 210, 220, 200);

        fotoVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        fotoVuelo.setForeground(new java.awt.Color(0, 0, 102));
        fotoVuelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoVuelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(fotoVuelo);
        fotoVuelo.setBounds(880, 210, 220, 200);

        fotoDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        fotoDestino.setForeground(new java.awt.Color(0, 0, 102));
        fotoDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotoDestino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(fotoDestino);
        fotoDestino.setBounds(320, 210, 220, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1150, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adelante1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_adelante1ActionPerformed
    {//GEN-HEADEREND:event_adelante1ActionPerformed
        actualizaAeropuerto(1);
        actualizaDestino(1);
        actualizaCompania(1);
        actualizaVuelo(1);
    }//GEN-LAST:event_adelante1ActionPerformed

    private void atras1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_atras1ActionPerformed
    {//GEN-HEADEREND:event_atras1ActionPerformed
        actualizaAeropuerto(0);
        actualizaDestino(0);
        actualizaCompania(0);
        actualizaVuelo(0);
    }//GEN-LAST:event_atras1ActionPerformed

    private void adelante2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_adelante2ActionPerformed
    {//GEN-HEADEREND:event_adelante2ActionPerformed
        actualizaDestino(1);
        actualizaCompania(1);
        actualizaVuelo(1);
    }//GEN-LAST:event_adelante2ActionPerformed

    private void atras2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_atras2ActionPerformed
    {//GEN-HEADEREND:event_atras2ActionPerformed
        actualizaDestino(0);
        actualizaCompania(0);
        actualizaVuelo(0);
    }//GEN-LAST:event_atras2ActionPerformed

    private void adelante3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_adelante3ActionPerformed
    {//GEN-HEADEREND:event_adelante3ActionPerformed
        actualizaCompania(1);
        actualizaVuelo(1);
    }//GEN-LAST:event_adelante3ActionPerformed

    private void atras3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_atras3ActionPerformed
    {//GEN-HEADEREND:event_atras3ActionPerformed
        actualizaCompania(0);
        actualizaVuelo(0);
    }//GEN-LAST:event_atras3ActionPerformed

    private void adelante4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_adelante4ActionPerformed
    {//GEN-HEADEREND:event_adelante4ActionPerformed
        actualizaVuelo(1);
    }//GEN-LAST:event_adelante4ActionPerformed

    private void atras4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_atras4ActionPerformed
    {//GEN-HEADEREND:event_atras4ActionPerformed
        actualizaVuelo(0);
    }//GEN-LAST:event_atras4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        nivel1 = VentanaPrincipal.r;
        actualizaAeropuerto(1);
        actualizaDestino(1);
        actualizaCompania(1);
        actualizaVuelo(1);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new VentanaConsultas().setVisible(true);
            }
        });
    }

    public void actualizaAeropuerto(int accion)
    {
        fotoAeropuerto.setIcon(null);
        if (nivel1 == null)
        {
            cadenaNivel1 = "No hay aeropuerto";
            nivel2 = null;
        } else
        {
            if (accion == 1)
            {
                nivel1 = nivel1.getSiguiente();
            } else
            {
                nivel1 = nivel1.getAnterior();
            }
            aeropuerto.setToolTipText(((Aeropuerto) nivel1.getObj()).desp());
            cadenaNivel1 = nivel1.getClave();
            nivel2 = nivel1.getAbajo();
            fotoAeropuerto.setIcon(((Aeropuerto) nivel1.getObj()).getImagenAer());
        }
        aeropuerto.setText(cadenaNivel1);
    }

    public void actualizaDestino(int accion)
    {
        fotoDestino.setIcon(null);
        if (nivel2 == null)
        {
            cadenaNivel2 = "No hay destino";
            nivel3 = null;
        } else
        {
            if (accion == 1)
            {
                nivel2 = nivel2.getSiguiente();

            } else
            {
                nivel2 = nivel2.getAnterior();
            }
            destino.setToolTipText(((Destino) nivel2.getObj()).desp());
            cadenaNivel2 = nivel2.getClave();
            nivel3 = nivel2.getAbajo();
            fotoDestino.setIcon(((Destino) nivel2.getObj()).getImagenDest());
        }
        destino.setText(cadenaNivel2);
    }

    public void actualizaCompania(int accion)
    {
        fotoCompania.setIcon(null);
        if (nivel3 == null)
        {
            cadenaNivel3 = "No hay compania";
            nivel4 = null;
        } else
        {
            if (accion == 1)
            {
                nivel3 = nivel3.getSiguiente();
            } else
            {
                nivel3 = nivel3.getAnterior();
            }
            compania.setToolTipText(((Compania) nivel3.getObj()).desp());
            cadenaNivel3 = nivel3.getClave();
            nivel4 = nivel3.getAbajo();
            fotoCompania.setIcon(((Compania) nivel3.getObj()).getImagenCom());
        }
        compania.setText(cadenaNivel3);
    }

    public void actualizaVuelo(int accion)
    {
        fotoVuelo.setIcon(null);
        if (nivel4 == null)
        {
            cadenaNivel4 = "No hay vuelo";
        } else
        {
            if (accion == 1)
            {
                nivel4 = nivel4.getSiguiente();
            } else
            {
                nivel4 = nivel4.getAnterior();
            }
            vuelo.setToolTipText(((Vuelos) nivel4.getObj()).desp());
            cadenaNivel4 = nivel4.getClave();
            fotoVuelo.setIcon(((Vuelos) nivel4.getObj()).getImagenVue());
        }
        vuelo.setText(cadenaNivel4);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adelante1;
    private javax.swing.JButton adelante2;
    private javax.swing.JButton adelante3;
    private javax.swing.JButton adelante4;
    private javax.swing.JTextField aeropuerto;
    private javax.swing.JButton atras1;
    private javax.swing.JButton atras2;
    private javax.swing.JButton atras3;
    private javax.swing.JButton atras4;
    private javax.swing.JTextField compania;
    private javax.swing.JTextField destino;
    private javax.swing.JLabel fotoAeropuerto;
    private javax.swing.JLabel fotoCompania;
    private javax.swing.JLabel fotoDestino;
    private javax.swing.JLabel fotoVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letreroAeropuereto;
    private javax.swing.JLabel letreroCompania;
    private javax.swing.JLabel letreroDestino;
    private javax.swing.JLabel letreroVuelo;
    private javax.swing.JTextField vuelo;
    // End of variables declaration//GEN-END:variables
}