-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2022 at 11:06 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlythuvien`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieumuon`
--

CREATE TABLE `chitietphieumuon` (
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `SoLuongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPhieuNhap` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `DonGia` double NOT NULL,
  `SoLuongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieuphat`
--

CREATE TABLE `chitietphieuphat` (
  `MaPhieuPhat` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `MaSach` varchar(255) NOT NULL,
  `NoiDungPhat` int(11) NOT NULL,
  `LePhiBoiThuong` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieutra`
--

CREATE TABLE `chitietphieutra` (
  `MaPhieuTra` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `SoLuongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dausach`
--

CREATE TABLE `dausach` (
  `MaDauSach` varchar(255) NOT NULL,
  `TenDauSach` varchar(511) NOT NULL,
  `DonGia` double NOT NULL,
  `MaNgonNgu` varchar(255) NOT NULL,
  `MaNhaXuatBan` varchar(255) NOT NULL,
  `MaTacGia` varchar(255) NOT NULL,
  `MaTheLoai` varchar(255) NOT NULL,
  `SoLuongSach` int(11) NOT NULL,
  `SoLuongSachKhaDung` int(11) NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `docgia`
--

CREATE TABLE `docgia` (
  `MaDocGia` varchar(255) NOT NULL,
  `TenDocGia` varchar(255) NOT NULL,
  `SoDienThoai` varchar(10) NOT NULL,
  `NgayDangKy` date NOT NULL,
  `NgayGiaHan` date NOT NULL,
  `NgayHetHan` date NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `ngonngu`
--

CREATE TABLE `ngonngu` (
  `MaNgonNgu` varchar(255) NOT NULL,
  `TenNgonNgu` varchar(255) NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ngonngu`
--

INSERT INTO `ngonngu` (`MaNgonNgu`, `TenNgonNgu`, `TonTai`) VALUES
('NN01', 'Tiếng Trung', 1);

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` varchar(255) NOT NULL,
  `TenNhanVien` varchar(255) NOT NULL,
  `SoDienThoai` int(11) NOT NULL,
  `NgaySinh` date NOT NULL,
  `TonTai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhatkyhoatdong`
--

CREATE TABLE `nhatkyhoatdong` (
  `MaNhanVien` varchar(255) NOT NULL,
  `TenNhanVien` varchar(255) NOT NULL,
  `ThoiGian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `MaNhaXuatBan` varchar(255) NOT NULL,
  `TenNhaXuatBan` varchar(255) NOT NULL,
  `TonTai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

CREATE TABLE `phieumuon` (
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaDocGia` varchar(255) NOT NULL,
  `MaNhanVien` varchar(255) NOT NULL,
  `ThoiGian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `TongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPhieuNhap` varchar(255) NOT NULL,
  `MaNhaXuatBan` varchar(255) NOT NULL,
  `MaNhanVien` varchar(255) NOT NULL,
  `ThoiGian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `TongTien` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phieuphat`
--

CREATE TABLE `phieuphat` (
  `MaPhieuPhat` varchar(255) NOT NULL,
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaNhanVien` varchar(255) NOT NULL,
  `ThoiGian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `TongTien` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phieutra`
--

CREATE TABLE `phieutra` (
  `MaPhieuTra` varchar(255) NOT NULL,
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaNhanVien` varchar(255) NOT NULL,
  `ThoiGian` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `TongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sach`
--

CREATE TABLE `sach` (
  `MaSach` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaPhieuTra` varchar(255) NOT NULL,
  `TinhTrang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tacgia`
--

CREATE TABLE `tacgia` (
  `MaTac` varchar(255) NOT NULL,
  `TenTacGia` varchar(255) NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaNhanVien` varchar(255) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `PhanQuyen` varchar(255) NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `theloai`
--

CREATE TABLE `theloai` (
  `MaTheLoai` varchar(255) NOT NULL,
  `TenTheLoai` varchar(255) NOT NULL,
  `TonTai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`),
  ADD KEY `MaDauSach` (`MaDauSach`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD KEY `MaPhieuNhap` (`MaPhieuNhap`),
  ADD KEY `MaDauSach` (`MaDauSach`);

--
-- Indexes for table `chitietphieuphat`
--
ALTER TABLE `chitietphieuphat`
  ADD KEY `MaPhieuPhat` (`MaPhieuPhat`),
  ADD KEY `MaDauSach` (`MaDauSach`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Indexes for table `chitietphieutra`
--
ALTER TABLE `chitietphieutra`
  ADD KEY `MaPhieuTra` (`MaPhieuTra`),
  ADD KEY `MaDauSach` (`MaDauSach`);

--
-- Indexes for table `dausach`
--
ALTER TABLE `dausach`
  ADD PRIMARY KEY (`MaDauSach`),
  ADD UNIQUE KEY `TenDauSach` (`TenDauSach`),
  ADD KEY `MaNgonNgu` (`MaNgonNgu`),
  ADD KEY `MaNhaXuatBan` (`MaNhaXuatBan`),
  ADD KEY `MaTacGia` (`MaTacGia`),
  ADD KEY `MaTheLoai` (`MaTheLoai`);

--
-- Indexes for table `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`MaDocGia`);

--
-- Indexes for table `ngonngu`
--
ALTER TABLE `ngonngu`
  ADD PRIMARY KEY (`MaNgonNgu`),
  ADD UNIQUE KEY `TenNgonNgu` (`TenNgonNgu`);

--
-- Indexes for table `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD UNIQUE KEY `SoDienThoai` (`SoDienThoai`);

--
-- Indexes for table `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  ADD PRIMARY KEY (`MaNhaXuatBan`),
  ADD UNIQUE KEY `TenNhaXuatBan` (`TenNhaXuatBan`);

--
-- Indexes for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD PRIMARY KEY (`MaPhieuMuon`),
  ADD KEY `MaDocGia` (`MaDocGia`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`),
  ADD KEY `MaNhaXuatBan` (`MaNhaXuatBan`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD PRIMARY KEY (`MaPhieuPhat`),
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `phieutra`
--
ALTER TABLE `phieutra`
  ADD PRIMARY KEY (`MaPhieuTra`),
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `sach`
--
ALTER TABLE `sach`
  ADD PRIMARY KEY (`MaSach`),
  ADD KEY `MaDauSach` (`MaDauSach`),
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`);

--
-- Indexes for table `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`MaTac`),
  ADD UNIQUE KEY `TenTacGia` (`TenTacGia`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD UNIQUE KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `theloai`
--
ALTER TABLE `theloai`
  ADD PRIMARY KEY (`MaTheLoai`),
  ADD UNIQUE KEY `TenTheLoai` (`TenTheLoai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
