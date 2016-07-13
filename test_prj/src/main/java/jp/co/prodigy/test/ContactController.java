package jp.co.prodigy.test;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {

	private static final Logger log = LoggerFactory.getLogger(ContactController.class);
	 /**
	   * selectの表示に使用するアイテム
	   */
	  final static Map<String, String> SELECT_ITEMS =
	    Collections.unmodifiableMap(new LinkedHashMap<String, String>() {
		{
	      put("就職ナビ＋の使い方に関するお問い合わせ", "就職ナビ＋の使い方に関するお問い合わせ");
	      put("ご質問・ご意見・ご感想", "ご質問・ご意見・ご感想");
	      put("システムトラブルに関するお問い合わせ", "システムトラブルに関するお問い合わせ");
	      put("採用応募情報掲載に関するお問い合わせ", "採用応募情報掲載に関するお問い合わせ");
	      put("広告掲載に関するお問い合わせ", "広告掲載に関するお問い合わせ");
	      put("広告掲載内容に関するお問い合わせ", "広告掲載内容に関するお問い合わせ");
	      put("その他", "その他");
	    }
	  });

  
	//@RequestMapping("/contact")
	@RequestMapping(value="/contact",  method = RequestMethod.GET)
	public String contact(Model model) {
		 model.addAttribute("contactForm", new ContactForm());
		 model.addAttribute("selectItems", SELECT_ITEMS);
        return "contact";
	}

    @RequestMapping(value = "/contact_check", method = RequestMethod.POST)
    public String contact_check(@ModelAttribute ContactForm contactForm, BindingResult result, Model model) {

    if (result.hasErrors()) {
    	for(FieldError err: result.getFieldErrors()) {
    		log.debug("error code = [" + err.getCode() + "]");	
    	}
    	return "contact";
    }
	model.addAttribute("contactForm", contactForm);
    return "contact_check";
}
}
