package com.curso.modulo4;

public class EjemploBreakContinue {
	public static void main(String... ar) {
		// break y continue

		// break
//		int a= 7;
//		for(int i =2;i<a;i++) {
//			System.out.println("linea " + i);
//			if (i==4)break;
//			System.out.println("y escribo esto ");
//		}
		// continue
//		int a= 7;
//		for(int i =2;i<a;i++) {
//			System.out.println("linea " + i);
//			if (i==4)continue;
//			System.out.println("y escribo esto ");
//		}

		
		
		// Break anidado sin etiqueta
//		int a = 7;
//		for (int i = 2; i < a; i++) {
//
//			System.out.println("linea " + i);
//			for(int j = 0;j<3;j++) {
//				System.out.println(j);
//			
//			if (i == 4)
//				break;
//			System.out.println("y escribo esto ");
//			}
//		}
		
		// Break anidado CON etiqueta
		int a =7;
				forexterno:		
					
				for (int i = 2; i < a; i++) {

					System.out.println("linea " + i);
					for(int j = 0;j<3;j++) {
						System.out.println(j);
					
					if (i == 4)
						continue forexterno;
					System.out.println("y escribo esto ");
					System.out.println("---bucle externo----");
				
					}
			
	

	}

	}
}
