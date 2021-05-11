/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import javax.swing.JComboBox;

/**
 *
 * @author Cristopher
 */
public class ManipulaMultista
{

    public static Nodo busca(Nodo r, String cadenaBuscar)
    {
        Nodo aux = r.getSiguiente();
        do
        {
            if (aux.getClave().equals(cadenaBuscar))
            {
                return aux;
            } else
            {
                aux = aux.getSiguiente();
            }
        } while (aux != r.getSiguiente());
        return null;
    }

    public static Nodo inserta(Nodo r, Nodo d, String s[], int nivel)
    {
        if (s.length - 1 == nivel)
        {
            ListaDoblementeLigadaCircular_LDLC lista = new ListaDoblementeLigadaCircular_LDLC();
            lista.setRaiz(r);
            System.out.println(lista.inserta(d));
            return lista.getRaiz();
        } else
        {
            Nodo aux = busca(r, s[nivel]);
            aux.setAbajo(inserta(aux.getAbajo(), d, s, nivel + 1));
            aux.getAbajo().setArriba(aux);
            return r;
        }
    }

    public static Nodo[] elimina(String clave, Nodo r, int nivel, String s[])
    {
        //posición[0] es el eliminado
        Nodo[] g = new Nodo[2];
        if (nivel < s.length - 1)
        {
            Nodo tmp = busca(r, s[nivel]);
            g = elimina(clave, tmp.getAbajo(), nivel + 1, s);
            tmp.setAbajo(g[1]);
            if (g[1] != null)
            {
                tmp.getAbajo().setArriba(tmp);
            }
        } else
        {
            ListaDoblementeLigadaCircular_LDLC l = new ListaDoblementeLigadaCircular_LDLC();
            l.setRaiz(r);
            g[0] = l.elimina(clave);
            r = l.getRaiz();
            if (g[0] != null)
            {
                g[0].setArriba(null);
            }
        }
        g[1] = r;
        return g;
    }

    public static void cargaCombo(Nodo r, JComboBox jcb)
    {
        jcb.removeAllItems();
        if (r != null)
        {
            Nodo aux = r.getSiguiente();
            do
            {
                jcb.addItem(aux.getClave());
                System.out.println("Agrego = " + aux.getClave());
                aux = aux.getSiguiente();
            } while (aux != r.getSiguiente());
        }
    }

}
