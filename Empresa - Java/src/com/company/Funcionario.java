package com.company;

import javax.swing.*;

public class Funcionario {
    private double horasTrabalhadas, salarioHora;
    private String nome;
    private int numDependente;
    double salarioLiquido, inss, ir, salarioBruto;

    public Funcionario(double horasTrabalhadas, double salarioHora, String nome, int numDependente) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.nome = nome;
        this.numDependente = numDependente;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumDependente() {
        return numDependente;
    }

    public void setNumDependente(int numDependente) {
        this.numDependente = numDependente;
    }

    public void cadastrarFuncionario() {
        this.nome = (JOptionPane.showInputDialog("Digite o nome: "));
        this.numDependente = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de dependentes: "));
        this.horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe o total de horas trabalhadas: "));
        this.salarioHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario por hora: "));
    }

    public void calcularImpostos() {
        this.salarioBruto = this.horasTrabalhadas * this.salarioHora + (50 * this.numDependente);

        if (this.salarioBruto <= 1000)
            this.inss = this.salarioBruto * 8.5 / 100;
        else {
            this.inss = this.salarioBruto * 9 / 100;
        }
        JOptionPane.showMessageDialog(null, "Total do INSS: " + this.inss);

        if (this.salarioBruto <= 500)
            this.ir = 0;
        else if (this.salarioBruto > 500 && this.salarioBruto <= 1000) {
            this.ir = this.salarioBruto * 5 / 100;
        } else {
            this.ir = this.salarioBruto * 7 / 100;
        }
        JOptionPane.showMessageDialog(null, "Total do Imposto de Renda: " + this.ir);
    }

    public void calcularSalarioLiquido() {
        this.salarioLiquido = (this.salarioBruto - this.inss) - this.ir;
        JOptionPane.showMessageDialog(null, "O salário liquido é: " + this.salarioLiquido);
    }

    public void imprimirDados() {
        JOptionPane.showMessageDialog(null,
                "Nome: " + this.nome
                        + "\nNúmero de dependentes: " + this.numDependente
                        + "\nTotal de horas trabalhadas: " + this.horasTrabalhadas
                        + "\nSalário por hora: " + this.salarioHora
                        + "\nSalário Bruto: " + this.salarioBruto
                        + "\nTotal do INSS: " + this.inss
                        + "\nTotal do Imposto de Renda: " + this.inss
                        + "\nSalário Líquido: " + this.salarioLiquido
        );
    }
}