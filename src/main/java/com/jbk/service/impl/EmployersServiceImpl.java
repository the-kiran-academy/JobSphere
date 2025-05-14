package com.jbk.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jbk.dtos.CompanyRequestDTO;
import com.jbk.dtos.JobRequestDTO;
import com.jbk.dtos.MessageRequestDTO;
import com.jbk.dtos.UserRequestDTO;
import com.jbk.entites.Application;
import com.jbk.entites.Company;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.User;
import com.jbk.service.EmployersService;

@Service
public class EmployersServiceImpl implements EmployersService {

	@Override
	public User registerEmployer(UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loginEmployer(UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmployer(Long employerId, UserRequestDTO userRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployer(Long employerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findEmployerById(Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findEmployerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company createCompanyProfile(Long employerId, CompanyRequestDTO companyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company updateCompanyProfile(Long companyId, CompanyRequestDTO companyRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCompanyProfile(Long companyId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Company findCompanyProfileById(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company findCompanyProfileByEmployerId(Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job createJobPosting(Long companyId, JobRequestDTO jobRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job updateJobPosting(Long jobId, JobRequestDTO jobRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJobPosting(Long jobId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Job findJobPostingById(Long jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findJobPostingsByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Application> findApplicationsByJobId(Long jobId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application updateApplicationStatus(Long applicationId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteApplication(Long applicationId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Application> findApplicationsByStatus(Long jobId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message sendMessageToCandidate(MessageRequestDTO messageRequest) {
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
	public List<Message> findMessagesSentByEmployer(Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findMessagesReceivedByEmployer(Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> findConversationWithCandidate(Long employerId, Long candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

}
