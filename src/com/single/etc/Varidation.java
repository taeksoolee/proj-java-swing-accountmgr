package com.single.etc;

import java.util.regex.Pattern;

// 다양한 유효성 검사를 저장하는 클래스
public class Varidation {
	/** Null 또는 ""이면 true 반환*/
	public static boolean isNullStr(String str) {
		if(str == null || str.equals("")) {
			return true;
		}
		return false;
	}
		
	/** 아이디 형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환
	 * 영문자와 숫자, 특수문자(_)로 이루어진 4~10개의 단어*/
	public static boolean isIdStr(String str) {
		if(Pattern.matches("^[0-9a-zA-Z]{4,10}$", str)) {
			return true;
		}
		return false;
	}
	
	/** 패스워드 형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환
	 * 영문자, 숫자, 특수문자(!, @, #)로 된 4~10자리 문자*/
	public static boolean isPasswordStr(String str) {
		if(Pattern.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#]).{4,10}", str)) {
			return true;
		}
		return false;
	}
	
	/** 이름형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환
	 * 한글이나 영문 3 ~ 10자리*/
	public static boolean isNameStr(String str) {
		if(Pattern.matches("[a-zA-Z가-힣]{3,10}", str)) {
			return true;
		}
		return false;
	}
	
	/** 생년월일 형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환*
	 * yyyy-mm-dd 형식이 맞는지 확인 */
	public static boolean isBirthStr(String str) {
		if(Pattern.matches("(19|20)[0-9]{2}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])", str)) {
			return true;
		}
		return false;
	}
	
	/** 전화번호 형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환
	 * ...
	 * */
	public static boolean isTelStr(String str) {
		if(Pattern.matches("(01[0139]|02|031)-(\\d{4}|\\d{3})-\\d{4}", str)) {
			return true;
		}
		return false;
	}
	
	/** 힌트 형식에 맞는지를 확인해서 맞으면 true 다르면 false 반환
	 * */
	public static boolean isHintStr(String str) {
		if(Pattern.matches(".{0,50}", str)) {
			return true;
		}
		return false;
	}
//test	
	public static void main(String[] args) {
		System.out.println(isPasswordStr("1234!@"));
	}
}