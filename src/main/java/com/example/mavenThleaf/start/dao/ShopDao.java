package com.example.mavenThleaf.start.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.MemberDto;

@Mapper
public interface ShopDao {

	MemberDto firstPointInfo();

	int plusPoint100(MemberDto memberDto);

	MemberDto findByID(MemberDto memberDto);

	int sendPoint1(MemberDto memberDto);

	int sendPoint2(MemberDto memberDto);

	int plusPoint(MemberDto memberDto);

	int minusPoint(MemberDto memberDto);


}
