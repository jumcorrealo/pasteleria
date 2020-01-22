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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByAbono", query = "SELECT p FROM Pedido p WHERE p.abono = :abono")
    , @NamedQuery(name = "Pedido.findByAdiciones", query = "SELECT p FROM Pedido p WHERE p.adiciones = :adiciones")
    , @NamedQuery(name = "Pedido.findByCantidadTortas", query = "SELECT p FROM Pedido p WHERE p.cantidadTortas = :cantidadTortas")
    , @NamedQuery(name = "Pedido.findByDecoracion", query = "SELECT p FROM Pedido p WHERE p.decoracion = :decoracion")
    , @NamedQuery(name = "Pedido.findByEstado", query = "SELECT p FROM Pedido p WHERE p.estado = :estado")
    , @NamedQuery(name = "Pedido.findByFechaE", query = "SELECT p FROM Pedido p WHERE p.fechaE = :fechaE")
    , @NamedQuery(name = "Pedido.findByFechaR", query = "SELECT p FROM Pedido p WHERE p.fechaR = :fechaR")
    , @NamedQuery(name = "Pedido.findByForma", query = "SELECT p FROM Pedido p WHERE p.forma = :forma")
    , @NamedQuery(name = "Pedido.findByIdCliente", query = "SELECT p FROM Pedido p WHERE p.idCliente = :idCliente")
    , @NamedQuery(name = "Pedido.findByIdPostre", query = "SELECT p FROM Pedido p WHERE p.idPostre = :idPostre")
    , @NamedQuery(name = "Pedido.findByPorciones", query = "SELECT p FROM Pedido p WHERE p.porciones = :porciones")
    , @NamedQuery(name = "Pedido.findByPrecio", query = "SELECT p FROM Pedido p WHERE p.precio = :precio")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PEDIDO")
    private Integer idPedido;
    @Column(name = "ABONO")
    private Integer abono;
    @Column(name = "ADICIONES")
    private String adiciones;
    @Column(name = "CANTIDAD_TORTAS")
    private Integer cantidadTortas;
    @Column(name = "DECORACION")
    private String decoracion;
    @Column(name = "ESTADO")
    private Boolean estado;
    @Column(name = "FECHA_E")
    @Temporal(TemporalType.DATE)
    private Date fechaE;
    @Column(name = "FECHA_R")
    @Temporal(TemporalType.DATE)
    private Date fechaR;
    @Column(name = "FORMA")
    private String forma;
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "ID_POSTRE")
    private Integer idPostre;
    @Column(name = "PORCIONES")
    private Integer porciones;
    @Column(name = "PRECIO")
    private Integer precio;

    public Pedido() {
    }

    public Pedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getAbono() {
        return abono;
    }

    public void setAbono(Integer abono) {
        this.abono = abono;
    }

    public String getAdiciones() {
        return adiciones;
    }

    public void setAdiciones(String adiciones) {
        this.adiciones = adiciones;
    }

    public Integer getCantidadTortas() {
        return cantidadTortas;
    }

    public void setCantidadTortas(Integer cantidadTortas) {
        this.cantidadTortas = cantidadTortas;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Date getFechaE() {
        return fechaE;
    }

    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }

    public Date getFechaR() {
        return fechaR;
    }

    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdPostre() {
        return idPostre;
    }

    public void setIdPostre(Integer idPostre) {
        this.idPostre = idPostre;
    }

    public Integer getPorciones() {
        return porciones;
    }

    public void setPorciones(Integer porciones) {
        this.porciones = porciones;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidad.Pedido[ idPedido=" + idPedido + " ]";
    }
    
}
