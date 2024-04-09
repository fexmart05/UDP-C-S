/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.udpserver;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket; 
/**
 *
 * @author federico
 */
public class UDPServer {
    private static final int PORT = 12345;
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            System.out.println("Server avviato e in ascolto sulla porta " + PORT);

            byte[] buffer = new byte[BUFFER_SIZE];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            while (true) {
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Messaggio ricevuto dal client: " + message);

                // Invia una risposta al client
                String replyMessage = "Risposta dal server: Messaggio ricevuto correttamente";
                byte[] replyBuffer = replyMessage.getBytes();
                DatagramPacket replyPacket = new DatagramPacket(replyBuffer, replyBuffer.length, packet.getAddress(), packet.getPort());
                socket.send(replyPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}