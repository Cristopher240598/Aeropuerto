/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cristopher y Javier
 */
public class VentanaFotosCarga extends javax.swing.JFrame
{

    JLabel l;

    /**
     *
     * Creates new form NewJFrame1
     */
    public VentanaFotosCarga(JLabel er)
    {
        initComponents();
        this.l = er;
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

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFileChooser1.setFileFilter(new FileNameExtensionFilter("JPG, PNG & GIF", "jpg","png","gif")
        );
        jFileChooser1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jFileChooser1ActionPerformed
    {//GEN-HEADEREND:event_jFileChooser1ActionPerformed
        JFileChooser s = (JFileChooser) evt.getSource();
        String c = evt.getActionCommand();
        BufferedImage im = null;
        if (c.equals((JFileChooser.APPROVE_SELECTION)))
        {
            String imagen = s.getSelectedFile().toString();
            //System.out.println(imagen);
            ImageIcon img = new ImageIcon((imagen));
            File loc = new File(imagen);
            try
            {
                im = ImageIO.read(loc);
            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(this, "Error", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
            ImageIcon ii = new ImageIcon(im.getScaledInstance(l.getWidth(), l.getHeight(), java.awt.Image.SCALE_SMOOTH));
            l.setIcon(ii);
            l.setVisible(true);
            dispose();
        }
        if (c.equals((JFileChooser.CANCEL_SELECTION)))
        {
            dispose();
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
