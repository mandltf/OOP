-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2025 at 07:32 AM
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
-- Database: `movie_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_film`
--

CREATE TABLE `data_film` (
  `ID` int(100) NOT NULL,
  `JUDUL` varchar(100) NOT NULL,
  `ALUR` double NOT NULL,
  `PENOKOHAN` double NOT NULL,
  `AKTING` double NOT NULL,
  `NILAI` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_film`
--

INSERT INTO `data_film` (`ID`, `JUDUL`, `ALUR`, `PENOKOHAN`, `AKTING`, `NILAI`) VALUES
(3, 'nanti kita cerita tentang hari ini', 4, 4, 4.1, 4.033333333333333),
(4, 'drawing closer', 5, 5, 4, 4.666666666666667);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_film`
--
ALTER TABLE `data_film`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_film`
--
ALTER TABLE `data_film`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
