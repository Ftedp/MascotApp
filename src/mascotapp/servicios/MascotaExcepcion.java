/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

/**
 *
 * @author Facundo
 */
public class MascotaExcepcion extends Exception {

    /**
     * Creates a new instance of <code>MascotaExcepcion</code> without detail
     * message.
     */
    public MascotaExcepcion() {
    }

    /**
     * Constructs an instance of <code>MascotaExcepcion</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MascotaExcepcion(String msg) {
        super(msg);
    }
}
