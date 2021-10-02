package com.community.japanese.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BoardIdNumValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return String.class.equals(clazz);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

}
