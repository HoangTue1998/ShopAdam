
CREATE DATABASE QLBH1
GO
USE QLBH1
GO


go 
	if OBJECT_ID('Category') is not null --Bảng thể loại
	drop table Category
go
	create table Category(
		MaTheLoai nvarchar(50) primary key not null,
		TenTheLoai nvarchar(50) not null,
		TrangThai bit,
	)


	create table GiamGia(
		MaGiamGia  int identity primary key not null,
		PhanTram float,
		NgayBatDau date ,
		NgayKetThuc date,
		TrangThai bit
	)


	go
	if OBJECT_ID('Size') is not null -- Bảng size
	drop table Size
	create table Size(
		
		maSize int identity primary key not null, 
		TenSize nvarchar(50) not null,
		TrangThai bit,
		--foreign key (MaSanPhamChiTiet) references Product_Detail (MaSanPhamChiTiet) on update cascade on delete no action,
	)

go
	if OBJECT_ID('Color') is not null -- Bảng màu
	drop table Color
	create table Color(
		
		maMau int identity primary key not null, 
		temMau nvarchar(100) not null,
		TrangThai bit,
		--foreign key (MaSanPhamChiTiet) references Product_Detail (MaSanPhamChiTiet) on update cascade on delete no action,
	)

go 
	if OBJECT_ID('Product') is not null -- Bảng sản phẩm
	drop table Product
go
	create table Product(
	MaSanPham nvarchar(50) primary key not null,
	TenSanPham nvarchar(50) not null,
	MaTheLoai nvarchar(50) not null,
	--SoLuong int not null,
	--GiaNhap float not null,
	GhiChu nvarchar(250) null,
	TrangThai bit,
	IsDelete bit,
	MaGiamGia int,
	foreign key (MaTheLoai) references Category (MaTheLoai) on update cascade on delete no action,
	foreign key (MaGiamGia) references GiamGia (MaGiamGia) on update cascade on delete no action,
	)
	go


go 
	if OBJECT_ID('Product_Detail') is not null -- Bảng sản phẩm
	drop table Product_Detail
go
	create table Product_Detail(
	MaSanPhamChiTiet nvarchar(50)  primary key,
	TenSanPham nvarchar(50) not null,
	SoLuong int not null,
	GiaNhap float not null,
	GiaBan float not null,
	MaSanPham nvarchar(50),
	MaTheLoai nvarchar(50),
	maSize int,
	maMau int,
	TrangThai bit,

	foreign key (MaSanPham) references Product (MaSanPham),-- on update cascade on delete no action,
	--foreign key (MaTheLoai) references Category (MaTheLoai), --on update cascade on delete no action,
	foreign key (maMau) references Color (maMau),
	foreign key (maSize) references Size (maSize),
	)
	go


	if OBJECT_ID('Staff') is not null -- Bảng Nhân viên
	drop table Staff
go
	create table Staff(
	MaNhanVien nvarchar(50) primary key not null,
	TaiKhoan nvarchar(50) not null,
	TenNhanVien nvarchar(50) not null,
	MatKhau nvarchar(50) not null,
	GioiTinh bit not null,
	DiaChi nvarchar(100) not null,
	DienThoai nvarchar(20) not null,
	Email nvarchar(50) not null,
	NgaySinh date not null,
	VaiTro bit not null,
	TrangThai bit default(0),
	

	)
	go 
	if OBJECT_ID('Client') is not null -- Bảng Khách hàng
	drop table Client
go
	create table Client(
	MaKhachHang int identity primary key not null,
	TenKhachHang nvarchar(50) not null,
	DiaChi nvarchar(100) not null,
	DienThoai nvarchar(20) not null,
	TrangThai bit,
	)



go 
	if OBJECT_ID('Invoice') is not null -- Bảng Hoá đơn
	drop table Invoice
go
	create table Invoice(
	MaHoaDon int identity primary key not null,
	MaNhanVien nvarchar(50) not null,
	NgayBan date not null,
	MaKhachHang int not null,
	TongTien float not null,
	TrangThai nvarchar(50),
	GhiChu text,
	foreign key (MaNhanVien) references Staff (MaNhanVien) on update cascade on delete no action,
	foreign key (MaKhachHang) references Client (MaKhachHang) on update cascade on delete no action,
	)
go
	if OBJECT_ID('Detailed_Invoice') is not null -- Bảng Hoá đơn chi tiết
	drop table Detailed_Invoice
go
	create table Detailed_Invoice(
	    MaHDCT int identity primary key not null,
		MaHoaDon int  not null,
		MaSanPhamChiTiet nvarchar(50) not null,
		Anh nvarchar(250) null,
		SoLuong int not null,
		DonGia float not null,
		GiamGia float not null,
		Tong float not null,
		TrangThai nvarchar(50),
		foreign key (MaHoaDon) references Invoice (MaHoaDon), 
		foreign key (MaSanPhamChiTiet) references Product_Detail (MaSanPhamChiTiet)

	)

