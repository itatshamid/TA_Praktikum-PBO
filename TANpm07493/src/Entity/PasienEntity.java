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
public class PasienEntity extends PasienAbstractEntity{
    private String alamat;
    public PasienEntity (String kode, String password, String nama, String no_telp, Date tglLahir, String alamat) {
        super(kode, password, nama, no_telp, tglLahir);
        this.alamat = alamat;
    }

    @Override
    public String getKode() {
        return kode;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
