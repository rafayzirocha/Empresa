package com.company;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        Funcionario func  = new Funcionario(0.0,0,null,0);

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe: \n1 - Cadastrar Funcionário \n2 - Calcular Impostos \n3 - Calcular Salário Líquido \n4 - Exibir Resultado \n0 - Sair "));

            switch (op){
                case 1:
                    func.cadastrarFuncionario();
                    break;
                case 2:
                    func.calcularImpostos();
                    break;
                case 3:
                    func.calcularSalarioLiquido();
                    break;
                case 4:
                    func.imprimirDados();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(
                            null, "Finalizando o programa..." );
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null, "Opção Inválida..." );
                    break;
            }
        }
        while(op!=0);
    }
}