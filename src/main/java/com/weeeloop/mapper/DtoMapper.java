package com.weeeloop.mapper;

import java.util.LinkedList;
import java.util.List;

import com.weeeloop.dto.MobileFeatureDTO;
import com.weeeloop.dto.OptionDTO;
import com.weeeloop.dto.ProductDto;
import com.weeeloop.dto.Products;
import com.weeeloop.dto.QuestionDto;
import com.weeeloop.model.Assessment;
import com.weeeloop.model.MobileFeature;
import com.weeeloop.model.Option;
import com.weeeloop.model.Product;
import com.weeeloop.model.Question;

public class DtoMapper {

	public static Products getDevices(List<Product> device) {
		List<ProductDto> list = new LinkedList<ProductDto>();
		Products devices = new Products();
		for (Product p : device) {
			ProductDto d = new ProductDto();
			d.setBrand(p.getBrand());
			d.setModel(p.getModel());
			d.setName(p.getName());
			d.setType(p.getType());
			d.setProductId(p.getId());
			List<MobileFeatureDTO> features = new LinkedList<MobileFeatureDTO>();
			for (MobileFeature mobileFeature : p.getMobileFeatures()) {
				MobileFeatureDTO dto = new MobileFeatureDTO();
				dto.setColour(mobileFeature.getColour());
				dto.setDescription(mobileFeature.getDescription());
				dto.setMemory(mobileFeature.getMemory());
				features.add(dto);
			}
			d.setFeatures(features);
			list.add(d);
		}
		devices.setDevices(list);
		return devices;
	}

	public static Assessment getAssessment(List<Question> questions) {

		Assessment assessment = new Assessment();
		List<QuestionDto> quesDTos = new LinkedList<QuestionDto>();
		for (Question ques : questions) {

			QuestionDto quesdto = new QuestionDto();
			quesdto.setId(ques.getId());
			quesdto.setQues(ques.getQues());
			quesdto.setAnswer(null);
			quesdto.setDescription(ques.getDescription());
			quesdto.setProduct_id(ques.getProduct().getId());
			List<OptionDTO> optionDto = new LinkedList<OptionDTO>();
			for (Option o : ques.getOptions()) {
				OptionDTO dto = new OptionDTO();
				dto.setId(o.getId());
				dto.setMarked(o.isMarked());
				dto.setQuestion_id(o.getQuestion().getId());
				dto.setValue(o.getValue());
				optionDto.add(dto);
			}
			quesdto.setOptions(optionDto);
			quesDTos.add(quesdto);
		}

		assessment.setQuestions(quesDTos);
		return assessment;
	}

}
