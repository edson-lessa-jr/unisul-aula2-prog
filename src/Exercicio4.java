/*

Fa�a um programa em JAVA declarando uma vari�vel chamada nome,  e siga os seguintes passos:

1 � Atribua o valor �Jo�o� a esta vari�vel
2 � Mostre o valor da vari�vel nome em uma mensagem
3 � Mude o valor da vari�vel nome para outro valor qualquer
4 - Mostre o valor da vari�vel nome em uma mensagem seguindo o seguinte modelo
    O valor da vari�vel �: <valor inserido no passo 3> 



*/
 

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static void main(String[] args) {
	       String nome;
           nome = "Jo�o";		   
           JOptionPane.showMessageDialog(null, nome);
		   nome = "Maria";
		   JOptionPane.showMessageDialog(null, "O valor da vari�vel �: " + nome);

    }

}










