package com.gradle.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gradle.biz.service.TestService;

/**
 * <p>Home Controller</p>
 * @author tlddbs1
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	TestService testService;
	
	/**
	 * <p>인덱스</p>
	 * @return String 인덱스
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	/**
	 * <p>인풋 테스트</p>
	 * @return String url
	 */
	@RequestMapping("/input")
	public String input() {
		return "input";
	}
	
	/**
	 * <p>서비스 ajax</p>
	 * @return String url
	 */
	@PostMapping("/data/test")
	public @ResponseBody String dataTest(@RequestBody Map<String, Object> params) {
		String result = testService.dataInfo(params.get("name").toString()
										, params.get("phone").toString());
		return result;
	}
	
	/**
	 * <p>테스트 페이지</p>
	 * @return String url
	 */
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	
}
