package com.zappiello.helpdesk.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> erros = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestamp, Integer status, String error, String message, String path) {
		super(timestamp, status, error, message, path);
	}

	public List<FieldMessage> getErros() {
		return erros;
	}

	public void addErro(String fieldName, String message) {
		this.erros.add(new FieldMessage(fieldName, message));
	}
	
	
}





















