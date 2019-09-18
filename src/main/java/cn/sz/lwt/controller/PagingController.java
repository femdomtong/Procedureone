package cn.sz.lwt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sz.lwt.pojo.Book;
import cn.sz.lwt.service.ProcedureService;

@Controller
@RequestMapping("/pc")
public class PagingController {
	
	@Autowired
	private ProcedureService service;
	@RequestMapping("paging")
	public void paging() {
		String pagesql = "book";
		Integer curPage = 1;
		Integer pageSize = 11;
		Integer totalRecords = null;
		Integer totalPages = null;
		List<Book> list = new ArrayList<Book>();
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("p_pagesql", pagesql);
		map.put("p_curPage", curPage);
		map.put("p_pageSize", pageSize);
		map.put("p_totalRecords", totalRecords);
		map.put("p_totalPages", totalPages);
		map.put("pageResultSet", list);
		
		service.paging(map);
		Set<Entry<String, Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			if("pageResultSet"==key) {
				@SuppressWarnings("unchecked")//压制警告
				List<Book> books =(List<Book>)map.get(key);
				for (Book book : books) {
					System.out.println(book.getBook_name());
				}
			}else {
				System.out.println("key: "+key+" value: "+entry.getValue());
			}
			
		}
		
	}
	
}
