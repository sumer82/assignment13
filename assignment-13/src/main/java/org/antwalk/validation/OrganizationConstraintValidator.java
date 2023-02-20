package org.antwalk.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OrganizationConstraintValidator implements ConstraintValidator<Organization,String>
{
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context)
	{
		boolean res=value.contains("Nri Fintech");
		return res;
	}

}