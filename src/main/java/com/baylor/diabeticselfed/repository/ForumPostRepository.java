package com.baylor.diabeticselfed.repository;

import com.baylor.diabeticselfed.entities.Comment;
import com.baylor.diabeticselfed.entities.ForumPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ForumPostRepository extends JpaRepository<ForumPost, Long> {
    List<ForumPost> findByPatient_Id(Long patientId);
    boolean existsByIdAndPatient_Id(Long postId, Long patientId);

}