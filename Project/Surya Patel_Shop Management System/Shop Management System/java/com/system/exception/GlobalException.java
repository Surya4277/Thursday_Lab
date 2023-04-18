package com.system.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


import com.system.exception.CustomerNotFoundException;


@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ShopNotFoundException.class)
	public ResponseEntity<?> hotelNotFoundHandling(ShopNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<?> DishNotFoundHandling(CustomerNotFoundException exception,WebRequest request){
		ErrorDetails error = new ErrorDetails(exception.getMessage(),request.getDescription(false));
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}          

}
