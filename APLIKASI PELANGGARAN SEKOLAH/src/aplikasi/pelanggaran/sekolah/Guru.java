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
@Table(name = "guru", catalog = "poinpelanggaran", schema = "")
@NamedQueries({
    @NamedQuery(name = "Guru.findAll", query = "SELECT g FROM Guru g"),
    @NamedQuery(name = "Guru.findByIdguru", query = "SELECT g FROM Guru g WHERE g.idguru = :idguru"),
    @NamedQuery(name = "Guru.findByNamaguru", query = "SELECT g FROM Guru g WHERE g.namaguru = :namaguru"),
    @NamedQuery(name = "Guru.findByJabatan", query = "SELECT g FROM Guru g WHERE g.jabatan = :jabatan"),
    @NamedQuery(name = "Guru.findByPelanggaran", query = "SELECT g FROM Guru g WHERE g.pelanggaran = :pelanggaran"),
    @NamedQuery(name = "Guru.findByPoin", query = "SELECT g FROM Guru g WHERE g.poin = :poin"),
    @NamedQuery(name = "Guru.findByTanggal", query = "SELECT g FROM Guru g WHERE g.tanggal = :tanggal")})
public class Guru implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_guru")
    private Integer idguru;
    @Basic(optional = false)
    @Column(name = "Nama_guru")
    private String namaguru;
    @Basic(optional = false)
    @Column(name = "Jabatan")
    private String jabatan;
    @Basic(optional = false)
    @Column(name = "Pelanggaran")
    private String pelanggaran;
    @Basic(optional = false)
    @Column(name = "Poin")
    private int poin;
    @Basic(optional = false)
    @Column(name = "Tanggal")
    private String tanggal;

    public Guru() {
    }

    public Guru(Integer idguru) {
        this.idguru = idguru;
    }

    public Guru(Integer idguru, String namaguru, String jabatan, String pelanggaran, int poin, String tanggal) {
        this.idguru = idguru;
        this.namaguru = namaguru;
        this.jabatan = jabatan;
        this.pelanggaran = pelanggaran;
        this.poin = poin;
        this.tanggal = tanggal;
    }

    public Integer getIdguru() {
        return idguru;
    }

    public void setIdguru(Integer idguru) {
        Integer oldIdguru = this.idguru;
        this.idguru = idguru;
        changeSupport.firePropertyChange("idguru", oldIdguru, idguru);
    }

    public String getNamaguru() {
        return namaguru;
    }

    public void setNamaguru(String namaguru) {
        String oldNamaguru = this.namaguru;
        this.namaguru = namaguru;
        changeSupport.firePropertyChange("namaguru", oldNamaguru, namaguru);
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        String oldJabatan = this.jabatan;
        this.jabatan = jabatan;
        changeSupport.firePropertyChange("jabatan", oldJabatan, jabatan);
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
        hash += (idguru != null ? idguru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guru)) {
            return false;
        }
        Guru other = (Guru) object;
        if ((this.idguru == null && other.idguru != null) || (this.idguru != null && !this.idguru.equals(other.idguru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.pelanggaran.sekolah.Guru[ idguru=" + idguru + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
