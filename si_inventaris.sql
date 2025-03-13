-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 18, 2024 at 08:29 AM
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
-- Database: `si_inventaris`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `Id_barang` char(12) NOT NULL,
  `Nama_barang` varchar(30) NOT NULL,
  `Sku` char(15) NOT NULL,
  `Kategori` varchar(20) NOT NULL,
  `Harga` int(20) NOT NULL,
  `Jml_stok` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`Id_barang`, `Nama_barang`, `Sku`, `Kategori`, `Harga`, `Jml_stok`) VALUES
('B01', 'ambalabu', 'akhdhakwhwkah', 'Peralatan Rmh Tangga', 1000000, 103010);

-- --------------------------------------------------------

--
-- Table structure for table `laporan`
--

CREATE TABLE `laporan` (
  `Id_laporan` char(12) NOT NULL,
  `Tipe_laporan` enum('pengguna','transaksi','barang','') NOT NULL,
  `Generated_at` date NOT NULL,
  `Id_user` char(12) NOT NULL,
  `Report_file` varchar(30) NOT NULL,
  `Remarks` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `Id_transaksi` char(12) NOT NULL,
  `Id_barang` char(12) NOT NULL,
  `Id_user` char(12) NOT NULL,
  `Tipe_transaksi` enum('Penambahan','Pengurangan') NOT NULL,
  `quantity` int(12) NOT NULL,
  `Tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`Id_transaksi`, `Id_barang`, `Id_user`, `Tipe_transaksi`, `quantity`, `Tanggal`) VALUES
('T01', 'B01', 'U02', 'Penambahan', 1000, '2024-11-11'),
('T02', 'B01', 'U06', 'Penambahan', 2000, '2024-11-11'),
('T03', 'B01', 'U05', 'Penambahan', 1010, '2024-11-17');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Id_user` char(12) NOT NULL,
  `Username` varchar(12) NOT NULL,
  `Password` varchar(64) NOT NULL,
  `Role` varchar(20) NOT NULL,
  `Contact_Info` varchar(12) DEFAULT NULL,
  `Created_At` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Id_user`, `Username`, `Password`, `Role`, `Contact_Info`, `Created_At`) VALUES
('U01', 'amba', 'ambasing', 'atmin', 'ambasing', '2024-11-04'),
('U02', 'ambalabu', 'ambasing', 'atmin', 'ambasing', '2024-11-04'),
('U03', 'Ambadam', '4df120637962e048d0a4d18048631b1a49a549614c4ac8997d43e0fb81950dfd', 'Atmin', NULL, '2024-11-15'),
('U04', 'Alamak', '4df120637962e048d0a4d18048631b1a49a549614c4ac8997d43e0fb81950dfd', 'Atmin', NULL, '2024-11-17'),
('U05', 'Ambasing', '4df120637962e048d0a4d18048631b1a49a549614c4ac8997d43e0fb81950dfd', 'Atmin', NULL, '2024-11-17'),
('U06', '1', '6b86b273ff34fce19d6b804eff5a3f5747ada4eaa22f1d49c01e52ddb7875b4b', 'Atmin', NULL, '2024-11-18'),
('U07', '2', 'd4735e3a265e16eee03f59718b9b5d03019c07d8b6c51f90da3a666eec13ab35', 'Atmin', NULL, '2024-11-18');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`Id_barang`);

--
-- Indexes for table `laporan`
--
ALTER TABLE `laporan`
  ADD PRIMARY KEY (`Id_laporan`),
  ADD KEY `Id_user` (`Id_user`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`Id_transaksi`),
  ADD KEY `Id_barang` (`Id_barang`,`Id_user`),
  ADD KEY `Id_user` (`Id_user`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`Id_user`),
  ADD UNIQUE KEY `Username` (`Username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `laporan`
--
ALTER TABLE `laporan`
  ADD CONSTRAINT `laporan_ibfk_1` FOREIGN KEY (`Id_user`) REFERENCES `user` (`Id_user`);

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`Id_barang`) REFERENCES `barang` (`Id_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_3` FOREIGN KEY (`Id_user`) REFERENCES `user` (`Id_user`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
