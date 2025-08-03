package br.com.basketballclub.model;

import java.util.Random;
import java.time.LocalDateTime;

public interface IUsuario {
	String id = gerarId();
	LocalDateTime criacaoConta = LocalDateTime.now();
	
	private static String gerarId() {
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(indice));
        }

        return sb.toString();
	}
}
