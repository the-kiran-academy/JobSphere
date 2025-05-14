package com.jbk.dao;

import java.util.List;
import java.util.Set;

import com.jbk.entites.Application;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.SeekerProfile;
import com.jbk.entites.Skill;
import com.jbk.entites.User;

public interface SeekersDao {
    // Registration and Login
    User saveSeeker(User user);
    User findSeekerByEmailAndPassword(String email, String password);
    User findSeekerByEmail(String email);
    User findSeekerById(Long seekerId);

    // Account Management
    User updateSeeker(User user);
    void deleteSeeker(Long seekerId);

    // Profile Creation/Editing
    SeekerProfile saveSeekerProfile(SeekerProfile seekerProfile);
    SeekerProfile updateSeekerProfile(SeekerProfile seekerProfile);
    void deleteSeekerProfile(Long profileId);
    SeekerProfile findSeekerProfileById(Long profileId);
    SeekerProfile findSeekerProfileBySeekerId(Long seekerId);
    void addSkillsToSeekerProfile(SeekerProfile seekerProfile, Set<Skill> skills);
    void removeSkillsFromSeekerProfile(SeekerProfile seekerProfile, Set<Skill> skills);

    // Job Search
    List<Job> searchJobs(String title, String location, String salaryRange, String skillName);
    List<Job> findAllOpenJobs();
    Job findJobById(Long jobId);

    // Job Application
    Application saveApplication(Application application);

    // Application Tracking
    List<Application> findApplicationsBySeekerProfileId(Long seekerProfileId);
    Application findApplicationById(Long applicationId);

    // Communication with Employers
    Message saveMessage(Message message);
    Message markMessageAsRead(Long messageId, Boolean isRead);
    void deleteMessage(Long messageId);
    List<Message> findMessagesSentBySeeker(Long seekerId);
    List<Message> findMessagesReceivedBySeeker(Long seekerId);
    List<Message> findConversationBetweenUsers(Long seekerId, Long employerId);
}