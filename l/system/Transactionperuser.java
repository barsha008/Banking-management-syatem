/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "TRANSACTIONPERUSER", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Transactionperuser.findAll", query = "SELECT t FROM Transactionperuser t"),
    @NamedQuery(name = "Transactionperuser.findByAcc", query = "SELECT t FROM Transactionperuser t WHERE t.acc = :acc"),
    @NamedQuery(name = "Transactionperuser.findByAmount", query = "SELECT t FROM Transactionperuser t WHERE t.amount = :amount"),
    @NamedQuery(name = "Transactionperuser.findByStatus", query = "SELECT t FROM Transactionperuser t WHERE t.status = :status"),
    @NamedQuery(name = "Transactionperuser.findByTtime", query = "SELECT t FROM Transactionperuser t WHERE t.ttime = :ttime")})
public class Transactionperuser implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "ACC")
    private String acc;
    @Column(name = "AMOUNT")
    private BigInteger amount;
    @Column(name = "STATUS")
    private String status;
    @Id
    @Basic(optional = false)
    @Column(name = "TTIME")
    private String ttime;

    public Transactionperuser() {
    }

    public Transactionperuser(String ttime) {
        this.ttime = ttime;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        String oldAcc = this.acc;
        this.acc = acc;
        changeSupport.firePropertyChange("acc", oldAcc, acc);
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        BigInteger oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        String oldTtime = this.ttime;
        this.ttime = ttime;
        changeSupport.firePropertyChange("ttime", oldTtime, ttime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttime != null ? ttime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transactionperuser)) {
            return false;
        }
        Transactionperuser other = (Transactionperuser) object;
        if ((this.ttime == null && other.ttime != null) || (this.ttime != null && !this.ttime.equals(other.ttime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banking.system.Transactionperuser[ ttime=" + ttime + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
