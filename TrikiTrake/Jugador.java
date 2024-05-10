package TrikiTrake;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Jugador {
    
    private String nombre;
    private String signo;
    private Color color;

    public Jugador(String nombre, String signo, Color color) {
        this.nombre = nombre;
        this.signo = signo;
        this.color = color;
    }

    public Jugador() {
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void configurarJugador(Jugador jugador, String nombre, String colorSeleccionado, JLabel labelNombre, JLabel labelFicha) {
        
        if (nombre.isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Falta tu nombre.", "Ojo", JOptionPane.WARNING_MESSAGE);    
        } 
        else {
            
            jugador.setNombre(nombre);
            
            Color colorLabel = jugador.obtenerColorJugador(colorSeleccionado);
            
            labelFicha.setForeground(colorLabel);
            labelNombre.setText(jugador.getNombre());   
        }   
    }
    
    public Color obtenerColorJugador(String colorSeleccionado){
        
        Jugador jugador = new Jugador("", "", Color.black);
        
        Color colorFicha = Color.black;
        
        switch (colorSeleccionado) {
            
            case "Azul":
                colorFicha = new Color(0, 0, 204);
                break;
            
            case "Rojo":
                colorFicha = new Color(255, 0, 0);
                break;
            
            case "Verde":
                colorFicha = new Color(0,255,51);
                break;
            
            case "Naranja":
                colorFicha = new Color(255, 53, 0);
                break;
              
            default:
                break;     
        }
        return colorFicha;    
    } 
}