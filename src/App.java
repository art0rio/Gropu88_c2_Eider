public class App{
	private String nombre; 					// palabras o cadenas de caracteres
	private int identificacion;				// enteros
	private double estatura;				// numeros con hasta 15 decimales 
	private float peso;						// numeros con hasta 7 decimales
	private char sexo;     					// char es un solo caracter, una sola letra o numero
	private boolean estaVacunado;			// datos de falso o verdadero


	public static void main(string[] args) throws exception {	//esto es una funcion, se llama escribiendo main y autocompletando
	    System.out.println("Hello world");				        // esta linea es: print() en python, se llama escribiendo syso y autocompletando
//operadores aritmeticos
	    int resultado = 45+12;
	        resultado = 45-12;
		    resultado = 45*12;
		    resultado = 45/12;
		    resultado = 45%12;
		    boolean respuesta = true;
//algebra booleana, el objetivo es averiguar si algo se cumple o no
		    respuesta = 5 < 8;
		    respuesta = 5 >= 8;
		    respuesta = 5 <= 8;
		    respuesta = 5 == 8;
		    respuesta = 5 != 8;
//operadores logicos, sirven para evaluar una o mas condiciones
		    respuesta = 5 < 8 && 4 >= 6;				// && operador y
		    respuesta = 5 < 8 || 4 >= 6;				// || operador or
//operadores bit a bit
		&							// and bit a bit						
		|							// or inclusivo
		^							// compuerta sort o potencia
//estructuras, sentencias o funciones de control
		if (5 != 10){  						//lo que esta dentro del parentesis (5!=10) tiene que ser una operacion logica, evaluar si algo es falso o verdadero
		 	/* aqui va el bloque de codigo          
			   que determina que hacer o 
			   que no hacer al cumplir o 
			   no cumplir la condicion 
			   logica mas cercana evaluada
			   O SEA LA INSTRUCCION */
            } 
  
		else if (operacion logica){
			// instruccion o bloque de codigo a ejecutar 
        }
		else if (operacion logica){
			/*instruccion o bloque de codigo
			a ejecutar*/
         }
         int llave = 2;
		switch (llave) {        // el switch evalua una llave o value dado en el case, si se cumple ejecuta la instruccion del bloque
            case 1:
            // instruccion o bloque de codigo a ejecutar
            case 2:
            // instruccion o bloque de codigo a ejecutar
                
                break;
        
            default:
                break;
        }
