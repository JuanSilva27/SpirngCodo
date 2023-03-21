package Clases;

import java.util.Date;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	//final Date FechaNacimiento = new Date( Date.parse("1995/21/01"));
	
	
	public Persona() {
		
	}
	
	public Persona (String nombre, String apellido, int edad, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	
	public void saludar() {
		System.out.println("Hola Soy "+ nombre + " " + apellido);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}

}
