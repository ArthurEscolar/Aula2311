/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author 20221074010008
 */
public class Funcionario {
    
    public String nome;
    public String cpf;
    public double salario;

    public double getBonificacao() {
        return this.salario * .10;
    }
}
