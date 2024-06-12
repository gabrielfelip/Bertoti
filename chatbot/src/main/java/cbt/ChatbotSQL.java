package main.java.cbt;


import java.util.Scanner;

public class ChatbotSQL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Chatbot SQL. Digite sua consulta em linguagem natural:");
        
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o Chatbot. Até mais!");
                break;
            }
            
            String sqlQuery = convertToSQL(input);
            System.out.println("Consulta SQL gerada: " + sqlQuery);
        }
        
        scanner.close();
    }

    private static String convertToSQL(String input) {
        // Lógica simples de conversão de linguagem natural para SQL
        input = input.toLowerCase();
        String sqlQuery = "";

        if (input.contains("clientes") && input.contains("todos")) {
            sqlQuery = "SELECT * FROM clientes;";
        } else if (input.contains("clientes") && input.contains("nome")) {
            sqlQuery = "SELECT nome FROM clientes;";
        } else if (input.contains("pedidos") && input.contains("todos")) {
            sqlQuery = "SELECT * FROM pedidos;";
        } else if (input.contains("pedidos") && input.contains("valor")) {
            sqlQuery = "SELECT valor FROM pedidos;";
        } else {
            sqlQuery = "Desculpe, não entendi sua consulta.";
        }

        return sqlQuery;
    }
}
