package TrikiTrake;

import java.awt.Color;
import javax.swing.JOptionPane;


public class Juego {
    
    int turno;
    int jugadorX;
    int JugadorO;

    public Juego(int turno, int jugadorX, int JugadorO) {
        this.turno = turno;
        this.jugadorX = jugadorX;
        this.JugadorO = JugadorO;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getJugadorX() {
        return jugadorX;
    }

    public void setJugadorX(int jugadorX) {
        this.jugadorX = jugadorX;
    }

    public int getJugadorO() {
        return JugadorO;
    }

    public void setJugadorO(int JugadorO) {
        this.JugadorO = JugadorO;
    }
    
    public void Intercambiar (){
        if(getTurno()==0){
            setTurno (1);
        }    
        else{
            setTurno(0);
        }
    }
    //Tablero 3X3
    // Posiciones ganadoras horizontales
    public int Resultado3x3(int Matriz [][]){
        if (Matriz[0][0] == Matriz[0][1] && Matriz[0][0] == Matriz[0][2]){
            return 1;
        }
        
        if (Matriz[1][0] == Matriz[1][1] && Matriz[1][0] == Matriz[1][2]){
            return 2;
        }
        
        if (Matriz[2][0] == Matriz[2][1] && Matriz[2][0] == Matriz[2][2]){
            return 3;
        }
    //Posiciones ganadoras verticales  
        if (Matriz[0][0] == Matriz[1][0] && Matriz[0][0] == Matriz[2][0]){
            return 4;
        }
        
        if (Matriz[0][1] == Matriz[1][1] && Matriz[0][1] == Matriz[2][1]){
            return 5;
        }
        
        if (Matriz[0][2] == Matriz[1][2] && Matriz[0][2] == Matriz[2][2]){
            return 6;
        }
        //Posiciones ganadoras en diagonal
        if (Matriz[0][0] == Matriz[1][1] && Matriz[0][0] == Matriz[2][2]){
            return 7;
        }
        if (Matriz[2][0] == Matriz[1][1] && Matriz[2][0] == Matriz[0][2]){
            return 8;
        }
        return 0;
    }
    
    //Tablero 4X4
    // Posiciones ganadoras horizontales
    public int Resultado4x4(int Matriz [][]){
        if ((Matriz[0][0] == Matriz[0][1] && Matriz[0][0] == Matriz[0][2]) && (Matriz[0][1] == Matriz[0][2] && Matriz[0][1] == Matriz[0][3])) {
            return 1;
        }
        
        if ((Matriz[1][0] == Matriz[1][1] && Matriz[1][0] == Matriz[1][2]) && (Matriz[1][1] == Matriz[1][2] && Matriz[1][1] == Matriz[1][3])) {
            return 2;
        }
        
        if ((Matriz[2][0] == Matriz[2][1] && Matriz[2][0] == Matriz[2][2]) && (Matriz[2][1] == Matriz[2][2] && Matriz[2][1] == Matriz[2][3])) {
            return 3;
        }
        
        if ((Matriz[3][0] == Matriz[3][1] && Matriz[3][0] == Matriz[3][2]) && (Matriz[3][1] == Matriz[3][2] && Matriz[3][1] == Matriz[3][3])) {
            return 4;
        }
        
    //Posiciones ganadoras verticales  
        if ((Matriz[0][0] == Matriz[1][0] && Matriz[0][0] == Matriz[2][0]) && (Matriz[1][0] == Matriz[2][0] && Matriz[1][0] == Matriz[3][0])) {
            return 5;
        }
        
        if ((Matriz[0][1] == Matriz[1][1] && Matriz[0][1] == Matriz[2][1]) && (Matriz[1][1] == Matriz[2][1] && Matriz[1][1] == Matriz[3][1])) {
            return 6;
        }
        
        if ((Matriz[0][2] == Matriz[1][2] && Matriz[0][2] == Matriz[2][2]) && (Matriz[1][2] == Matriz[2][2] && Matriz[1][2] == Matriz[3][2])) {
            return 7;
        }
        
        if ((Matriz[0][3] == Matriz[1][3] && Matriz[0][3] == Matriz[2][3]) && (Matriz[1][3] == Matriz[2][3] && Matriz[1][3] == Matriz[3][3])) {
            return 8;
        }
        
        //Posiciones ganadoras en diagonal
        if ((Matriz[0][0] == Matriz[1][1] && Matriz[0][0] == Matriz[2][2])&& (Matriz[1][1] == Matriz[2][2] && Matriz[1][1] == Matriz[3][3])) {
            return 9;
        }
        
        if ((Matriz[3][0] == Matriz[2][1] && Matriz[3][0] == Matriz[1][2]) && (Matriz[2][1] == Matriz[1][2] && Matriz[2][1] == Matriz[0][3])) {
            return 10;
        }

        return 0;
    }
    
    //Tablero 5X5
    // Posiciones ganadoras horizontales
    public int Resultado5x5(int Matriz [][]){
        if ((Matriz[0][0] == Matriz[0][1] && Matriz[0][0] == Matriz[0][2]) && (Matriz[0][1] == Matriz[0][2] && Matriz[0][1] == Matriz[0][3]) && (Matriz[0][2] == Matriz[0][3] && Matriz[0][2] == Matriz[0][4])) {
            return 1;
        }
        
        if ((Matriz[1][0] == Matriz[1][1] && Matriz[1][0] == Matriz[1][2]) && (Matriz[1][1] == Matriz[1][2] && Matriz[1][1] == Matriz[1][3]) && (Matriz[1][2] == Matriz[1][3] && Matriz[1][2] == Matriz[1][4])) {
            return 2;
        }
        
        if ((Matriz[2][0] == Matriz[2][1] && Matriz[2][0] == Matriz[2][2]) && (Matriz[2][1] == Matriz[2][2] && Matriz[2][1] == Matriz[2][3]) && (Matriz[2][2] == Matriz[2][3] && Matriz[2][2] == Matriz[2][4])) {
            return 3;
        }
        
        if ((Matriz[3][0] == Matriz[3][1] && Matriz[3][0] == Matriz[3][2]) && (Matriz[3][1] == Matriz[3][2] && Matriz[3][1] == Matriz[3][3]) && (Matriz[3][2] == Matriz[3][3] && Matriz[3][2] == Matriz[3][4])) {
            return 4;
        }
        
        if ((Matriz[4][0] == Matriz[4][1] && Matriz[4][0] == Matriz[4][2]) && (Matriz[4][1] == Matriz[4][2] && Matriz[4][1] == Matriz[4][3]) && (Matriz[4][2] == Matriz[4][3] && Matriz[4][2] == Matriz[4][4])) {
            return 5;
        }
        
    //Posiciones ganadoras verticales  
        if ((Matriz[0][0] == Matriz[1][0] && Matriz[0][0] == Matriz[2][0]) && (Matriz[1][0] == Matriz[2][0] && Matriz[1][0] == Matriz[3][0]) && (Matriz[2][0] == Matriz[3][0] && Matriz[2][0] == Matriz[4][0])) {
            return 6;
        }
        
        if ((Matriz[0][1] == Matriz[1][1] && Matriz[0][1] == Matriz[2][1]) && (Matriz[1][1] == Matriz[2][1] && Matriz[1][1] == Matriz[3][1]) && (Matriz[2][1] == Matriz[3][1] && Matriz[2][1] == Matriz[4][1])) {
            return 7;
        }
        
        if ((Matriz[0][2] == Matriz[1][2] && Matriz[0][2] == Matriz[2][2]) && (Matriz[1][2] == Matriz[2][2] && Matriz[1][2] == Matriz[3][2]) && (Matriz[2][2] == Matriz[3][2] && Matriz[2][2] == Matriz[4][2])) {
            return 8;
        }
        
        if ((Matriz[0][3] == Matriz[1][3] && Matriz[0][3] == Matriz[2][3]) && (Matriz[1][3] == Matriz[2][3] && Matriz[1][3] == Matriz[3][3]) && (Matriz[2][3] == Matriz[3][3] && Matriz[2][3] == Matriz[4][3])) {
            return 9;
        }
        
        if ((Matriz[0][4] == Matriz[1][4] && Matriz[0][4] == Matriz[2][4]) && (Matriz[1][4] == Matriz[2][4] && Matriz[1][4] == Matriz[3][4]) && (Matriz[2][4] == Matriz[3][4] && Matriz[2][4] == Matriz[4][4])) {
            return 10;
        }
        
        //Posiciones ganadoras en diagonal
        if ((Matriz[0][0] == Matriz[1][1] && Matriz[0][0] == Matriz[2][2]) && (Matriz[1][1] == Matriz[2][2] && Matriz[1][1] == Matriz[3][3]) && (Matriz[2][2] == Matriz[3][3] && Matriz[2][2] == Matriz[4][4])) {
            return 11;
        }
        
        if ((Matriz[4][0] == Matriz[3][1] && Matriz[4][0] == Matriz[2][2]) && (Matriz[3][1] == Matriz[2][2] && Matriz[3][1] == Matriz[1][3]) && (Matriz[2][2] == Matriz[1][3] && Matriz[2][2] == Matriz[0][4])) {
            return 12;
        }    
        return 0;
    }
    
    public boolean Empate3x3(boolean[][]matriz){
        
        for (int i = 0; i < matriz.length; i++){
        
            for (int j = 0; j < matriz.length; j++){
                
                if (matriz[i][j] = false){
                    
                    return true;
                    
                }
                
            }
            
        }
        
        return false;
        
    }
    
    public int Ejecutar3x3(javax.swing.JButton bt, int i, int j, int Matriz[][],javax.swing.JLabel jugadorX, javax.swing.JLabel jugadorO){
        Matriz[i][j]=getTurno();
        boolean[][] matriz =  new boolean[3][3];
        String nombreGanador;
        String n = new String();
        Jugador jugador = new Jugador ();
        if(getTurno()==0){
            n="X";
            nombreGanador=jugador.getNombre();
            bt.setForeground(Color.black);
        }else{
            n="O";
            bt.setForeground(Color.black);
        }
        Intercambiar();
        bt.setText(n);
        bt.setEnabled(false);

        if(Empate3x3(matriz)){
            
            JOptionPane.showMessageDialog(null, "Yempat");
            
        }else{
            
            if(Resultado3x3(Matriz)!=0){
            JOptionPane.showMessageDialog(null, "Ganaste jugador "+ n);
            if(getTurno()==1){
                setJugadorX(getJugadorX()+1);
                jugadorX.setText(String.valueOf(getJugadorX()));
            }
            if(getTurno()==0){
                setJugadorO(getJugadorO()+1);
                jugadorO.setText(String.valueOf(getJugadorO()));
            }
            return 1;
            
            }
        
        }
        
        return 0;
   
    }
    
    
    public void Rayar3x3(int Matriz[][], javax.swing.JPanel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado3x3(Matriz)==n){
            p.setVisible(true);
        }
    }
    
