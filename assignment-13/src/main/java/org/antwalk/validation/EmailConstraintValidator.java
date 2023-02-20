package org.antwalk.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailConstraintValidator implements ConstraintValidator<Email,String>
{
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
		boolean res=value.contains("nrifintech");
		return res;
	}
}

