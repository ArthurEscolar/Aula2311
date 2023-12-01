/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author 20221074010008
 */
public class Gerente {
    
    public static void main(String[] args) {
         app.Gerente gerente1 = new app.Gerente();
         gerente1.nome = "Ednaldo";
         gerente1.salario = 450.0;
         
         double bonificacao = gerente1.getBonificacao();
         System.out.println("Nome: "+gerente1.nome+"\nSalário: "+gerente1.salario+"\nBonificação: "+bonificacao);
    }
}
