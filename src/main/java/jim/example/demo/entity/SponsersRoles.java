package jim.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SponsersRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long sponsersRolesId;
    String role;
    long sponserId;


    public long getSponsersRolesId() {
        return sponsersRolesId;
    }

    public void setSponsersRolesId(long sponsersRolesId) {
        this.sponsersRolesId = sponsersRolesId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSponserId() {
        return sponserId;
    }

    public void setSponserId(long sponserId) {
        this.sponserId = sponserId;
    }
}
