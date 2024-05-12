/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuAdmin.QuanLiSP.ClikeThemSp;

import MenuAdmin.QuanLiSP.*;

/**
 *
 * @author Quangratdeptrai
 */
public class Danhsach1 {
    private String Hang;
    private int Gia;
    private String dt;
    private String nc;
    private String dl;
    private String tn;
    private String tndb;
    private String ram;
    private String FileAvata;
    
    

    public String getHang() {
        return Hang;
    }

    public int getGia() {
        return Gia;
    }

    public String getDt() {
        return dt;
    }

    public String getNc() {
        return nc;
    }

    public String getDl() {
        return dl;
    }

    public String getTn() {
        return tn;
    }

    public String getTndb() {
        return tndb;
    }

    public String getRam() {
        return ram;
    }

    public String getFileAvata() {
        return FileAvata;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public void setDl(String dl) {
        this.dl = dl;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public void setTndb(String tndb) {
        this.tndb = tndb;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
     public void setFileAvata(String anh) {
        this.FileAvata = FileAvata;
    }

    public Danhsach1(String Hang, String dt, String nc, String ram, String dl, String tn, String tndb, int Gia, String FileAvata) {
        this.Hang = Hang;
        this.Gia = Gia;
        this.dt = dt;
        this.nc = nc;
        this.dl = dl;
        this.tn = tn;
        this.tndb = tndb;
        this.ram = ram;
        this.FileAvata = FileAvata;
    }
}
