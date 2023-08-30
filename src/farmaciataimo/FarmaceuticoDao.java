/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmaciataimo;

import java.util.List;

/**
 *
 * @author H.Chirico
 */
public interface FarmaceuticoDao {
    
    
    public void save(FarmaceuticoClass farm);
    public void Update(FarmaceuticoClass farm);
    public void delete(FarmaceuticoClass farm);
    public FarmaceuticoClass get(int id);
    
    public List<FarmaceuticoClass> list();
}
