/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelos;

/**
 *
 * @author Jonathan Saez
 */
public class Pais {
    private int id_pais;
    private String cd_origen;
    private String cd_destino;

    public Pais(int id_pais, String cd_origen, String cd_destino) {
        this.id_pais = id_pais;
        this.cd_origen = cd_origen;
        this.cd_destino = cd_destino;
    }

    public Pais() {
        
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getCd_origen() {
        return cd_origen;
    }

    public void setCd_origen(String cd_origen) {
        this.cd_origen = cd_origen;
    }

    public String getCd_destino() {
        return cd_destino;
    }

    public void setCd_destino(String cd_destino) {
        this.cd_destino = cd_destino;
    }
    
    
}
