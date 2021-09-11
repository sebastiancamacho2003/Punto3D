package Coordenadas;

import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner dato = new Scanner(System.in);
		double x1, y1, z1, x2, y2, z2, sum1, sum2, sum3;
		int a;
		System.out.println("Escoja el plano de los puntos \n1. 3D\n2. 2D");
		a = dato.nextInt();
		switch (a) {
		case 1:
			System.out.println("Escoja las coordenadas iniciales del punto 1 \nx= ");
			x1 = dato.nextDouble();
			System.out.println("y= ");
			y1 = dato.nextDouble();
			System.out.println("z= ");
			z1 = dato.nextDouble();
			System.out.println("Escoja las coordenadas iniciales del punto 2 \nx= ");
			x2 = dato.nextDouble();
			System.out.println("y= ");
			y2 = dato.nextDouble();
			System.out.println("z= ");
			z2 = dato.nextDouble();
			System.out.println("(" + x1 + "," + y1 + "," + z1 + ")(" + x2 + "," + y2 + "," + z2 + ")");
			Punto3D p1 = new Punto3D(x1, y1, z1);
			Punto3D p2 = new Punto3D(x2, y2, z2);
			System.out.println("Ingrese el aumento: ");
			System.out.println("x= ");
			sum1 = dato.nextDouble();
			System.out.println("y= ");
			sum2 = dato.nextDouble();
			System.out.println("z= ");
			sum3 = dato.nextDouble();
			Punto3D a1 = new Punto3D(sum1, sum2, sum3);
			double aux1 = p1.cambiarX(a1);
			double aux2 = p1.cambiarY(a1);
			double aux3 = p1.cambiarZ(a1);
			double aux4 = p2.cambiarX(a1);
			double aux5 = p2.cambiarY(a1);
			double aux6 = p2.cambiarZ(a1);

			System.out.println("Las nuevas coordenadas (" + aux1 + "," + aux2 + "," + aux3 + ")(" + aux4 + "," + aux5
					+ "," + aux6 + ")");
			System.out.println("La distancia entre los 2 puntos es: ");
			Punto3D dato1 = new Punto3D(aux1, aux2, aux3);
			Punto3D dato2 = new Punto3D(aux4, aux5, aux6);
			double dis = dato1.distanciaPunto(dato2);
			double origen1 = dato1.distanciaPunto();
			double origen2 = dato2.distanciaPunto();
			System.out.println("La distancia del punto1 al punto 2 es: " + (double) Math.round(dis * 100d) / 100d);
			System.out.println("La distancia del punto1 al punto 1 es: " + (double) Math.round(origen1 * 100d) / 100d);
			System.out.println("La distancia del punto1 al punto 2 es: " + (double) Math.round(origen2 * 100d) / 100d);
			break;
		case 2:
			
			System.out.println("Escoja las coordenadas iniciales del punto 1 \nx= ");
			x1 = dato.nextDouble();
			System.out.println("y= ");
			y1 = dato.nextDouble();
			System.out.println("Escoja las coordenadas iniciales del punto 2 \nx= ");
			x2 = dato.nextDouble();
			System.out.println("y= ");
			y2 = dato.nextDouble();
			System.out.println("(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")");
			Punto j1 = new Punto(x1, y1);
			Punto j2 = new Punto(x2, y2);
			System.out.println("Ingrese el aumento: ");
			System.out.println("x= ");
			sum1 = dato.nextDouble();
			System.out.println("y= ");
			sum2 = dato.nextDouble();
			Punto l1 = new Punto(sum1, sum2);
			double auxi1 = j1.cambiarX(l1);
			double auxi2 = j1.cambiarY(l1);
			double auxi4 = j2.cambiarX(l1);
			double auxi5 = j2.cambiarY(l1);

			System.out.println("Las nuevas coordenadas (" + auxi1 + "," + auxi2+ ")(" + auxi4 + "," + auxi5
					 + ")");
			System.out.println("La distancia entre los 2 puntos es: ");
			Punto3D datoa1 = new Punto3D(auxi1, auxi2, 0);
			Punto3D datoa2 = new Punto3D(auxi4, auxi5, 0);
			double dist = datoa1.distanciaPunto(datoa2);
			double origena1 = datoa1.distanciaPunto();
			double origena2 = datoa2.distanciaPunto();
			System.out.println("La distancia del punto1 al punto 2 es: " + (double) Math.round(dist * 100d) / 100d);
			System.out.println("La distancia del punto1 al punto 2 es: " + (double) Math.round(origena1 * 100d) / 100d);
			System.out.println("La distancia del punto1 al punto 2 es: " + (double) Math.round(origena2 * 100d) / 100d);
			break;
			default:
				 System.out.println("Escogio una opcion invalida, cerrando programa...");
		}
	}
}
