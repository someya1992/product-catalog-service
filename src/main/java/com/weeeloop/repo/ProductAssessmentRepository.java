package com.weeeloop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.weeeloop.model.Question;

@Repository
public interface ProductAssessmentRepository extends JpaRepository<Question,Long> {
	
	@Query("from Question q where q.product.id = :productId")
	List<Question> fetchByProduct(Long productId);
}
