-- phpMyAdmin SQL Dump
-- version 2.6.1
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tempo de Generação: Nov 10, 2010 at 08:41 PM
-- Versão do Servidor: 4.1.9
-- Versão do PHP: 4.3.10
-- 
-- Banco de Dados: `escola`
-- 
CREATE DATABASE `escola` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE escola;

-- --------------------------------------------------------

-- 
-- Estrutura da tabela `aluno`
-- 

CREATE TABLE `aluno` (
  `codaluno` int(10) NOT NULL default '0',
  `nomaluno` varchar(60) NOT NULL default '',
  PRIMARY KEY  (`codaluno`),
  KEY `nomalu` (`nomaluno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Cadastro de alunos da escola';

-- 
-- Extraindo dados da tabela `aluno`
-- 

INSERT INTO `aluno` VALUES (1, 'ALUNO1');
INSERT INTO `aluno` VALUES (2, 'ALUNO2');
INSERT INTO `aluno` VALUES (3, 'ALUNO3');
INSERT INTO `aluno` VALUES (4, 'ALUNO4');
INSERT INTO `aluno` VALUES (5, 'Aluno5');

-- --------------------------------------------------------

-- 
-- Estrutura da tabela `curso`
-- 

CREATE TABLE `curso` (
  `codcurso` int(10) NOT NULL auto_increment,
  `desccurso` varchar(60) NOT NULL default '',
  PRIMARY KEY  (`codcurso`),
  KEY `desccurso` (`desccurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='mantém cursos' AUTO_INCREMENT=1 ;

-- 
-- Extraindo dados da tabela `curso`
-- 


-- --------------------------------------------------------

-- 
-- Estrutura da tabela `funcionario`
-- 

CREATE TABLE `funcionario` (
  `codfuncionario` int(10) NOT NULL default '0',
  `nomfuncionario` varchar(50) NOT NULL default '',
  PRIMARY KEY  (`codfuncionario`),
  KEY `nomfuncionario` (`nomfuncionario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='mantém informações dos funcionarios';

-- 
-- Extraindo dados da tabela `funcionario`
-- 


-- --------------------------------------------------------

-- 
-- Estrutura da tabela `matricula`
-- 

CREATE TABLE `matricula` (
  `codmatricula` int(10) NOT NULL default '0',
  `codaluno` int(10) NOT NULL default '0',
  `codcurso` int(50) NOT NULL default '0',
  PRIMARY KEY  (`codmatricula`),
  KEY `codaluno` (`codaluno`),
  KEY `codcurso` (`codcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='mantém matriculas';

-- 
-- Extraindo dados da tabela `matricula`
-- 


-- --------------------------------------------------------

-- 
-- Estrutura da tabela `professor`
-- 

CREATE TABLE `professor` (
  `codprofessor` int(10) NOT NULL default '0',
  `nomprofessor` varchar(60) NOT NULL default '',
  PRIMARY KEY  (`codprofessor`),
  KEY `nomprofessor` (`nomprofessor`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='mantém informações do professor';

-- 
-- Extraindo dados da tabela `professor`
-- 

INSERT INTO `professor` VALUES (1, 'Alysson');
INSERT INTO `professor` VALUES (2, 'Mauricio');
INSERT INTO `professor` VALUES (3, 'Daniele');
INSERT INTO `professor` VALUES (4, 'Joao');
INSERT INTO `professor` VALUES (5, 'Mauricio');
INSERT INTO `professor` VALUES (6, 'Ricardo');
INSERT INTO `professor` VALUES (9, 'professor9');

-- --------------------------------------------------------

-- 
-- Estrutura da tabela `usuario`
-- 

CREATE TABLE `usuario` (
  `codusuario` int(10) NOT NULL default '0',
  `nomusuario` varchar(60) NOT NULL default '',
  `senhausuario` varchar(30) NOT NULL default '',
  PRIMARY KEY  (`nomusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='mantém informações do usuário';

-- 
-- Extraindo dados da tabela `usuario`
-- 

INSERT INTO `usuario` VALUES (1, 'usuario', 'usuario');

-- 
-- Constraints for dumped tables
-- 

-- 
-- Constraints for table `matricula`
-- 
ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_4` FOREIGN KEY (`codaluno`) REFERENCES `aluno` (`codaluno`) ON UPDATE CASCADE,
  ADD CONSTRAINT `matricula_ibfk_5` FOREIGN KEY (`codcurso`) REFERENCES `curso` (`codcurso`) ON UPDATE CASCADE;
        