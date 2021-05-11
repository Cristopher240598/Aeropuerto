/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import interfaz.Machote;
import java.io.Serializable;

/**
 *
 * @author Cristopher
 */
public class ListaDoblementeLigadaCircular_LDLC implements Machote, Serializable
{

    public static final long SerialVersionUID = 1L;
    private Nodo raiz = null;

    /**
     * @return the raiz
     */
    public Nodo getRaiz()
    {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz)
    {
        this.raiz = raiz;
    }

    @Override
    public boolean llena()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean vacia()
    {
        return raiz == null;
    }

//Primero se conecta el que llega y luego los que estan
    @Override
    public String inserta(Object obj)
    {
        if (obj == null)
        {
            return "El objeto no debe de ser nulo";
        } else
        {
            Nodo n = (Nodo) obj;
            if (raiz == null)
            {
                raiz = n;
                raiz.setSiguiente(n);
                raiz.setAnterior(n);
            } else
            {
                if (n.getClave().compareTo(raiz.getSiguiente().getClave()) < 0 || raiz.getClave().compareTo(n.getClave()) < 0)
                {
                    n.setSiguiente(raiz.getSiguiente());
                    n.setAnterior(raiz);
                    raiz.getSiguiente().setAnterior(n);
                    raiz.setSiguiente(n);
                    if (raiz.getClave().compareTo(n.getClave()) < 0)
                    {
                        raiz = n;
                    }
                } else
                {
                    Nodo aux = raiz.getSiguiente();
                    boolean b = true;
                    while (b)
                    {
                        if (aux.getSiguiente().getClave().compareTo(n.getClave()) > 0)
                        {
                            n.setSiguiente(aux.getSiguiente());
                            n.setAnterior(aux);
                            aux.getSiguiente().setAnterior(n);
                            aux.setSiguiente(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSiguiente();
                        }
                    }
                }
            }
            return "Dato insertado";
        }
    }

    @Override
    public String inserta(Object obj, Object r)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object elimina(Object obj, Object r)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Primero se desconectan los que quedan y luego el que se va
    @Override
    public Nodo elimina(Object obj)
    {
        if (vacia())
        {
            return null;
        } else
        {
            String s = (String) obj;
            Nodo aux = null;
            if (!(s.compareTo(raiz.getSiguiente().getClave()) < 0 || s.compareTo(raiz.getClave()) > 0))
            {
                if (raiz.getSiguiente().getClave().equals(s))
                {
                    aux = raiz.getSiguiente();
                    raiz.setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(raiz);
                    aux.setSiguiente(null);
                    aux.setAnterior(null);
                    if (raiz == aux)
                    {
                        raiz = null;
                    }
                } else
                {
                    Nodo aux2 = raiz.getSiguiente();
                    boolean b = true;
                    while (aux2 != raiz && b)
                    {
                        if (aux2.getSiguiente().getClave().equals(s))
                        {
                            aux = aux2.getSiguiente();
                            aux2.setSiguiente(aux.getSiguiente());
                            aux.getSiguiente().setAnterior(aux2);
                            aux.setSiguiente(null);
                            aux.setAnterior(null);
                            if (raiz == aux)
                            {
                                raiz = aux2;
                            }
                            b = false;
                        } else
                        {
                            aux2 = aux2.getSiguiente();
                        }
                    }
                }
            }
            return aux;
        }
    }
}
