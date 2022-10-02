package com.bhavna.springcore.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bhavna.springcore.bean.Student;

@Repository
public class StudentRepo {
	private Map<Integer, Student> repo;

	public Map<Integer, Student> getRepo() {
		return repo;
	}

	public void setRepo(Map<Integer, Student> repo) {
		this.repo = repo;
	}

	public StudentRepo(Map<Integer, Student> repo) {
		super();
		this.repo = repo;
	}

	public StudentRepo() {
		super();
	}

	@Override
	public String toString() {
		return "StudentRepo [repo=" + repo + "]";
	}

}
