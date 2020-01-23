/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Entidad.*;
import DAO.PedidoDAO;
import java.time.*;
import java.util.*;
import javax.persistence.*;
import javax.swing.JPanel;
import org.knowm.xchart.*;
/**
 *
 * @author Nicolas
 */
public class STATS_C {
    public STATS_C (){
        
    }
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
    private static final GestionPostres GP = new GestionPostres();
    private static final PedidoDAO PDAO= new PedidoDAO();
    EntityManager em = emf.createEntityManager(); 
    LocalDate now = LocalDate.now();
    Date now1 = java.sql.Date.valueOf(now);
    public JPanel Pasteles_v_mes (){
        //pedidos_init();
        Period p = Period.ofMonths(1);
        
        String jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p))+"' and '"+now1+"'";
        System.out.println(jpql);
        Query query = em.createQuery(jpql);
        List<Pedido> resultados = query.getResultList();
        List<Postre> l= GP.allPostres();
        ArrayList<Number> yData = new ArrayList<>();
        ArrayList<String> xData = new ArrayList<>();
        if((resultados.size()<=0)||(l.size()<=0)){
            yData.add(0);
            xData.add("No se han registrado ventas");
        }else{
            yData = ydata_v(resultados);
            xData = SPostres();
        }
        
        CategoryChart chart = new CategoryChartBuilder().width(456).height(619).title("Ventas de pasteles en el mes").xAxisTitle("Pastel").yAxisTitle("Cantidad de ventas").build();
        chart.getStyler().setHasAnnotations(true);
        chart.addSeries("Ventas",xData,yData);
        JPanel ChartPanel = new XChartPanel(chart);
        return ChartPanel;
    } 
    public JPanel Pasteles_v_anio (){
       Period p = Period.ofYears(1);
        
        String jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p))+"' and '"+now1+"'";
        System.out.println(jpql);
        Query query = em.createQuery(jpql);
        List<Pedido> resultados = query.getResultList();
        List<Postre> l= GP.allPostres();
        ArrayList<Number> yData = new ArrayList<>();
        ArrayList<String> xData = new ArrayList<>();
        if((resultados.size()<=0)||(l.size()<=0)){
            yData.add(0);
            xData.add("No se han registrado ventas");
        }else{
            yData = ydata_v(resultados);
            xData = SPostres();
        }
        
        CategoryChart chart = new CategoryChartBuilder().width(456).height(619).title("Ventas de pasteles en el mes").xAxisTitle("Pastel").yAxisTitle("Cantidad de ventas").build();
        chart.getStyler().setHasAnnotations(true);
        chart.addSeries("Ventas",xData,yData);
        JPanel ChartPanel = new XChartPanel(chart);
        return ChartPanel;
    }
    public JPanel Pedidos_dinero_mes (){
        
        ArrayList<Number> yData = new ArrayList<>();
        Period p1 = Period.ofWeeks(1);
        Period p2 = Period.ofWeeks(2);
        Period p3 = Period.ofWeeks(3);
        Period p4 = Period.ofWeeks(4);
        
        String jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p1))+"' and '"+now1+"'";
        Query query = em.createQuery(jpql);
        List<Pedido> resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(pedido_dinero(resultados));
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p2))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(pedido_dinero(resultados));
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p3))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(pedido_dinero(resultados));
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p4))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(pedido_dinero(resultados));
        }
        CategoryChart chart = new CategoryChartBuilder().width(456).height(619).title("Numero de ventas en el mes").xAxisTitle("Semana").yAxisTitle("Dinero").build();
        chart.getStyler().setHasAnnotations(true);
        chart.addSeries("Dinero de los pedidos",new ArrayList<String>(Arrays.asList(new String[] { "1era Semana", "2da Semana", "3era Semana", "4ta Semana"})),yData);
        JPanel ChartPanel = new XChartPanel(chart);
        return ChartPanel;
    }
    public JPanel Pedidos_cantidad_mes (){
        ArrayList<Number> yData = new ArrayList<>();
        Period p1 = Period.ofWeeks(1);
        Period p2 = Period.ofWeeks(2);
        Period p3 = Period.ofWeeks(3);
        Period p4 = Period.ofWeeks(4);
        
        String jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p1))+"' and '"+now1+"'";
        Query query = em.createQuery(jpql);
        List<Pedido> resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(resultados.size());
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p2))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(resultados.size());
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p3))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(resultados.size());
        }
        jpql = "SELECT p FROM Pedido p where p.fechaE between '"+java.sql.Date.valueOf(now.minus(p4))+"' and '"+now1+"'";
        query = em.createQuery(jpql);
        resultados = query.getResultList();
        if(resultados.size()<=0){
            yData.add(0);
        }else{
            yData.add(resultados.size());
        }
        
        //[456, 619]
        CategoryChart chart = new CategoryChartBuilder().width(456).height(619).title("Numero de ventas en el mes").xAxisTitle("Semanas").yAxisTitle("Ventas").build();
        chart.getStyler().setHasAnnotations(true);
        chart.addSeries("Cantidad de pedidos",new ArrayList<String>(Arrays.asList(new String[] { "1era Semana", "2da Semana", "3era Semana", "4ta Semana"})),yData);
        JPanel ChartPanel = new XChartPanel(chart);
        return ChartPanel;
    }
    public ArrayList<Number> ydata_v(List<Pedido> Pedidos){
        List<Postre> l= GP.allPostres();
        double[] yData = new double[l.size()];
        int i=0;
        for(Postre p : l){
            for(Pedido a: Pedidos){        
                if(a.getIdPostre().equals(p.getId())){
                    yData[i]+=1;
                }
            }
            i++;
        }
        ArrayList<Number> a= new ArrayList<>();
        System.out.println(l.size());
        for(int j=0;j<=l.size();j++){
//            System.out.println(a.get(i));
            a.add(yData[j]);
        }
        return a;
    }
    public ArrayList<String> SPostres(){
        List<Postre> l= GP.allPostres();
        ArrayList<String> a= new ArrayList<>();
        for(Postre p : l){
            a.add(p.getTipo());
        }
        return a;
    }
    public int pedido_dinero(List<Pedido> d){
        int i=0;
        for(Pedido a: d){
            i+=a.getPrecio();
        }
        return i;
    }
    
}
