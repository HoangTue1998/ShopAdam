/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Entity;

/**
 *
 * @author Minh
 */
public class InvoiceDetail {
   private int MaHoaDon;
   private String MaSanPhamChiTiet;
   private int SoLuong;
   private int DonGia;
   private int GiamGia;
   private int Tong;

    public InvoiceDetail() {
    }

    public InvoiceDetail(int MaHoaDon, String MaSanPhamChiTiet, int SoLuong, int DonGia, int GiamGia, int Tong) {
        this.MaHoaDon = MaHoaDon;
        this.MaSanPhamChiTiet = MaSanPhamChiTiet;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.GiamGia = GiamGia;
        this.Tong = Tong;
    }

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getMaSanPhamChiTiet() {
        return MaSanPhamChiTiet;
    }

    public void setMaSanPhamChiTiet(String MaSanPhamChiTiet) {
        this.MaSanPhamChiTiet = MaSanPhamChiTiet;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(int GiamGia) {
        this.GiamGia = GiamGia;
    }

    public int getTong() {
        return Tong;
    }

    public void setTong(int Tong) {
        this.Tong = Tong;
    }
   
   
}
