/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.enumeraciones;

/**
 *
 * @author Facundo
 */
public enum Raza {
    BEAGLE(1243,"Beagle"), COCKER(5253,"Cocker"), PITBULL(1123,"Pitbul"), BORDER_COLLIE(3334,"Border Collie");
    
    private Integer codigo;
    private String valor;
    
    private Raza(Integer codigo, String valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
    
}
