/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author sonho
 */
public class RelatorioException extends Exception {
    public RelatorioException(){
        super("Produto não encontrado, tente novamente!");
    }
}
