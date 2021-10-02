package com.community.japanese.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.community.japanese.dto.LoginDTO;

public class LoginDTOValidator implements Validator {
	


	@Override
	public boolean supports(Class<?> clazz) {
		return LoginDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		LoginDTO targetData = (LoginDTO)target;
		String targetId = targetData.getUserId();
		String targetPassword = targetData.getUserPassword();
		if(targetId.length() > 20) {
			System.out.println("ID length exceed MAX (Input Data length:"+targetId.length()+")");
			errors.rejectValue("userId", "exceed MAX");
		}
		if(targetPassword.length() > 25) {
			System.out.println("ID length exceed MAX (Input Data length:"+targetPassword.length()+")");
			errors.rejectValue("userPassword", "exceed MAX");
		}
	}
}