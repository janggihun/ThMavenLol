package com.example.mavenThleaf.start.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.KakaoDto;
import com.example.mavenThleaf.start.dto.MemberDto;

@Mapper
public interface MemberDao {

	MemberDto login(MemberDto memberDto);

	int join(MemberDto memberDto);

	int find(MemberDto memberDto);

	int payDbSave(KakaoDto paymentDto);

	MemberDto main(MemberDto memberDto);

	int updatePoint(KakaoDto paymentDto);

	int ajaxtest(MemberDto memberDto);

	MemberDto joinIdCheck(MemberDto memberDto);

	void loginNow(MemberDto mDto);

	void logoutNow(String userId);

	String checkAdmin(String userId);

	ArrayList<HashMap<String, MemberDto>> memberTable();

	MemberDto addRoulette(MemberDto memberDto);

	MemberDto rouletteInfo(MemberDto memberDto);

	MemberDto minusRoulette(MemberDto memberDto);

	MemberDto findId(MemberDto memberDto);

	boolean findPw(MemberDto memberDto);

	int changePw(MemberDto memberDto);

	MemberDto myInfo(MemberDto memberDto);

	ArrayList<MemberDto> memberload(MemberDto memberDto);

	String InfoChange(MemberDto memberDto);

	int changeInfo(MemberDto memberDto);

	int changePw2(MemberDto mDto);

	int emailcheck(MemberDto memberDto);

	ArrayList<HashMap<String, Object>> paymentTable();

	int changeAuthority(Map<String, Object> aMap);

	Map<String, Object> adminCheck(String userId);

	


}