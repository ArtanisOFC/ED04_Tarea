/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Carlos Román Aguilera
 */

public class CCuenta {

    /**
     * @return El nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta La cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return El saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo El saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return El tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés El tipoInterés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * 
     * @param nom El nombre a establecer
     * @param cue La cuenta a establecer
     * @param sal El saldo a establecer
     * @param tipo El tipo a establecer
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
