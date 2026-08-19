/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDate;

/**
 * Representa un contrato de alquiler entre inquilino y vivienda.
 *
 * @author mario
 */
public class Alquileres {

    private int numAlquiler;
    private LocalDate fechContrato;
    private int cantMeses;
    private int numAdultos;
    private int numNinos;
    private double depositoGarantia;
    private double precioAlquiler;
    private double porcIncremAnual;
    private int cedInquilino;
    private int idVivienda;
    private String estado;

    public Alquileres() {
    }

    /**
     * Crea un alquiler con todos sus datos.
     *
     * @param numAlquiler número (único) @param fechContrato fecha @param
     * cantMeses meses
     * @param numAdultos adultos @param numNinos niños @param depositoGarantia
     * depósito
     * @param precioAlquiler precio @param porcIncremAnual % incremento @param
     * cedInquilino cédula inquilino
     * @param idVivienda id vivienda @param estado estado
     */
    public Alquileres(int numAlquiler, LocalDate fechContrato, int cantMeses, int numAdultos,
            int numNinos, double depositoGarantia, double precioAlquiler,
            double porcIncremAnual, int cedInquilino, int idVivienda, String estado) {
        this.numAlquiler = numAlquiler;
        this.fechContrato = fechContrato;
        this.cantMeses = cantMeses;
        this.numAdultos = numAdultos;
        this.numNinos = numNinos;
        this.depositoGarantia = depositoGarantia;
        this.precioAlquiler = precioAlquiler;
        this.porcIncremAnual = porcIncremAnual;
        this.cedInquilino = cedInquilino;
        this.idVivienda = idVivienda;
        this.estado = estado;
    }

    public int getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(int numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public LocalDate getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(LocalDate fechContrato) {
        this.fechContrato = fechContrato;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public int getNumAdultos() {
        return numAdultos;
    }

    public void setNumAdultos(int numAdultos) {
        this.numAdultos = numAdultos;
    }

    public int getNumNinos() {
        return numNinos;
    }

    public void setNumNinos(int numNinos) {
        this.numNinos = numNinos;
    }

    public double getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(double depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public double getPorcIncremAnual() {
        return porcIncremAnual;
    }

    public void setPorcIncremAnual(double porcIncremAnual) {
        this.porcIncremAnual = porcIncremAnual;
    }

    public int getCedInquilino() {
        return cedInquilino;
    }

    public void setCedInquilino(int cedInquilino) {
        this.cedInquilino = cedInquilino;
    }

    public int getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(int idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return número del alquiler e id de la vivienda
     */
    @Override
    public String toString() {
        return "Alquiler #" + numAlquiler + " - Vivienda " + idVivienda;
    }

}
