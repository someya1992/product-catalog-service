package com.weeeloop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.weeeloop.model.Question;
import com.weeeloop.repo.ProductAssessmentRepository;

@Component
public class ProductAssessmentService {

	@Autowired
	private ProductAssessmentRepository assessmentRepo;
	
	
	public List<Question> getProductAssessment(String productId) {
		return assessmentRepo.fetchByProduct(Long.valueOf(productId));
	}
	
	
//	private Assessment createAssessment(String productId)
//	{
//		
//		Question q1 = new Question();
//		q1.setId(1l);
//		q1.setQues("Which cell phone do you want to give back?");
//		List<Option> options = new LinkedList<Option>();
//		Option o1= new Option();
//		o1.setOption("Apple");
//		o1.setValue(false);
//		Option o2= new Option();
//		o2.setOption("Samsung");
//		o2.setValue(false);
//		Option o3= new Option();
//		o3.setOption("Huawei");
//		o3.setValue(false);
//		Option o4= new Option();
//		o4.setOption("Sonstiges");
//		o4.setValue(false);
//		options.add(o1);
//		options.add(o2);
//		options.add(o3);
//		options.add(o4);
//		q1.setOptions(options);
//		q1.setAnswer(null);
//		
//		Question q2 = new Question();
//		q2.setId(2l);
//		q2.setQues("What is the model of your Apple phone?");
//		q2.setAnswer(null);
//		
//		Question q3 = new Question();
//		q3.setId(3l);
//		q3.setQues("Which is the internal memory of the phone?");
//		List<Option> options1 = new LinkedList<Option>();
//		Option o5= new Option();
//		o5.setOption("32GB");
//		o5.setValue(false);
//		Option o6= new Option();
//		o6.setOption("64GB");
//		o6.setValue(false);
//		Option o7= new Option();
//		o7.setOption("128GB");
//		o7.setValue(false);
//		Option o8= new Option();
//		o8.setOption("356GB");
//		o8.setValue(false);
//		options1.add(o5);
//		options1.add(o6);
//		options1.add(o7);
//		options1.add(o8);
//		q3.setOptions(options1);
//		q3.setAnswer(null);
//		
//		Question q4 = new Question();
//		q4.setId(4l);
//		q4.setQues("Are all the function properly working?");
//		List<Option> options2 = new LinkedList<Option>();
//		Option o9= new Option();
//		o9.setOption("Yes");
//		o9.setValue(false);
//		Option o10= new Option();
//		o10.setOption("No");
//		o10.setValue(false);
//		options2.add(o9);
//		options2.add(o10);
//		q4.setOptions(options2);
//		q4.setAnswer(null);
//		
//		Question q5 = new Question();
//		q5.setId(5l);
//		q5.setQues("Is the battery still ok?");
//		List<Option> options3 = new LinkedList<Option>();
//		Option o11= new Option();
//		o11.setOption("Yes, atleat 80% battery");
//		o11.setValue(false);
//		Option o12= new Option();
//		o12.setOption("No");
//		o12.setValue(false);
//		Option o13= new Option();
//		o13.setOption("I dont know");
//		o13.setValue(false);
//		Option o14= new Option();
//		o14.setOption("The battery is replaced");
//		o14.setValue(false);
//		options3.add(o11);
//		options3.add(o12);
//		options3.add(o13);
//		options3.add(o14);
//		q5.setOptions(options3);
//		q5.setAnswer(null);
//		
//		Question q6 = new Question();
//		q6.setId(6l);
//		q6.setQues("What is the optical condtion of your phone?");
//		List<Option> options4 = new LinkedList<Option>();
//		Option o15= new Option();
//		o15.setOption("Very Good");
//		o15.setValue(false);
//		Option o16= new Option();
//		o16.setOption("Good");
//		o16.setValue(false);
//		Option o17= new Option();
//		o17.setOption("Ok");
//		o17.setValue(false);
//		Option o18= new Option();
//		o18.setOption("Bad");
//		o18.setValue(false);
//		options4.add(o15);
//		options4.add(o16);
//		options4.add(o17);
//		options4.add(o18);
//		q6.setOptions(options4);
//		q6.setAnswer(null);
//		
//		Question q7 = new Question();
//		q7.setId(7l);
//		q7.setQues("Does the mobile phone have a SIM card lock (SIM/Net-Lock)");
//		List<Option> options5 = new LinkedList<Option>();
//		Option o19= new Option();
//		o19.setOption("Yes");
//		o19.setValue(false);
//		Option o20= new Option();
//		o20.setOption("No");
//		o20.setValue(false);
//		Option o21= new Option();
//		o21.setOption("I dont know");
//		o21.setValue(false);
//		options5.add(o19);
//		options5.add(o20);
//		options5.add(o21);
//		q7.setOptions(options5);
//		q7.setAnswer(null);
//		
//		List<Question> questions = new LinkedList<Question>();
//		questions.add(q7);
//		questions.add(q6);
//		questions.add(q5);
//		questions.add(q4);
//		questions.add(q3);
//		questions.add(q2);
//		questions.add(q1);
//		
//		Assessment assessment = new Assessment();
//		assessment.setQuestions(questions);
//		return assessment;
//		
//	}
	

}
