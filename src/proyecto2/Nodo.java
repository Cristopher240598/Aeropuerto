/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.Serializable;

/**
 *
 * @author Cristopher y Javier
 */
public class Nodo implements Serializable
{

    public static final long SerialVersionUID = 1L;
    private Object obj;
    private String clave;
    private Nodo siguiente = null;
    private Nodo anterior = null;
    private Nodo arriba = null;
    private Nodo abajo = null;

    public Nodo()
    {
    }

    public Nodo(Object obj, String clave)
    {
        this.obj = obj;
        this.clave = clave;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the clave
     */
    public String getClave()
    {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave)
    {
        this.clave = clave;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public Nodo getAnterior()
    {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Nodo anterior)
    {
        this.anterior = anterior;
    }

    /**
     * @return the arriba
     */
    public Nodo getArriba()
    {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(Nodo arriba)
    {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public Nodo getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(Nodo abajo)
    {
        this.abajo = abajo;
    }

}
