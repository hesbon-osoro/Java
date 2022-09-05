/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentrecordapp;

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
 * @author HB
 */
@Entity
@Table(name = "studentrecord", catalog = "mystudents", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studentrecord.findAll", query = "SELECT s FROM Studentrecord s"),
    @NamedQuery(name = "Studentrecord.findByStudentId", query = "SELECT s FROM Studentrecord s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Studentrecord.findByStudFirstName", query = "SELECT s FROM Studentrecord s WHERE s.studFirstName = :studFirstName"),
    @NamedQuery(name = "Studentrecord.findByStudLastName", query = "SELECT s FROM Studentrecord s WHERE s.studLastName = :studLastName"),
    @NamedQuery(name = "Studentrecord.findByStudDateOfBirth", query = "SELECT s FROM Studentrecord s WHERE s.studDateOfBirth = :studDateOfBirth"),
    @NamedQuery(name = "Studentrecord.findByStudAddress", query = "SELECT s FROM Studentrecord s WHERE s.studAddress = :studAddress"),
    @NamedQuery(name = "Studentrecord.findByStudProgram", query = "SELECT s FROM Studentrecord s WHERE s.studProgram = :studProgram"),
    @NamedQuery(name = "Studentrecord.findByStudMaritalStatus", query = "SELECT s FROM Studentrecord s WHERE s.studMaritalStatus = :studMaritalStatus"),
    @NamedQuery(name = "Studentrecord.findByStudCountry", query = "SELECT s FROM Studentrecord s WHERE s.studCountry = :studCountry"),
    @NamedQuery(name = "Studentrecord.findByStudEmail", query = "SELECT s FROM Studentrecord s WHERE s.studEmail = :studEmail")})
public class Studentrecord implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "stud_first_name")
    private String studFirstName;
    @Basic(optional = false)
    @Column(name = "stud_last_name")
    private String studLastName;
    @Basic(optional = false)
    @Column(name = "stud_date_of_birth")
    private String studDateOfBirth;
    @Basic(optional = false)
    @Column(name = "stud_address")
    private String studAddress;
    @Basic(optional = false)
    @Column(name = "stud_program")
    private String studProgram;
    @Basic(optional = false)
    @Column(name = "stud_marital_status")
    private int studMaritalStatus;
    @Basic(optional = false)
    @Column(name = "stud_country")
    private String studCountry;
    @Basic(optional = false)
    @Column(name = "stud_email")
    private String studEmail;

    public Studentrecord() {
    }

    public Studentrecord(String studentId) {
        this.studentId = studentId;
    }

    public Studentrecord(String studentId, String studFirstName, String studLastName, String studDateOfBirth, String studAddress, String studProgram, int studMaritalStatus, String studCountry, String studEmail) {
        this.studentId = studentId;
        this.studFirstName = studFirstName;
        this.studLastName = studLastName;
        this.studDateOfBirth = studDateOfBirth;
        this.studAddress = studAddress;
        this.studProgram = studProgram;
        this.studMaritalStatus = studMaritalStatus;
        this.studCountry = studCountry;
        this.studEmail = studEmail;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        String oldStudentId = this.studentId;
        this.studentId = studentId;
        changeSupport.firePropertyChange("studentId", oldStudentId, studentId);
    }

    public String getStudFirstName() {
        return studFirstName;
    }

    public void setStudFirstName(String studFirstName) {
        String oldStudFirstName = this.studFirstName;
        this.studFirstName = studFirstName;
        changeSupport.firePropertyChange("studFirstName", oldStudFirstName, studFirstName);
    }

    public String getStudLastName() {
        return studLastName;
    }

    public void setStudLastName(String studLastName) {
        String oldStudLastName = this.studLastName;
        this.studLastName = studLastName;
        changeSupport.firePropertyChange("studLastName", oldStudLastName, studLastName);
    }

    public String getStudDateOfBirth() {
        return studDateOfBirth;
    }

    public void setStudDateOfBirth(String studDateOfBirth) {
        String oldStudDateOfBirth = this.studDateOfBirth;
        this.studDateOfBirth = studDateOfBirth;
        changeSupport.firePropertyChange("studDateOfBirth", oldStudDateOfBirth, studDateOfBirth);
    }

    public String getStudAddress() {
        return studAddress;
    }

    public void setStudAddress(String studAddress) {
        String oldStudAddress = this.studAddress;
        this.studAddress = studAddress;
        changeSupport.firePropertyChange("studAddress", oldStudAddress, studAddress);
    }

    public String getStudProgram() {
        return studProgram;
    }

    public void setStudProgram(String studProgram) {
        String oldStudProgram = this.studProgram;
        this.studProgram = studProgram;
        changeSupport.firePropertyChange("studProgram", oldStudProgram, studProgram);
    }

    public int getStudMaritalStatus() {
        return studMaritalStatus;
    }

    public void setStudMaritalStatus(int studMaritalStatus) {
        int oldStudMaritalStatus = this.studMaritalStatus;
        this.studMaritalStatus = studMaritalStatus;
        changeSupport.firePropertyChange("studMaritalStatus", oldStudMaritalStatus, studMaritalStatus);
    }

    public String getStudCountry() {
        return studCountry;
    }

    public void setStudCountry(String studCountry) {
        String oldStudCountry = this.studCountry;
        this.studCountry = studCountry;
        changeSupport.firePropertyChange("studCountry", oldStudCountry, studCountry);
    }

    public String getStudEmail() {
        return studEmail;
    }

    public void setStudEmail(String studEmail) {
        String oldStudEmail = this.studEmail;
        this.studEmail = studEmail;
        changeSupport.firePropertyChange("studEmail", oldStudEmail, studEmail);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studentrecord)) {
            return false;
        }
        Studentrecord other = (Studentrecord) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "studentrecordapp.Studentrecord[ studentId=" + studentId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
