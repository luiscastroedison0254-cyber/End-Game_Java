package endgamepedri;

import java.awt.Color;

/**
 * Proyecto: Avengers EndGame Pixel
 * Autor: Luis Angel Castro Edison
 * Subclase Hulk
 */
public class hulk extends avenger {

    public hulk(String nombre) {
        super(nombre);
    }

    @Override
    public String usarPoder() {
        return "💥 Hulk aplasta todo.";
    }

    @Override
    public Color[][] getPixelArt() {
        Color G = Color.GREEN;
        Color P = new Color(128, 0, 128);
        Color B = Color.BLACK;
        Color W = Color.WHITE;

        return new Color[][]{
            {B, B, G, G, G, G, B, B},
            {B, G, G, W, W, G, G, B},
            {G, G, W, B, B, W, G, G},
            {G, W, W, W, W, W, W, G},
            {G, W, P, P, P, P, W, G},
            {G, W, P, P, P, P, W, G},
            {B, G, W, W, W, W, G, B},
            {B, B, G, B, B, G, B, B}
        };
    }
}