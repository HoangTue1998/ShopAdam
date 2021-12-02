/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Sevice;

import Business.DTO.StaffDTO;
import DAL.Entity.Staff;
import DAL.Service.StaffService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Tue
 */
public class StaffSeviceB {

    StaffService service = new StaffService();

    public List<StaffDTO> getAll() {
        List<Staff> listStaff = service.selectALL();
        List<StaffDTO> listDTO = new ArrayList<>();
        for (Staff x : listStaff) {
            StaffDTO staffDTO = new StaffDTO();
            staffDTO.setTaiKhoan(x.getTaiKhoan());
            staffDTO.setMatKhau(x.getMatKhau());
            listDTO.add(staffDTO);
        }
        return listDTO;
    }

    public List<StaffDTO> getEmail() {
        List<Staff> listStaff = service.selectALL();
        List<StaffDTO> listDTO = new ArrayList<>();
        for (Staff x : listStaff) {
            StaffDTO staffDTO = new StaffDTO();
            staffDTO.setTaiKhoan(x.getTaiKhoan());
            staffDTO.setMatKhau(x.getMatKhau());
            staffDTO.setEmail(x.getEmail());
            listDTO.add(staffDTO);
        }
        return listDTO;
    }

    public void insertNV(Staff entity) {
        service.insert(entity);
    }

    public List<StaffDTO> selectNv() {
//        service.selectALL();
        List<Staff> listStaff = service.selectALL();
        List<StaffDTO> listDTO = new ArrayList<>();
        for (Staff x : listStaff) {
            StaffDTO staffDTO = new StaffDTO();
            staffDTO.setTaiKhoan(x.getTaiKhoan());
            staffDTO.setMatKhau(x.getMatKhau());
            staffDTO.setGioiTinh(x.isGioiTinh());
            staffDTO.setDiaChi(x.getDiaChi());
            staffDTO.setNgaySinh(x.getNgaySinh());
            staffDTO.setDienThoai(x.getDienThoai());
            staffDTO.setVaiTro(true);
            staffDTO.setTrangThai(true);
            listDTO.add(staffDTO);
        }
        return listDTO;
    }
}
