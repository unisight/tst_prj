package jp.co.prodigy.test;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class SampleController {

	@RequestMapping("/index")
	public String main(Model model) {
        return "index";
	}
	
	class ViewData {
	    private int no;
	    private String message;
	 
	    public int getNo() {
	        return no;
	    }
	 
	    public void setNo(int no) {
	        this.no = no;
	    }
	 
	    public String getMessage() {
	        return message;
	    }
	 
	    public void setMessage(String message) {
	        this.message = message;
	    }
	 
	    public String toString() {
	        return message;
	    }
	}
}
