package com.pipeline.service.workflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class WorkflowService {

//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/getWorkflow", method = RequestMethod.GET)
	public HashMap<String, String> getdata() throws JSONException {

//		logger.info("Welcome home! The client locale is");
		HashMap<String, String> workflows = getList();

		//return back to index.jsp
//		ModelAndView model = new ModelAndView("home");
//		String workflows;
//		JSONObject json = new JSONObject();
//		json.put("name", "student");
//
//		JSONArray array = new JSONArray();
//		JSONObject item = new JSONObject();
//		item.put("information", "test");
//		item.put("id", 3);
//		item.put("name", "course1");
//		array.put(item);
//
//		json.put("course", array);
//
//		workflows = json.toString();
		return list_cmd;

	}
	
	private HashMap<String, String> getList() {

		HashMap<String, String> > map = new HashMap<String, String>();
		map.put("List A");
		map.add("List B");
		map.add("List C");
		map.add("List D");
		map.add("List 1");
		map.add("List 2");
		map.add("List 3");

		return map;

	}
	
}
