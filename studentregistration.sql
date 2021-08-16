-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Aug 14, 2021 at 08:12 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentregistration`
--

-- --------------------------------------------------------

--
-- Table structure for table `marking`
--

CREATE TABLE `marking` (
  `Id` int(11) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `RegNo` varchar(25) NOT NULL,
  `School` varchar(255) NOT NULL,
  `Class` varchar(25) NOT NULL,
  `Subject 1` varchar(25) NOT NULL,
  `Marks 1` int(2) NOT NULL,
  `Subject 2` varchar(25) NOT NULL,
  `Marks 2` int(2) NOT NULL,
  `Subject 3` varchar(25) NOT NULL,
  `Marks 3` int(2) NOT NULL,
  `Subject 4` varchar(25) NOT NULL,
  `Marks 4` int(2) NOT NULL,
  `Subject 5` varchar(25) NOT NULL,
  `Marks 5` int(2) NOT NULL,
  `Total` int(3) NOT NULL,
  `Average` float NOT NULL,
  `Grade` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marking`
--

INSERT INTO `marking` (`Id`, `StudentName`, `RegNo`, `School`, `Class`, `Subject 1`, `Marks 1`, `Subject 2`, `Marks 2`, `Subject 3`, `Marks 3`, `Subject 4`, `Marks 4`, `Subject 5`, `Marks 5`, `Total`, `Average`, `Grade`) VALUES
(1, 'Ann Kishanthi', 'AA1832', 'IT and Computing', '2nd year 1st Semester', 'Maths', 88, 'Java', 85, 'CS', 75, 'CCSD', 85, 'C', 75, 408, 81, 'A');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `ID` int(11) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `RegNo` varchar(10) NOT NULL,
  `PaymentDate` date NOT NULL,
  `School` varchar(255) NOT NULL,
  `Class` varchar(20) NOT NULL,
  `NIC` varchar(255) NOT NULL,
  `Mail` varchar(255) NOT NULL,
  `AccountNo` varchar(25) NOT NULL,
  `Amount` varchar(100) NOT NULL,
  `PaymentModel` varchar(25) NOT NULL,
  `Bank` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`ID`, `StudentName`, `RegNo`, `PaymentDate`, `School`, `Class`, `NIC`, `Mail`, `AccountNo`, `Amount`, `PaymentModel`, `Bank`) VALUES
(1, 'Ann Kishanthi', 'AA1832', '2021-11-30', 'IT and Computing', '2nd year 2nd Semi', '997383885V', 'kishanthih@gmail.com', 'AC 200-2000-8005', 'Rs 169375.00', 'Cash', 'People\'s Bank'),
(2, 'Ann Piyanthi', 'AA1688', '2021-10-30', 'Engineering', '3rd year 2nd Semi', '968574155V', 'piyanthi@gmail.com', 'AC 200-2000-800-500', 'Rs 245000.00', 'Cash', 'NDB');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ID` int(11) NOT NULL,
  `studentname` varchar(255) NOT NULL,
  `fathername` varchar(255) NOT NULL,
  `phone` varchar(25) NOT NULL,
  `dateofbirth` date NOT NULL,
  `gender` varchar(255) NOT NULL,
  `school` varchar(255) NOT NULL,
  `class` varchar(255) NOT NULL,
  `admissiondate` date NOT NULL,
  `nicno` varchar(25) NOT NULL,
  `mail` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `studentname`, `fathername`, `phone`, `dateofbirth`, `gender`, `school`, `class`, `admissiondate`, `nicno`, `mail`, `address`) VALUES
(1, 'Ann Kishanthi', 'Henrich Ravi', '0719199042', '1999-08-25', 'Female', 'IT and Computing', '2nd year 2nd Semester', '2020-02-18', '997383885V', 'kishanthih@gmail.com', 'Mannar'),
(2, 'Ann Piyanthi', 'Henrich Ravi', '0719181160', '1996-03-05', 'Female', 'Engineering', '3rd year 2nd Semester', '2019-08-16', '968574123V', 'piyanthi@gmail.com', 'Mannar'),
(3, 'Nithya', 'Suganthan', '0714418017', '1996-03-01', 'Female', 'Engineering', '4th year 2nd Semester', '2017-08-17', '965654437V', 'nithyasuga@gmail.com', 'Colombo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `marking`
--
ALTER TABLE `marking`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `marking`
--
ALTER TABLE `marking`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
