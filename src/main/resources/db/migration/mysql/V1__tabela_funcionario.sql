CREATE TABLE `funcionario` (
`id` bigint(20) NOT NULL,
`nome` varchar(255) NOT NULL,
`email` varchar(255) NOT NULL,
`senha` varchar(255) NOT NULL,
`cpf` varchar(255) NOT NULL,
`valor_hora` bigint NOT NULL,
`qtd_horas_trabalho_dia` decimal(7,2) NOT NULL,
`qtd_horas_almoco` decimal(7,2) NOT NULL,
`perfil` varchar(255) NOT NULL,
`data_atualizacao` datetime NOT NULL,
`data_criacao` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE `funcionario`
ADD PRIMARY KEY (`id`);

ALTER TABLE `funcionario`
MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
