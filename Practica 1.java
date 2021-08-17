//Diego Paredes
//568295
//Practica 1

import java.io.*;
import java.util.*;

class Divicion{
   public static void main(String[] args) {
      float n = Divicion.pedir_num();
      float d = Divicion.pedir_den();
      float res = Divicion.dividir(n, d);
      Divicion.imprimir(res);
   }
   
   public static float pedir_num() {
      Scanner x = new Scanner(System.in);
      System.out.println("Dame un valor para el numerador");
      return x.nextFloat();
   }
   
      public static float pedir_den() {
      Scanner x = new Scanner(System.in);
      float n = 0;
      do { 
         System.out.println("Dame un valor para el denumerador, tiene que ser distinto a 0");
         n = x.nextFloat();
         if (n == 0)
            System.out.println("ERROR - El denumerador no puede ser 0");
      } while (n == 0);
      return n;
   }
   
   public static float dividir(float n, float d) {
      return n/d;
   }
   
   public static void imprimir(float res) {
      System.out.println("El resultado de la divicion es: "+res);
   }
}