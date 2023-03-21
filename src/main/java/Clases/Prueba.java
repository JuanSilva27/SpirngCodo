package Clases;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola Mundo");
		int nota;
		String contenido;
		
		Persona ruben = new Persona();
		Persona Maria = new Persona("Maria","Rosa", 23, 17478374) ;
		
		ruben.setNombre("Ruben");
		ruben.setApellido("Rojas");
		
		Maria.saludar();
		
		Pez pez = new Pez();
		System.out.println(pez.moverse());
		
	}

}
