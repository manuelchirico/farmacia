/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo;

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
public class FarmaceuticodaoImp  implements FarmaceuticoDao{

    @Override
    public void save(FarmaceuticoClass farm) {
         try{
            Connection con=conexao.getconnection();
            
           String query="insert into medicamento values (null, ?,?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(query);
           ps.setString(1,farm.getNomeFar());
           ps.setDouble(2, farm.getPrecoFar());
           ps.setInt(3, farm.getQuantdFar());
           ps.setString(4, farm.getDatafabrico());
           ps.setString(5, farm.getDataValidade());
           ps.setString(6, farm.getHospital());
          
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Medicamento  Salvos com sucesso");
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erros ao salvar os dados de medicamento" +e);
        }
        
        
    }

    @Override
    public void Update(FarmaceuticoClass farm) {
       
   try{ 
          Connection con =conexao .getconnection();
          String query= "UPDATE medicamento SET Nome=?,Preco=?,Quantidade=?,Hospital=?  WHERE ID_Med=?";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setString(1,farm.getNomeFar());
           ps.setDouble(2, farm.getPrecoFar());
           ps.setInt(3, farm.getQuantdFar());
           //ps.setString(4, farm.getDatafabrico());
           //ps.setString(5, farm.getDataValidade());
           ps.setString(4, farm.getHospital());
             ps.setInt(5, farm.getIdMed());
           
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, " Dados atualizados com sucesso");
          
      }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null," falha ao atualizar dados");
      
        
        
    }
        
        
        
    }

    @Override
    public void delete(FarmaceuticoClass farm) {
         
         try{
            Connection con= conexao.getconnection();
            String query= "delete  from medicamento where ID_Med=? ";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, farm.getIdMed());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null," Medicamento Apagado com Sucesso");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null," Falha ao apagar Medicamento " +e);
        }
        
        
        
        
        
    }

    @Override
    public FarmaceuticoClass get(int id) {
      
          FarmaceuticoClass med= new  FarmaceuticoClass();
     
        try{
            
             Connection con=conexao.getconnection();
            
           String query="SELECT * FROM medicamento WHERE ID_Med=? ";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setInt(1, id);
          ResultSet rs=ps.executeQuery();
          if(rs.next()){
           /*  st.setId(rs.getInt("id"));
              st.setNome(rs.getString("nome"));
              st.setApelido(rs.getString("apelido"));
              st.setFaculdade(rs.getString("faculdade"));
              st.setCurso(rs.getString("curso"));
              st.setAno(rs.getInt("ano"));
              
             */
           
            med.setIdMed(rs.getInt("ID_Med"));
               med.setNomeFar(rs.getString("Nome"));
               med.setPrecoFar(rs.getDouble("Preco"));
               med.setQuantdFar(rs.getInt("Quantidade"));
               med.setDatafabrico(rs.getString("DataFabrica"));
               med.setDataValidade(rs.getString("DataExpira"));
               med.setHospital(rs.getString("Hospital"));
          
           
           
          }
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "falha na Busca");
        }
        
        return med;
        
        
    }

    @Override
    public List<FarmaceuticoClass> list() {
      List<FarmaceuticoClass> list= new ArrayList< FarmaceuticoClass>();
      
        try{
            Connection con=conexao.getconnection();
            String query=" SELECT * FROM medicamento";
            PreparedStatement ps= con.prepareStatement(query);
            
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                 FarmaceuticoClass med= new  FarmaceuticoClass();
               
               
               med.setIdMed(rs.getInt("ID_Med"));
               med.setNomeFar(rs.getString("Nome"));
               med.setPrecoFar(rs.getDouble("Preco"));
               med.setQuantdFar(rs.getInt("Quantidade"));
               med.setDatafabrico(rs.getString("DataFabrica"));
               med.setDataValidade(rs.getString("DataExpira"));
               med.setHospital(rs.getString("Hospital"));
               list.add(med);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" +e);
        }
       return list; 
    }
        
        
        
    }
    

