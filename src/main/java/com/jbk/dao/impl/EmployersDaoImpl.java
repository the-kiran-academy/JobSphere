package com.jbk.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.dao.EmployersDao;
import com.jbk.entites.Application;
import com.jbk.entites.Company;
import com.jbk.entites.Job;
import com.jbk.entites.Message;
import com.jbk.entites.User;

@Repository
public class EmployersDaoImpl implements EmployersDao {

	@Override
	public User saveEmployer(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findEmployerByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findEmployerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findEmployerById(Long employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateEmployer(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployer(Long employerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Company saveCompanyProfile(Company company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company updateCompanyProfile(Company company) {
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
	public Job saveJobPosting(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Job updateJobPosting(Job job) {
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
	public Application updateApplication(Application application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteApplication(Long applicationId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Application> findApplicationsByJobIdAndStatus(Long jobId, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message saveMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message markMessageAsRead(Long messageId, Boolean isRead) {
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
	public List<Message> findConversationBetweenUsers(Long employerId, Long candidateId) {
		// TODO Auto-generated method stub
		return null;
	}

}
