package com.jbk.dtos;

public class ApplicationRequestDTO {
    private Long seekerProfileId;
    private Long jobId;
    private String coverLetter;

    // Getters and Setters
    public Long getSeekerProfileId() { return seekerProfileId; }
    public void setSeekerProfileId(Long seekerProfileId) { this.seekerProfileId = seekerProfileId; }
    public Long getJobId() { return jobId; }
    public void setJobId(Long jobId) { this.jobId = jobId; }
    public String getCoverLetter() { return coverLetter; }
    public void setCoverLetter(String coverLetter) { this.coverLetter = coverLetter; }
}