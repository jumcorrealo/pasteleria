/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.*;
/**
 *
 * @author andre
 */
@Entity
@Table(name = "cliente")
//@NamedQueries({
//    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM cliente c")})
public class Cliente implements Serializable {
    private String nombre; 
    private String telefono;
    private String Casa;
    //a mayor puntaje mayor prioridad
    private int puntaje; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    public Cliente() {
        this.puntaje = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCasa() {
        return Casa;
    }

    public void setCasa(String casa) {
        this.Casa = casa;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    public void sumarPuntos(){
    this.puntaje = puntaje++;
    }
    
    
}
