package com.weeeloop.service;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.DecisionTableConfiguration;
import org.kie.internal.builder.DecisionTableInputType;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatelessKnowledgeSession;

import com.weeeloop.model.MobileRuleParameters;
import com.weeeloop.model.MobileRuleParameters.DAMAGE;
import com.weeeloop.model.MobileRuleParameters.MOBILEAGE;
import com.weeeloop.model.MobileRuleParameters.MOBILEBRAND;
import com.weeeloop.model.MobileRuleParameters.OPTICALCONDITION;
import com.weeeloop.model.MobileRuleParameters.SIMLOCK;

public class OptionEvaluationService {
	
	private static StatelessKnowledgeSession session;
	 
		
	public static void main(String[] args) throws Exception {
		
		KnowledgeBase knowledgeBase = createKnowledgeBaseFromSpreadsheet();
        session = knowledgeBase.newStatelessKnowledgeSession();
        
		MobileRuleParameters param = new MobileRuleParameters();
		param.setBrand(MOBILEBRAND.NO);
		param.setDamage(DAMAGE.YES);
		param.setMobileAge(MOBILEAGE.NEW);
		param.setOpticalCondition(OPTICALCONDITION.NEW);
		param.setSimLock(SIMLOCK.NO);
		
		session.execute(param);
		System.out.println(param.getResult());
		
	}
	
	 private static KnowledgeBase createKnowledgeBaseFromSpreadsheet()
	            throws Exception {
	        DecisionTableConfiguration dtconf = KnowledgeBuilderFactory
	                .newDecisionTableConfiguration();
	        dtconf.setInputType(DecisionTableInputType.XLS);
	 
	        KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory
	                .newKnowledgeBuilder();
	        knowledgeBuilder.add(ResourceFactory
	                .newClassPathResource("MobileRules.xls"),
	                ResourceType.DTABLE, dtconf);
	 
	        if (knowledgeBuilder.hasErrors()) {
	            throw new RuntimeException(knowledgeBuilder.getErrors().toString());
	        }       
	 
	        KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
	        knowledgeBase.addKnowledgePackages(knowledgeBuilder
	                .getKnowledgePackages());
	        return knowledgeBase;
	    }
	
	
	 
	 
	 
	 
	 
	 

}
