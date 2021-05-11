/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.Serializable;
import javax.swing.Icon;

/**
 *
 * @author Cristopher y Javier
 */
public class Destino implements Serializable
{

    public static final long SerialVersionUID = 1L;
    private String aeropuertoDestino;
    private Icon imagenDest;

    public Destino()
    {
    }

    public Destino(String aeropuertoDestino, Icon imagenDest)
    {
        this.aeropuertoDestino = aeropuertoDestino;
        this.imagenDest = imagenDest;
    }

    /**
     * @return the aeropuertoDestino
     */
    public String getAeropuertoDestino()
    {
        return aeropuertoDestino;
    }

    /**
     * @param aeropuertoDestino the aeropuertoDestino to set
     */
    public void setAeropuertoDestino(String aeropuertoDestino)
    {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    /**
     * @return the imagenDest
     */
    public Icon getImagenDest()
    {
        return imagenDest;
    }

    /**
     * @param imagenDest the imagenDest to set
     */
    public void setImagenDest(Icon imagenDest)
    {
        this.imagenDest = imagenDest;
    }

    public String desp()
    {
        return "Destino: " + aeropuertoDestino + "\n";
    }

}
