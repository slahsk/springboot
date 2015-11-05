package com.sb.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sb.study.entity.Member;

@Controller
public class StudyController {
	
	@Autowired
	private StudyService studyService; 
	
	@RequestMapping("/test")
    public String test() {
        return "test";
    }
	
	@RequestMapping("/ajaxTest")
	@ResponseBody
	public String ajaxTest(){
		return "test";
	}
	
	
	@RequestMapping(value= "/member/create",method =RequestMethod.POST)
	public ResponseEntity<Member> createMember(@RequestBody Member member){
		return new ResponseEntity<Member>(studyService.createMember(member),HttpStatus.CREATED);
	}
	
	@RequestMapping(value= "/member/{id}",method =RequestMethod.GET)
	public ResponseEntity<Member> getMember(@PathVariable Long id){
		return new ResponseEntity<Member>(studyService.getMember(id),HttpStatus.OK);
	}
	
	
	
}
