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
public class VentanaPrincipal extends javax.swing.JFrame
{

    public static Nodo r = null;
    public static ArbolBinario aR1 = new ArbolBinario();
    public static ArbolBinario aR3 = new ArbolBinario();
    public static ArbolBinario aR2 = new ArbolBinario();
    public static ArbolBinario aR4 = new ArbolBinario();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal()
    {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Registro.png")).getImage());
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

        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuAeropuertos = new javax.swing.JMenu();
        menuAltasAeropuerto = new javax.swing.JMenuItem();
        menuBajasAeropuerto = new javax.swing.JMenuItem();
        menuModificacionesAeropuerto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuConsultasAeropuerto = new javax.swing.JMenuItem();
        menuBuscarAeropuerto = new javax.swing.JMenuItem();
        menuDestinos = new javax.swing.JMenu();
        menuAltasDestino = new javax.swing.JMenuItem();
        menuBajasDestino = new javax.swing.JMenuItem();
        menuModificacionesDestino = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuConsultasDestino = new javax.swing.JMenuItem();
        menuBuscarDestino = new javax.swing.JMenuItem();
        menuCompanias = new javax.swing.JMenu();
        menuAltasCompania = new javax.swing.JMenuItem();
        menuBajasCompania = new javax.swing.JMenuItem();
        menuModificacionesCompania = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuConsultasCompania = new javax.swing.JMenuItem();
        menuBuscarCompania = new javax.swing.JMenuItem();
        menuVuelos = new javax.swing.JMenu();
        menuAltasVuelo = new javax.swing.JMenuItem();
        menuBajasVuelo = new javax.swing.JMenuItem();
        menuModificacionesVuelo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuConsultasVuelo = new javax.swing.JMenuItem();
        menuBuscarVuelo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(0, 0, 255));
        setMinimumSize(new java.awt.Dimension(1000, 647));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        clockFace1.setBackground(new java.awt.Color(255, 255, 255));
        clockFace1.setForeground(new java.awt.Color(0, 0, 102));
        clockFace1.setRomano(false);
        getContentPane().add(clockFace1);
        clockFace1.setBounds(670, 160, 270, 290);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 60, 620, 470);

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoP.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1010, 600);

        menu.setBackground(new java.awt.Color(51, 255, 51));
        menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu.setForeground(new java.awt.Color(0, 153, 204));
        menu.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N

        menuAeropuertos.setBackground(new java.awt.Color(255, 255, 255));
        menuAeropuertos.setBorder(null);
        menuAeropuertos.setText("Aeropuertos   ");
        menuAeropuertos.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        menuAltasAeropuerto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        menuAltasAeropuerto.setBackground(new java.awt.Color(255, 255, 255));
        menuAltasAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuAltasAeropuerto.setText("Altas");
        menuAltasAeropuerto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAltasAeropuerto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuAltasAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuertos.add(menuAltasAeropuerto);

        menuBajasAeropuerto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        menuBajasAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBajasAeropuerto.setText("Bajas");
        menuBajasAeropuerto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBajasAeropuerto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBajasAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuertos.add(menuBajasAeropuerto);

        menuModificacionesAeropuerto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        menuModificacionesAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuModificacionesAeropuerto.setText("Modificaciones");
        menuModificacionesAeropuerto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuModificacionesAeropuerto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuModificacionesAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuertos.add(menuModificacionesAeropuerto);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 255));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAeropuertos.add(jSeparator1);

        menuConsultasAeropuerto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuConsultasAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuConsultasAeropuerto.setText("Consultas");
        menuConsultasAeropuerto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultasAeropuerto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuConsultasAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuertos.add(menuConsultasAeropuerto);

        menuBuscarAeropuerto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
        menuBuscarAeropuerto.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBuscarAeropuerto.setText("Busqueda");
        menuBuscarAeropuerto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBuscarAeropuerto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBuscarAeropuertoActionPerformed(evt);
            }
        });
        menuAeropuertos.add(menuBuscarAeropuerto);

        menu.add(menuAeropuertos);

        menuDestinos.setBackground(new java.awt.Color(153, 153, 255));
        menuDestinos.setText("Destinos   ");
        menuDestinos.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        menuAltasDestino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        menuAltasDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuAltasDestino.setText("Altas");
        menuAltasDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAltasDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuAltasDestinoActionPerformed(evt);
            }
        });
        menuDestinos.add(menuAltasDestino);

        menuBajasDestino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        menuBajasDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBajasDestino.setText("Bajas");
        menuBajasDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBajasDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBajasDestinoActionPerformed(evt);
            }
        });
        menuDestinos.add(menuBajasDestino);

        menuModificacionesDestino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        menuModificacionesDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuModificacionesDestino.setText("Modificaciones");
        menuModificacionesDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuModificacionesDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuModificacionesDestinoActionPerformed(evt);
            }
        });
        menuDestinos.add(menuModificacionesDestino);

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuDestinos.add(jSeparator2);

        menuConsultasDestino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuConsultasDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuConsultasDestino.setText("Consultas");
        menuConsultasDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultasDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuConsultasDestinoActionPerformed(evt);
            }
        });
        menuDestinos.add(menuConsultasDestino);

        menuBuscarDestino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuBuscarDestino.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBuscarDestino.setText("Busqueda");
        menuBuscarDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBuscarDestino.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBuscarDestinoActionPerformed(evt);
            }
        });
        menuDestinos.add(menuBuscarDestino);

        menu.add(menuDestinos);

        menuCompanias.setText("Compañias   ");
        menuCompanias.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        menuAltasCompania.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuAltasCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuAltasCompania.setText("Altas");
        menuAltasCompania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAltasCompania.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuAltasCompaniaActionPerformed(evt);
            }
        });
        menuCompanias.add(menuAltasCompania);

        menuBajasCompania.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuBajasCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBajasCompania.setText("Bajas");
        menuBajasCompania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBajasCompania.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBajasCompaniaActionPerformed(evt);
            }
        });
        menuCompanias.add(menuBajasCompania);

        menuModificacionesCompania.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuModificacionesCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuModificacionesCompania.setText("Modificaciones");
        menuModificacionesCompania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuModificacionesCompania.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuModificacionesCompaniaActionPerformed(evt);
            }
        });
        menuCompanias.add(menuModificacionesCompania);

        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCompanias.add(jSeparator3);

        menuConsultasCompania.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuConsultasCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuConsultasCompania.setText("Consultas");
        menuConsultasCompania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultasCompania.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuConsultasCompaniaActionPerformed(evt);
            }
        });
        menuCompanias.add(menuConsultasCompania);

        menuBuscarCompania.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        menuBuscarCompania.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBuscarCompania.setText("Busqueda");
        menuBuscarCompania.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBuscarCompania.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBuscarCompaniaActionPerformed(evt);
            }
        });
        menuCompanias.add(menuBuscarCompania);

        menu.add(menuCompanias);

        menuVuelos.setBackground(new java.awt.Color(51, 51, 255));
        menuVuelos.setText("Vuelos   ");
        menuVuelos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuVuelos.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N

        menuAltasVuelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuAltasVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuAltasVuelo.setText("Altas");
        menuAltasVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuAltasVuelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuAltasVueloActionPerformed(evt);
            }
        });
        menuVuelos.add(menuAltasVuelo);

        menuBajasVuelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuBajasVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBajasVuelo.setText("Bajas");
        menuBajasVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBajasVuelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBajasVueloActionPerformed(evt);
            }
        });
        menuVuelos.add(menuBajasVuelo);

        menuModificacionesVuelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuModificacionesVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuModificacionesVuelo.setText("Modificaciones");
        menuModificacionesVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuModificacionesVuelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuModificacionesVueloActionPerformed(evt);
            }
        });
        menuVuelos.add(menuModificacionesVuelo);

        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuVuelos.add(jSeparator4);

        menuConsultasVuelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuConsultasVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuConsultasVuelo.setText("Consultas");
        menuConsultasVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuConsultasVuelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuConsultasVueloActionPerformed(evt);
            }
        });
        menuVuelos.add(menuConsultasVuelo);

        menuBuscarVuelo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuBuscarVuelo.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        menuBuscarVuelo.setText("Busqueda");
        menuBuscarVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuBuscarVuelo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                menuBuscarVueloActionPerformed(evt);
            }
        });
        menuVuelos.add(menuBuscarVuelo);

        menu.add(menuVuelos);

        setJMenuBar(menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuAltasAeropuertoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuAltasAeropuertoActionPerformed
    {//GEN-HEADEREND:event_menuAltasAeropuertoActionPerformed
        new VentanaAltasAeropuerto().setVisible(true);
    }//GEN-LAST:event_menuAltasAeropuertoActionPerformed

    private void menuAltasDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuAltasDestinoActionPerformed
    {//GEN-HEADEREND:event_menuAltasDestinoActionPerformed
        new VentanaAltasDestino().setVisible(true);
    }//GEN-LAST:event_menuAltasDestinoActionPerformed

    private void menuAltasCompaniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuAltasCompaniaActionPerformed
    {//GEN-HEADEREND:event_menuAltasCompaniaActionPerformed
        new VentanaAltasCompania().setVisible(true);
    }//GEN-LAST:event_menuAltasCompaniaActionPerformed

    private void menuAltasVueloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuAltasVueloActionPerformed
    {//GEN-HEADEREND:event_menuAltasVueloActionPerformed
        new VentanaAltasVuelos().setVisible(true);
    }//GEN-LAST:event_menuAltasVueloActionPerformed

    private void menuConsultasAeropuertoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultasAeropuertoActionPerformed
    {//GEN-HEADEREND:event_menuConsultasAeropuertoActionPerformed
        new VentanaConsultas().setVisible(true);
    }//GEN-LAST:event_menuConsultasAeropuertoActionPerformed

    private void menuConsultasDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultasDestinoActionPerformed
    {//GEN-HEADEREND:event_menuConsultasDestinoActionPerformed
        new VentanaConsultas().setVisible(true);
    }//GEN-LAST:event_menuConsultasDestinoActionPerformed

    private void menuConsultasCompaniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultasCompaniaActionPerformed
    {//GEN-HEADEREND:event_menuConsultasCompaniaActionPerformed
        new VentanaConsultas().setVisible(true);
    }//GEN-LAST:event_menuConsultasCompaniaActionPerformed

    private void menuConsultasVueloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuConsultasVueloActionPerformed
    {//GEN-HEADEREND:event_menuConsultasVueloActionPerformed
        new VentanaConsultas().setVisible(true);
    }//GEN-LAST:event_menuConsultasVueloActionPerformed

    private void menuBajasAeropuertoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBajasAeropuertoActionPerformed
    {//GEN-HEADEREND:event_menuBajasAeropuertoActionPerformed
        new VentanaBajasAeropuerto().setVisible(true);
    }//GEN-LAST:event_menuBajasAeropuertoActionPerformed

    private void menuBajasDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBajasDestinoActionPerformed
    {//GEN-HEADEREND:event_menuBajasDestinoActionPerformed
        new VentanaBajasDestino().setVisible(true);
    }//GEN-LAST:event_menuBajasDestinoActionPerformed

    private void menuBajasCompaniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBajasCompaniaActionPerformed
    {//GEN-HEADEREND:event_menuBajasCompaniaActionPerformed
        new VentanaBajasCompania().setVisible(true);
    }//GEN-LAST:event_menuBajasCompaniaActionPerformed

    private void menuBajasVueloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBajasVueloActionPerformed
    {//GEN-HEADEREND:event_menuBajasVueloActionPerformed
        new VentanaBajasVuelo().setVisible(true);
    }//GEN-LAST:event_menuBajasVueloActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        r = ManipulaArchR.cargaR(this);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulaArchR.guarda(r, this);
    }//GEN-LAST:event_formWindowClosing

    private void menuBuscarAeropuertoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBuscarAeropuertoActionPerformed
    {//GEN-HEADEREND:event_menuBuscarAeropuertoActionPerformed
        new VentanaBusquedaAeropuerto().setVisible(true);
    }//GEN-LAST:event_menuBuscarAeropuertoActionPerformed

    private void menuBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBuscarDestinoActionPerformed
    {//GEN-HEADEREND:event_menuBuscarDestinoActionPerformed
        new VentanaBusquedaDestino().setVisible(true);
    }//GEN-LAST:event_menuBuscarDestinoActionPerformed

    private void menuBuscarCompaniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBuscarCompaniaActionPerformed
    {//GEN-HEADEREND:event_menuBuscarCompaniaActionPerformed
        new VentanaBusquedaCompania().setVisible(true);
    }//GEN-LAST:event_menuBuscarCompaniaActionPerformed

    private void menuBuscarVueloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuBuscarVueloActionPerformed
    {//GEN-HEADEREND:event_menuBuscarVueloActionPerformed
        new VentanaBusquedaVuelos().setVisible(true);
    }//GEN-LAST:event_menuBuscarVueloActionPerformed

    private void menuModificacionesAeropuertoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuModificacionesAeropuertoActionPerformed
    {//GEN-HEADEREND:event_menuModificacionesAeropuertoActionPerformed
        new VentanaModificaAeropuerto().setVisible(true);
    }//GEN-LAST:event_menuModificacionesAeropuertoActionPerformed

    private void menuModificacionesDestinoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuModificacionesDestinoActionPerformed
    {//GEN-HEADEREND:event_menuModificacionesDestinoActionPerformed
        new VentanaModificaDestino().setVisible(true);
    }//GEN-LAST:event_menuModificacionesDestinoActionPerformed

    private void menuModificacionesCompaniaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuModificacionesCompaniaActionPerformed
    {//GEN-HEADEREND:event_menuModificacionesCompaniaActionPerformed
        new VentanaModificaCompania().setVisible(true);
    }//GEN-LAST:event_menuModificacionesCompaniaActionPerformed

    private void menuModificacionesVueloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_menuModificacionesVueloActionPerformed
    {//GEN-HEADEREND:event_menuModificacionesVueloActionPerformed
        new VentanaModificaVuelo().setVisible(true);
    }//GEN-LAST:event_menuModificacionesVueloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAeropuertos;
    private javax.swing.JMenuItem menuAltasAeropuerto;
    private javax.swing.JMenuItem menuAltasCompania;
    private javax.swing.JMenuItem menuAltasDestino;
    private javax.swing.JMenuItem menuAltasVuelo;
    private javax.swing.JMenuItem menuBajasAeropuerto;
    private javax.swing.JMenuItem menuBajasCompania;
    private javax.swing.JMenuItem menuBajasDestino;
    private javax.swing.JMenuItem menuBajasVuelo;
    private javax.swing.JMenuItem menuBuscarAeropuerto;
    private javax.swing.JMenuItem menuBuscarCompania;
    private javax.swing.JMenuItem menuBuscarDestino;
    private javax.swing.JMenuItem menuBuscarVuelo;
    private javax.swing.JMenu menuCompanias;
    private javax.swing.JMenuItem menuConsultasAeropuerto;
    private javax.swing.JMenuItem menuConsultasCompania;
    private javax.swing.JMenuItem menuConsultasDestino;
    private javax.swing.JMenuItem menuConsultasVuelo;
    private javax.swing.JMenu menuDestinos;
    private javax.swing.JMenuItem menuModificacionesAeropuerto;
    private javax.swing.JMenuItem menuModificacionesCompania;
    private javax.swing.JMenuItem menuModificacionesDestino;
    private javax.swing.JMenuItem menuModificacionesVuelo;
    private javax.swing.JMenu menuVuelos;
    // End of variables declaration//GEN-END:variables
}