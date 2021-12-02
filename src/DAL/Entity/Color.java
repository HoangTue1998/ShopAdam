/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL.Entity;

/**
 *
 * @author Minh
 */
public class Color {
    private int maMau;
    private String tenMau;
    private boolean  trangThai;
    
    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Color(int maMau, String tenMau, boolean trangThai) {
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.trangThai = trangThai;
    }

   

    public Color() {
    }
 
    
}
