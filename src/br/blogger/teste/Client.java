package br.blogger.teste;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import br.blogger.model.Cliente;

public class Client {

	public static void main(String[] args) {
		//Nome menor que 5, email invalido
		Cliente cliente = new Cliente(1, "Cris", "adminqwdadmin.com");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
		Set<ConstraintViolation<Cliente>> constraintViolations = validator.validate(cliente);
		for(ConstraintViolation<Cliente> error : constraintViolations){
			System.out.println(error.getMessage());
		}
	}
}
