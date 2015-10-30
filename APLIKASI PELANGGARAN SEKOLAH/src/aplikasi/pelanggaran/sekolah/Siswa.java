/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.pelanggaran.sekolah;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author FAZRILP
 */
@Entity
@Table(name = "siswa", catalog = "poinpelanggaran", schema = "")
@NamedQueries({
    @NamedQuery(name = "Siswa.findAll", query = "SELECT s FROM Siswa s"),
    @NamedQuery(name = "Siswa.findByIdsiswa", query = "SELECT s FROM Siswa s WHERE s.idsiswa = :idsiswa"),
    @NamedQuery(name = "Siswa.findByNamasiswa", query = "SELECT s FROM Siswa s WHERE s.namasiswa = :namasiswa"),
    @NamedQuery(name = "Siswa.findByKelas", query = "SELECT s FROM Siswa s WHERE s.kelas = :kelas"),
    @NamedQuery(name = "Siswa.findByPelanggaran", query = "SELECT s FROM Siswa s WHERE s.pelanggaran = :pelanggaran"),
    @NamedQuery(name = "Siswa.findByPoin", query = "SELECT s FROM Siswa s WHERE s.poin = :poin"),
    @NamedQuery(name = "Siswa.findByTanggal", query = "SELECT s FROM Siswa s WHERE s.tanggal = :tanggal")})
public class Siswa implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_siswa")
    private Integer idsiswa;
    @Basic(optional = false)
    @Column(name = "Nama_siswa")
    private String namasiswa;
    @Basic(optional = false)
    @Column(name = "Kelas")
    private String kelas;
    @Basic(optional = false)
    @Column(name = "pelanggaran")
    private String pelanggaran;
    @Basic(optional = false)
    @Column(name = "Poin")
    private int poin;
    @Basic(optional = false)
    @Column(name = "Tanggal")
    private String tanggal;

    public Siswa() {
    }

    public Siswa(Integer idsiswa) {
        this.idsiswa = idsiswa;
    }

    public Siswa(Integer idsiswa, String namasiswa, String kelas, String pelanggaran, int poin, String tanggal) {
        this.idsiswa = idsiswa;
        this.namasiswa = namasiswa;
        this.kelas = kelas;
        this.pelanggaran = pelanggaran;
        this.poin = poin;
        this.tanggal = tanggal;
    }

    public Integer getIdsiswa() {
        return idsiswa;
    }

    public void setIdsiswa(Integer idsiswa) {
        Integer oldIdsiswa = this.idsiswa;
        this.idsiswa = idsiswa;
        changeSupport.firePropertyChange("idsiswa", oldIdsiswa, idsiswa);
    }

    public String getNamasiswa() {
        return namasiswa;
    }

    public void setNamasiswa(String namasiswa) {
        String oldNamasiswa = this.namasiswa;
        this.namasiswa = namasiswa;
        changeSupport.firePropertyChange("namasiswa", oldNamasiswa, namasiswa);
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        String oldKelas = this.kelas;
        this.kelas = kelas;
        changeSupport.firePropertyChange("kelas", oldKelas, kelas);
    }

    public String getPelanggaran() {
        return pelanggaran;
    }

    public void setPelanggaran(String pelanggaran) {
        String oldPelanggaran = this.pelanggaran;
        this.pelanggaran = pelanggaran;
        changeSupport.firePropertyChange("pelanggaran", oldPelanggaran, pelanggaran);
    }

    public int getPoin() {
        return poin;
    }

    public void setPoin(int poin) {
        int oldPoin = this.poin;
        this.poin = poin;
        changeSupport.firePropertyChange("poin", oldPoin, poin);
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        String oldTanggal = this.tanggal;
        this.tanggal = tanggal;
        changeSupport.firePropertyChange("tanggal", oldTanggal, tanggal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsiswa != null ? idsiswa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siswa)) {
            return false;
        }
        Siswa other = (Siswa) object;
        if ((this.idsiswa == null && other.idsiswa != null) || (this.idsiswa != null && !this.idsiswa.equals(other.idsiswa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.pelanggaran.sekolah.Siswa[ idsiswa=" + idsiswa + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
