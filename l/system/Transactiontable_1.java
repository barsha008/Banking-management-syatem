/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminbank;

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
@Table(name = "TRANSACTIONTABLE", catalog = "", schema = "SYSTEM")
@NamedQueries({
    @NamedQuery(name = "Transactiontable_1.findAll", query = "SELECT t FROM Transactiontable_1 t"),
    @NamedQuery(name = "Transactiontable_1.findByAcc", query = "SELECT t FROM Transactiontable_1 t WHERE t.acc = :acc"),
    @NamedQuery(name = "Transactiontable_1.findByAmount", query = "SELECT t FROM Transactiontable_1 t WHERE t.amount = :amount"),
    @NamedQuery(name = "Transactiontable_1.findByStatus", query = "SELECT t FROM Transactiontable_1 t WHERE t.status = :status"),
    @NamedQuery(name = "Transactiontable_1.findByTtime", query = "SELECT t FROM Transactiontable_1 t WHERE t.ttime = :ttime")})
public class Transactiontable_1 implements Serializable {
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

    public Transactiontable_1() {
    }

    public Transactiontable_1(String ttime) {
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
        if (!(object instanceof Transactiontable_1)) {
            return false;
        }
        Transactiontable_1 other = (Transactiontable_1) object;
        if ((this.ttime == null && other.ttime != null) || (this.ttime != null && !this.ttime.equals(other.ttime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adminbank.Transactiontable_1[ ttime=" + ttime + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
