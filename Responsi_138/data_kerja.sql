-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2025 at 07:29 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kerja`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_kerja`
--

CREATE TABLE `data_kerja` (
  `ID` int(11) NOT NULL,
  `NAMA` varchar(100) NOT NULL,
  `UNIT` int(11) NOT NULL,
  `JAM_KERJA` int(11) NOT NULL,
  `TENAGA_KERJA` int(11) NOT NULL,
  `BIAYA` int(11) NOT NULL,
  `BIAYA_TENAGA_KERJA` int(11) NOT NULL,
  `EFISIENSI` int(11) NOT NULL,
  `TOTAL` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_kerja`
--

INSERT INTO `data_kerja` (`ID`, `NAMA`, `UNIT`, `JAM_KERJA`, `TENAGA_KERJA`, `BIAYA`, `BIAYA_TENAGA_KERJA`, `EFISIENSI`, `TOTAL`) VALUES
(1, 'kertas', 2, 5, 5, 5000, 375000, 8, 380000),
(2, 'kursi', 7, 8, 9, 5000, 1080000, 9, 1085000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_kerja`
--
ALTER TABLE `data_kerja`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_kerja`
--
ALTER TABLE `data_kerja`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
