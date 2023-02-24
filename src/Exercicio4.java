/*

Faça um programa em JAVA declarando uma variável chamada nome,  e siga os seguintes passos:

1 – Atribua o valor “João” a esta variável
2 – Mostre o valor da variável nome em uma mensagem
3 – Mude o valor da variável nome para outro valor qualquer
4 - Mostre o valor da variável nome em uma mensagem seguindo o seguinte modelo
    O valor da variável é: <valor inserido no passo 3> 



*/


import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {
        String nome;
        nome = "João";
        JOptionPane.showMessageDialog(null, nome);
        nome = "Maria";
        JOptionPane.showMessageDialog(null, "O valor da variável é: " + nome);

    }

}










