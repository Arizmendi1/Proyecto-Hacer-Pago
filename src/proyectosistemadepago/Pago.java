/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectosistemadepago;

/**
 *
 * @author T
 */
public class Pago {
      public Pago (){
      System.out.print("Aver si es cierto que aparezco");
      }
      
    public float hacerPago(int HorasTrabajadas, float sueldo){
        float pago=HorasTrabajadas*sueldo;
        return pago;
    }
}
