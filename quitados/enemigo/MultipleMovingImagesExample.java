package enemigo;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class MultipleMovingImagesExample  extends j {
    private List<ImageObject> images = new ArrayList<>(); // Lista de objetos de imagen

    public MultipleMovingImagesExample() {
        // Carga las imágenes desde archivos y configura sus posiciones iniciales
        try {
            images.add(new ImageObject("enemy.png", 50, 50, 5));
            images.add(new ImageObject("enemy.png", 100, 100, 3));
            images.add(new ImageObject("enemy.png", 120, 120, 3));

            // Agrega más imágenes según sea necesario
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage map = null;
        try {
            map = ImageIO.read(new File("maps/map03.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Divide el mapa de bits en baldosas (cada baldosa es una imagen)


        // Inicia un temporizador para actualizar el movimiento de las imágenes
        Timer timer = new Timer(20, e -> {
            for (ImageObject image : images) {
                image.move(); // Mueve cada imagen en la lista
            }

            repaint(); // Vuelve a dibujar el componente para mostrar las nuevas posiciones
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibuja cada imagen en su posición actual
        for (ImageObject image : images) {
            g.drawImage(image.getImage(), image.getX(), image.getY(), this);
        }
    }

    private class ImageObject {
        private BufferedImage image;
        private int x;
        private int y;
        private int moveSpeed;

        public ImageObject(String imagePath, int x, int y, int moveSpeed) throws IOException {
            this.image = ImageIO.read(new File(imagePath));
            this.x = x;
            this.y = y;
            this.moveSpeed = moveSpeed;
        }

        public void move() {
            x += moveSpeed; // Mueve la imagen hacia la derecha

            // Si la imagen sale de la ventana, reinicia su posición a la izquierda
            if (x > getWidth()) {
                x = -image.getWidth();
            }
        }

        public BufferedImage getImage() {
            return image;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

  /*



   public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Moving Images Example");
        MultipleMovingImagesExample panel = new MultipleMovingImagesExample();

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }*/
}
