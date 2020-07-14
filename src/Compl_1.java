/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package adminbank;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author aashirbad JAY
 */
@Entity
@Table(name = "COMPL", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Compl.findAll", query = "SELECT c FROM Compl c"),
    @NamedQuery(name = "Compl.findByAcc", query = "SELECT c FROM Compl c WHERE c.acc = :acc"),
    @NamedQuery(name = "Compl.findByComplain", query = "SELECT c FROM Compl c WHERE c.complain = :complain"),
    @NamedQuery(name = "Compl.findByTime", query = "SELECT c FROM Compl c WHERE c.time = :time")})
public class Compl implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "ACC")
    private String acc;
    @Column(name = "COMPLAIN")
    private String complain;
    @Id
    @Basic(optional = false)
    @Column(name = "TIME")
    private String time;

    public Compl() {
    }

    public Compl(String time) {
        this.time = time;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        String oldAcc = this.acc;
        this.acc = acc;
        changeSupport.firePropertyChange("acc", oldAcc, acc);
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        String oldComplain = this.complain;
        this.complain = complain;
        changeSupport.firePropertyChange("complain", oldComplain, complain);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (time != null ? time.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compl)) {
            return false;
        }
        Compl other = (Compl) object;
        if ((this.time == null && other.time != null) || (this.time != null && !this.time.equals(other.time))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adminbank.Compl[ time=" + time + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
