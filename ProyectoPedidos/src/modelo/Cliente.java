package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente implements Serializable{
	private String dni;
	private String nombre;
	private String descripcion;

	

	public Cliente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean equals(Object obj) {
//		System.out.println("soy el equals de persona");
		return this.dni.equals(((Cliente)obj).dni);
	}
}
