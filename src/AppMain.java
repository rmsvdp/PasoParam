
public class AppMain {


	
	public static void main(String[] args) {
		int x = 3;
		int[] miArray = {3};
		
		pasaValor(x);
		System.out.println("Poscion 0 de miArray ANTES DE EJECUTAR pasaRef:" + miArray[0]);
		pasaRef(miArray);
		System.out.println(" Esta x es la de main :" + x);
	System.out.println("Poscion 0 de miArray :" + miArray[0]);
	}
	
	public static void pasaValor(int x) {
		x++;
		System.out.println(" Esta x es la de pasaValor :" + x);
	}
	
	public static void pasaRef(int[] ref) {
		System.out.println(" Poscion 0 de ref ( A LA ENTRADA DE pasaRef ):" + ref[0]);
			ref[0]++;
			System.out.println(" Poscion 0 de ref ( A LA SALIDA DE pasaRef ):" + ref[0]);
		}
}
