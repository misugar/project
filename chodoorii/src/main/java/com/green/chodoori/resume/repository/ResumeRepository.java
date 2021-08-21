package com.green.chodoori.resume.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.chodoori.resume.domain.ResumeDto;
import com.green.chodoori.resume.domain.ResumeDtoRepo;

@Repository
public class ResumeRepository {
	
	@Autowired
	ResumeDtoRepo resumeRepo;
	
	public void saveResumeDto(ResumeDto dto) {
		resumeRepo.save(dto);
	}
	
	public void deleteResumeDto(ResumeDto dto) {
		resumeRepo.delete(dto);
	}
	
	public Optional<ResumeDto> findByIdForResume(String id) {
		return resumeRepo.findById(id);
	}
	



}
