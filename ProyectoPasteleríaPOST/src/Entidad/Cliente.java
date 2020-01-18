/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author andre
 */
@Entity
@Table(name = "cliente")
//@NamedQueries({
//    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM cliente c")})
public class Cliente implements Serializable {

    @Column(name = "ACTIVO")
    private Boolean activo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCliente")
    private Collection<Pedidos> pedidosCollection;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "CASA")
    private String casa;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "PUNTAJE")
    private Integer puntaje;
    @Column(name = "TELEFONO")
    private String telefono;
   

   
    public Cliente() {
        this.puntaje = 0;
        this.activo = true;
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
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
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

    public Cliente(Integer id) {
        this.id = id;
    }

    public Cliente(Integer id, boolean activo) {
        this.id = id;
        this.activo = activo;
    }

    
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }


    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Cliente[ id=" + id + " ]";
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @XmlTransient
    public Collection<Pedidos> getPedidosCollection() {
        return pedidosCollection;
    }

    public void setPedidosCollection(Collection<Pedidos> pedidosCollection) {
        this.pedidosCollection = pedidosCollection;
    }
    
    
}
