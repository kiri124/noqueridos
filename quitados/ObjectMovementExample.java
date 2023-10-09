package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectMovementExample extends JPanel implements ActionListener {
    private int circleX = 8; // Posición inicial en X del círculo
    private int circleY = 8; // Posición en Y del círculo
    private int circleRadius = 30; // Radio del círculo
    private int moveSpeed = 6; // Velocidad de movimiento del círculo

    public ObjectMovementExample() {
        Timer timer = new Timer(2, this); // Temporizador para animación
        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja el círculo en la posición actual
        g.setColor(Color.BLUE);
        g.fillOval(circleX, circleY, 2 * circleRadius, 2 * circleRadius);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Actualiza la posición del círculo (movimiento horizontal)
        circleX += moveSpeed;

        // Si el círculo llega al borde derecho, reinicia su posición a la izquierda
        if (circleX > getWidth()) {
            circleX = -circleRadius * 2;
        }

        repaint(); // Vuelve a dibujar el componente para mostrar la nueva posición
    }
}
