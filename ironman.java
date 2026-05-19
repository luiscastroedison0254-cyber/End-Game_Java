package endgamepedri;

import java.awt.Color;

/**
 * Proyecto: Avengers EndGame Pixel
 * Autor: Luis Angel Castro Edison
 * Subclase Iron Man
 */
public class ironman extends avenger {

    public ironman(String nombre) {
        super(nombre);
    }

    @Override
    public String usarPoder() {
        return "⚡ Iron Man dispara rayos repulsores.";
    }

    @Override
    public Color[][] getPixelArt() {
        Color R = Color.RED;
        Color Y = Color.YELLOW;
        Color B = Color.BLACK;
        Color C = Color.CYAN;

        return new Color[][]{
            {B, B, R, R, R, R, B, B},
            {B, R, R, Y, Y, R, R, B},
            {R, R, Y, Y, Y, Y, R, R},
            {R, Y, Y, B, B, Y, Y, R},
            {R, Y, B, C, C, B, Y, R},
            {R, Y, Y, Y, Y, Y, Y, R},
            {B, R, R, Y, Y, R, R, B},
            {B, B, R, B, B, R, B, B}
        };
    }
}