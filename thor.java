package endgamepedri;

import java.awt.Color;

/**
 * Proyecto: Avengers EndGame Pixel
 * Autor: Luis Angel Castro Edison
 * Subclase Thor
 */
public class thor extends avenger {

    public thor(String nombre) {
        super(nombre);
    }

    @Override
    public String usarPoder() {
        return "🔨 Thor invoca el trueno.";
    }

    @Override
    public Color[][] getPixelArt() {
        Color BL = Color.BLUE;
        Color G = Color.GRAY;
        Color W = Color.WHITE;
        Color B = Color.BLACK;

        return new Color[][]{
            {B, B, BL, BL, BL, BL, B, B},
            {B, BL, W, W, W, W, BL, B},
            {BL, W, B, B, B, B, W, BL},
            {BL, W, W, W, W, W, W, BL},
            {BL, W, G, G, G, G, W, BL},
            {BL, W, G, G, G, G, W, BL},
            {B, BL, W, W, W, W, BL, B},
            {B, B, BL, B, B, BL, B, B}
        };
    }
}