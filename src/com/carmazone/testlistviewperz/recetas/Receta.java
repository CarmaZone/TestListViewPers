package com.carmazone.testlistviewperz.recetas;

import android.graphics.drawable.Drawable;

public class Receta {

	private Drawable foto;
	private String nombre;
	private String pueblo;
	private String ingredientes;

	public Receta(Drawable foto, String nombre, String pueblo,
			String ingredientes) {
		super();
		this.foto = foto;
		this.nombre = nombre;
		this.pueblo = pueblo;
		this.ingredientes = ingredientes;
	}

	public Drawable getFoto() {
		return foto;
	}

	public void setFoto(Drawable foto) {
		this.foto = foto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPueblo() {
		return pueblo;
	}

	public void setPueblo(String pueblo) {
		this.pueblo = pueblo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}
