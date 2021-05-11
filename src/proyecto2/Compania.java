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
public class Compania implements Serializable
{

    public static final long SerialVersionUID = 1L;
    private String nombreCompania;
    private String uRL;
    private long telefono1;
    private long telefono2;
    private String correoElectronico;
    private Icon imagenCom;

    public Compania()
    {
    }

    public Compania(String nombreCompania, String uRL, long telefono1, long telefono2, String correoElectronico, Icon imagenVue)
    {
        this.nombreCompania = nombreCompania;
        this.uRL = uRL;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correoElectronico = correoElectronico;
        this.imagenCom = imagenVue;
    }

    /**
     * @return the nombreCompania
     */
    public String getNombreCompania()
    {
        return nombreCompania;
    }

    /**
     * @param nombreCompania the nombreCompania to set
     */
    public void setNombreCompania(String nombreCompania)
    {
        this.nombreCompania = nombreCompania;
    }

    /**
     * @return the uRL
     */
    public String getuRL()
    {
        return uRL;
    }

    /**
     * @param uRL the uRL to set
     */
    public void setuRL(String uRL)
    {
        this.uRL = uRL;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico()
    {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the imagenCom
     */
    public Icon getImagenCom()
    {
        return imagenCom;
    }

    /**
     * @param imagenCom the imagenCom to set
     */
    public void setImagenCom(Icon imagenCom)
    {
        this.imagenCom = imagenCom;
    }

    public String desp()
    {
        return "Nombre de la compania: " + nombreCompania + "\n"
                + " URL: " + uRL + "\n"
                + " Teléfono: " + '(' + getTelefono1() + ')' + getTelefono2() + "\n"
                + " Correo electrónico: " + correoElectronico + "\n";
    }

    /**
     * @return the telefono1
     */
    public long getTelefono1()
    {
        return telefono1;
    }

    /**
     * @param telefono1 the telefono1 to set
     */
    public void setTelefono1(long telefono1)
    {
        this.telefono1 = telefono1;
    }

    /**
     * @return the telefono2
     */
    public long getTelefono2()
    {
        return telefono2;
    }

    /**
     * @param telefono2 the telefono2 to set
     */
    public void setTelefono2(long telefono2)
    {
        this.telefono2 = telefono2;
    }

}
