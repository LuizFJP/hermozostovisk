/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author sonho
 */
public class CadastroException extends Exception{
    public CadastroException(){
        super("Produto já existe no sistema");
 }
}
