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
public class Vuelos implements Serializable
{

    public static final long SerialVersionUID = 1L;
    private int numeroVuelo;
    private String horaSalida;
    private String horaLlegada;
    private double precio;
    private int numeroAsientosFila;
    private int numeroFilas;
    private int numeroAsientos;
    private Icon imagenVue;

    public Vuelos()
    {
    }

    public Vuelos(int numeroVuelo, String horaSalida, String horaLlegada, double precio, int numeroAsientosFila, int numeroFilas, Icon imagenVue)
    {
        this.numeroVuelo = numeroVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.precio = precio;
        this.numeroAsientos = numeroAsientosFila * numeroFilas;
        this.numeroAsientosFila = numeroAsientosFila;
        this.numeroFilas = numeroFilas;
        this.imagenVue = imagenVue;
    }

    /**
     * @return the numeroVuelo
     */
    public int getNumeroVuelo()
    {
        return numeroVuelo;
    }

    /**
     * @param numeroVuelo the numeroVuelo to set
     */
    public void setNumeroVuelo(int numeroVuelo)
    {
        this.numeroVuelo = numeroVuelo;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida()
    {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the horaLlegada
     */
    public String getHoraLlegada()
    {
        return horaLlegada;
    }

    /**
     * @param horaLlegada the horaLlegada to set
     */
    public void setHoraLlegada(String horaLlegada)
    {
        this.horaLlegada = horaLlegada;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the numeroAsientosFila
     */
    public int getNumeroAsientosFila()
    {
        return numeroAsientosFila;
    }

    /**
     * @param numeroAsientosFila the numeroAsientosFila to set
     */
    public void setNumeroAsientosFila(int numeroAsientosFila)
    {
        this.numeroAsientosFila = numeroAsientosFila;
    }

    /**
     * @return the numeroFilas
     */
    public int getNumeroFilas()
    {
        return numeroFilas;
    }

    /**
     * @param numeroFilas the numeroFilas to set
     */
    public void setNumeroFilas(int numeroFilas)
    {
        this.numeroFilas = numeroFilas;
    }

    /**
     * @return the numeroAsientos
     */
    public int getNumeroAsientos()
    {
        return numeroAsientos;
    }

    /**
     * @param numeroAsientos the numeroAsientos to set
     */
    public void setNumeroAsientos(int numeroAsientos)
    {
        this.numeroAsientos = numeroAsientos;
    }

    /**
     * @return the imagenVue
     */
    public Icon getImagenVue()
    {
        return imagenVue;
    }

    /**
     * @param imagenVue the imagenVue to set
     */
    public void setImagenVue(Icon imagenVue)
    {
        this.imagenVue = imagenVue;
    }

    public String desp()
    {
        return "Número de vuelo: " + numeroVuelo + "\n"
                + " Hora de salida: " + horaSalida + "\n"
                + " Hora de llegada: " + horaLlegada + "\n"
                + " Precio: " + precio + "\n"
                + " Número de asientos: " + numeroAsientos + "\n";
    }
}
