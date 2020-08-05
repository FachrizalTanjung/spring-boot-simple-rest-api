package id.co.idstar.rest.advice;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AppRestAdvice {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> handleException(Exception e, HttpServletResponse response) {
		e.printStackTrace();
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("status", "0");
		res.put("message", "Interval Server Error");
		return res;
	}

}
