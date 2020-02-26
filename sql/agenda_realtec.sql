-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 26-Fev-2020 às 17:26
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `agenda_realtec`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `evento`
--

CREATE TABLE IF NOT EXISTS `evento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome_cantor` varchar(100) NOT NULL,
  `valor` double NOT NULL,
  `data` date NOT NULL,
  `hora_inicio` varchar(30) NOT NULL,
  `hora_fim` varchar(30) NOT NULL,
  `genero_show` varchar(50) NOT NULL,
  `show_principal` tinyint(1) NOT NULL,
  `informacao_geral` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=237 ;

--
-- Extraindo dados da tabela `evento`
--

INSERT INTO `evento` (`id`, `nome_cantor`, `valor`, `data`, `hora_inicio`, `hora_fim`, `genero_show`, `show_principal`, `informacao_geral`) VALUES
(165, 'teste 1', 9990.22, '2020-02-25', '02:00', '03:00', 'Blues', 0, 'dsadad'),
(166, 'teste 2', 99898, '2020-02-25', '01:30', '02:30', 'Blues', 0, 'dadas'),
(167, 'teste 3', 99898.99, '2020-02-25', '02:30', '02:30', 'Blues', 0, 'sadas'),
(168, 'teste 4', 8898.99, '2020-02-25', '01:30', '02:30', 'Country', 0, 'sdada'),
(169, 'teste 20/1', 99097, '2020-02-20', '01:30', '02:30', 'Blues', 0, 'dadada'),
(170, 'teste 11', 8898.99, '2020-02-25', '02:00', '03:00', 'Country', 1, 'adasdas'),
(171, 'teste 26 /1', 9980.99, '2020-02-26', '02:00', '03:00', 'Blues', 0, 'sadad'),
(172, 'teste 26/2', 99898.99, '2020-02-26', '02:30', '03:00', 'Blues', 0, 'dasda'),
(174, 'teste 27/1', 9989.99, '2020-02-27', '01:30', '01:30', 'Country', 0, 'asdas'),
(175, 'teste 27/2', 99899.99, '2020-02-27', '01:30', '02:00', 'Country', 0, 'dasda'),
(176, 'teste 28/1', 89878.99, '2020-02-28', '01:30', '02:30', 'Country', 0, 'asdasdas'),
(177, 'teste 28/2', 987678.99, '2020-02-28', '02:00', '01:30', 'Blues', 0, 'ssss'),
(178, 'teste 28/3', 6789.99, '2020-02-28', '02:00', '03:00', 'Axé', 1, 'dadasd'),
(179, 'teste 28/4', 34678.9, '2020-02-28', '02:00', '03:00', 'Country', 0, 'dasdsad'),
(180, 'teste 29/1', 2346, '2020-02-29', '02:30', '03:00', 'Country', 0, 'dasda'),
(181, 'teste 29/2', 6789, '2020-02-29', '02:00', '02:30', 'Blues', 1, 'dasda'),
(182, 'teste 24/1', 467.1, '2020-02-24', '03:00', '03:30', 'Country', 0, 'sdasda'),
(183, 'teste 24/2', 46789.99, '2020-02-24', '02:30', '03:00', 'Country', 1, 'jalsjdaljd'),
(184, 'teste 23/1', 87768.998, '2020-02-23', '01:30', '02:30', 'Country', 0, 'sadasd'),
(185, 'teste 23/2', 3242.32, '2020-02-23', '02:00', '02:00', 'Country', 1, 'xczcz'),
(186, 'teste 22/1', 7877.22, '2020-02-22', '02:00', '01:30', 'Country', 0, 'sdaasd'),
(187, 'teste 22/2', 9989, '2020-02-22', '02:00', '02:30', 'Blues', 0, 'dasdas'),
(188, 'teste 22/3', 9989.99, '2020-02-22', '02:00', '03:30', 'Country', 1, 'dasdas'),
(189, 'teste 21/1', 99823.2, '2020-02-21', '01:30', '01:30', 'Blues', 0, 'dasdasd'),
(190, 'teste 19/1', 78879.22, '2020-02-19', '02:30', '03:00', 'Country', 0, 'adas'),
(191, 'teste 19/2', 8898111.11, '2020-02-19', '01:00', '02:30', 'Country', 1, 'dasda'),
(192, 'teste 18/1', 8898.99, '2020-02-18', '02:30', '03:00', 'Axé', 0, 'jklkjl'),
(193, 'teste 18/1', 789.3, '2020-02-18', '02:30', '03:00', 'Country', 1, 'dada'),
(194, 'teste 18/2', 6789.2, '2020-02-18', '03:00', '03:30', 'Blues', 0, 'asdasda'),
(195, 'teste 18/4', 3445.21, '2020-02-18', '01:30', '01:30', 'Blues', 0, 'dsada'),
(196, 'teste 18/5', 8789.3, '2020-02-18', '02:30', '03:00', 'Axé', 0, 'dasdas'),
(197, 'teste 17/1', 8898.33, '2020-02-17', '02:00', '02:30', 'Blues', 0, 'asdsad'),
(198, 'teste 17/2', 7887.3, '2020-02-17', '02:00', '03:30', 'Country', 1, 'dasda'),
(199, 'teste 17/3', 5676.99, '2020-02-17', '00:30', '01:00', 'Blues', 0, 'dadasda'),
(200, '16/1', 8889.22, '2020-02-16', '01:30', '02:30', 'Country', 0, 'sadada'),
(201, 'teste 16/2', 66763.33, '2020-02-16', '02:00', '03:00', 'Country', 0, 'asdsada'),
(202, 'teste 16/3', 32423.534, '2020-02-16', '02:00', '02:00', 'Country', 1, 'dsadsa'),
(203, 'teste 15/1', 77767.22, '2020-02-15', '02:00', '03:00', 'Country', 0, 'dsfsdf'),
(204, 'teste 15/2', 88733.2, '2020-02-15', '02:00', '03:00', 'Blues', 1, 'dasdas'),
(205, 'teste 14/1', 77657.9, '2020-02-14', '01:30', '03:00', 'Country', 0, 'dsada'),
(206, 'teste 13/1', 88789, '2020-02-13', '02:00', '03:00', 'Eletrônica', 0, 'sdasda'),
(207, 'teste 13/2', 98998.99, '2020-02-13', '03:00', '03:30', 'Eletrônica', 0, 'sadasdas'),
(208, 'teste 13/5', 987678.99, '2020-02-13', '01:30', '02:30', 'Eletrônica', 1, 'sda'),
(209, 'teste 13/6', 2324.32, '2020-02-13', '02:00', '02:00', 'Country', 0, 'dsadas'),
(210, 'teste 12/1', 9992.22, '2020-02-12', '02:00', '03:00', 'Blues', 0, 'sadsad'),
(211, 'teste 12/2', 88783.22, '2020-02-12', '03:00', '02:30', 'Country', 0, 'dsadas'),
(212, 'teste 12/3', 3432.32, '2020-02-12', '01:30', '02:00', 'Country', 1, 'weqewq'),
(213, 'teste 11/1', 8898.999, '2020-02-11', '01:30', '02:30', 'Country', 0, 'dsada'),
(214, 'teste 11/2', 9993.33, '2020-02-11', '02:00', '02:00', 'Country', 0, 'dadasda'),
(215, 'teste 11/1', 56678.33, '2020-02-11', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(216, 'teste 11/1', 9999.33, '2020-02-11', '01:30', '02:00', 'Blues', 0, 'weq'),
(217, 'teste 11/11', 88988.33, '2020-02-11', '01:30', '02:30', 'Country', 1, 'fsdfsd'),
(218, 'teste 11/11', 9999.4, '2020-02-11', '01:30', '01:00', 'Blues', 0, 'sdadas'),
(219, 'teste 10/1', 9990, '2020-02-10', '02:00', '02:30', 'Axé', 1, 'dasda'),
(220, 'teste 10/2', 9932.2, '2020-02-10', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(221, 'teste 9/1', 89893.33, '2020-02-09', '01:30', '02:30', 'Country', 0, 'fdsfsd'),
(222, 'teste 9/2', 77873.33, '2020-02-09', '02:00', '03:00', 'Country', 0, 'dasdsad'),
(223, 'teste 9/3', 324234.42, '2020-02-09', '02:00', '02:30', 'Blues', 1, 'dsadas'),
(224, 'teste 8/1', 87678.22, '2020-02-08', '02:30', '03:30', 'Country', 0, 'dasdsad'),
(225, 'teste 8/2', 8333.22, '2020-02-08', '02:00', '03:00', 'Country', 1, 'dasd'),
(226, 'teste 7/1', 88833.32, '2020-02-07', '02:00', '03:00', 'Country', 1, 'dadas'),
(227, 'teste 7/2', 8797423.32, '2020-02-07', '02:30', '03:00', 'Eletrônica', 0, 'dasasd'),
(228, 'teste 27/2', 99899.99, '2020-02-27', '01:30', '02:00', 'Country', 1, 'dasda'),
(229, 'teste 10/2', 9932.2, '2020-02-10', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(230, 'teste 10/2', 9932.2, '2020-02-10', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(231, 'teste 10/1', 9990, '2020-02-10', '02:00', '02:30', 'Axé', 0, 'dasda'),
(232, 'teste 10/2', 9932.2, '2020-02-10', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(233, 'teste 10/2', 9932.2, '2020-02-10', '02:00', '03:00', 'Blues', 0, 'dadasd'),
(234, 'teste 1/1', 1342.23, '2020-03-01', '01:30', '02:30', 'Country', 1, 'sdad'),
(235, 'teste1/3', 6577889.99, '2020-03-01', '02:00', '03:00', 'Eletrônica', 0, 'dasdasdsa'),
(236, 'teste 26/5', 42342.5, '2020-02-26', '02:00', '02:30', 'Country', 1, 'sdfdsf');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
