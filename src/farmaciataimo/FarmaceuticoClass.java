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
public class FarmaceuticoClass {
    
  

    private int idMed;
    private String nomeFar;
   private double precoFar;
   private int quantdFar;
   private String datafabrico;
   private String dataValidade;
   private String hospital;

    public int getIdMed() {
        return idMed;
    }

    public void setIdMed(int idMed) {
        this.idMed = idMed;
    }

    public String getNomeFar() {
        return nomeFar;
    }

    public void setNomeFar(String nomeFar) {
        this.nomeFar = nomeFar;
    }

    public double getPrecoFar() {
        return precoFar;
    }

    public void setPrecoFar(double precoFar) {
        this.precoFar = precoFar;
    }

    public int getQuantdFar() {
        return quantdFar;
    }

    public void setQuantdFar(int quantdFar) {
        this.quantdFar = quantdFar;
    }

    public String getDatafabrico() {
        return datafabrico;
    }

    public void setDatafabrico(String datafabrico) {
        this.datafabrico = datafabrico;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
   

}
