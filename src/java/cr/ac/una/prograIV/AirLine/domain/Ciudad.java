package cr.ac.una.prograIV.AirLine.domain;

import java.util.HashSet;
import java.util.Set;

public class Ciudad implements java.io.Serializable, Jsonable {

    private String pkSigla;
    private String nombre;
    private String pais;
    private Set<Vuelo> vuelosForCiudadDestino = new HashSet<Vuelo>(0);
    private Set<Vuelo> vuelosForCiudadOrigen = new HashSet<Vuelo>(0);

    public String toString(){
         return pkSigla+" "+nombre+" "+pais+" ";
    }
    
    public Ciudad() {
    }
    
    public Ciudad(Ciudad c){
        this.pkSigla=c.pkSigla;
        this.nombre=c.nombre;
        this.pais=c.pais;
        this.vuelosForCiudadOrigen=null;
        this.vuelosForCiudadDestino=null;
    }
	
    public Ciudad(String pkSigla, String nombre, String pais) {
        this.pkSigla = pkSigla;
        this.nombre = nombre;
        this.pais = pais;
    }
    public Ciudad(String pkSigla, String nombre, String pais, Set<Vuelo> vuelosForCiudadDestino, Set<Vuelo> vuelosForCiudadOrigen) {
       this.pkSigla = pkSigla;
       this.nombre = nombre;
       this.pais = pais;
       this.vuelosForCiudadDestino = vuelosForCiudadDestino;
       this.vuelosForCiudadOrigen = vuelosForCiudadOrigen;
    }
   
    public String getPkSigla() {
        return this.pkSigla;
    }
    
    public void setPkSigla(String pkSigla) {
        this.pkSigla = pkSigla;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Set<Vuelo> getVuelosForCiudadDestino() {
        return this.vuelosForCiudadDestino;
    }
    
    public void setVuelosForCiudadDestino(Set<Vuelo> vuelosForCiudadDestino) {
        this.vuelosForCiudadDestino = vuelosForCiudadDestino;
    }
    public Set<Vuelo> getVuelosForCiudadOrigen() {
        return this.vuelosForCiudadOrigen;
    }
    
    public void setVuelosForCiudadOrigen(Set<Vuelo> vuelosForCiudadOrigen) {
        this.vuelosForCiudadOrigen = vuelosForCiudadOrigen;
    }
}