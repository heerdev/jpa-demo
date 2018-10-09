package jim.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ReportTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long reportTableId;
    long caseStatusId;
    long candidatesId;
    Date startDate;
    Date endDate;

    public long getReportTableId() {
        return reportTableId;
    }

    public void setReportTableId(long reportTableId) {
        this.reportTableId = reportTableId;
    }

    public long getCaseStatusId() {
        return caseStatusId;
    }

    public void setCaseStatusId(long caseStatusId) {
        this.caseStatusId = caseStatusId;
    }

    public long getCandidatesId() {
        return candidatesId;
    }

    public void setCandidatesId(long candidatesId) {
        this.candidatesId = candidatesId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
