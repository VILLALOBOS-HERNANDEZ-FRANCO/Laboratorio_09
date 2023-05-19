/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class Arquero extends Personaje {
    
    private int agilidad;
    private int precision;

    /**
     * @return the precision
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * @param precision the precision to set
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }
    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        if(this.precision>5)
             atacado.setVida(nivelActualDeVida - 50);
        else
             atacado.setVida(nivelActualDeVida - 6);
        atacado.defender(this);
    }
    
}
