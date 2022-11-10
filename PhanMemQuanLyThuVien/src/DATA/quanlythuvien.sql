-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 10, 2022 at 10:48 AM
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
-- Table structure for table `chitietdausach`
--

CREATE TABLE `chitietdausach` (
  `MaDauSach` varchar(255) NOT NULL,
  `MaDinhDanhDauSach` varchar(255) NOT NULL,
  `MaPhieuMuon` varchar(255) NOT NULL,
  `TinhTrang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieumuon`
--

CREATE TABLE `chitietphieumuon` (
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `SoLuong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPhieuNhap` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieuphat`
--

CREATE TABLE `chitietphieuphat` (
  `MaPhieuPhat` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `MaDinhDanhSach` varchar(255) NOT NULL,
  `NoiDungPhat` varchar(255) NOT NULL,
  `LePhiBoiThuong` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieutra`
--

CREATE TABLE `chitietphieutra` (
  `MaPhieuTra` varchar(255) NOT NULL,
  `MaDauSach` varchar(255) NOT NULL,
  `MaDinhDanhSach` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `dausach`
--

CREATE TABLE `dausach` (
  `MaDauSach` varchar(255) NOT NULL,
  `TenDauSach` varchar(255) NOT NULL,
  `DonGia` double NOT NULL,
  `MaNgonNgu` varchar(255) NOT NULL,
  `MaNhaXuatBan` varchar(255) NOT NULL,
  `MaTacGia` varchar(255) NOT NULL,
  `MaTheLoai` varchar(255) NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
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
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `docgia`
--

INSERT INTO `docgia` (`MaDocGia`, `TenDocGia`, `SoDienThoai`, `NgayDangKy`, `NgayGiaHan`, `NgayHetHan`, `TrangThai`) VALUES
('DG01', 'Huyền', '0353631949', '2022-11-09', '2022-11-09', '2022-12-09', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ngonngu`
--

CREATE TABLE `ngonngu` (
  `MaNgonNgu` varchar(255) NOT NULL,
  `TenNgonNgu` varchar(255) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNhanVien` varchar(255) NOT NULL,
  `TenNhanVien` varchar(255) NOT NULL,
  `SoDienThoai` varchar(10) NOT NULL,
  `NgaySinh` date NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhanvien`
--

INSERT INTO `nhanvien` (`MaNhanVien`, `TenNhanVien`, `SoDienThoai`, `NgaySinh`, `TrangThai`) VALUES
('NV01', 'Lư Triển Vinh', '0353631949', '2000-08-09', 1);

-- --------------------------------------------------------

--
-- Table structure for table `nhatkyhoatdong`
--

CREATE TABLE `nhatkyhoatdong` (
  `MaNhanVien` varchar(255) NOT NULL,
  `HoatDong` varchar(1023) NOT NULL,
  `ThoiGian` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nhatkyhoatdong`
--

INSERT INTO `nhatkyhoatdong` (`MaNhanVien`, `HoatDong`, `ThoiGian`) VALUES
('NV01', 'Nhân viên \'NV01\' đăng nhập vào hệ thống', '2022-11-10 16:12:35'),
('NV01', 'Nhân viên \'NV01\' đăng nhập vào hệ thống', '2022-11-10 16:25:35');

-- --------------------------------------------------------

--
-- Table structure for table `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `MaNhaXuatBan` varchar(255) NOT NULL,
  `TenNhaXuatBan` varchar(255) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phieumuon`
--

CREATE TABLE `phieumuon` (
  `MaPhieuMuon` varchar(255) NOT NULL,
  `MaDocGia` varchar(255) NOT NULL,
  `MaNhanVien` varchar(255) NOT NULL,
  `ThoiGian` datetime NOT NULL,
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
  `ThoiGian` datetime NOT NULL,
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
  `ThoiGian` datetime NOT NULL,
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
  `ThoiGian` datetime NOT NULL,
  `TongSach` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tacgia`
--

CREATE TABLE `tacgia` (
  `MaTacGia` varchar(255) NOT NULL,
  `TenTacGia` varchar(255) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `MaNhanVien` varchar(255) NOT NULL,
  `MatKhau` varchar(255) NOT NULL,
  `PhanQuyen` varchar(255) NOT NULL,
  `TinhTrang` varchar(255) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`MaNhanVien`, `MatKhau`, `PhanQuyen`, `TinhTrang`, `TrangThai`) VALUES
('NV01', '-1768893937', 'Quản trị viên', 'Khả dụng', 1);

-- --------------------------------------------------------

--
-- Table structure for table `theloai`
--

CREATE TABLE `theloai` (
  `MaTheLoai` varchar(255) NOT NULL,
  `TenTheLoai` varchar(255) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitietdausach`
--
ALTER TABLE `chitietdausach`
  ADD UNIQUE KEY `MaDinhDanhDauSach` (`MaDinhDanhDauSach`),
  ADD KEY `MaDauSach` (`MaDauSach`),
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`);

--
-- Indexes for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD KEY `MaDauSach` (`MaDauSach`),
  ADD KEY `MaPhieuMuon` (`MaPhieuMuon`);

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
  ADD KEY `MaDinhDanhSach` (`MaDinhDanhSach`);

--
-- Indexes for table `chitietphieutra`
--
ALTER TABLE `chitietphieutra`
  ADD KEY `MaDauSach` (`MaDauSach`),
  ADD KEY `MaPhieuTra` (`MaPhieuTra`),
  ADD KEY `MaDinhDanhSach` (`MaDinhDanhSach`);

--
-- Indexes for table `dausach`
--
ALTER TABLE `dausach`
  ADD PRIMARY KEY (`MaDauSach`),
  ADD KEY `MaNgonNgu` (`MaNgonNgu`),
  ADD KEY `MaNhaXuatBan` (`MaNhaXuatBan`),
  ADD KEY `MaTacGia` (`MaTacGia`),
  ADD KEY `MaTheLoai` (`MaTheLoai`);

--
-- Indexes for table `docgia`
--
ALTER TABLE `docgia`
  ADD PRIMARY KEY (`MaDocGia`),
  ADD UNIQUE KEY `SoDienThoai` (`SoDienThoai`);

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
  ADD PRIMARY KEY (`MaNhanVien`);

--
-- Indexes for table `nhatkyhoatdong`
--
ALTER TABLE `nhatkyhoatdong`
  ADD KEY `MaNhanVien` (`MaNhanVien`);

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
-- Indexes for table `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`MaTacGia`),
  ADD UNIQUE KEY `TenTacGia` (`TenTacGia`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`MaNhanVien`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `theloai`
--
ALTER TABLE `theloai`
  ADD PRIMARY KEY (`MaTheLoai`),
  ADD UNIQUE KEY `TenTheLoai` (`TenTheLoai`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitietdausach`
--
ALTER TABLE `chitietdausach`
  ADD CONSTRAINT `chitietdausach_ibfk_1` FOREIGN KEY (`MaDauSach`) REFERENCES `dausach` (`MaDauSach`),
  ADD CONSTRAINT `chitietdausach_ibfk_2` FOREIGN KEY (`MaPhieuMuon`) REFERENCES `phieumuon` (`MaPhieuMuon`);

--
-- Constraints for table `chitietphieumuon`
--
ALTER TABLE `chitietphieumuon`
  ADD CONSTRAINT `chitietphieumuon_ibfk_1` FOREIGN KEY (`MaDauSach`) REFERENCES `dausach` (`MaDauSach`),
  ADD CONSTRAINT `chitietphieumuon_ibfk_2` FOREIGN KEY (`MaPhieuMuon`) REFERENCES `phieumuon` (`MaPhieuMuon`);

--
-- Constraints for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`),
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`MaDauSach`) REFERENCES `dausach` (`MaDauSach`);

--
-- Constraints for table `chitietphieuphat`
--
ALTER TABLE `chitietphieuphat`
  ADD CONSTRAINT `chitietphieuphat_ibfk_1` FOREIGN KEY (`MaPhieuPhat`) REFERENCES `phieuphat` (`MaPhieuPhat`),
  ADD CONSTRAINT `chitietphieuphat_ibfk_2` FOREIGN KEY (`MaDauSach`) REFERENCES `dausach` (`MaDauSach`),
  ADD CONSTRAINT `chitietphieuphat_ibfk_3` FOREIGN KEY (`MaDinhDanhSach`) REFERENCES `chitietdausach` (`MaDinhDanhDauSach`);

--
-- Constraints for table `chitietphieutra`
--
ALTER TABLE `chitietphieutra`
  ADD CONSTRAINT `chitietphieutra_ibfk_1` FOREIGN KEY (`MaPhieuTra`) REFERENCES `phieutra` (`MaPhieuTra`),
  ADD CONSTRAINT `chitietphieutra_ibfk_2` FOREIGN KEY (`MaDinhDanhSach`) REFERENCES `chitietdausach` (`MaDinhDanhDauSach`);

--
-- Constraints for table `dausach`
--
ALTER TABLE `dausach`
  ADD CONSTRAINT `dausach_ibfk_1` FOREIGN KEY (`MaTheLoai`) REFERENCES `theloai` (`MaTheLoai`),
  ADD CONSTRAINT `dausach_ibfk_2` FOREIGN KEY (`MaNgonNgu`) REFERENCES `ngonngu` (`MaNgonNgu`),
  ADD CONSTRAINT `dausach_ibfk_3` FOREIGN KEY (`MaNhaXuatBan`) REFERENCES `nhaxuatban` (`MaNhaXuatBan`),
  ADD CONSTRAINT `dausach_ibfk_4` FOREIGN KEY (`MaTacGia`) REFERENCES `tacgia` (`MaTacGia`),
  ADD CONSTRAINT `dausach_ibfk_5` FOREIGN KEY (`MaDauSach`) REFERENCES `chitietphieutra` (`MaDauSach`);

--
-- Constraints for table `nhatkyhoatdong`
--
ALTER TABLE `nhatkyhoatdong`
  ADD CONSTRAINT `nhatkyhoatdong_ibfk_1` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `phieumuon`
--
ALTER TABLE `phieumuon`
  ADD CONSTRAINT `phieumuon_ibfk_1` FOREIGN KEY (`MaDocGia`) REFERENCES `docgia` (`MaDocGia`),
  ADD CONSTRAINT `phieumuon_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNhaXuatBan`) REFERENCES `nhaxuatban` (`MaNhaXuatBan`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `phieuphat`
--
ALTER TABLE `phieuphat`
  ADD CONSTRAINT `phieuphat_ibfk_1` FOREIGN KEY (`MaPhieuMuon`) REFERENCES `phieumuon` (`MaPhieuMuon`),
  ADD CONSTRAINT `phieuphat_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `phieutra`
--
ALTER TABLE `phieutra`
  ADD CONSTRAINT `phieutra_ibfk_1` FOREIGN KEY (`MaPhieuMuon`) REFERENCES `phieumuon` (`MaPhieuMuon`),
  ADD CONSTRAINT `phieutra_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);

--
-- Constraints for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD CONSTRAINT `taikhoan_ibfk_1` FOREIGN KEY (`MaNhanVien`) REFERENCES `nhanvien` (`MaNhanVien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
