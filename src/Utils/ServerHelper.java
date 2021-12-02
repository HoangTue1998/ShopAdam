/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;
import DAL.Entity.Staff;

/**
 *
 * @author Hoang Tue
 */
public class ServerHelper {

    public static final Image APP_ICON;
    public static final ImageIcon APP_ICON_1;

    static {

        String file = "/img/logos.png";
        APP_ICON = new ImageIcon(ServerHelper.class.getResource(file)).getImage();
        APP_ICON_1 = new ImageIcon(SecurityManager.class.getResource(file));
    }
// Tạo mới thư mục để lưu

    public static boolean saveLogo(File file) {
        File CheckFile = new File("Logos");
        if (!CheckFile.exists()) {
            CheckFile.mkdirs();
        }
        File newFile = new File(CheckFile, file.getName());
        try {
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            System.out.println("Code lỗi");
            e.printStackTrace();
            return false;

        }

    }
//đọc 

    public static ImageIcon readLogo(String fileName) {
        File page = new File("Logos", fileName);
        return new ImageIcon(new ImageIcon(page.getAbsolutePath()).getImage()
                .getScaledInstance(190, 190, Image.SCALE_DEFAULT)
        );
    }
    public static Staff URSER = null;

    public static void Out() {
        ServerHelper.URSER = null;
    }

    public boolean CheckLogin() {
        return ServerHelper.URSER != null;
    }
}
