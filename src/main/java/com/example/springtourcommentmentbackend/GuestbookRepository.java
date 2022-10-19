package com.example.springtourcommentmentbackend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository extends JpaRepository<GuestbookEntry, Long> {

	
	public List<GuestbookEntry> findAllByOrderByIdDesc();
}
