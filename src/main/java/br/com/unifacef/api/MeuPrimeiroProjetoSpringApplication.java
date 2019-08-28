package br.com.unifacef.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.unifacef.utils.SenhaUtils;

@SpringBootApplication
public class MeuPrimeiroProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoSpringApplication.class, args);
		System.out.println("Alteramos o arquivo application.properties ");
		System.out.println("de modo que não precisemos configurar agora a fonte de dados do MySQL ");
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encosded: " + senhaEncoded);
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha encoded novamente:" + senhaEncoded);
			System.out.println("Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
		};
	}
}
