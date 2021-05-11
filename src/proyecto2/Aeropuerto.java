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
public class Aeropuerto implements Serializable
{

    public static final long SerialVersionUID = 1L;
    private String nombreAeropuerto;
    private int numeroPuertas;
    private String pais;
    private String clave;
    private Icon imagenAer;

    public Aeropuerto()
    {
    }

    public Aeropuerto(String nombreAeropuerto, int numeroPuertas, String pais, String clave, Icon imagenAer)
    {
        this.nombreAeropuerto = nombreAeropuerto;
        this.numeroPuertas = numeroPuertas;
        this.pais = pais;
        this.clave = clave;
        this.imagenAer = imagenAer;
    }

    /**
     * @return the nombreAeropuerto
     */
    public String getNombreAeropuerto()
    {
        return nombreAeropuerto;
    }

    /**
     * @param nombreAeropuerto the nombreAeropuerto to set
     */
    public void setNombreAeropuerto(String nombreAeropuerto)
    {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    /**
     * @return the numeroPuertas
     */
    public int getNumeroPuertas()
    {
        return numeroPuertas;
    }

    /**
     * @param numeroPuertas the numeroPuertas to set
     */
    public void setNumeroPuertas(int numeroPuertas)
    {
        this.numeroPuertas = numeroPuertas;
    }

    /**
     * @return the pais
     */
    public String getPais()
    {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais)
    {
        this.pais = pais;
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
     * @return the imagenAer
     */
    public Icon getImagenAer()
    {
        return imagenAer;
    }

    /**
     * @param imagenAer the imagenAer to set
     */
    public void setImagenAer(Icon imagenAer)
    {
        this.imagenAer = imagenAer;
    }

    public String desp()
    {
        return "Nombre del aeropuerto: " + nombreAeropuerto + "\n"
                + " Número de puertas: " + numeroPuertas + "\n"
                + " País: " + pais + "\n"
                + " Clave: " + clave + "\n";
    }

}
