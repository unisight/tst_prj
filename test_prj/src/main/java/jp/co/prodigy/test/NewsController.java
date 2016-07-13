package jp.co.prodigy.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class NewsController {

	/**
	 * ニュース一覧
	 * @param model
	 * @return
	 */
	@RequestMapping("/news")
	public String news(Model model) {
		ArrayList<ViewData> list = new ArrayList<ViewData>();
		Date nowDate = new Date();
		Calendar calendar = Calendar.getInstance();
		for(int i = 0; i < 5; i++ ) {
			ViewData v = new ViewData();
			// 暫定 : 現在の日付から  i 日前を表示
			calendar.setTime(nowDate);
			calendar.add(Calendar.DAY_OF_MONTH, -i);
			String day = new SimpleDateFormat("yyyy年MM月dd日",Locale.getDefault()).format(calendar.getTime());
			v.setDay(day);
			// 暫定 : ニュースの内容メッセージ
			v.setMessage("ニュースのテキスト" + i);
			// 暫定 : ニュースURL
			v.setUrl("2016_00_00_detail.html");
			list.add(v);
		}
		model.addAttribute("newsList", list);
		return "news";
	}
	
	/**
	 * ニュース一覧用データ
	 * @author nishimoto
	 *
	 */
	class ViewData {
	    private String day;
	    private String url;
	    private String message;
	    
		public String getDay() {
			return day;
		}
		
		public void setDay(String day) {
			this.day = day;
		}
		
		public String getMessage() {
			return message;
		}
		
		public void setMessage(String message) {
			this.message = message;
		}
		
		public String getUrl() {
			return url;
		}
		
		public void setUrl(String url) {
			this.url = url;
		}
	}
}
