import java.util.Scanner;

/**
 * Examen
 */
public class Examen {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] temperatura = {2,6,8,5,17,23,8,1,29.7,11,17};
        double [] temperatura1 = {4,6,8,5,17,7,8,1,29.7,8,19};
        double [] temperatura2 = {2,6,8,15,8,23,18,1,29.7,11,17};
        double [] temperatura3 = {11,6,8,5,17,23,13,1,29,11,1};
        double [] temperatura4 = {2,6,8,6,17,23,8,1,29.10,11,17};
       
        double suma = 0;
        double media = 0;
        for (int i = 0; i < temperatura.length; i++){
            suma = suma + temperatura[i];
        }
        media = ( suma/temperatura.length);
        System.out.println("la media de la temperatura es: " + media);

        suma = 0;
         double media1 = 0;
        for (int i = 0; i < temperatura1.length; i++){
            suma = suma + temperatura1[i];
        }
        media1 = ( suma/temperatura1.length);
        System.out.println("la media de la temperatura-1 es: " + media1);

        suma = 0;
        double media2 = 0;
        for (int i = 0; i < temperatura2.length; i++){
            suma = suma + temperatura2[i];
        }
        media2 = ( suma/temperatura2.length);
        System.out.println("la media de la temperatura-2 es: " + media2);

        suma = 0;
        double media3 = 0;
        for (int i = 0; i < temperatura3.length; i++){
            suma = suma + temperatura3[i];
        }
        media3 = ( suma/temperatura3.length);
        System.out.println("la media de la temperatura-3 es: " + media3);
        suma = 0;
        double media4 = 0;
        for (int i = 0; i < temperatura4.length; i++){
            suma = suma + temperatura4[i];
        }
        media4 = ( suma/temperatura4.length);
        System.out.println("la media de la temperatura-4 es: " + media4);
       
        suma = 0;
        double MediaTotal = (media+ media1 + media2 + media3 + media4) / 5;
        System.out.println("la media de las temperaturas es: " + MediaTotal);
        
        suma = temperatura[i]+temperatura1[i]+temperatura2[i]+temperatura3[i]+temperatura4[i];
        for (int i = 0; i < temperatura.length; i ++);



    
       
    }
    
    
}