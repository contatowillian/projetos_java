-- --------------------------------------------------------
-- Servidor:                     localhost
-- Versão do servidor:           5.5.23 - MySQL Community Server (GPL)
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              8.0.0.4396
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura para tabela projeto_java.aluno
CREATE TABLE IF NOT EXISTS `aluno` (
  `codaluno` int(10) NOT NULL DEFAULT '0',
  `nomaluno` varchar(60) NOT NULL DEFAULT '',
  PRIMARY KEY (`codaluno`),
  KEY `nomalu` (`nomaluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Cadastro de alunos da escola';

-- Copiando dados para a tabela projeto_java.aluno: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` (`codaluno`, `nomaluno`) VALUES
	(1, 'ALUNO1'),
	(2, 'ALUNO2'),
	(3, 'ALUNO3'),
	(4, 'ALUNO4'),
	(5, 'Aluno5');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;


-- Copiando estrutura para tabela projeto_java.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `codcurso` int(10) NOT NULL AUTO_INCREMENT,
  `desccurso` varchar(60) NOT NULL DEFAULT '',
  PRIMARY KEY (`codcurso`),
  KEY `desccurso` (`desccurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='mantém cursos';

-- Copiando dados para a tabela projeto_java.curso: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;


-- Copiando estrutura para tabela projeto_java.funcionario
CREATE TABLE IF NOT EXISTS `funcionario` (
  `codfuncionario` int(10) NOT NULL DEFAULT '0',
  `nomfuncionario` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`codfuncionario`),
  KEY `nomfuncionario` (`nomfuncionario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='mantém informações dos funcionarios';

-- Copiando dados para a tabela projeto_java.funcionario: 0 rows
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;


-- Copiando estrutura para tabela projeto_java.matricula
CREATE TABLE IF NOT EXISTS `matricula` (
  `codmatricula` int(10) NOT NULL DEFAULT '0',
  `codaluno` int(10) NOT NULL DEFAULT '0',
  `codcurso` int(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`codmatricula`),
  KEY `codaluno` (`codaluno`),
  KEY `codcurso` (`codcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='mantém matriculas';

-- Copiando dados para a tabela projeto_java.matricula: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;


-- Copiando estrutura para tabela projeto_java.professor
CREATE TABLE IF NOT EXISTS `professor` (
  `codprofessor` int(10) NOT NULL DEFAULT '0',
  `nomprofessor` varchar(60) NOT NULL DEFAULT '',
  PRIMARY KEY (`codprofessor`),
  KEY `nomprofessor` (`nomprofessor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='mantém informações do professor';

-- Copiando dados para a tabela projeto_java.professor: 7 rows
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` (`codprofessor`, `nomprofessor`) VALUES
	(1, 'Alysson'),
	(2, 'Mauricio'),
	(3, 'Daniele'),
	(4, 'Joao'),
	(5, 'Mauricio'),
	(6, 'Ricardo'),
	(9, 'professor9');
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;


-- Copiando estrutura para tabela projeto_java.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `sexo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela projeto_java.usuario: ~159 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`id`, `nome`, `cpf`, `email`, `telefone`, `senha`, `login`, `status`, `sexo`) VALUES
	(1, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '123456', 'Willian', 0, NULL),
	(2, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(7, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(8, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(9, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(10, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(11, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(12, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(13, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(14, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(16, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(17, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(18, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(19, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(20, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(21, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(22, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(23, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(24, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(25, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(26, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(27, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(28, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(29, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(30, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(31, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(32, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(33, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(34, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(35, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(36, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(37, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(38, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(39, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(40, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(41, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(42, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(43, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(44, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(45, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(46, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(47, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(48, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(49, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(50, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(51, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(52, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(53, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(54, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(55, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(56, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(57, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(58, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(59, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(60, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(61, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(62, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(63, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(64, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(65, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(66, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(67, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(68, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(69, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(70, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(71, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(72, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(73, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(74, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(75, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(76, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(77, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(78, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(79, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(80, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(81, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(82, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(83, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(84, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(85, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(86, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(87, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(88, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(89, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(90, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(91, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(92, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(93, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(94, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(95, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(96, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(97, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(98, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(99, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(100, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(101, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(102, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(103, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(104, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(105, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(106, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(107, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(108, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(109, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(110, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(111, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(112, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(113, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(114, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(115, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(116, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(117, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(118, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(119, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(120, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(121, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(122, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(123, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(124, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(125, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(126, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(127, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(128, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(129, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(130, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(131, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(132, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(133, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(134, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(135, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(136, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(137, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(138, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(139, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(140, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(141, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(142, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(143, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(144, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(145, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(146, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(147, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(148, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(149, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(150, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(151, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(152, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(153, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(154, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(155, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(156, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(157, 'Willian Batista Domingos', '372.712.878-09', 'contatowillian@mgial.com', '(011)96139-0801', '', '', 0, NULL),
	(158, 'Marcio ', 'dasdsadasd', 'dsad', 'sadsad', '', '', 1, NULL),
	(159, 'Maria da Silva', '378.987.987-09', 'maria@teste.com.br', '(011)96859-0801', '', '', 0, NULL),
	(160, 'Julio Prestes', '920.234.234-09', 'julio_prestes@teste.com.br', '(011)98547-9658', '', '', 0, NULL),
	(161, 'Willian Thomas Batista', '321321321321321', 'contatowilllian@gmail.com', '32132132132', '', '', 0, NULL),
	(162, 'Teste Willian', '372.712.878-09', 'contatowillian@gmail.com', '3213213213', NULL, NULL, 0, '3213213213'),
	(163, 'sadsadsadsa', '213.213.213-12', '111111111', '111111111111', NULL, NULL, 0, 'Feminino'),
	(164, 'dasdas', '546.546.546-54', 'contatowill@gmail.com', '123213213213', NULL, NULL, 0, 'Masculino');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
