/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;

/**
 *
 * @author MGFE
 */
public class ProyectoLotificacion {
    public static Terreno [][] lotes = new Terreno[5][5];
    
    public static boolean estaVacia(int a, int b ){
      if(lotes[a][b].getOcupado()== false){
          return true;
      }else{
          return false;
      }
    }
    public static int terrOcupado(){
        int cont1=0;

        for (int i = 0; i < lotes.length; i++) {
            for (int j = 0; j <lotes.length; j++) {
                if(lotes[i][j].getOcupado()== true){
                    cont1++;
                    
                }
            }
        }
        return cont1;
    }
    
    public static double totalLps(){
        double total=0;
        for (int i = 0; i < lotes.length; i++) {
            for (int j = 0; j < lotes.length; j++) {
                total+= lotes[i][j].getPrecioTotal();
            }
        }
        return total;
    }
    public static int terrVacio(){
        int cont2=0;
        for (int i = 0; i < lotes.length; i++) {
            for (int j = 0; j <lotes.length; j++) {
                if(lotes[i][j].getOcupado()== false){
                    cont2++;
                    
                }
            }
        }
        return cont2;
    }
    
}
