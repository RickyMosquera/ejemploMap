/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ricky.mosquera
 */
public class Cliente {
    
    private String nombre;
    private String idcliente;
    private String empresa;

    public Cliente() {
    }

    public Cliente(String nombre, String idcliente, String empresa) {
        this.nombre = nombre;
        this.idcliente = idcliente;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdcliente() {
        return idcliente;
    }
    


    /**
     * Get the value of empresa
     *
     * @return the value of empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", idcliente=" + idcliente + ", empresa=" + empresa + '}';
    }
    

    
    
    
}
