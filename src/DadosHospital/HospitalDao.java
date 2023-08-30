/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DadosHospital;

import farmaciataimo.FarmaceuticoClass;
import java.util.List;

/**
 *
 * @author H.Chirico
 */
public interface HospitalDao {
     public void save(HospitalH h);
    public void Update(HospitalH h);
    public void delete(HospitalH h);
    public HospitalH get(int id);
    
    public List<HospitalH> list();
    
}
