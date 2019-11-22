/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "postres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postres.findAll", query = "SELECT p FROM Postres p")
    , @NamedQuery(name = "Postres.findById", query = "SELECT p FROM Postres p WHERE p.id = :id")
    , @NamedQuery(name = "Postres.findByTipo", query = "SELECT p FROM Postres p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "Postres.findByFlavor", query = "SELECT p FROM Postres p WHERE p.flavor = :flavor")
    , @NamedQuery(name = "Postres.findBySize", query = "SELECT p FROM Postres p WHERE p.size = :size")
    , @NamedQuery(name = "Postres.findByForm", query = "SELECT p FROM Postres p WHERE p.form = :form")
    , @NamedQuery(name = "Postres.findByPrice", query = "SELECT p FROM Postres p WHERE p.price = :price")
    , @NamedQuery(name = "Postres.findByDiscontinued", query = "SELECT p FROM Postres p WHERE p.discontinued = :discontinued")})
public class Postres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "FLAVOR")
    private String flavor;
    @Column(name = "SIZE")
    private Integer size;
    @Column(name = "FORM")
    private String form;
    @Basic(optional = false)
    @Column(name = "PRICE")
    private int price;
    @Basic(optional = false)
    @Column(name = "DISCONTINUED")
    private boolean discontinued;

    public Postres() {
    }

    public Postres(Integer id) {
        this.id = id;
    }

    public Postres(Integer id, String tipo, String flavor, int price, boolean discontinued) {
        this.id = id;
        this.tipo = tipo;
        this.flavor = flavor;
        this.price = price;
        this.discontinued = discontinued;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }


    public boolean isSame(Postres other) {
        return  this.tipo.toLowerCase().equals(other.tipo.toLowerCase()) &&
                this.flavor.toLowerCase().equals(other.flavor.toLowerCase()) &&
                this.form.toLowerCase().equals(other.form.toLowerCase()) &&
                Objects.equals(this.size, other.size);
    }
    @Override
    public String toString() {
        return "Entidad.Postres[ id=" + id + " ]";
    }
    
}
