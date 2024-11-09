import javax.swing.*;
import java.awt.*;

public class MenuVentanas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame con Dos Ventanas");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        // Panel izquierdo
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new GridLayout(3, 1));
        JButton boton1 = new JButton("Bot\u00F3n 1");
        JButton boton2 = new JButton("Bot\u00F3n 2");
        JButton boton3 = new JButton("Bot\u00F3n 3");
        panelIzquierdo.add(boton1);
        panelIzquierdo.add(boton2);
        panelIzquierdo.add(boton3);

        // Panel derecho
        JPanel panelDerecho = new JPanel();
        panelDerecho.setLayout(new GridLayout(3, 1));
        JButton boton4 = new JButton("Bot\u00F3n 4");
        JButton boton5 = new JButton("Bot\u00F3n 5");
        JButton boton6 = new JButton("Bot\u00F3n 6");
        panelDerecho.add(boton4);
        panelDerecho.add(boton5);
        panelDerecho.add(boton6);

        // Añadir los paneles al frame
        frame.add(panelIzquierdo);
        frame.add(panelDerecho);

        frame.setVisible(true);
    }
}
