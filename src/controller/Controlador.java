package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import model.Juego;
import view.Interfaz;

public class Controlador implements ActionListener {
	private Juego mi_juego;
	private Interfaz mi_interfaz;
	private byte jugador;
	public Controlador(Juego mi_juego,Interfaz mi_interfaz) {
		this.mi_juego=mi_juego;
		this.mi_interfaz=mi_interfaz;
		this.jugador=1;
	}
	public void iniciarVista() {
		mi_interfaz.setLocationRelativeTo(null);
		mi_interfaz.setTitle("Turno de Jugador : +"+jugador);
		mi_interfaz.boton0.addActionListener(this);
		mi_interfaz.boton1.addActionListener(this);
		mi_interfaz.boton2.addActionListener(this);
		mi_interfaz.boton3.addActionListener(this);
		mi_interfaz.boton4.addActionListener(this);
		mi_interfaz.boton5.addActionListener(this);
		mi_interfaz.boton6.addActionListener(this);
		mi_interfaz.boton7.addActionListener(this);
		mi_interfaz.boton8.addActionListener(this);
	}
	public char logica(byte jugador,int posicion,JButton boton) {
		char resultado = mi_juego.marcar(posicion, jugador);
		if (resultado=='e'){
				JOptionPane.showMessageDialog(null,"Error : casilla ocupada");
		}else {boton.setText(resultado+"");}
		return 'a';
	}
	
	private void cambiarJugador(byte jugador) { if(jugador==1) this.jugador=2; else this.jugador=1; }
	public void fin() {
		if(JOptionPane.showOptionDialog(null, "Desea volver a jugar?","Continuar?", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null)==JOptionPane.YES_NO_OPTION) {
			this.jugador=1;
			mi_juego.inicializar();
			mi_interfaz.setTitle("Turno de jugador : "+jugador);
			mi_interfaz.turno.setText(""+jugador);
			mi_interfaz.boton0.setText(" ");
			mi_interfaz.boton1.setText(" ");
			mi_interfaz.boton2.setText(" ");
			mi_interfaz.boton3.setText(" ");
			mi_interfaz.boton4.setText(" ");
			mi_interfaz.boton5.setText(" ");
			mi_interfaz.boton6.setText(" ");
			mi_interfaz.boton7.setText(" ");
			mi_interfaz.boton8.setText(" ");
		} else {
			System.exit(0);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object boton = e.getSource();
		char resultado='e';
		if(boton==mi_interfaz.boton0) {
			resultado=logica(jugador,0,mi_interfaz.boton0);
		} else if(boton==mi_interfaz.boton1) {
			resultado=logica(jugador,1,mi_interfaz.boton1);
		} else if(boton==mi_interfaz.boton2) {
			resultado=logica(jugador,2,mi_interfaz.boton2);
		} else if(boton==mi_interfaz.boton3) {
			resultado=logica(jugador,3,mi_interfaz.boton3);
		} else if(boton==mi_interfaz.boton4) {
			resultado=logica(jugador,4,mi_interfaz.boton4);
		} else if(boton==mi_interfaz.boton5) {
			resultado=logica(jugador,5,mi_interfaz.boton5);
		} else if(boton==mi_interfaz.boton6) {
			resultado=logica(jugador,6,mi_interfaz.boton6);
		} else if(boton==mi_interfaz.boton7) {
			resultado=logica(jugador,7,mi_interfaz.boton7);
		} else if(boton==mi_interfaz.boton8) {
			resultado=logica(jugador,8,mi_interfaz.boton8);
		} else if(boton==mi_interfaz.botonReset) {
			this.jugador=1;
			mi_juego.inicializar();
			mi_interfaz.setTitle("Turno de jugador : "+jugador);
			mi_interfaz.boton0.setText(" ");
			mi_interfaz.boton1.setText(" ");
			mi_interfaz.boton2.setText(" ");
			mi_interfaz.boton3.setText(" ");
			mi_interfaz.boton4.setText(" ");
			mi_interfaz.boton5.setText(" ");
			mi_interfaz.boton6.setText(" ");
			mi_interfaz.boton7.setText(" ");
			mi_interfaz.boton8.setText(" ");
		}
		if (resultado!='e') {
			if(mi_juego.ganador(jugador)==true) {
				JOptionPane.showMessageDialog(null,"El jugador "+jugador+" ha ganado");
				this.fin();
			}else if(mi_juego.empate()==true) {
				JOptionPane.showMessageDialog(null,"Empate");
				this.fin();
			} else {
				this.cambiarJugador(jugador);
				mi_interfaz.setTitle("Turno del jugador : "+jugador);
			}
		}
		
	}
}
