package com.jbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jbk.dtos.ApplicationRequestDTO;
import com.jbk.dtos.MessageRequestDTO;
import com.jbk.dtos.SeekerProfileRequestDTO;
import com.jbk.dtos.UserRequestDTO;
import com.jbk.entites.Application;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.SeekerProfile;
import com.jbk.entites.User;
import com.jbk.service.SeekersService;

@Service
public class SeekersServiceImpl implements SeekersService {

	@Override
	public User registerSeeker(UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginSeeker(UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateSeeker(Long seekerId, UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSeeker(Long seekerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findSeekerById(Long seekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findSeekerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeekerProfile createSeekerProfile(Long seekerId, SeekerProfileRequestDTO profileRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeekerProfile updateSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSeekerProfile(Long profileId) {
		// TODO Auto-generated method stub

	}

	@Override
	public SeekerProfile findSeekerProfileById(Long profileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SeekerProfile findSeekerProfileBySeekerId(Long seekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSkillsToSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSkillsFromSeekerProfile(Long profileId, SeekerProfileRequestDTO profileRequest) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Job> searchJobs(String title, String location, String salaryRange, String skillName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findAllOpenJobs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job findJobById(Long jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application applyToJob(ApplicationRequestDTO applicationRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> findApplicationsBySeekerProfileId(Long seekerProfileId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application findApplicationById(Long applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message sendMessageToEmployer(MessageRequestDTO messageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message markMessageAsRead(Long messageId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMessage(Long messageId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Message> findMessagesSentBySeeker(Long seekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findMessagesReceivedBySeeker(Long seekerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findConversationWithEmployer(Long seekerId, Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
