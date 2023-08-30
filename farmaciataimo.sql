-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 08, 2023 at 12:55 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farmaciataimo`
--

-- --------------------------------------------------------

--
-- Table structure for table `farmaceutico`
--

CREATE TABLE `farmaceutico` (
  `ID_Far` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Apelido` varchar(50) NOT NULL,
  `Idade` int(11) NOT NULL,
  `Celular` int(15) NOT NULL,
  `Senha` varchar(20) NOT NULL,
  `Sexo` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `farmaceutico`
--

INSERT INTO `farmaceutico` (`ID_Far`, `Nome`, `Apelido`, `Idade`, `Celular`, `Senha`, `Sexo`) VALUES
(2, 'taimo', 'meque', 120, 120, '120', 'Femenino');

-- --------------------------------------------------------

--
-- Table structure for table `hospital`
--

CREATE TABLE `hospital` (
  `ID_H` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Endereco` varchar(30) NOT NULL,
  `Celular` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `hospital`
--

INSERT INTO `hospital` (`ID_H`, `Nome`, `Endereco`, `Celular`) VALUES
(1, 'HCB', 'Beira43', 846100952),
(3, 'taimo', 'Beira', 87);

-- --------------------------------------------------------

--
-- Table structure for table `medicamento`
--

CREATE TABLE `medicamento` (
  `ID_Med` int(14) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Preco` double NOT NULL,
  `Quantidade` int(10) NOT NULL,
  `DataFabrica` varchar(15) NOT NULL,
  `DataExpira` varchar(15) NOT NULL,
  `Hospital` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicamento`
--

INSERT INTO `medicamento` (`ID_Med`, `Nome`, `Preco`, `Quantidade`, `DataFabrica`, `DataExpira`, `Hospital`) VALUES
(1, 'taimo', 10, 5, '07-04-2023', '06-04-2023', 'Hospital da Ponta Gea'),
(3, 'paretamol', 100, 80, '05-04-2023', '14-04-2023', 'Hospital Central da Beira');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `farmaceutico`
--
ALTER TABLE `farmaceutico`
  ADD PRIMARY KEY (`ID_Far`);

--
-- Indexes for table `hospital`
--
ALTER TABLE `hospital`
  ADD PRIMARY KEY (`ID_H`);

--
-- Indexes for table `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`ID_Med`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `farmaceutico`
--
ALTER TABLE `farmaceutico`
  MODIFY `ID_Far` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `hospital`
--
ALTER TABLE `hospital`
  MODIFY `ID_H` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `ID_Med` int(14) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
