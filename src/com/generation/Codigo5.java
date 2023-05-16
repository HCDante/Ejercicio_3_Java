package com.generation;
import java.util.Scanner;

public class Codigo5 {

		public static void main(String[] args) {
			
			    Scanner sc = new Scanner(System.in);
			    System.out.print("Introduzca un número: ");
			    long numeroIngresado = (long) Math.round(sc.nextDouble());
			    long cifra = numeroIngresado;
			    int afortunado = 0;
			    int noAfortunado = 0;
			    
			    while (numeroIngresado > 0) {
				  long digito = (numeroIngresado % 10);
			      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
					afortunado++;
					numeroIngresado /= 10;
			      } else {
					noAfortunado++;
				  
				  //numeroIngresado /= 10;	
			    }

			      numeroIngresado /= 10;
			    }
			    	sc.close();
			    
			    if (afortunado > noAfortunado) {
			    	System.out.println("El " + cifra + " es un número afortunado.");
			
			    } else {
			      System.out.println("El " + cifra + " no es un número afortunado.");
			    }		  
		}

	}
