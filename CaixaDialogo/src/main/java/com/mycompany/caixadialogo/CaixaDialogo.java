/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixadialogo;


import javax.swing.JOptionPane;


public class CaixaDialogo {

    
  public static void main(String[] args) {

    // JOptionPane.showMessageDialog(null, "Hello World Turma!");

    double peso;

    double altura;

    double imc;

    String nome;

    String mensagem = "";

   
    nome = JOptionPane.showInputDialog("Digite seu nome: ");


    peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: ")); 


    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));


    imc = peso / (altura * altura);


    if( imc < 18.5) {

      mensagem = nome + " você esta muito magro. \n Precisa de uma dieta para engordar.";

    } else if (imc < 24.9) {

      mensagem = nome + " você esta no peso ideal. \n Não precisa de dieta";

    } else if (imc < 29.9) {

      mensagem = nome + " voce esta com sobrepeso. \n Precisa de uma dieta para emagrecer";

    } else {

      mensagem = nome + " voce esta com obesidade grave. \n Precisa de um médico";

    }

     

    JOptionPane.showMessageDialog(null, mensagem);

     

  }

   

}
