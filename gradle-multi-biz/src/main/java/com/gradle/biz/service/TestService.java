package com.gradle.biz.service;

import org.springframework.stereotype.Service;

/**
 * <p>Test Service</p>
 * @author tlddb
 *
 */
@Service
public class TestService {
	
	/**
	 * <p>테스트</p>
	 * @return String 아무거나
	 */
	public String test() {
		return "biz service test ..";
	}
	
	public String dataInfo(String name, String phone) {
		if(name.length() < 1 || phone.length() < 1) {
			return "이름과 전화번호를 입력해 주세요.";
		} else {
			return "정상입력 ::" + name + " / " + phone;
		}
	}
}
