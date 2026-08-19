/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDate;

/**
 * Representa a un inquilino que arrienda viviendas en GuanaRent.
 *
 * @author celeste
 */
public class Inquilino {

    private int cedula;
    private String nombre;
    private String genero;
    private LocalDate fechNac;
    private String direccion;
    private String telefono;
    private String email;
    private String ocupacion;

    public Inquilino() {
    }

    /**
     * Crea un inquilino con todos sus datos.
     *
     * @param cedula cédula (única) @param nombre nombre @param genero género
     * @param fechNac fecha de nacimiento @param direccion dirección @param
     * telefono teléfono
     * @param email correo @param ocupacion ocupación
     */
    public Inquilino(int cedula, String nombre, String genero, LocalDate fechNac, String direccion, String telefono, String email, String ocupacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.fechNac = fechNac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.ocupacion = ocupacion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    /**
     * @return cédula y nombre del inquilino (se usa en los combos)
     */
    @Override
    public String toString() {
        return cedula + " - " + nombre;
    }

}
