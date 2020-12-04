
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonny
 */
public class Acciones {

    static Object ObtenerAccion(String yamatriculado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    boolean matriculado;
    boolean registrado;
    boolean esDocente;
    boolean esInstitucion;
    boolean esExterno;
    String tipoPersonaDestino;
    String estadoRegistro;
    String esObligatorio;

   
    public String  ObtenerAccion(){
     String salida="";
    if(matriculado==true){
       
       salida="yamatriculado";
        
        
       }
    if(matriculado==true && registrado==true)
    {   
        salida="yamatriculado";
        
     }
    if(matriculado==false && esDocente==true && estadoRegistro=="vigente" && esObligatorio=="si"){
    
     salida="nodestinado";
    }
    
    if(matriculado==false && estadoRegistro=="vigente" && esObligatorio=="no"){
       salida="matricularse";
        
    }
    
    if(matriculado==true && estadoRegistro=="porConfirmar"){
  salida="registarse";
    }
    if(matriculado==false && estadoRegistro=="vigente" && esDocente==false && tipoPersonaDestino=="esInstitucion" || tipoPersonaDestino=="esExterno" ){
    
        salida="matricularse";
    }
     if(matriculado==false && estadoRegistro=="porConfirmar"){
     
         salida="registarse y matricularse";
     }
      if(estadoRegistro=="porConfirmar" && esDocente==false)
      {
    salida="registrase y matricularse";
      }
        
      if(esDocente==true && esObligatorio=="si" && estadoRegistro=="porConfirmar")
      {
    salida="no destinado";
      }
      if(esDocente==true && esObligatorio=="no" && estadoRegistro=="porConfirmar")
      {
         salida="registarse y matricularse";
      }
      
     return salida;
    }
    
}
