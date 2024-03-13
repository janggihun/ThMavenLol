package com.example.mavenThleaf.start.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.DuoMsgDto;
import com.example.mavenThleaf.start.dto.DuoSearchDto;

@Mapper
public interface MsgDao {

	int insertMsg(DuoMsgDto msgDto);

	DuoSearchDto roomUpdate(DuoSearchDto duoSearchDto);

	DuoMsgDto connectRoom(DuoMsgDto duoChattRoomDto);

	DuoMsgDto chattInfo(DuoMsgDto mDto);

	DuoSearchDto duoInfo(DuoSearchDto mDto);

	void duoCreateMsgRoom(DuoMsgDto mDto);

	
}