    public void Rayar3x3(int Matriz[][], javax.swing.JLabel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado3x3(Matriz)==n){
            p.setVisible(true);
        }
    }


    public int Ejecutar4x4(javax.swing.JButton bt, int i, int j, int Matriz[][],javax.swing.JLabel jugadorX, javax.swing.JLabel jugadorO){
        Matriz[i][j]=getTurno();
        String n = new String();
        if(getTurno()==0){
            n="X";
            bt.setForeground(Color.black);
        }else{
            n="O";
            bt.setForeground(Color.black);
        }
        Intercambiar();
        bt.setText(n);
        bt.setEnabled(false);
        
        if(Resultado4x4(Matriz)!=0){
            JOptionPane.showMessageDialog(null, "Ganaste jugador "+ n);
            if(getTurno()==1){
                setJugadorX(getJugadorX()+1);
                jugadorX.setText(String.valueOf(getJugadorX()));
            }
            if(getTurno()==0){
                setJugadorO(getJugadorO()+1);
                jugadorO.setText(String.valueOf(getJugadorO()));
            }
            return 1;
        }
        return 0;
    }
    
    public void Rayar4x4(int Matriz[][], javax.swing.JPanel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado4x4(Matriz)==n){
            p.setVisible(true);
        }
    }
    
    public void Rayar4x4(int Matriz[][], javax.swing.JLabel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado4x4(Matriz)==n){
            p.setVisible(true);
        }
    }
    
    public int Ejecutar5x5(javax.swing.JButton bt, int i, int j, int Matriz[][],javax.swing.JLabel jugadorX, javax.swing.JLabel jugadorO){
        Matriz[i][j]=getTurno();
        String n = new String();
        if(getTurno()==0){
            n="X";
            bt.setForeground(Color.black);
        }else{
            n="O";
            bt.setForeground(Color.black);
        }
        Intercambiar();
        bt.setText(n);
        bt.setEnabled(false);
        
        if(Resultado5x5(Matriz)!=0){
            JOptionPane.showMessageDialog(null, "Ganaste jugador "+n);
            if(getTurno()==1){
                setJugadorX(getJugadorX()+1);
                jugadorX.setText(String.valueOf(getJugadorX()));
            }
            if(getTurno()==0){
                setJugadorO(getJugadorO()+1);
                jugadorO.setText(String.valueOf(getJugadorO()));
            }
            return 1;
        }
        return 0;
    }
    
    public void Rayar5x5(int Matriz[][], javax.swing.JPanel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado5x5(Matriz)==n){
            p.setVisible(true);
        }
    }
    
    public void Rayar5x5(int Matriz[][], javax.swing.JLabel p, int n, int i, int j){
        Matriz[i][j]=getTurno();
        if(Resultado5x5(Matriz)==n){
            p.setVisible(true);
        }
    }
}
  