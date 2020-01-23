/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author enano
 */
@Entity
@Table(name = "postre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postre.findAll", query = "SELECT p FROM Postre p")
    , @NamedQuery(name = "Postre.findById", query = "SELECT p FROM Postre p WHERE p.id = :id")
    , @NamedQuery(name = "Postre.findByFlavor", query = "SELECT p FROM Postre p WHERE p.flavor = :flavor")
    , @NamedQuery(name = "Postre.findByPrice", query = "SELECT p FROM Postre p WHERE p.price = :price")
    , @NamedQuery(name = "Postre.findByTipo", query = "SELECT p FROM Postre p WHERE p.tipo = :tipo")})
public class Postre implements Serializable {

    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FLAVOR")
    private String flavor;
    @Column(name = "PRICE")
    private Integer price;
    @Column(name = "TIPO")
    private String tipo;

    public Postre() {
    }

    public Postre(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof Postre)) {
            return false;
        }
        Postre other = (Postre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Postre[ id=" + id + " ]";
    }
    
    public boolean isSame(Postre other) {
        return  this.tipo.toLowerCase().equals(other.tipo.toLowerCase()) &&
                this.flavor.toLowerCase().equals(other.flavor.toLowerCase());
    }

  
}
