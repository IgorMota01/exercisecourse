package com.exercise.aplication;

import com.exercise.entities.Cliente;
import com.exercise.entities.Order;
import com.exercise.entities.OrderItem;
import com.exercise.entities.Produto;
import com.exercise.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        OrderItem produtos = new OrderItem();
        Order pedido = new Order();

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Nascimento (DD/MM/AAAA): ");
        Date dataNascimento = sdf.parse(sc.next());
        Cliente cliente = new Cliente(nome, email, dataNascimento);
        System.out.println("Digite o status do pedido: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus.valueOf(status);

        System.out.println();
        System.out.print("Quantos itens ira digitar ?");
        int qtItens = sc.nextInt();

        for (int i = 0; i < qtItens; i++) {
            System.out.println("Digite o item #" + i + 1);
            sc.nextLine();
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preco do produto: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int qtProduto = sc.nextInt();
            produtos = new OrderItem(qtProduto, precoProduto, new Produto(nomeProduto, precoProduto));
        }
        pedido.addItem(produtos);

        System.out.println();
        System.out.println("--- RESUMO DO PEDIDO ---");
        System.out.println("Horario do pedido: " + dataAtual.format(new Date()));
        System.out.println("Status do pedido: " + status);
        System.out.println(cliente);
        System.out.println(produtos);
        System.out.println(pedido.total());



    }
}