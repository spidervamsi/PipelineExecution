package com.pipeline.service.workflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WorkflowService {

	@RequestMapping(value = "/getWorkflow", method = RequestMethod.GET)
	public HashMap<String, Object> getWorkflow() {

		HashMap<String, Object> workflows = getList();

		return workflows;

	}
	
	private HashMap<String, Object> getList() {

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("url", "https://github.com/Shekharrajak/PipelineExecution.git");
		
		String[] cmd = new String[] {"mvn build", "mvn test", "mvn package"};
		List<String> list_cmd = Arrays.asList(cmd);
		map.put("cmd", list_cmd);

		return map;

	}
	
}
