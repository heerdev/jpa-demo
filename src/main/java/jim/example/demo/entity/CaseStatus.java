package jim.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CaseStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   long caseStatusId;
   String caseStatusText;

    public long getCaseStatusId() {
        return caseStatusId;
    }

    public void setCaseStatusId(long caseStatusId) {
        this.caseStatusId = caseStatusId;
    }

    public String getCaseStatusText() {
        return caseStatusText;
    }

    public void setCaseStatusText(String caseStatusText) {
        this.caseStatusText = caseStatusText;
    }
}
