package endgamepedri;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Proyecto: Avengers EndGame Pixel
 * Autor: Luis Angel Castro Edison
 * Materia: Programación Orientada a Objetos
 */
public class Avengerinter extends JFrame {

    // ================= PANEL PIXEL =================
    class PixelPanel extends JPanel {

        private Color[][] sprite;

        public void setSprite(Color[][] sprite) {
            this.sprite = sprite;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (sprite != null) {
                int size = 40;

                for (int fila = 0; fila < sprite.length; fila++) {
                    for (int col = 0; col < sprite[fila].length; col++) {
                        g.setColor(sprite[fila][col]);
                        g.fillRect(
                                col * size + 250,
                                fila * size + 50,
                                size,
                                size
                        );

                        g.setColor(Color.DARK_GRAY);
                        g.drawRect(
                                col * size + 250,
                                fila * size + 50,
                                size,
                                size
                        );
                    }
                }
            }
        }
    }

    // ================= VARIABLES =================
    private PixelPanel panelPixel;
    private JLabel lblPoder;

    // ================= CONSTRUCTOR =================
    public Avengerinter() {
        setTitle("Avengers EndGame Pixel - Luis Angel Castro Edison");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // TITULO
        JLabel titulo = new JLabel(
                "AVENGERS ENDGAME",
                SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial Black", Font.BOLD, 30));
        titulo.setForeground(Color.RED);
        titulo.setBackground(Color.BLACK);
        titulo.setOpaque(true);

        add(titulo, BorderLayout.NORTH);

        // ================= PANEL PIXEL =================
        panelPixel = new PixelPanel();
        panelPixel.setBackground(Color.BLACK);
        add(panelPixel, BorderLayout.CENTER);

        // ================= TEXTO PODER =================
        lblPoder = new JLabel(
                "Selecciona un Avenger",
                SwingConstants.CENTER
        );

        lblPoder.setFont(new Font("Arial", Font.BOLD, 22));
        lblPoder.setForeground(Color.WHITE);
        lblPoder.setBackground(Color.BLACK);
        lblPoder.setOpaque(true);

        add(lblPoder, BorderLayout.SOUTH);

        // ================= PANEL BOTONES =================
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(1, 4));

        JButton iron = new JButton("Iron Man");
        JButton thor = new JButton("Thor");
        JButton hulk = new JButton("Hulk");
        JButton strange = new JButton("Strange");

        JButton[] botones = {iron, thor, hulk, strange};

        for (JButton b : botones) {
            b.setBackground(Color.BLACK);
            b.setForeground(Color.RED);
            b.setFont(new Font("Arial", Font.BOLD, 16));
            panelBotones.add(b);
        }

        add(panelBotones, BorderLayout.PAGE_END);

        // ================= IRON MAN =================
        iron.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avenger a = new ironman("Iron Man");
                panelPixel.setSprite(a.getPixelArt());
                lblPoder.setText(a.usarPoder());
            }
        });

        // ================= THOR =================
        thor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avenger a = new thor("Thor");
                panelPixel.setSprite(a.getPixelArt());
                lblPoder.setText(a.usarPoder());
            }
        });

        // ================= HULK =================
        hulk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avenger a = new hulk("Hulk");
                panelPixel.setSprite(a.getPixelArt());
                lblPoder.setText(a.usarPoder());
            }
        });

        // ================= DOCTOR STRANGE =================
        strange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                avenger a = new doctorstrange("Doctor Strange");
                panelPixel.setSprite(a.getPixelArt());
                lblPoder.setText(a.usarPoder());
            }
        });
    }

    // ================= MAIN =================
    public static void main(String[] args) {
        new Avengerinter().setVisible(true);
    }
}