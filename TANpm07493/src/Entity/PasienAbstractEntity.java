/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author abdul.wijaya
 */
public abstract class PasienAbstractEntity {
    protected String kode, password, nama, no_telp;
    protected Date tglLahir;

    public PasienAbstractEntity(String kode, String password, String nama, String no_telp, Date tglLahir) {
        this.kode = kode;
        this.password = password;
        this.nama = nama;
        this.no_telp = no_telp;
        this.tglLahir = tglLahir;
    }
    
    public PasienAbstractEntity(){
    }
    
    public abstract String getKode();

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public Date getTglLahir() {
        return tglLahir;
    }
}
