package e14;
/*
 * Ejercicio 14 de Programación M03B1 del año 2019/2020 del IOC
 */
public class E14 {

	public static void main(String[] args) {
		int filas=10;
		int columnas=4;
		int [][] listado= new int [filas][columnas];
		int mejorTiempoH=100;
		int mejorTiempoM=100;
		int provisionalH;
		int provisionalM;
		int dorsalH=0;
		int dorsalM=0;
		
		listado[0][0]=3457;
		listado[0][1]=1;
		listado[0][2]=51;
		listado[0][3]=52;
		
		listado[1][0]=3467;
		listado[1][1]=1;
		listado[1][2]=32;
		listado[1][3]=41;
		
		listado[2][0]=3568;
		listado[2][1]=0;
		listado[2][2]=14;
		listado[2][3]=57;
		
		listado[3][0]=3570;
		listado[3][1]=0;
		listado[3][2]=12;
		listado[3][3]=63;
		
		listado[4][0]=3571;
		listado[4][1]=1;
		listado[4][2]=45;
		listado[4][3]=63;
	
		listado[5][0]=3572;
		listado[5][1]=0;
		listado[5][2]=17;
		listado[5][3]=46;
	
		listado[6][0]=3573;
		listado[6][1]=0;
		listado[6][2]=12;
		listado[6][3]=44;
	
		listado[7][0]=3574;
		listado[7][1]=0;
		listado[7][2]=30;
		listado[7][3]=42;
		
		listado[8][0]=3575;
		listado[8][1]=1;
		listado[8][2]=24;
		listado[8][3]=77;
		
		listado[9][0]=3576;
		listado[9][1]=0;
		listado[9][2]=57;
		listado[9][3]=48;
	
	
		System.out.println("Dorsal\tSexo\tEdad\tMinutos");
		for (int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				System.out.print(listado[i][j] + "\t");
				if (listado[i][j]==0) { //hombre
					provisionalH=listado[i][j+2];
					if(provisionalH < mejorTiempoH) {
						mejorTiempoH=provisionalH;
						dorsalH=listado[i][j-1];
					}
				
				}
				if (listado[i][j]==1) { //mujer
					provisionalM=listado[i][j+2];
					if(provisionalM < mejorTiempoM) {
						mejorTiempoM=provisionalM;
						dorsalM=listado[i][j-1];
					}
				
				}
			}
			System.out.print("\n");
		}
		System.out.println("El ganador en hombres es el dorsal " + dorsalH + " con un tiempo de "+mejorTiempoH+ " minutos" 
		+ "\nLa ganadora en mujeres es el dorsal " + dorsalM +" con un tiempo de "+mejorTiempoM+" minutos");

	}

}

