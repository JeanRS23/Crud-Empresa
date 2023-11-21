package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    FuncionarioController funcionario = new FuncionarioController();

    public void executarMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            System.out.println("/------- Bem-Vindo -------/");
            System.out.println("/-------------------------/");
            System.out.println("/--------- Menu ----------/");
            System.out.println("/_________________________/");
            System.out.println("1- Cadastrar Funcionario  /");
            System.out.println("2- Listar Funcionario     /");
            System.out.println("3- Deletar Funcionario    /");
            System.out.println("4- Consultar Funcionario  /");
            System.out.println("5- Editar Funcionario     /");
            System.out.println("6- Sair                   /");
            System.out.println("/-------------------------/");

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Funcionario newFuncionario = new Funcionario();
                    newFuncionario.cadastrarFuncionario();
                    funcionario.cadastrarFuncionario(newFuncionario);
                    break;

                case 2:
                    System.out.println("/---- Listar Funcionarios -----/");
                    funcionario.listarFuncionarios();
                    break;

                case 3:
                    System.out.println("Informe o nome do ex-funcionario: ");
                    String nomeDelete = scanner.nextLine();
                    funcionario.deletarFuncionario(nomeDelete);
                    break;

                case 4:
                    System.out.println("Informe o nome que deseja pesquisar: ");
                    String nomePesquisado = scanner.nextLine();
                    funcionario.consultarFuncionario(nomePesquisado);
                    break;

                case 5:
                    System.out.println("Qual o nome que deseja alterar: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o valor do novo sobrenome: ");
                    String newSobrenome = scanner.nextLine();

                    funcionario.editarFuncionario(nome, newSobrenome);

                    break;

                case 6:
                    continuar = false;
                    break;
            }
        }
    }

}
