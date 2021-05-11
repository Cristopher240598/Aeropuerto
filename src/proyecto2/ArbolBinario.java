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
public class ArbolBinario
{

    private NodoArbol r = null;

    public ArbolBinario()
    {
    }

    /**
     * @return the r
     */
    public NodoArbol getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    public NodoArbol inserta(NodoArbol r, NodoArbol n)//n dato a insertar
    {
        if (r == null)
        {
            return n;
        } else
        {
            if (r.getClave().compareTo(n.getClave()) < 0)
            {
                r.setDerecho(inserta(r.getDerecho(), n));
            } else
            {
                r.setIzquierdo(inserta(r.getIzquierdo(), n));
            }
            return r;
        }
    }

    public void enOrden(NodoArbol r)
    {
        if (r != null)
        {
            enOrden(r.getIzquierdo());
            System.out.println(r.getClave());
            enOrden(r.getDerecho());
        }
    }

    public void enPreorden(NodoArbol r)
    {
        if (r != null)
        {
            System.out.println(r.getClave());
            enPreorden(r.getIzquierdo());
            enPreorden(r.getDerecho());
        }
    }

    public void enPosorden(NodoArbol r)
    {
        if (r != null)
        {
            enPosorden(r.getIzquierdo());
            enPosorden(r.getDerecho());
            System.out.println(r.getClave());
        }
    }

    public void elimina(NodoArbol r, String clave, NodoArbol[] d)
    {
        //d[0]= eliminado
        //d[1]= nuevo arbol
        if (r == null)
        {
            d[0] = null;
            d[1] = null;
        } else
        {
            if (!(r.getClave().equals(clave)))
            {
                if (r.getClave().compareTo(clave) < 0)
                {
                    elimina(r.getDerecho(), clave, d);
                    r.setDerecho(d[1]);
                } else
                {
                    elimina(r.getIzquierdo(), clave, d);
                    r.setIzquierdo(d[1]);
                }
                d[1] = r;
            } else
            {
                d[0] = r;
                if ((r.getIzquierdo() == null) && (r.getDerecho() == null))//no hay hijos
                {
                    d[1] = null;
                } else
                {
                    if (!(r.getIzquierdo() != null && r.getDerecho() != null))//hay un hijo
                    {
                        if (r.getIzquierdo() != null)
                        {
                            d[1] = r.getIzquierdo();
                        } else
                        {
                            d[1] = r.getDerecho();
                        }
                    } else
                    {
                        if (r.getDerecho().getIzquierdo() == null)
                        {
                            r.getDerecho().setIzquierdo(r.getIzquierdo());
                            d[1] = r.getDerecho();
                        } else
                        {
                            NodoArbol se = sucesor(r.getDerecho());
                            NodoArbol aux = se.getIzquierdo();
                            se.setIzquierdo(aux.getDerecho());
                            aux.setIzquierdo(r.getIzquierdo());
                            aux.setDerecho(r.getDerecho());
                            d[1] = aux;
                        }
                    }
                }
                d[0].setIzquierdo(null);
                d[0].setDerecho(null);
            }
        }
    }

    public NodoArbol busca(NodoArbol r, String clave)
    {
        NodoArbol b;
        if (r == null)
        {
            return null;
        } else
        {
            if (!(r.getClave().equals(clave)))
            {
                if (r.getClave().compareTo(clave) < 0)
                {
                    b = busca(r.getDerecho(), clave);
                } else
                {
                    b = busca(r.getIzquierdo(), clave);
                }
            } else
            {
                return r;
            }
        }
        return b;
    }

    public NodoArbol sucesor(NodoArbol r)
    {
        if (r.getIzquierdo().getIzquierdo() == null)
        {
            return r;
        } else
        {
            return sucesor(r.getIzquierdo());
        }
    }
}
