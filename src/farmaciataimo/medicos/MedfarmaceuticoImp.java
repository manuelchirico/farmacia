/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo.medicos;

import farmaciataimo.Farmaceutico;
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
public class MedfarmaceuticoImp implements  MedFarmaceuticoDao {

    @Override
    public void save(MedFarmaceutico farm) {
       try{
            Connection con=conexao.getconnection();
            
           String query="insert into farmaceutico  values (null, ?,?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(query);
           ps.setString(1,farm.getNome());
           ps.setString(2, farm.getApelido());
           ps.setInt(3, farm.getIdade());
           ps.setInt(4, farm.getCelular());
           ps.setString(5,farm.getSenha());
           ps.setString(6, farm.getSexo()); 
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"  Salvos com sucesso");
           new Farmaceutico().setVisible(true);
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erros ao salvar os dados  os farmaceuticos " +e);
        }
        
        
 
        
        
    }

    @Override
    public void Update(MedFarmaceutico farm) {
        
         try{ 
          Connection con =conexao .getconnection();
          String query= "UPDATE farmaceutico  SET Nome=?,Apelido=?,Idade=?,Celular=?, Senha=?, Sexo=? WHERE ID_Far=?";
          PreparedStatement ps= con.prepareStatement(query);
          
          ps.setString(1, farm.getNome());
          ps.setString(2,farm.getApelido() );
          ps.setInt(3,farm.getIdade());
          ps.setInt(4, farm.getCelular());
          ps.setString(5, farm.getSenha());
          ps.setString(6, farm.getSexo());
           ps.setInt(7, farm.getIdMedFarm());
           
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, " Dados atualizados com sucesso");
          
      }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null," falha ao atualizar dados");
      
        
        
    }
        
        
        
        
        
        
    }

    @Override
    public void delete(MedFarmaceutico farm) {
        
        try{
            Connection con= conexao.getconnection();
            String query= "delete  from farmaceutico where ID_Far=? ";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, farm.getIdMedFarm());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null," Usuario   Apagado com Sucesso");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null," Falha ao apagar usuario " +e);
        }
        
        
        
    }

    @Override
    public MedFarmaceutico get(int id) {
     MedFarmaceutico med= new  MedFarmaceutico();
     
        try{
            
             Connection con=conexao.getconnection();
            
           String query="SELECT * FROM farmaceutico WHERE ID_Far=? ";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setInt(1, id);
          ResultSet rs=ps.executeQuery();
          if(rs.next()){
        
        
          med.setIdMedFarm(rs.getInt("ID_Far"));
          med.setNome(rs.getString("Nome"));
          med.setApelido(rs.getString("Apelido"));
          med.setIdade(rs.getInt("Idade"));
          med.setCelular(rs.getInt("Celular"));
          med.setSenha(rs.getString("Senha"));
          med.setSexo(rs.getString("Sexo"));
          
          
          }
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "falha na Busca");
        }
        
        return med;
    
    
    }

    @Override
    public List<MedFarmaceutico> list() {
       
        List<MedFarmaceutico> list= new ArrayList<MedFarmaceutico>();
      
        try{
            Connection con=conexao.getconnection();
            String query=" SELECT * FROM farmaceutico";
            PreparedStatement ps= con.prepareStatement(query);
            
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                  MedFarmaceutico mf= new  MedFarmaceutico();
               
               
               mf.setIdMedFarm(rs.getInt("ID_Far"));
               mf.setNome(rs.getString("Nome"));
               mf.setApelido(rs.getString("Apelido"));
               mf.setIdade(rs.getInt("Idade"));
               mf.setCelular(rs.getInt("Celular"));
               mf.setSenha(rs.getString("Senha"));
               mf.setSexo(rs.getString("Sexo"));;
               
 
              
              list.add(mf);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" +e);
        }
       return list; 
    }
        
        
        
        
    
    
}
