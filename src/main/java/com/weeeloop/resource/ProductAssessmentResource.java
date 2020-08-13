package com.weeeloop.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weeeloop.dto.Products;
import com.weeeloop.mapper.DtoMapper;
import com.weeeloop.model.Assessment;
import com.weeeloop.model.Question;
import com.weeeloop.service.ProductAssessmentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product/assessment")
public class ProductAssessmentResource {

	@Autowired
	private ProductAssessmentService service;

	@ApiOperation(value = "Fetches List of all questions", response = Products.class)
	@GetMapping(path = "/{productId}", produces = "application/json")
	public ResponseEntity<Assessment> getProductAssessment(@PathVariable String productId) {
		List<Question> questions = service.getProductAssessment(productId);
		return ResponseEntity.ok().body(DtoMapper.getAssessment(questions));
	}

}
