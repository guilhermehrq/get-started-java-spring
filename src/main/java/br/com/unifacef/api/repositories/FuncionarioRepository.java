package br.com.unifacef.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.api.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	Funcionario findByCpf(String cpf);
}
