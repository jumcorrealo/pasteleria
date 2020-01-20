/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findByIDPedido", query = "SELECT p FROM Pedidos p WHERE p.iDPedido = :iDPedido")
    , @NamedQuery(name = "Pedidos.findByFechaR", query = "SELECT p FROM Pedidos p WHERE p.fechaR = :fechaR")
    , @NamedQuery(name = "Pedidos.findByFechaE", query = "SELECT p FROM Pedidos p WHERE p.fechaE = :fechaE")
    , @NamedQuery(name = "Pedidos.findByTama\u00f1o", query = "SELECT p FROM Pedidos p WHERE p.tama\u00f1o = :tama\u00f1o")
    , @NamedQuery(name = "Pedidos.findByAbono", query = "SELECT p FROM Pedidos p WHERE p.abono = :abono")
    , @NamedQuery(name = "Pedidos.findByPrecio", query = "SELECT p FROM Pedidos p WHERE p.precio = :precio")
    , @NamedQuery(name = "Pedidos.findByEstado", query = "SELECT p FROM Pedidos p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pedidos.findByCantidad", query = "SELECT p FROM Pedidos p WHERE p.cantidad = :cantidad")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPedido")
    private Integer iDPedido;
    @Basic(optional = false)
    @Column(name = "FechaR")
    @Temporal(TemporalType.DATE)
    private Date fechaR;
    @Basic(optional = false)
    @Column(name = "FechaE")
    @Temporal(TemporalType.DATE)
    private Date fechaE;
    @Basic(optional = false)
    @Lob
    @Column(name = "Forma")
    private String forma;
    @Basic(optional = false)
    @Column(name = "Tama\u00f1o")
    private int tamaño;
    @Basic(optional = false)
    @Lob
    @Column(name = "Decoracion")
    private String decoracion;
    @Basic(optional = false)
    @Lob
    @Column(name = "Adicion")
    private String adicion;
    @Basic(optional = false)
    @Column(name = "Abono")
    private int abono;
    @Basic(optional = false)
    @Column(name = "Precio")
    private int precio;
    @Basic(optional = false)
    @Column(name = "Estado")
    private boolean estado;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @JoinColumn(name = "IDCliente", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cliente iDCliente;
    @JoinColumn(name = "IDPostre", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Postres iDPostre;

    public Pedidos(Integer iDPedido, Date fechaR, Date fechaE, String forma, int tamaño, String decoracion, String adicion, int abono, int precio, boolean estado) {
        this.iDPedido = iDPedido;
        this.fechaR = fechaR;
        this.fechaE = fechaE;
        this.forma = forma;
        this.tamaño = tamaño;
        this.decoracion = decoracion;
        this.adicion = adicion;
        this.abono = abono;
        this.precio = precio;
        this.estado = estado;
    }
    
    public Pedidos() {
        this(null,null,null,null,0,null,null,0,0,false);
    }

    public Pedidos(Integer iDPedido) {
        this(iDPedido,null,null,null,0,null,null,0,0,false);
    }

    

    public Integer getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Date getFechaR() {
        return fechaR;
    }

    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }

    public Date getFechaE() {
        return fechaE;
    }

    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getAdicion() {
        return adicion;
    }

    public void setAdicion(String adicion) {
        this.adicion = adicion;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getIDCliente() {
        return iDCliente;
    }

    public void setIDCliente(Cliente iDCliente) {
        this.iDCliente = iDCliente;
    }

    public Postres getIDPostre() {
        return iDPostre;
    }

    public void setIDPostre(Postres iDPostre) {
        this.iDPostre = iDPostre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPedido != null ? iDPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.iDPedido == null && other.iDPedido != null) || (this.iDPedido != null && !this.iDPedido.equals(other.iDPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DAO.exceptions.Pedidos[ iDPedido=" + iDPedido + " ]";
    }
    
}
