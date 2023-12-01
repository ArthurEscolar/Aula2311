/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author 20221074010008
 */
public class TesteDoCliente {
    app.Cliente meuCliente = new app.Cliente();
    
    public void testa() {
        meuCliente.nome = "Arthur";
        meuCliente.endereco = "rua X";
        
        System.out.println(meuCliente.nome);
        System.out.println(meuCliente.endereco);
    }
}
