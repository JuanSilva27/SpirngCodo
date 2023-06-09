package Clases;

public class Animal {

	protected String nombre;
	protected String raza;
	protected int edad;
	protected String color;
	protected String tipo;
	
	public Animal () {
		
	}
	
	public String moverse () {
		
		return switch(this.tipo) {
		case "Ave" -> "El animal vuela";
        case "Mamifero" -> "El animal camina";
        case "Reptil" -> "El animal se arrastra";
        case "Pez" -> "El animal nada";
        default -> "El animal se mueve";
				
		};
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
