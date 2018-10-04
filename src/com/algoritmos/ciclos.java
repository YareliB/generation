package com.algoritmos;

public class ciclos {

	public int potencia (int base, int exp) {
		int res = 1;
		for (int i=0; i<exp; i++) {
			res *= base;
			
		}
		
		return res;
		
		
	}
	
//	public int cifras(int n1, int n2) {
//		int cont1=0;
//		int cont2 = 0;
//		if (n1==0)
//			cont1=1;
//		else {
//			while (n1>=1) {
//				n1 = n1/10;
//				cont1++;
//			}
//		}
//		if (n2==0) 
//			cont2=1;
//		else {
//			while (n2>=1)
//			{
//				n2 = n2/10;
//			}
//		}return cifras;
//	}
//	
//	
//	public int invertirNumero(int n) {
//		int cifras = cifras(n, 1)-1;
//		int nIvertido = 0;
//		int divisorCifras = 1;
//		int multiplicadorCifras =1;
//		
//		for (int i=1; i< cifras; i++)
//			divisorCifras *=10;
//		
//		while (divisorCifras>= 1) {
//			nIvertido+= n/divisorCifras * multiplicadorCifras;
//			n%=divisorCifras;
//			divisorCifras/=10;
//			multiplicadorCifras *=10; 
//		}
//		return nIvertido;
//		
//	}
	
	
	public String adivinar (int n1, int n2) {
		String pista = "";
		 if (n1>n2)
			 pista= "el numero es mayor";
		 else if (n2>n1)
			 pista = "el numero es menor";
		 else 
			 pista= "adivinaste";
			 
			 return pista;
	}
	
	public String Matriz(int numero) {
		String cuadrado = "";
		for (int i=0; i< numero; i++) {
			for (int j=0; j < numero; j++) {
				cuadrado = cuadrado + "@";
				
			}
			cuadrado = cuadrado + "\n";
		}
		return cuadrado;
	}
}
