package codigoCajas;

import java.util.Scanner;

//Ejercicio:

//Se tiene una linea de 4 cajas donde se cobran facturas que luego seran cargadas 
//en el sistema.
//Se solicitara el numero de caja y el importe cobrado. La carga finaliza con importe cero.
//Informar la cantidad de facturas cobradas por cada caja y el promedio de todas las 
//facturas

public class SistemaCajas {

	public static void main(String[] args) {

		int cantidadFacturasCaja[] = new int[4];
		double promedio = 0;
		int totalFacturas = 0;

		System.out.println("SISTEMA DE CAJAS");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese importe factura (0=terminar)");
		double importe = sc.nextDouble();
		while (importe != 0) {
			System.out.println("Ingrese caja de pago (1 a 4)");
			int posicionCaja = sc.nextInt();
			cantidadFacturasCaja[posicionCaja - 1]++;
			totalFacturas++;
			// promedio = promedio + importe;
			promedio += importe;
			sc = new Scanner(System.in);
			System.out.println("Ingrese importe factura (0=terminar)");
			importe = sc.nextDouble();
		}

		for (int i = 0; i < cantidadFacturasCaja.length; i++) {
			System.out.println("Caja: " + (i + 1) + " --> " + cantidadFacturasCaja[i]);
		}

		System.out.println("Promedio: " + (promedio / totalFacturas));
	}

}