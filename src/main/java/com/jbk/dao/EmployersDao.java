package com.jbk.dao;

import java.util.List;

import com.jbk.entites.Application;
import com.jbk.entites.Company;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.User;

public interface EmployersDao {
    // Registration and Login
    User saveEmployer(User user);
    User findEmployerByEmailAndPassword(String email, String password);
    User findEmployerByEmail(String email);
    User findEmployerById(Long employerId);

    // Account Management
    User updateEmployer(User user);
    void deleteEmployer(Long employerId);

    // Company Profile Setup
    Company saveCompanyProfile(Company company);
    Company updateCompanyProfile(Company company);
    void deleteCompanyProfile(Long companyId);
    Company findCompanyProfileById(Long companyId);
    Company findCompanyProfileByEmployerId(Long employerId);

    // Job Posting and Management
    Job saveJobPosting(Job job);
    Job updateJobPosting(Job job);
    void deleteJobPosting(Long jobId);
    Job findJobPostingById(Long jobId);
    List<Job> findJobPostingsByCompanyId(Long companyId);

    // Application Management
    List<Application> findApplicationsByJobId(Long jobId);
    Application updateApplication(Application application);
    void deleteApplication(Long applicationId);
    List<Application> findApplicationsByJobIdAndStatus(Long jobId, String status);

    // Candidate Communication
    Message saveMessage(Message message);
    Message markMessageAsRead(Long messageId, Boolean isRead);
    void deleteMessage(Long messageId);
    List<Message> findMessagesSentByEmployer(Long employerId);
    List<Message> findMessagesReceivedByEmployer(Long employerId);
    List<Message> findConversationBetweenUsers(Long employerId, Long candidateId);
}