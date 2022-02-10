package com.github.KubanD936.pokedex;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server;

    public Server(int port) {
        try {
        server = new ServerSocket(port);

        public void run (Pokedex pokedex){
            while (server.isBound()) {
                try {
                    Socket socket = server.accept();
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), autoFlush: true);
                    out.println("HTTP1.1 200 Ok");
                    out.println();
                    out.println("<html>\n" +
                            "    <body>\n" +
                            "        <ul>");
                    for (String pokemon : pokedex.pokemans) ;
                    out.println("<li>" + pokemon + "</li>");
                }
                out.println("</ul></body></html>");
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}