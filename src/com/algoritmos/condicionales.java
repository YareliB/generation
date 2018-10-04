package com.algoritmos;

public class condicionales {
	
	public boolean acreditar (int asis, int cal) {
		
		
		final int Totalasis = 70;
		boolean paso = false;
		
		if (asis>=(Totalasis*.8) && cal >=60) {
			paso=true;
			
		}
		return paso;
		
	}
	
	public float Salario (float salario, float Horas) {
		
		if (Horas>40)  
			salario = (float) ((40*salario)+ (Horas-40)*(salario*1.5));
			else
				salario = Horas *salario;
		
		return salario;
	
	}  

	
	public int medio (int n1, int n2, int n3) {
		if (n1<n2 && n1>n3|| n1>n2 && n1<n3) {
			return n1;
		}
			else if (n2>n1 && n2<n3 || n2<n1 && n2>n3) {
			return n2;
			}
		else {
		return n3;
		}
	}
	
	
	public int cifras(int n1, int n2) {
		int cont1 = 0;
		int cont2 = 0;
		
		if (n1==0) {
			cont1=1;
		}
			else {
					while (n1>=1) {
						n1=n1/10;
						cont1++;
					}
				}
		if (n2==0) {
			cont2 =1;
		}
			else {
					while (n2>=1) {
						n2 = n2/10;
						cont2++;
					}
		
				}	return cont1+cont2;
				
				
				
	}
	public String  Horausuario(int hora, int minuto, int segundos, int segundousuario) {
					if (segundousuario!=0) {
						segundos+=segundousuario;
						if(segundos>59) {
							minuto+=segundos/60;
							segundos+=segundos%60;
							if (minuto>59) {
								hora+=minuto/60;
								minuto+=minuto%60;
								if(hora>23) {
									hora=(hora%24);
								}
							}
						}
					}
					return ("Hora: "+hora+"minutos"+minuto+"segundos"+segundousuario);
					
				}
	
			public boolean esprimo (int num) {
				int cont = 2;
				boolean primo = true;
				if (num==1)
					return primo;
				while ((primo)&& (cont!=num)) {
					if (num % cont == 0)
						primo = false;
					cont++;
				}
				return primo;
			}
	
	
	
}


