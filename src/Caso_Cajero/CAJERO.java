package Caso_Cajero;

import java.util.Scanner;

public class CAJERO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"U-89465", "R-98465", "T-35656", "A-15546"};
		String[] arrClave = {"1655", "8531", "6513", "5156"};
		String[] arrUsuario = {"Anthony Urrutia", "Maria Rodriguez", "Rosario Ttito", "David Arango"};
		int[] arrSaldo = {800, 2500, 1800, 0};
		System.out.println("-----------------------");
		
		System.out.print("INGRESE NUMERO DE TARJETA: ");
		String codigo = sc.nextLine(); 
		System.out.println("--------------------------");
		System.out.println("ESTAMOS VALIDANDO SUS DATOS");
		System.out.println("--------------------------");
		System.out.print("INGRRESE SU CLAVE DE CAJERO: ");
		String clave = sc.nextLine();
		
		int p = -1;
		
		for (int i = 0; i < arrClave.length; i++) {
			if (clave.equals(arrClave[i])) {
				p = i;
				break; 
	} 

		}
		int cli = 0;
		String continuar = "S";
		
		if (p == -1) {
			System.out.println("\n--------------");
			System.out.println("Clave incorrecta");
			System.out.println("----------------");		
	  }
		
		else {
			System.out.println("\n----------------------------------");
			System.out.println("Bienvenido(a) " + "<<< " + arrUsuario[p] + " >>>");
			System.out.println("----------------------------------");
			System.out.println("\nPor favor eliga una opcion:");
			System.out.println("\n[1] Consulta de saldo");
			System.out.println("[2] Hacer retiro");
			System.out.println("[3] Transferencia");
			System.out.println("[4] Deposito en efectivo");
			System.out.println("[5] Pago de servicios");			
			System.out.println("[6] Salir");		
			System.out.print("Opcion: ");
			int opcion = sc.nextInt();
			
			int saldo = 0;
			float monto = 0;
			float nuevo_saldo = 0;
			
			switch (opcion) {
			     case 1:
			    	saldo = arrSaldo[p];
			    	System.out.println("-----------------");
			    	System.out.println("Consulta de Saldo");
			    	System.out.println("-----------------");
			    	System.out.println("Su saldo es: " + saldo);
			    	System.out.println("Gracias por usar nuestro cajero");	    		   	
					break;			
			     case 2:
			    	 System.out.println("-----------");
			    	 System.out.println("R E T I R O");
			    	 System.out.println("-----------");
			    	 System.out.println("¿Cuanto desea retirar?");    	 
			    	 monto = sc.nextInt();  	
		    	 
			    	 if (arrSaldo[p] == 0) {
			    		 System.out.println("Saldo Insuficiente");
			    		 }
			    		 else if(monto > 1000) {	 
			    			 System.out.println("No excederse de 1000");	
			    			 System.out.print("Inserte monto a retirar: ");    	 
					    	 monto = sc.nextInt();
					    	 System.out.println("Retiro con exito: " + monto);
					    	 nuevo_saldo = arrSaldo[p] - monto;
					    	 System.out.println("Nuevo saldo es: " + nuevo_saldo);
					    	 System.out.println("GRACIAS POR USAR NUESTRO CAJERO");	 
			    		 }
			    		 else if(monto >= arrSaldo[p] && monto >= 800) {	 
			    			 System.out.println("Saldo no alcanzable para esa cantidad de retiro");
			    			 System.out.print("Inserte monto a retirar: ");    	 
					    	 monto = sc.nextInt();
					    	 System.out.println("Retiro con éxito" + monto);
					    	 nuevo_saldo = arrSaldo[p]- monto;
					    	 System.out.println("Nuevo Saldo es: "+ nuevo_saldo);
					    	 System.out.println("GRACIAS POR USAR NUESTRO CAJERO");
					    	 break;
			    		 }
			}
		}
			    	 




}


	}


