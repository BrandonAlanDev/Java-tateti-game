package view;

import controller.Controlador;
import model.Juego;

public class Inicio {

	public static void main(String[] args) {
		Interfaz mi_interfaz=new Interfaz();
		Juego mi_juego=new Juego();
		Controlador cr = new Controlador(mi_juego,mi_interfaz);
		cr.iniciarVista();
		mi_interfaz.setVisible(true);
	}

}
