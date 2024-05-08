package model;

public class Juego {
	private char tablero[][]=new char[3][3];
	public Juego() {
		inicializar();
	}
	public void inicializar() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=' ';
			}
		}
	}
	private char marca(byte jugador) {
		if(jugador==1) {
			return 'X';
		} else return 'O';
	}
	private char verifica(int fila,int col,byte jugador){
		if(tablero[fila][col]==' ') {
			tablero[fila][col]=marca(jugador);
			return marca(jugador);
		}else return'e';
	}
	public char marcar (int pos,byte jugador) {
		switch(pos){
			case 0: return verifica(0,0,jugador);
			case 1: return verifica(0,1,jugador);
			case 2: return verifica(0,2,jugador);
			case 3: return verifica(1,0,jugador);
			case 4: return verifica(1,1,jugador);
			case 5: return verifica(1,2,jugador);
			case 6: return verifica(2,0,jugador);
			case 7: return verifica(2,1,jugador);
			case 8: return verifica(2,2,jugador);
			default : return 'e';
		}
	}
	public boolean ganador(byte jugador){
		char n=marca(jugador);
		for(int i=0;i<3;i++) {
			if(tablero[0][i]==n && tablero[1][i]==n && tablero[2][i]==n) return true;
		}
		for(int i=0;i<3;i++) {
			if(tablero[i][0]==n && tablero[i][1]==n && tablero[i][2]==n) return true;
		}
		if (tablero[0][0]==n && tablero[1][1]==n && tablero[2][2]==n) return true;
		if (tablero[0][2]==n && tablero[1][1]==n && tablero[2][0]==n) {return true;}
		else return false;
	}
	public boolean empate() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(tablero[i][j]==' ')return false;
			}
		}
		return true;
	}
}
