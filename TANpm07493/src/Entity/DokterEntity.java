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
public class DokterEntity extends PasienAbstractEntity{
    private String poliklinik;
    public DokterEntity(String kode, String password, String nama, String no_telp, Date tglLahir, String poli) {
        super(kode, password, nama, no_telp, tglLahir);
        this.poliklinik = poli;
    }
    @Override
    public String getKode() {
        return this.kode;
    }

    public String getPoliklinik() {
        return poliklinik;
    }
    
    public void setPoliklinik(String poliklinik) {
        this.poliklinik = poliklinik;
    }
}
