/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package init;
import teste.TesteDoBanco;
import teste.TesteDoCliente;
/**
 *
 * @author 20221074010008
 */
public class Init {
    public static void main(String[] args) {
        
        TesteDoBanco meuBanco = new TesteDoBanco();
        meuBanco.testa();
        
        TesteDoCliente meuCliente = new TesteDoCliente();
        meuCliente.testa();
        
    }
}
