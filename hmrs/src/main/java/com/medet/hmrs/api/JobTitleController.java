package com.medet.hmrs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medet.hmrs.business.abstracts.JobTitleService;
import com.medet.hmrs.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobtitles")
public class JobTitleController {
	
	private JobTitleService jobTitleService;

	@Autowired
	public JobTitleController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@RequestMapping("/getall")
	List<JobTitle> getAll(){
		return jobTitleService.getALL();
		
	}
	
	
	

}
