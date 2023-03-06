package Controlador;

import Modelo.*;
import Vista.*;
import Modelo.DarkRoast;
import Modelo.Decaf;
import Modelo.Espresso; 

import Modelo.Extra;
import Modelo.HouseBlend;
import Vista.Vista_3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {
    
    DefaultTableModel modelo_1;
    DefaultTableModel modelo_2;
    DefaultTableModel modelo_3;
    
    DarkRoast d;
    Espresso e;
    Decaf dc;
    HouseBlend hb;
    
    String us;
    
    Vista_4 vista_4;
    Vista_3 vista_3;
    Vista_2 vista_2;
    Vista_1 vista_1;

    

    Controlador(DarkRoast d, Espresso e, Decaf dc, HouseBlend hb, Vista_1 v1, Vista_2 v2, Vista_3 v3,Vista_4 v4) {
        this.d = d;
        this.e = e;
        this.dc = dc;
        this.hb = hb;
        
        
        this.vista_1 = v1;
        this.vista_2 = v2;
        this.vista_3 = v3;
        this.vista_4 = v4;
        
        this.vista_1.boton_Pedidos.addActionListener(this);
        this.vista_1.boton_Cocina.addActionListener(this);
        
        this.vista_2.boton_Continuar.addActionListener(this);
        this.vista_2.boton_Volver.addActionListener(this);
        
        this.vista_3.boton_Volver.addActionListener(this);
        this.vista_3.darkRoast.addActionListener(this);
        this.vista_3.decaf.addActionListener(this);
        this.vista_3.espresso.addActionListener(this);
        this.vista_3.houseBlend.addActionListener(this);
        this.vista_3.mocha.addActionListener(this);
        this.vista_3.caramel.addActionListener(this);
        this.vista_3.soy.addActionListener(this);
        this.vista_3.steamedMilk.addActionListener(this);
        this.vista_3.boton_Confirmar.addActionListener(this);
        this.vista_3.boton_Borrar.addActionListener(this);
        this.vista_3.boton_Orden.addActionListener(this);
        
        this.vista_4.boton_Volver.addActionListener(this);
        this.vista_4.boton_Finalizado.addActionListener(this);
        this.vista_4.boton_Limpiar.addActionListener(this);
        
       
        modelo_1 = new  DefaultTableModel();
        modelo_1.addColumn("Café:");
        modelo_1.addColumn("Precio:");
        modelo_1.addColumn("Extra:");
        this.vista_3.tablaPedidos.setModel(modelo_1);
         
        modelo_2 = new  DefaultTableModel();
        modelo_2.addColumn("Orden ID:");
        modelo_2.addColumn("Mesero:");
        modelo_2.addColumn("Café:");
        modelo_2.addColumn("Extra:");
        this.vista_4.tabla_Pendientes.setModel(modelo_2);
        
        modelo_3 = new  DefaultTableModel();
        modelo_3.addColumn("Orden ID:");
        modelo_3.addColumn("Mesero:");
        modelo_3.addColumn("Café:");
        modelo_3.addColumn("Extra:");
        this.vista_4.tabla_Completados.setModel(modelo_3);
        
        /*modelo_2 = new  DefaultTableModel();
        modelo_2.addColumn("Mesero:");
        modelo_2.addColumn("Orden ID:");
        modelo_2.addColumn("Café:");
        modelo_2.addColumn("Extra:");
        this.vista_4.tabla_Pendientes.setModel(modelo_2);
        
        modelo_3 = new  DefaultTableModel();
        modelo_3.addColumn("Mesero:");
        modelo_3.addColumn("Orden ID:");
        modelo_3.addColumn("Café:");
        modelo_3.addColumn("Extra:");
        this.vista_4.tabla_Completados.setModel(modelo_3);*/
         
         
         
         
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == vista_1.boton_Pedidos){
            
            vista_2.setVisible(true);
            this.vista_1.setVisible(false);
            
        }else if (ae.getSource() == vista_1.boton_Cocina){
            
            vista_4.setVisible(true);
            this.vista_1.setVisible(false);
            
        }else if (ae.getSource() == vista_2.boton_Volver){
        
            this.vista_2.setVisible(false);
            vista_1.setVisible(true);
    
        }else if (ae.getSource() == vista_2.boton_Continuar) {
            
            us = vista_2.txt_username.getText();
            String pw = vista_2.txt_password.getText();
        
            String p = "prueba";
            String n = "1234";
        
            String p2 = "starbuzz";
            String n2 = "1234";
        
            String p3 = "Daniel";
            String n3 = "1234";
            
            String p4 = "Michael";
            String n4 = "1234";
            if (us.equals(p) && pw.equals(n)) { 
            
               vista_3.setVisible(true);
               this.vista_2.setVisible(false);
               vista_2.txt_username.setText("");
               vista_2.txt_password.setText(""); 
               
            }else if(us.equals(p2) && pw.equals(n2)){
                
               vista_3.setVisible(true);
               this.vista_2.setVisible(false);
               vista_2.txt_username.setText("");
               vista_2.txt_password.setText("");
           
            } else if(us.equals(p3) && pw.equals(n3)){
                
               vista_3.setVisible(true);
               this.vista_2.setVisible(false);
               vista_2.txt_username.setText("");
               vista_2.txt_password.setText("");
                
            }else if(us.equals(p4) && pw.equals(n4)){
                
               vista_3.setVisible(true);
               this.vista_2.setVisible(false);
               vista_2.txt_username.setText("");
               vista_2.txt_password.setText("");
             } else {
        
             JOptionPane.showMessageDialog(null, "Contrasena incorrecta");
             vista_2.txt_username.setText("");
             vista_2.txt_password.setText("");
           
        
             }  
        }else if(ae.getSource() == vista_3.boton_Volver){
            
            this.vista_3.setVisible(false);
            vista_1.setVisible(true);
            
            modelo_1.setRowCount(0);
        
        }else if(ae.getSource() == vista_3.darkRoast){
            
            JOptionPane.showMessageDialog(null, "Usted ha escogido el café: darkroast");
            JOptionPane.showMessageDialog(null, "Costo: 1500");
            vista_3.baseCafe.setText(d.getDescripcion());
            
            double price = this.d.costo();
            this.vista_3.txt_Precio.setText(String.valueOf(price));

        }else if(ae.getSource() == vista_3.espresso){
            
           JOptionPane.showMessageDialog(null, "Usted ha escogido el café: espresso");
            JOptionPane.showMessageDialog(null, "Costo: 1000");
            vista_3.baseCafe.setText(e.getDescripcion());
            
            double price = this.e.costo();
            this.vista_3.txt_Precio.setText(String.valueOf(price));
            
        }else if(ae.getSource() == vista_3.decaf){
            
           JOptionPane.showMessageDialog(null, "Usted ha escogido el café: Decaf");
            JOptionPane.showMessageDialog(null, "Costo: 1200");
            vista_3.baseCafe.setText(dc.getDescripcion());
            
             double price = this.dc.costo();
            this.vista_3.txt_Precio.setText(String.valueOf(price));
            
        }else if(ae.getSource() == vista_3.houseBlend){
            
            JOptionPane.showMessageDialog(null, "Usted ha escogido el café: houseblend");
            JOptionPane.showMessageDialog(null, "Costo: 1600");
            vista_3.baseCafe.setText(hb.getDescripcion());
            
            double price = this.hb.costo();
            this.vista_3.txt_Precio.setText(String.valueOf(price));
           
        //Extras
        }else if(ae.getSource() == vista_3.mocha){
            
            JOptionPane.showMessageDialog(null, "Usted ha escogido el extra: Mocha");
            this.vista_3.txt_extra.setText(d.agregarExtraMocha());
              
            double price = this.d.costo()+500;
            this.vista_3.txt_Precio.setText(String.valueOf(price));
                 
                 
        }else if(ae.getSource() == vista_3.soy){
            JOptionPane.showMessageDialog(null, "Usted ha escogido el extra: Soy");
            this.vista_3.txt_extra.setText(e.agregarExtraSoy());

            double price = this.e.costo()+500;
            this.vista_3.txt_Precio.setText(String.valueOf(price));
                 
        }else if(ae.getSource() == vista_3.caramel){
            
            JOptionPane.showMessageDialog(null, "Usted ha escogido el extra: Caramel");
            this.vista_3.txt_extra.setText(dc.agregarExtraCaramel());
                 
            double price = this.dc.costo()+500;
            this.vista_3.txt_Precio.setText(String.valueOf(price));
                   
        }else if(ae.getSource() == vista_3.steamedMilk){
            
            JOptionPane.showMessageDialog(null, "Usted ha escogido el extra: steamedMilk");
            this.vista_3.txt_extra.setText(hb.agregarExtraSteamedMilk());
            double price = this.hb.costo()+500;
            this.vista_3.txt_Precio.setText(String.valueOf(price));
                 
        //boton confirmar pedido
        }else if(ae.getSource() == vista_3.boton_Confirmar){
            
            String[]pedido=new String[3];
            
            pedido[0] = vista_3.baseCafe.getText();
            pedido[1] = vista_3.txt_Precio.getText();
            pedido[2] = vista_3.txt_extra.getText();
            modelo_1.addRow(pedido);
            
            /*tabla de Pendientes v4
            
            pedido[0] = us;
            pedido[1] = vista_3.baseCafe.getText();
            pedido[2] = vista_3.txt_extra.getText();
            
            modelo_2.addRow(pedido);*/
  
            vista_3.baseCafe.setText("");
            vista_3.txt_Precio.setText("");
            vista_3.txt_extra.setText("");
        
        }else if(ae.getSource() == vista_3.boton_Borrar){
            
            int borrarPedido = vista_3.tablaPedidos.getSelectedRow();
            modelo_1.removeRow(borrarPedido);
            
        }else if(ae.getSource() == vista_3.boton_Orden){
            
            Object[] orden = new Object[4];
            
            
            int contador = 1000;
            orden[0] = contador;
         
            int aux =vista_3.tablaPedidos.getRowCount();
            
            for(int i =0 ; aux>i;i++){
                
                orden[1]  = us;
                orden[2] = (String) vista_3.tablaPedidos.getModel().getValueAt(i,0);
                orden[3] = (String) vista_3.tablaPedidos.getModel().getValueAt(i,2);
                
                modelo_2.addRow(orden);
            }
            
            contador++;
            /*Object[] orden = new Object[4];
            
            
            
            orden[0] = 1000;
         
            int aux =vista_3.tablaPedidos.getRowCount();
            
            for(int i =0 ; aux>i;i++){
                
                orden[1]  = (String) vista_3.tablaPedidos.getModel().getValueAt(i,0);
                orden[2] = (String) vista_3.tablaPedidos.getModel().getValueAt(i,1);
                orden[3] = (String) vista_3.tablaPedidos.getModel().getValueAt(i,2);
                
                modelo_2.addRow(orden);
            }*/
            
        }else if(ae.getSource() == vista_4.boton_Volver){
            
            this.vista_4.setVisible(false);
            vista_1.setVisible(true);
            
        }else if(ae.getSource() == vista_4.boton_Finalizado){
            
            int seleccion = vista_4.tabla_Pendientes.getSelectedRow();
            
            Vector data = modelo_2.getDataVector();
            
            Vector row = (Vector) data.elementAt(seleccion);
            
            modelo_3.addRow(row);
            modelo_2.removeRow(seleccion);
            
        }else if(ae.getSource() == vista_4.boton_Limpiar){
            
            modelo_3.setRowCount(0);
            
        }
    }
    
     
}
