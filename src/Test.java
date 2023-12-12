

public class Test {
	
	public int dato=-1;
	public static int datoestatico=1;

	public void metodo() {
		this.datoestatico++;
		this.dato++;
		datoestatico++;
} //metodo
	
public static void metodoestatico() {
	
	//this.datoestatico++;
	datoestatico++;
} //metodoestatico

public static void main(String[] args){
	
	Test tst1 = new Test();
	Test tst2 = new Test();
	
	System.out.println("valor del atributo dato en tst1 "+tst1.dato);
	System.out.println("valor del atributo dato en tst2 "+tst2.dato);
	tst1.dato = tst1.dato +1;
	tst2.dato = tst2.dato +100;
	System.out.println("valor del atributo dato en tst1 "+tst1.dato);
	System.out.println("valor del atributo dato en tst2 "+tst2.dato);
	
	/*
	//dato++;
	datoestatico++;
	System.out.println("datoestatico 1st-> "+ datoestatico);
	metodoestatico();
	System.out.println("datoestatico 2nd-> "+ datoestatico);
	//metodo(); //-- error
	 * 
	 */
	
} // main
} //Class
