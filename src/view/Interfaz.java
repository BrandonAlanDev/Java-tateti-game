package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton boton0;
	public JButton boton1;
	public JButton boton2;
	public JButton boton3;
	public JButton boton4;
	public JButton boton5;
	public JButton boton6;
	public JButton boton7;
	public JButton boton8;
	public JLabel lblTurno;
	public JLabel turno;
	public JButton botonReset;
	public int wins1 = 0;
	public int wins2 = 0;
	public int empates =0;

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 620);
		Image icon=Toolkit.getDefaultToolkit().getImage(getClass().getResource("tateti.png"));
		setIconImage(icon);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(62, 40, 81));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel tateti = new JPanel();
		tateti.setBackground(new Color(62, 40, 81));
		tateti.setPreferredSize(new Dimension(450, 450));
		tateti.setLayout(new GridLayout(3, 3, 5, 5));
		contentPane.add(tateti);
		
		boton0 = new JButton(" ");
		tateti.add(boton0);
		
		boton1 = new JButton(" ");
		tateti.add(boton1);
		
		boton2 = new JButton(" ");
		tateti.add(boton2);
		
		boton3 = new JButton(" ");
		tateti.add(boton3);
		
		boton4 = new JButton(" ");
		tateti.add(boton4);
		
		boton5 = new JButton(" ");
		tateti.add(boton5);
		
		boton6 = new JButton(" ");
		tateti.add(boton6);
		
		boton7 = new JButton(" ");
		tateti.add(boton7);
		
		boton8 = new JButton(" ");
		tateti.add(boton8);
		
		JPanel control = new JPanel();
		control.setBackground(new Color(62, 40, 81));
		control.setPreferredSize(new Dimension(450, 150));
		contentPane.add(control);
		control.setLayout(new GridLayout(0, 3, 0, 0));
		
		lblTurno = new JLabel("Turno :");
		lblTurno.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblTurno.setForeground(SystemColor.text);
		control.add(lblTurno);
		
		turno = new JLabel("X");
		turno.setForeground(SystemColor.text);
		control.add(turno);
		
		botonReset = new JButton("Reset");
		control.add(botonReset);
	}

}
