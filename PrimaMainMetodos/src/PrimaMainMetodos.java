import java.util.Scanner;


/**
 * <h1> PROBLEMA DEL CÁLCULO DE LA PRIMA. 
 * Se calcula la prima que corresponde a un empleado según una serie de parámetros.
 * Estos parámetros se introducirán por teclado previa petición.</h1>
 * @version v1.2022
 * @author alons
 * @since 31/03/2022
 */


public class PrimaMainMetodos {
	

	static Scanner  teclado=new Scanner(System.in);

	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\nÂ¿CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}

/** Método que halla el tipo de prima.
 * @param esDirectivo Caracter que indica si lo es o no.
 * @param meses Entero que almacena el numero de meses de antigüedad del empleado.
 * @return P1 si es directivo y tiene una antigüedad mayor o igual de 12 meses.
 * P3 si es directivo y tiene una antigüedad menor de 12 meses.
 * P2 si no es directivo y tiene una antigüedad mayor o igual de 12 meses.
 * P4 si no es directivo y tiene una antigüedad menor de 12 meses.
 */
	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}

/** Método que lee el número del empleado.	
 * @return Un entero con el número del empleado. 
 */
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("NÃšMERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
/** Método que lee el nombre del empleado.
 * @return Una cadena con el nombre del empleado.	
  */
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	
/** Metodo que lee la antigüedad del empleado.
 * @return Un entero con el número de meses de antigüedad del empleado.
 */
	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	
/** Método que  lee por teclado si el empleado es directivo o no.
 * @return + si es directivo.	
 * - si no es directivo.
 */
	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("Â¿ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}
