package jim.example.demo.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@EntityScan
public class Sponseres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long sponserId;
    String sponserCategory;
    long userRolesId;
    long personId;
    Date creationDate;
    Date lastModifiedDate;
    String createdBy;
    String updatedBy;


    public long getSponserId() {
        return sponserId;
    }

    public void setSponserId(long sponserId) {
        this.sponserId = sponserId;
    }

    public String getSponserCategory() {
        return sponserCategory;
    }

    public void setSponserCategory(String sponserCategory) {
        this.sponserCategory = sponserCategory;
    }

    public long getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(long userRolesId) {
        this.userRolesId = userRolesId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
