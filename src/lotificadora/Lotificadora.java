/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotificadora;
import java.util.Scanner;
import static lotificadora.ProyectoLotificacion.lotes;

/**
 *
 * @author Juan Zepeda
 */
public class Lotificadora {
    static ProyectoLotificacion pl = new ProyectoLotificacion();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        for (int i = 0; i < lotes.length; i++) {
            for (int j = 0; j < lotes.length; j++) {
                lotes[i][j]= new Terreno(0.0,0.0,0.0);
                lotes[i][j].setOcupado(false);
    }
    
}int opcion;
    do{ 
        
        System.out.println("******Reserve su terreno en cualquiera de nuestros lotes******");
        System.out.println("1.Venta de Terreno");
        System.out.println("2.Consulta/reportes");
        System.out.println("3.Salir");
        opcion = datos.nextInt();
        
        switch(opcion){
            case 1:
                double  largo;
                double  ancho;
                double  precio;
                int x;
                int y;
                System.out.println("Compre su terreno");
                System.out.println("");
                System.out.println("Escriba las cordenadas del terreno: ");
                System.out.println("X: ");
                x= datos.nextInt();
                System.out.println("Y: ");
                y = datos.nextInt();
            if(x<5 && y<5){
                if(pl.estaVacia(x, y)== true){
                        
                System.out.println("Ancho del terreno: ");
                ancho = datos.nextDouble();
                System.out.println("Largo del terreno: ");
                largo = datos.nextDouble();
                System.out.println("Precio del terreno: ");
                precio = datos.nextDouble();
            
                
                    lotes [x][y].setAncho(ancho);
                    lotes [x][y].setLargo(largo);
                    lotes [x][y].setOcupado(true);
                    lotes [x][y].setPrecio(precio);
                    System.out.println("Gracias por su compra");
                    System.out.println("");
                }else{
                    System.out.println("Terreno no disponible");
                    System.out.println("");
                }
            }else{
                System.out.println("Coordenadas invalidas verifique");
                System.out.println("");
            }
                break;
            case 2:
                System.out.println("Cantidad de Terrenos Ocupados: "+pl.terrOcupado());
                System.out.println("");
                System.out.println("Cantidad total LPS. : "+pl.totalLps());
                System.out.println("");
                System.out.println("Cantidad terrenos Vacios: "+pl.terrVacio());
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }while(opcion!=3);
}}
