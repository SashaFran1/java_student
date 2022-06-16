package ru.gb.radyuk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    private static DataInputStream in;
    private static DataOutputStream out;

    public static void main(String[] args) {
        EchoServer.start();
    }

    private static void start() {
        new Thread(() -> {
            try (ServerSocket serverSocket = new ServerSocket(5555)) {
                System.out.println("Ждём подключения клиента...");
                Socket socket = serverSocket.accept();
                System.out.println("Клиент подключился");
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
                while (true) {
                    String message = in.readUTF();
                    if ("/end".equalsIgnoreCase(message)) {
                        out.writeUTF("/end");
                        closeConnection();
                        break;
                    }
                    System.out.println("Сообщение от клиента: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            sendMessage(scanner.nextLine());
        }
    }

    private static void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeConnection() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.exit(1);
    }
}

