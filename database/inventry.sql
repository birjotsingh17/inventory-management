-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 15, 2016 at 03:03 AM
-- Server version: 5.6.12-log
-- PHP Version: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `inventry`
--
CREATE DATABASE IF NOT EXISTS `inventry` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `inventry`;

-- --------------------------------------------------------

--
-- Table structure for table `cbill`
--

CREATE TABLE IF NOT EXISTS `cbill` (
  `id` varchar(30) NOT NULL,
  `item` varchar(30) NOT NULL,
  `quantity` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `clogin`
--

CREATE TABLE IF NOT EXISTS `clogin` (
  `cuser` varchar(30) NOT NULL,
  `cpass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clogin`
--

INSERT INTO `clogin` (`cuser`, `cpass`) VALUES
('gurprit', 'gurprit');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `name` varchar(30) NOT NULL,
  `address` varchar(80) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `item` varchar(30) NOT NULL,
  `colour` varchar(30) NOT NULL,
  `price` varchar(30) NOT NULL,
  `quantity` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `address`, `phone`, `item`, `colour`, `price`, `quantity`, `total`) VALUES
('Gurprit', '59-AX Model Town Ext.\nLudhiana', '8146384006', 'Black', 'T-Shirt', '500', '2', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `rbill`
--

CREATE TABLE IF NOT EXISTS `rbill` (
  `id` int(11) NOT NULL,
  `item` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `retailer`
--

CREATE TABLE IF NOT EXISTS `retailer` (
  `id` varchar(20) NOT NULL,
  `item` varchar(20) NOT NULL,
  `colour` varchar(20) NOT NULL,
  `quantity` varchar(20) NOT NULL,
  `price` varchar(20) NOT NULL,
  `total` varchar(30) NOT NULL,
  KEY `price` (`price`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `retailer`
--

INSERT INTO `retailer` (`id`, `item`, `colour`, `quantity`, `price`, `total`) VALUES
('r1', 'T-Shirt', 'Blue', '125', '400', '50000'),
('r2', 'T-Shirt', 'Grey', '125', '400', '50000'),
('r3', 'T-Shirt', 'Grey', '100', '400', '40000');

-- --------------------------------------------------------

--
-- Table structure for table `rlogin`
--

CREATE TABLE IF NOT EXISTS `rlogin` (
  `ruser` varchar(30) NOT NULL,
  `rpass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rlogin`
--

INSERT INTO `rlogin` (`ruser`, `rpass`) VALUES
('gurprit', 'gurprit');

-- --------------------------------------------------------

--
-- Table structure for table `rnew`
--

CREATE TABLE IF NOT EXISTS `rnew` (
  `name` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `id` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rnew`
--

INSERT INTO `rnew` (`name`, `address`, `phone`, `id`) VALUES
('malhotra_retail', 'shop-29,gulati chowk\nLudhiana.', '9692992924', 'r1');

-- --------------------------------------------------------

--
-- Table structure for table `slogin`
--

CREATE TABLE IF NOT EXISTS `slogin` (
  `auser` varchar(30) NOT NULL,
  `apass` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `slogin`
--

INSERT INTO `slogin` (`auser`, `apass`) VALUES
('', ''),
('', ''),
('', ''),
('gurprit', 'gurprit'),
('nikhil', 'nikhil'),
('birjot', 'birjot');

-- --------------------------------------------------------

--
-- Table structure for table `sreg`
--

CREATE TABLE IF NOT EXISTS `sreg` (
  `name` varchar(30) NOT NULL,
  `address` varchar(80) NOT NULL,
  `phone` varchar(40) NOT NULL,
  `id` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sreg`
--

INSERT INTO `sreg` (`name`, `address`, `phone`, `id`) VALUES
('mohan_shopee', 'shop-18, sco-10,\nMohali.', '8257495', 'S1'),
('rohan&sons', 'shop-15, sco-30\nMohali.', '8393759449', 'S2'),
('malhotras', '18-saco', '8756775467', 's3');

-- --------------------------------------------------------

--
-- Table structure for table `supply`
--

CREATE TABLE IF NOT EXISTS `supply` (
  `material` varchar(30) NOT NULL,
  `price` int(30) NOT NULL,
  `quantity` int(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `date` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supply`
--

INSERT INTO `supply` (`material`, `price`, `quantity`, `sname`, `date`, `total`) VALUES
('Cotton', 300, 150, 'mohan_shopee', 'Tue Jul 12 00:00:00 IST 2016', '45000'),
('Nylon', 350, 2, 'anil', 'Tue Jul 12 13:40:30 IST 2016', '700');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
