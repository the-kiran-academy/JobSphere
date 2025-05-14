package com.jbk.service;

import java.util.List;

import com.jbk.dtos.ApplicationRequestDTO;
import com.jbk.dtos.MessageRequestDTO;
import com.jbk.dtos.SeekerProfileRequestDTO;
import com.jbk.dtos.UserRequestDTO;
import com.jbk.entites.Application;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.SeekerProfile;
import com.jbk.entites.User;

public interface SeekersService {
    // Registration and Login
    User registerSeeker(UserRequestDTO userRequest);
    User loginSeeker(UserRequestDTO userRequest);

    // Account Management
    User updateSeeker(Long seekerId, UserRequestDTO userRequest);
    void deleteSeeker(Long seekerId);
    User findSeekerById(Long seekerId);
    User findSeekerByEmail(String email);

    // Profile Creation/Editing
    SeekerProfile createSeekerProfile(Long seekerId, SeekerProfileRequestDTO profileRequest);
    SeekerProfile updateSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest);
    void deleteSeekerProfile(Long profileId);
    SeekerProfile findSeekerProfileById(Long profileId);
    SeekerProfile findSeekerProfileBySeekerId(Long seekerId);
    void addSkillsToSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest);
    void removeSkillsFromSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest);

    // Job Search
    List<Job> searchJobs(String title, String location, String salaryRange, String skillName);
    List<Job> findAllOpenJobs();
    Job findJobById(Long jobId);

    // Job Application
    Application applyToJob(ApplicationRequestDTO applicationRequest);

    // Application Tracking
    List<Application> findApplicationsBySeekerProfileId(Long seekerProfileId);
    Application findApplicationById(Long applicationId);

    // Communication with Employers
    Message sendMessageToEmployer(MessageRequestDTO messageRequest);
    Message markMessageAsRead(Long messageId);
    void deleteMessage(Long messageId);
    List<Message> findMessagesSentBySeeker(Long seekerId);
    List<Message> findMessagesReceivedBySeeker(Long seekerId);
    List<Message> findConversationWithEmployer(Long seekerId, Long employerId);
}