package jim.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Candidates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long candidatesId;
    long personId;
    long sponserId;
    String internalReference;
    long assignedVettingOfficerId;
    String comments;
    long caseStatusId;
    long activationCode;
    Date activationCodeExpiryDate;
    long interviewAudioId;
    String interviewTranscript;
    String interviewSar;
    Date caseCreationDate;
    Date creationDate;
    Date lastModifiedDate;
    String createdBy;
    String updatedBy;

    public long getCandidatesId() {
        return candidatesId;
    }

    public void setCandidatesId(long candidatesId) {
        this.candidatesId = candidatesId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public long getSponserId() {
        return sponserId;
    }

    public void setSponserId(long sponserId) {
        this.sponserId = sponserId;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public long getAssignedVettingOfficerId() {
        return assignedVettingOfficerId;
    }

    public void setAssignedVettingOfficerId(long assignedVettingOfficerId) {
        this.assignedVettingOfficerId = assignedVettingOfficerId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getCaseStatusId() {
        return caseStatusId;
    }

    public void setCaseStatusId(long caseStatusId) {
        this.caseStatusId = caseStatusId;
    }

    public long getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(long activationCode) {
        this.activationCode = activationCode;
    }

    public Date getActivationCodeExpiryDate() {
        return activationCodeExpiryDate;
    }

    public void setActivationCodeExpiryDate(Date activationCodeExpiryDate) {
        this.activationCodeExpiryDate = activationCodeExpiryDate;
    }

    public long getInterviewAudioId() {
        return interviewAudioId;
    }

    public void setInterviewAudioId(long interviewAudioId) {
        this.interviewAudioId = interviewAudioId;
    }

    public String getInterviewTranscript() {
        return interviewTranscript;
    }

    public void setInterviewTranscript(String interviewTranscript) {
        this.interviewTranscript = interviewTranscript;
    }

    public String getInterviewSar() {
        return interviewSar;
    }

    public void setInterviewSar(String interviewSar) {
        this.interviewSar = interviewSar;
    }

    public Date getCaseCreationDate() {
        return caseCreationDate;
    }

    public void setCaseCreationDate(Date caseCreationDate) {
        this.caseCreationDate = caseCreationDate;
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
