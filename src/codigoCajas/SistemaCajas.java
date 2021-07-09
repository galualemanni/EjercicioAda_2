package codigoCajas;

import java.util.Scanner;

//Ejercicio : 
//Desarrollar un sistema que permita el ingreso de totales recaudados de lunes a viernes, 
//donde ademas se pueda modificar uno de los valores ingresados seleccionando el numero de dia.
//Se ingresa toda la semana completa y se modifica de a uno.
//Tambien se deberan poder listar los valores ingresados.(opcional ordenado de mayor a menor)
//Todas las funciones se codificaran en un menu con valores enteros hasta que el usuario ingrese 
//cero para salir. (1. agregar  2. listar 3. modificar 0. salir)

public class SistemaCajas {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// Creo variable totalesRecaudados
		int totalesRecaudados;

		// Creo variable opcion
		int opcion;

		// Creo variable acumuladora
		int acc = 0;

		// Creo el objeto Scanner
		Scanner sc = new Scanner(System.in);

		// Creo el array de los dias de la semana
		int[] dia = new int[] { 0, 0, 0, 0, 0 };

		opcion = mostrarMenu(sc);

		while (opcion != 0) {

			switch (opcion) {

			case 1:
				// solicito al usuario el valor del ttal del dia
				System.out.println("Ingrese el numero el dia de la semana");

				// Leo el dia de la semana de acuerdo al codigo ingresado
				int numDia = sc.nextInt();

				// Solicito el total recaudado en el dia seleccionado
				System.out.println("Ingrese el total que cobro en el dia seleccionado");

				// leo el monto recaudado del dia
				totalesRecaudados = sc.nextInt();

				dia[numDia] = totalesRecaudados;
				break;

			case 2:
				// imprimo todos los dias
				for (int i = 0; i < dia.length; i++) {
					System.out.println("el total es " + dia[i]);
				}
				break;

			case 3:
				System.out.println("que dia desea modificar");
				System.out.println("0 Lunes");
				System.out.println("1 martes");
				System.out.println("2 miercoles");
				System.out.println("3 jueves");
				System.out.println("4 viernes");

				int diaModificado = sc.nextInt();

				System.out.println("Ingrese el monto que desea modicar");
				int montoModificado = sc.nextInt();

				dia[diaModificado] = montoModificado;

			}
			opcion = mostrarMenu(sc);
		}

		System.out.println("Gracias por utilizar el sistema");
	}

	private static int mostrarMenu(Scanner sc) {
		int opcion;
		// solicito la opcion que quiere realizar el usuario
		System.out.println("Ingrese la opcion que desea realizar");
		System.out.println("Escribir 0 para salir");
		System.out.println("Escribir 1 para agregar");
		System.out.println("Escribir 2 para listar");
		System.out.println("Escribir 3 para modificar");

		// Leo la opcion seleccionada
		opcion = sc.nextInt();
		return opcion;
	}

}
