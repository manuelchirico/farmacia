/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo.medicos;

import farmaciataimo.FarmaceuticoClass;
import java.util.List;

/**
 *
 * @author H.Chirico
 */
public interface MedFarmaceuticoDao {
   
     public void save(MedFarmaceutico farm);
    public void Update(MedFarmaceutico farm);
    public void delete(MedFarmaceutico farm);
    public MedFarmaceutico get(int id);
    
    public List<MedFarmaceutico> list();
}
