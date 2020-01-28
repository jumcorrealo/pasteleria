/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "insumo")
public class Insumo implements Serializable, Comparable<Insumo> {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @Column(name="ID_INSUMO")
    private Long id;

    @Column(name="NOMBRE")
    private String nombre;
    
    @Column(name="UNIDAD")
    private String unidad;
    
    @Column(name="FRECUENCIA")
    private int freq;
    
    @Column(name="FECHA_RECORDATORIO")
    private String fecha;
    
    @Column(name="CANTIDAD")
    private int cantidad;
    
    public Insumo(){
        this("","");
    }
    
    public Insumo(String n, String u){
        nombre=n.toLowerCase();
        unidad=u.toLowerCase();
        freq=0;
    }
    
    public Insumo(Long id,String n, String u){
        this(n,u);
        this.id=id;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }
    
    public void setRecordatorio(String fecha, int cantidad){
        this.fecha=fecha;
        this.cantidad=cantidad;
    }
    
    public String getRecordatorio(){
        return fecha;
    }
    
  
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public void suprRecordatorio(){
        this.fecha=null;
        this.cantidad=0;
    }
    
    
    public void upFreq(){
        this.freq++;
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
        if (!(object instanceof Insumo)) {
            return false;
        }
        Insumo other = (Insumo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "id:"+id+",Insumo:"+nombre+", unidad:"+unidad+", frecuencia:"+freq+
                ", fecha próximo recordatorio:"+fecha+",cantidad:"+cantidad;
    }

    @Override
    public int compareTo(Insumo ins) {
        
        if(fecha==null && ins.getRecordatorio()==null){
            return compare(ins);
        }else if(fecha==null && ins.getRecordatorio()!=null){
            return 1;
        }else if (fecha!=null && ins.getRecordatorio()==null){
            return -1;
        }else{
            return compare(ins);
        }
    }
    
    private int compare(Insumo ins){
        if (freq-ins.getFreq()<0) return 1;
        else if(freq-ins.getFreq()==0) return 0;
        else return -1;
    }
    
}
