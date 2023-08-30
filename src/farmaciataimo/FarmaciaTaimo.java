/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo;

/**
 *
 * @author H.Chirico
 */
public class FarmaciaTaimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        logo l= new logo();
        l.setVisible(true);
        Login m= new Login();
        m.setVisible(false);
        try{
          
            for(int i=0; i<=100; i++){
                Thread.sleep(110);
            
             l.progress.setValue(i);
               
             if(i==100){
                 l.setVisible(false);
                 m.setVisible(true);
             }
            }
        }catch(Exception e){
            
        }
        
        
        
        
    }
    
}
