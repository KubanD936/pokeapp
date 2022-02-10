package com.github.KubanD936.pokedex;

public class App {
	public static void main(String[] args) {
		String filename = args[0];
		Pokedex pokedex = new Pokedex(filename);
		Server server = new Server(8080);
		server.run(pokedex);
	}
}
