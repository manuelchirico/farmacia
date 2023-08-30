/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DadosHospital;

import farmaciataimo.FarmaceuticoClass;
import farmaciataimo.conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author H.Chirico
 */
public class HospitalImp  implements HospitalDao{

    @Override
    public void save(HospitalH h) {
   
        try{
            Connection con=conexao.getconnection();
            
           String query="insert into hospital  values (null, ?,?,?)";
          PreparedStatement ps= con.prepareStatement(query);
           ps.setString(1,h.getNomeH());
           ps.setString(2, h.getEnderecoH());
           ps.setInt(3, h.getCelularH());
          
          
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null," Dados do Hospital Salvos  com sucesso");
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao Salvar os dados do Hospital" +e);
        }
        
        
        
    }

    @Override
    public void Update(HospitalH h) {
      
        try{ 
          Connection con =conexao .getconnection();
          String query= "UPDATE hospital SET Nome=?,Endereco=?,Celular=?   WHERE ID_H=?";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setString(1,h.getNomeH());
           ps.setString(2,h.getEnderecoH());
           
           ps.setInt(3, h.getCelularH());
           
          
             ps.setInt(4,h.getIdh());
           
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, " Dados atualizados com sucesso");
          
      }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null," falha ao atualizar dados");
      
        
        
    }
        
    }

    @Override
    public void delete(HospitalH h) {
       
        try{
            Connection con= conexao.getconnection();
            String query= "delete  from hospital where ID_H=? ";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, h.getIdh());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null," Hospital Apagado com Sucesso");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null," Falha ao apagar aos dados do Hospital " +e);
        }
        
        
        
    }

    @Override
    public HospitalH get(int id) {
         HospitalH med= new  HospitalH();
     
        try{
            
             Connection con=conexao.getconnection();
            
           String query="SELECT * FROM hospital  WHERE ID_H=? ";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setInt(1, id);
          ResultSet rs=ps.executeQuery();
          
          if(rs.next()){
                 
               med.setIdh(rs.getInt("ID_H"));
               med.setNomeH(rs.getString("Nome"));
               med.setEnderecoH(rs.getString("Endereco"));
               med.setCelularH(rs.getInt("Celular"));
          
  
          }
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "falha na Busca");
        }
        
        return med;
        
        
        
    }

    @Override
    public List<HospitalH> list() {
       
        List<HospitalH> list= new ArrayList<HospitalH>();
      
        try{
            Connection con=conexao.getconnection();
            String query=" SELECT * FROM hospital";
            PreparedStatement ps= con.prepareStatement(query);
            
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                 HospitalH med= new  HospitalH();
               
               
            
               med.setIdh(rs.getInt("ID_H"));
               med.setNomeH(rs.getString("Nome"));
               med.setEnderecoH(rs.getString("Endereco"));
               med.setCelularH(rs.getInt("Celular"));
               list.add(med);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" +e);
        }
       return list; 
    }
        
        
        
    }
    

