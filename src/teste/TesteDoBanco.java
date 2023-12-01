/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;
/**
 *
 * @author 20221074010008
 */
public class TesteDoBanco {
    app.Banco meuBanco = new app.Banco();
    
    public void testa() {
        meuBanco.nome = "Caixa Economica";
        System.out.println(meuBanco.nome);
    }
}
