package com.jbk.service;

import java.util.List;

import com.jbk.dtos.CompanyRequestDTO;
import com.jbk.dtos.JobRequestDTO;
import com.jbk.dtos.MessageRequestDTO;
import com.jbk.dtos.UserRequestDTO;
import com.jbk.entites.Application;
import com.jbk.entites.Company;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.User;

public interface EmployersService {
    // Registration and Login
    User registerEmployer(UserRequestDTO userRequest);
    User loginEmployer(UserRequestDTO userRequest);

    // Account Management
    User updateEmployer(Long employerId, UserRequestDTO userRequest);
    void deleteEmployer(Long employerId);
    User findEmployerById(Long employerId);
    User findEmployerByEmail(String email);

    // Company Profile Setup
    Company createCompanyProfile(Long employerId, CompanyRequestDTO companyRequest);
    Company updateCompanyProfile(Long companyId, CompanyRequestDTO companyRequest);
    void deleteCompanyProfile(Long companyId);
    Company findCompanyProfileById(Long companyId);
    Company findCompanyProfileByEmployerId(Long employerId);

    // Job Posting and Management
    Job createJobPosting(Long companyId, JobRequestDTO jobRequest);
    Job updateJobPosting(Long jobId, JobRequestDTO jobRequest);
    void deleteJobPosting(Long jobId);
    Job findJobPostingById(Long jobId);
    List<Job> findJobPostingsByCompanyId(Long companyId);

    // Application Management
    List<Application> findApplicationsByJobId(Long jobId);
    Application updateApplicationStatus(Long applicationId, String status);
    void deleteApplication(Long applicationId);
    List<Application> findApplicationsByStatus(Long jobId, String status);

    // Candidate Communication
    Message sendMessageToCandidate(MessageRequestDTO messageRequest);
    Message markMessageAsRead(Long messageId);
    void deleteMessage(Long messageId);
    List<Message> findMessagesSentByEmployer(Long employerId);
    List<Message> findMessagesReceivedByEmployer(Long employerId);
    List<Message> findConversationWithCandidate(Long employerId, Long candidateId);
}