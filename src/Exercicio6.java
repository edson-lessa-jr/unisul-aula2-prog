/*

5 - Fa�a um programa em JAVA, declarando uma vari�vel do tipo inteiro (int), 
atribua um valor qualquer a esta vari�vel, 
depois mostre o valor desta vari�vel em uma mensagem.

6 - Repita o exerc�cio anterior, mas agora mostre a mensagem abaixo:

O valor da vari�vel � : <n�mero escolhido>



*/


import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main(String[] args) {
	       int numero;
           numero = 10;		   
           JOptionPane.showMessageDialog(null, "O valor da vari�vel � : " + numero);
    }

}
