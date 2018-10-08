package jim.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserRoles {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    long userRolesId;
    String role;
    long personId;

    public long getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(long userRolesId) {
        this.userRolesId = userRolesId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
