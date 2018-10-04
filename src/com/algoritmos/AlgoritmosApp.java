package com.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class AlgoritmosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int base = 0;
		int exp = 0;
		int cal = 0;
		int asis = 0;
		float salario = 0;
		float Horas = 0;
		int hora, minuto, segundos, segundosusuario;
		int n1, n2, n3,n;
		String respuesta = "";
		int num = 0;
		int numero=0;
		ciclos ciclo = new ciclos();
		condicionales condicion = new condicionales();
		
		//figuras
//		System.out.println("Dame la base");
//		base = sc.nextInt();
//		System.out.println("Dame el exponente");
//		exp = sc.nextInt();
//		System.out.println("El resultado es: " +ciclo.potencia(base, exp));
//		
//		calificaciones
//		System.out.println("Cual es tu calificacion?");
//		cal = sc.nextInt();
//		System.out.println("Cuantas asistencias tienes?");
//		asis =  sc.nextInt();
//		System.out.println("Pasaste: " +condicion.acreditar(asis, cal));
//	
		
//		trabajo
//		System.out.println("Cuantas horas trabajaste: ");
//		Horas = sc.nextFloat();
//		System.out.println("Cuanto te pagaron las horas: ");
//		salario =  sc.nextFloat();
//		System.out.println("Tu pago es: " +condicion.Salario(salario, Horas));
//		
		
		//numero de en medio
//		System.out.println("Dame un numero: ");
//		n1 = sc.nextInt();
//		System.out.println("Dame un numero: ");
//		n2 = sc.nextInt();
//		System.out.println("Dame un numero: ");
//		n3 = sc.nextInt();
//		System.out.println("El numero de a medias es:  " +condicion.medio(n1, n2, n3));
//	
//		System.out.println("Dame un numero: ");
//		n1 = sc.nextInt();
//		System.out.println("Dame un numero: ");
//		n2 = sc.nextInt();
//		System.out.println("Las cifras son: " +condicion.cifras(n1, n2));
	
		//horario
//		System.out.println("Dame la hora");
//		hora = sc.nextInt();
//		System.out.println("Dame los minutos");
//		minuto = sc.nextInt();
//		System.out.println("Dame los segunos ");
//		segundos = sc.nextInt();
//		System.out.println("Dame los segundos que van a pasar ");
//		segundosusuario = sc.nextInt();
//		System.out.println("Cuantos segundos pasaron" +condicion.Horausuario(hora, minuto, segundos,segundosusuario));
		
		//numero invertido 
//		System.out.println("ingresa un numero");
//		n = sc.nextInt();
//		System.out.println("El numero invertido es " +ciclo.invertirNumero(n));
		
		//Adivinar numero
//		Random rnd = new Random(System.nanoTime());
//		n1 =  rnd.nextInt(100);
//		do {
//			System.out.println("adivina el numero");
//			n2 = sc.nextInt();
//			respuesta = ciclo.adivinar(n1, n2);
//			System.out.println(respuesta);
//		}while (!respuesta.equals("Lo adivinaste"));
//		
		
		//Numeros primos
//		System.out.println("ingresa un numero");
//		num = sc.nextInt();
//		System.out.println("El numero es: " +condicion.esprimo(num));

		//matrices 
		System.out.println("ingresa el tamanio de la matriz: ");
		numero = sc.nextInt();
		System.out.println("asi quedaria la matriz \n" +ciclo.Matriz(numero));
		
		}
}
