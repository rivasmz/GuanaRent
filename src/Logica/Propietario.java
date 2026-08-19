/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 * Representa a un propietario (dueño) de viviendas en GuanaRent.
 *
 * @author kevin
 */
public class Propietario {

    private int cedPropiet;
    private String nomPropiet;
    private String genero;
    private String direccion;
    private String telefono;
    private String email;

    public Propietario() {
    }

    /**
     * Crea un propietario con todos sus datos.
     *
     * @param cedPropiet cédula (única) @param nomPropiet nombre @param genero
     * género
     * @param direccion dirección @param telefono teléfono @param email correo
     */
    public Propietario(int cedPropiet, String nomPropiet, String genero,
            String direccion, String telefono, String email) {
        this.cedPropiet = cedPropiet;
        this.nomPropiet = nomPropiet;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCedPropiet() {
        return cedPropiet;
    }

    public void setCedPropiet(int cedPropiet) {
        this.cedPropiet = cedPropiet;
    }

    public String getNomPropiet() {
        return nomPropiet;
    }

    public void setNomPropiet(String nomPropiet) {
        this.nomPropiet = nomPropiet;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    /**
     * @return cédula y nombre del propietario (se usa en los combos)
     */
    @Override
    public String toString() {
        return cedPropiet + " - " + nomPropiet;
    }
}
