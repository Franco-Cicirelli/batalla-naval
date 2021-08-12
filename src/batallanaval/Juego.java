

package batallanaval;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*** BATALLA NAVAL  ***/
		
		
		
        //Profe hice impresiones en consola asi se muestra como funciona la creacion de barcos y del tablero
		
		int tableroJ[][] = new int[10][10];
		int tableroC[][] = new int [10][10];
		
		System.out.println("Tablero Jugador");
		for (int i = 0; i < 10; i++) { //creacion de tablero del jugador
			for (int j = 0; j < 10; j++) {
				tableroJ[i][j] = 0;
				
			}
			System.out.println("");
		}
		
		System.out.println("Tablero Computadora");
		for( int i = 0 ; i < 10 ; i ++ ) {
			for (int j = 0 ; j < 10 ; j ++ ) {
				tableroC[i][j]=0;
				System.out.print("|" + tableroC[i][j] + "|");
			}
			System.out.println("");
		}

		int direccion = 0;
		int fila = 0;
		int columna = 0;
		int barcosJ = 0;
		int barcosC = 0;
		boolean crearBarcoH = false;
		boolean crearBarcoV = false;

		do {//Creacion de barcos en el tablero del jugador
			direccion = (int) (Math.random() * 2);
			System.out.println("la direccion es " + direccion);

			if (direccion == 0) {// si direccion es 0 el barco se creara en una columna

				fila = (int) (Math.random() * 10);
				columna = (int) (Math.random() * 5);
				crearBarcoV = false;

				while (tableroJ[fila][columna] == 0 && tableroJ[fila][columna + 1] == 0
						&& tableroJ[fila][columna + 2] == 0 && tableroJ[fila][columna + 3] == 0
						&& tableroJ[fila][columna + 4] == 0 && crearBarcoV == false) {

					for (int j = 0; j < 5; j++) {
						tableroJ[fila][columna] = barcosJ + 1;
						columna++;
					}
					crearBarcoV = true;
					fila = (int) (Math.random() * 10);
					columna = (int) (Math.random() * 5);
					barcosJ++;
					
				}

			} else if (direccion == 1) {//// si direccion es 1 el barco se creara en una fila

				fila = (int) (Math.random() * 5);
				columna = (int) (Math.random() * 10);
				crearBarcoH = false;

				//Verificacion de que en cada lugar , no se creo un barco antes
				while (tableroJ[fila][columna] == 0 && tableroJ[fila + 1][columna] == 0
						&& tableroJ[fila + 2][columna] == 0 && tableroJ[fila + 3][columna] == 0
						&& tableroJ[fila + 4][columna] == 0 && crearBarcoH == false) {

					for (int j = 0; j < 5; j++) {//creacion de barcos 
						tableroJ[fila][columna] = barcosJ + 1;
						fila++;
					}
					crearBarcoH = true;
					fila = (int) (Math.random() * 5);
					columna = (int) (Math.random() * 10);
					barcosJ++;
					
				}

			}

		} while (barcosJ < 5); //Seguira ejecutandose siempre que la cantidad de barcos sea menor a 5
		
		
		direccion = 0;
		fila = 0;
		columna = 0;
		barcosC = 0;
		crearBarcoH = false;
		crearBarcoV = false;
		
		do {//Creacion de barcos en el tablero del jugador
			direccion = (int) (Math.random() * 2);
			System.out.println("la direccion es " + direccion);

			if (direccion == 0) {// si direccion es 0 el barco se creara en una columna

				fila = (int) (Math.random() * 10);
				columna = (int) (Math.random() * 5);
				crearBarcoV = false;

				while (tableroC[fila][columna] == 0 && tableroC[fila][columna + 1] == 0
						&& tableroC[fila][columna + 2] == 0 && tableroC[fila][columna + 3] == 0
						&& tableroC[fila][columna + 4] == 0 && crearBarcoV == false) {

					for (int j = 0; j < 5; j++) {
						tableroC[fila][columna] = barcosC + 1;
						columna++;
					}
					crearBarcoV = true;
					fila = (int) (Math.random() * 10);
					columna = (int) (Math.random() * 5);
					barcosC++;
					
				}

			} else if (direccion == 1) {//// si direccion es 1 el barco se creara en una fila

				fila = (int) (Math.random() * 5);
				columna = (int) (Math.random() * 10);
				crearBarcoH = false;

				//Verificacion de que en cada lugar , no se creo un barco antes
				while (tableroC[fila][columna] == 0 && tableroC[fila + 1][columna] == 0
						&& tableroC[fila + 2][columna] == 0 && tableroC[fila + 3][columna] == 0
						&& tableroC[fila + 4][columna] == 0 && crearBarcoH == false) {

					for (int j = 0; j < 5; j++) {//creacion de barcos 
						tableroC[fila][columna] = barcosC + 1;
						fila++;
					}
					crearBarcoH = true;
					fila = (int) (Math.random() * 5);
					columna = (int) (Math.random() * 10);
					barcosC++;
					
				}

			}

		} while (barcosC < 5); //Seguira ejecutandose siempre que la cantidad de barcos sea menor a 5

		
		//Muestro en consola los barcos del jugador ya creados
		
		System.out.println(barcosJ);
		System.out.println("Barcos Jugador");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				System.out.print("|" + tableroJ[i][j] + "|");
			}
			System.out.println("");
		}
		
		//Muestro en consola los barcos de la computadora ya creados
		
		System.out.println(barcosC);
		System.out.println("Barcos Computadora");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				System.out.print("|" + tableroC[i][j] + "|");
			}
			System.out.println("");
		}
		
		
		
		
		JOptionPane.showMessageDialog(null, "Bienvenidos al juego ","Estas preparado ?" ,
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Juego.class.getResource("/img/batallanaval.jpg")));
		JOptionPane.showMessageDialog(null, "Mucha suerte"
				+"\nEl tablero es de 10 filas por 10 columnas, total 100 espacios"
				+ "\n*Para poder disparar debes ingresar un numero del 1 al 10"
				+ "\nTanto para las filas como para las columnas"
				+"\n*Tus barcos seran situados de forma aleatoria , seran 5 y ocuparan 5 casillas"
				+ "\nExitos!!!");

		/* DISPAROS A BARCOS */
		//COMPUTADORA

		int barcosHundidosC=0;
		int barcosHundidosJ=0;
		int disparosTotalesJ = 0;
		int disparosTotalesC = 0;
		int disparosAguaC = 0;
		int disparosAguaJ = 0;
		int barcoHerido=0;
		int[] disparosABuquesJ = new int[5];
		int[] disparosABuquesC = new int [5];
		boolean buqueHerido=false;
		int[][] disparosRepetidosC = new int[10][10];
		disparosRepetidosC[fila][columna] = 0;
		int [][] disparosJ = new int[10][10];
		disparosJ[fila][columna] = 0;
		int count=0;
		int volverAJugar=0;
		boolean juegoTerminar = false;
		String mensaje="";
		int nivelDificultad = Integer.parseInt(JOptionPane.showInputDialog("Elige el nivel de dicultad numericamente"+
		"\n(1) Nivel Medio \n(2) Nivel Dificil"));
		while(nivelDificultad<1 || nivelDificultad>2) {
			nivelDificultad = Integer.parseInt(JOptionPane.showInputDialog("Has ingresado un valor incorrecto,Elige el nivel de dicultad numericamente"+
					"\n(1) Nivel Medio \n(2) Nivel Dificil"));
		}
		

		do {
			juegoTerminar=false;
			
			//COMPUTADORA DISPARA AL JUGADOR
		
			if(juegoTerminar==false) {
				
			if (nivelDificultad==1) {//Nivel Medio
				do {
					fila = (int) (Math.random() * 10);
			        columna = (int) (Math.random() * 10);
				}while(disparosRepetidosC[fila][columna]==1);
			}	
			else if(nivelDificultad == 2	) {//Nivel Dificil
				do {
				//Si hay un buque herido , vuelve a disparar hasta hundirlo 
				if(buqueHerido==true) {
					do {
						fila = (int) (Math.random() * 10);
				        columna = (int) (Math.random() * 10);
					   
					} while(! (tableroJ[fila][columna]==barcoHerido) );
				}
				//No hay un buque herido , entonces genera un disparo donde no se ha disparado
				else if(buqueHerido==false) {
					fila = (int) (Math.random() * 10);
			        columna = (int) (Math.random() * 10);
				}	
				
			  }while(disparosRepetidosC[fila][columna] == 1);
			}	
			
			//El while verifica si ya se ha disparado a aquel sitio 
			//generara un espacio en la matriz donde todavia no se ha disparado
			
			
		    disparosRepetidosC[fila][columna]++;

			System.out.println(disparosRepetidosC[fila][columna]);

			if (disparosRepetidosC[fila][columna] == 1) {
				disparosTotalesC++;

				//busca en el tablero los barcos 1,2,3,4 y 5
				switch (tableroJ[fila][columna]) {
				case 0:
					disparosAguaC++;
					mensaje = "La computadora ha disparado en el agua";

					break;
				case 1:
					// agrego disparos en el buque
					disparosABuquesJ[0]++;  
					
					break;
				case 2:
					disparosABuquesJ[1]++;
                   
					break;
				case 3:
					disparosABuquesJ[2]++;
					
					break;
				case 4:
					disparosABuquesJ[3]++;
					
					break;
				case 5:
					disparosABuquesJ[4]++;
					
					break;

				default:
					break;
				}
				if(tableroJ[fila][columna]>0) {
					mensaje = "La computadora ha sido certera, ha dañado una de tus naves";
					buqueHerido=true;
					barcoHerido=tableroJ[fila][columna];
					
				}
				JOptionPane.showMessageDialog(null,
						mensaje +"\nBuques dañados del Jugador:"
						        + "\nBuque-1 ha recibido " + disparosABuquesJ[0] + " disparos" + "\nBuque-2 ha recibido "
								+ disparosABuquesJ[1] + " disparos" + "\nBuque-3 ha recibido " + disparosABuquesJ[2]
								+ " disparos" + "\nBuque-4 ha recibido " + disparosABuquesJ[3] + " disparos"
								+ "\nBuque-5 ha recibido " + disparosABuquesJ[4] + " disparos");

			}
			
			
            // bucle dentro del array disparosBuque[] para saber si el buque ha sido hundido
			
			
			for (int i = 0; i < 5; i++) { 
			
				if (disparosABuquesJ[i] == 5) {
					barcosHundidosJ++;
					JOptionPane.showMessageDialog(null, "La computadora ha hundido tu buque numero" +(i + 1),"\nCuidado la computadora es muy precisa" ,
							JOptionPane.PLAIN_MESSAGE, new ImageIcon(Juego.class.getResource("/img/barco"
							+ (i+1) + ".jpg")));
					if(barcosHundidosJ==5) {
						JOptionPane.showMessageDialog(null, "Lamentablemente has perdido el juego contra la computadora"
					            +"\n***Jugador***"
								+"\ndisparos totales del jugador = "+ disparosTotalesJ
								+"\ndisparos al agua jugador ="+ disparosAguaJ
								+"\nBuques hundidos a la computadora = "+ barcosHundidosC
								+"\n***Computadora***"
								+"\ndisparos totales de la computadora = "+disparosTotalesC
								+"\ndisparos al agua computadora = "+ disparosAguaC
								+"\nBuques hundidos al jugador = " +  barcosHundidosJ
								);
						volverAJugar=Integer.parseInt(JOptionPane.showInputDialog("Desea volver a jugar \nIngresa el 0 para volver a jugar \nIngresa el 1 para salir del juego"));
					
						juegoTerminar=true;
					}
					   buqueHerido=false;
					   disparosABuquesJ[i] = 6; 
				}
			}
			}
			
			
			
			//JUGADOR DISPARA A COMPUTADORA
		    
			if(juegoTerminar==false) {
				
				JOptionPane.showMessageDialog(null," Comienza tu turno ");
			    count=0;
			do {
				if(count>0) {
					JOptionPane.showMessageDialog(null,"Ya has disparado aqui, intentalo en otro lado");
				}
				fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la fila donde deseas disparar" ))-1;
			    columna=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la columna donde deseas disparar" ))-1;
			    
			    if(fila<0 || fila>=10) {
			    	fila = Integer.parseInt(JOptionPane.showInputDialog("Has ingresado un numero incorrecto para la fila , ingresa la fila donde deseas disparar" ))-1;
			    }
			    if(columna<0 || columna>=10) {
			    	columna = Integer.parseInt(JOptionPane.showInputDialog("Has ingresado un numero incorrecto para la columna , ingresa la columna donde deseas disparar" ))-1;
			    }
				count++;
			}while(disparosJ[fila][columna] >=
					1 );
			
			//El while verifica si ya se ha disparado a aquel sitio 
			//generara un espacio en la matriz donde todavia no se ha disparado
			
			
		    disparosJ[fila][columna]++;

			System.out.println(disparosJ[fila][columna]);

			if (disparosJ[fila][columna] == 1) {
				disparosTotalesJ++;

				//busca en el tablero los barcos 1,2,3,4 y 5
				switch (tableroC[fila][columna]) {
				case 0:
					disparosAguaJ++;
					mensaje = "Tu disparo ha sido en el *agua*";

					break;
				case 1:
					// agrego disparos en el buque
					disparosABuquesC[0]++;  
					
					break;
				case 2:
					disparosABuquesC[1]++;
                   
					break;
				case 3:
					disparosABuquesC[2]++;
					
					break;
				case 4:
					disparosABuquesC[3]++;
					
					break;
				case 5:
					disparosABuquesC[4]++;
					
					break;

				default:
					break;
				}
				if(tableroC[fila][columna]>0) {
					mensaje = "Tu disparo ha sido certero, has dañado una nave enemiga";
					disparosJ[fila][columna]++;
					
				}
				JOptionPane.showMessageDialog(null,
						mensaje +"\nBuques dañados a la Computadora:"
						        + "\nBuque-1 ha recibido " + disparosABuquesC[0] + " disparos" + "\nBuque-2 ha recibido "
								+ disparosABuquesC[1] + " disparos" + "\nBuque-3 ha recibido " + disparosABuquesC[2]
								+ " disparos" + "\nBuque-4 ha recibido " + disparosABuquesC[3] + " disparos"
								+ "\nBuque-5 ha recibido " + disparosABuquesC[4] + " disparos");

			}
			
			//Si el jugador dispara hacia el agua en el mapa aparecera el numero 1 
			//Si el jugador dispara hacia un buque enemigo aparecera el numero 2
			
			JOptionPane.showMessageDialog(null,
					"Disparos a Computadora \n"+
			        "(0)=  lugar sin disparos\n"+"(1)=  lugar disparado\n"+"(2)= has herido un buque\n"+
					"     "+"   1   "+ "   2   "+"   3   "+"   4   "+"   5   "+"   6   "+"   7   "+ "   8   "+"   9   "+"  10   "
			+"\n(1)"+"  | "+disparosJ[0][0]+" | "+" | "+disparosJ[0][1]+" | "+" | "+disparosJ[0][2]+" | "+" | "+disparosJ[0][3]+" | "+" | "+disparosJ[0][4]+" | "+" | "
					      +disparosJ[0][5]+" | "+" | "+disparosJ[0][6]+" | "+" | "+disparosJ[0][7]+" | "+" | "+disparosJ[0][8]+" | "+" | "+disparosJ[0][9]+" | "
			+"\n(2)"+"  | "+disparosJ[1][0]+" | "+" | "+disparosJ[1][1]+" | "+" | "+disparosJ[1][2]+" | "+" | "+disparosJ[1][3]+" | "+" | "+disparosJ[1][4]+" | "+" | "
					      +disparosJ[1][5]+" | "+" | "+disparosJ[1][6]+" | "+" | "+disparosJ[1][7]+" | "+" | "+disparosJ[1][8]+" | "+" | "+disparosJ[1][9]+" | "
     		+"\n(3)"+"  | "+disparosJ[2][0]+" | "+" | "+disparosJ[2][1]+" | "+" | "+disparosJ[2][2]+" | "+" | "+disparosJ[2][3]+" | "+" | "+disparosJ[2][4]+" | "+" | "
					      +disparosJ[2][5]+" | "+" | "+disparosJ[2][6]+" | "+" | "+disparosJ[2][7]+" | "+" | "+disparosJ[2][8]+" | "+" | "+disparosJ[2][9]+" | "
			+"\n(4)"+"  | "+disparosJ[3][0]+" | "+" | "+disparosJ[3][1]+" | "+" | "+disparosJ[3][2]+" | "+" | "+disparosJ[3][3]+" | "+" | "+disparosJ[3][4]+" | "+" | "
					      +disparosJ[3][5]+" | "+" | "+disparosJ[3][6]+" | "+" | "+disparosJ[3][7]+" | "+" | "+disparosJ[3][8]+" | "+" | "+disparosJ[3][9]+" | "
			+"\n(5)"+"  | "+disparosJ[4][0]+" | "+" | "+disparosJ[4][1]+" | "+" | "+disparosJ[4][2]+" | "+" | "+disparosJ[4][3]+" | "+" | "+disparosJ[4][4]+" | "+" | "
					      +disparosJ[4][5]+" | "+" | "+disparosJ[4][6]+" | "+" | "+disparosJ[4][7]+" | "+" | "+disparosJ[4][8]+" | "+" | "+disparosJ[4][9]+" | "
			+"\n(6)"+"  | "+disparosJ[5][0]+" | "+" | "+disparosJ[5][1]+" | "+" | "+disparosJ[5][2]+" | "+" | "+disparosJ[5][3]+" | "+" | "+disparosJ[5][4]+" | "+" | "
					      +disparosJ[5][5]+" | "+" | "+disparosJ[5][6]+" | "+" | "+disparosJ[5][7]+" | "+" | "+disparosJ[5][8]+" | "+" | "+disparosJ[5][9]+" | "
			+"\n(7)"+"  | "+disparosJ[6][0]+" | "+" | "+disparosJ[6][1]+" | "+" | "+disparosJ[6][2]+" | "+" | "+disparosJ[6][3]+" | "+" | "+disparosJ[6][4]+" | "+" | "
					      +disparosJ[6][5]+" | "+" | "+disparosJ[6][6]+" | "+" | "+disparosJ[6][7]+" | "+" | "+disparosJ[6][8]+" | "+" | "+disparosJ[6][9]+" | "
			+"\n(8)"+"  | "+disparosJ[7][0]+" | "+" | "+disparosJ[7][1]+" | "+" | "+disparosJ[7][2]+" | "+" | "+disparosJ[7][3]+" | "+" | "+disparosJ[7][4]+" | "+" | "
					      +disparosJ[7][5]+" | "+" | "+disparosJ[7][6]+" | "+" | "+disparosJ[7][7]+" | "+" | "+disparosJ[7][8]+" | "+" | "+disparosJ[7][9]+" | "
			+"\n(9)"+"  | "+disparosJ[8][0]+" | "+" | "+disparosJ[8][1]+" | "+" | "+disparosJ[8][2]+" | "+" | "+disparosJ[8][3]+" | "+" | "+disparosJ[8][4]+" | "+" | "
					      +disparosJ[8][5]+" | "+" | "+disparosJ[8][6]+" | "+" | "+disparosJ[8][7]+" | "+" | "+disparosJ[8][8]+" | "+" | "+disparosJ[8][9]+" | "
			+"\n(10)"+"| "+disparosJ[9][0]+" | "+" | "+disparosJ[9][1]+" | "+" | "+disparosJ[9][2]+" | "+" | "+disparosJ[9][3]+" | "+" | "+disparosJ[9][4]+" | "+" | "
					      +disparosJ[9][5]+" | "+" | "+disparosJ[9][6]+" | "+" | "+disparosJ[9][7]+" | "+" | "+disparosJ[9][8]+" | "+" | "+disparosJ[9][9]+" | ");
			
			
           
			
			
			 // bucle dentro al array disparosBuque[] para saber si el buque ha sido hundido y verificar la cantidad de buques hundidos
			for (int i = 0; i < 5; i++) { 
			
				if (disparosABuquesC[i] == 5) {
					barcosHundidosC++;
					System.out.println("Barcos hundidos a la computadora es igual a = "+barcosHundidosC);
					JOptionPane.showMessageDialog(null, "Has hundido un buque de la computadora\nel buque " +(i + 1),"\nFelicitaciones" ,
							JOptionPane.PLAIN_MESSAGE, new ImageIcon(Juego.class.getResource("/img/barco"
							+ (i+1) + ".jpg")));
					if(barcosHundidosC==5) {
						JOptionPane.showMessageDialog(null, "Felicitaciones has ganado el juego contra la computadora"
								+"\n***Jugador***"
								+"\ndisparos totales del jugador = "+ disparosTotalesJ
								+"\ndisparos al agua jugador ="+ disparosAguaJ
								+"\nBuques hundidos a la computadora = "+ barcosHundidosC
								+"\n***Computadora***"
								+"\ndisparos totales de la computadora = "+disparosTotalesC
								+"\ndisparos al agua computadora = "+ disparosAguaC
								+"\nBuques hundidos al jugador = " +  barcosHundidosJ
								);
						volverAJugar=Integer.parseInt(JOptionPane.showInputDialog("Desea volver a jugar \nIngresa el 0 para volver a jugar \nIngresa el 1 para salir del juego"));
						juegoTerminar=true;
					} 
					   disparosABuquesC[i] = 6; 
				  }
				}
			}

		} while (volverAJugar==0);
		
		JOptionPane.showMessageDialog(null,"Esta batalla naval fue programda por Franco Cicirelli durante el mes de Julio del año 2021");
	
	}

}
