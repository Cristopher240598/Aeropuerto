/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Cristopher y Javier
 */
public class ManipulaArchR
{

    public static Nodo cargaR(JFrame js)
    {
        Nodo n = null;
        String n1 = "", n2 = "", n3 = "", n4 = "";
        String sa[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("Datos/Archivo.txt");//abrir archivo, lectura
            ObjectInputStream arch = new ObjectInputStream(fis);
            try
            {
                Nodo obj = null;
                do
                {
                    obj = (Nodo) arch.readObject();
                    NodoArbol ndA = new NodoArbol(obj.getClave());
                    ndA.setHh(obj);
                    if (obj != null)
                    {
                        if (obj.getObj() instanceof Aeropuerto)
                        {
                            n1 = obj.getClave();
                            sa = new String[1];
                            sa[0] = n1;

                            VentanaPrincipal.aR1.setR(VentanaPrincipal.aR1.inserta(VentanaPrincipal.aR1.getR(), ndA));
                        }
                        if (obj.getObj() instanceof Destino)
                        {
                            n2 = obj.getClave();
                            sa = new String[2];
                            sa[0] = n1;
                            sa[1] = n2;

                            VentanaPrincipal.aR2.setR(VentanaPrincipal.aR2.inserta(VentanaPrincipal.aR2.getR(), ndA));
                        }
                        if (obj.getObj() instanceof Compania)
                        {
                            n3 = obj.getClave();
                            sa = new String[3];
                            sa[0] = n1;
                            sa[1] = n2;
                            sa[2] = n3;

                            VentanaPrincipal.aR3.setR(VentanaPrincipal.aR3.inserta(VentanaPrincipal.aR3.getR(), ndA));
                        }
                        if (obj.getObj() instanceof Vuelos)
                        {
                            n4 = obj.getClave();
                            sa = new String[4];
                            sa[0] = n1;
                            sa[1] = n2;
                            sa[2] = n3;
                            sa[3] = n4;

                            VentanaPrincipal.aR4.setR(VentanaPrincipal.aR4.inserta(VentanaPrincipal.aR4.getR(), ndA));
                        }
                        n = ManipulaMultista.inserta(n, obj, sa, 0);
                    }
                } while (obj != null);
            } catch (IOException ex)
            {
                if (n == null)
                {
                    JOptionPane.showMessageDialog(js, "No se pudo leer del archivo", "Error", JOptionPane.ERROR_MESSAGE);
                } else
                {
                    //JOptionPane.showMessageDialog(js, "Carga de datos correctamente...", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(js, "Error...qqq" + n + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            arch.close();
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(js, "No se encontro el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(js, "Carga de datos incorrectamente...", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(js, "Error...aaa" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return n;
    }

    public static void guarda(Nodo r, JFrame js)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Datos/Archivo.txt");
            ObjectOutputStream arch = new ObjectOutputStream(fos);//Escribir texto, escritura
            guarda(arch, js, r);
            arch.close();
        } catch (FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(js, "No se encontro el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(js, "No se pudo cerrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(js, "Error..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void guarda(ObjectOutputStream arch, JFrame jf, Nodo r)
    {
        while (r != null)
        {
            try
            {
                ListaDoblementeLigadaCircular_LDLC l = new ListaDoblementeLigadaCircular_LDLC();
                l.setRaiz(r);
                Nodo aux = l.elimina(r.getSiguiente().getClave());
                Nodo aux2 = aux.getAbajo();
                aux.setAbajo(null);
                r = l.getRaiz();
                arch.writeObject(aux);
                guarda(arch, jf, aux2);
            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(jf, "No se pudo escribir en el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(jf, "Error..." + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
