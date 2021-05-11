/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Cristopher y Javier
 */
public class NodoArbol
{

    private String clave;
    private NodoArbol izquierdo = null;
    private NodoArbol derecho = null;
    private Nodo hh = null;

    public NodoArbol()
    {

    }

    public NodoArbol(String clave)
    {
        this.clave = clave;
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
     * @return the izquierdo
     */
    public NodoArbol getIzquierdo()
    {
        return izquierdo;
    }

    /**
     * @param izquierdo the izquierdo to set
     */
    public void setIzquierdo(NodoArbol izquierdo)
    {
        this.izquierdo = izquierdo;
    }

    /**
     * @return the derecho
     */
    public NodoArbol getDerecho()
    {
        return derecho;
    }

    /**
     * @param derecho the derecho to set
     */
    public void setDerecho(NodoArbol derecho)
    {
        this.derecho = derecho;
    }

    /**
     * @return the hh
     */
    public Nodo getHh()
    {
        return hh;
    }

    /**
     * @param hh the hh to set
     */
    public void setHh(Nodo hh)
    {
        this.hh = hh;
    }

}
