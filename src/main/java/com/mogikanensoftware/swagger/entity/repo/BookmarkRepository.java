package com.mogikanensoftware.swagger.entity.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mogikanensoftware.swagger.entity.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
	Collection<Bookmark> findByAccountUsername(String username);
}
