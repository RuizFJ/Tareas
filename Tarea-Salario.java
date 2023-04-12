package clase110423;

import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		
		float sal,inss=(float) 0.0625,tot = 0;
		int n,horas = 0;int hor = 0;
		String nombre=null;
		
		int i = 0;
		do {
			
		System.out.println("Hola bienvenido, por favor ingrese su nombre");
		nombre=tc.next();
		do {
		System.out.println("Ingrese su salario bàsico");
		sal=tc.nextFloat();
		} while (sal<=0);
		
		do {
		System.out.println("Usted hizo horas extras, escriba 1 si hizo,2 si no hizo");
		n=tc.nextInt();
		} while(n<=0 || n>=3);
		if (n==1) {
			
		do {
		System.out.println("Ingrese sus horas extras");
		horas=tc.nextInt();
		} while (horas<=0);
		hor=horas*360;
		inss=(float) (sal*0.0625);
		tot = (sal+hor)-inss;
		
		}else if (n!=1) {
			
			
			inss=(float) (sal*0.0625);
			tot = sal-inss;
		}
		
		i++;
		}while (i<3);
		
		if (n==1) {
		System.out.printf("%-12s%-12s%-12s\n" , "Nombre" , "Horas extras" , " Salario bàsico");
		System.out.printf("%-10s%-10s%-10s%-10s\n" , nombre , horas, " "  , sal);
		System.out.println("--------------------------------------------");
		System.out.printf("%-10s%-10s%-10s\n" , "Nombre" , "tot-horas extras" , " Salario total");
		System.out.printf("%-10s%-10s%-10s%-10s\n" , nombre , hor ,"  " , tot);
		}
		else if (n!=1) {
		
		System.out.printf("%-10s%-10s\n" , "Nombre"  , " Salario bàsico");
		System.out.printf("%-15s%-15s\n" , nombre   , sal);
		System.out.println("------------------------------------------");
		System.out.printf("%-10s%-10s\n" , "Nombre" , " Salario total");
		System.out.printf("%-15s%-15s\n" , nombre  , tot);
		
		}
		

	}

}
