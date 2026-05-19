package endgamepedri;

import java.awt.Color;

/**
 * Proyecto: Avengers EndGame Pixel
 * Autor: Luis Angel Castro Edison
 * Clase Base para los Avengers
 */
public class avenger {

    protected String nombre;

    public avenger(String nombre) {
        this.nombre = nombre;
    }

    public String usarPoder() {
        return nombre + " usa un poder.";
    }

    // MATRIZ PIXEL
    public Color[][] getPixelArt() {
        return null;
    }
}