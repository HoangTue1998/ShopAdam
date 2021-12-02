/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DTO;

/**
 *
 * @author Hoang Tue
 */
public class ProducDetailDTO {
    private String maSPCT;
   // private String tenSanPham;
    
    private String mau;
    private String size;
    private int soLuong;
    private int giaNhap;
    private int giaBan;
    
    

    public ProducDetailDTO() {
    }

    public String getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(String maSPCT) {
        this.maSPCT = maSPCT;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

   

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ProducDetailDTO(String maSPCT, String mau, String size, int soLuong, int giaNhap, int giaBan) {
        this.maSPCT = maSPCT;
        this.mau = mau;
        this.size = size;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    
  
    
    

    
}
