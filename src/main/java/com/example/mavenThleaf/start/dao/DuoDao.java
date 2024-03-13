package com.example.mavenThleaf.start.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.DuoMsgDto;
import com.example.mavenThleaf.start.dto.DuoSearchDto;

@Mapper
public interface DuoDao {
	ArrayList<HashMap<String, DuoSearchDto>> duoInfo();

	ArrayList<HashMap<String, DuoMsgDto>> chattRoomInfo(String userId);

	DuoSearchDto infoDuoT(DuoSearchDto duoSearchDto);

	DuoMsgDto myRoomCheck(DuoMsgDto duoChattRoomDto);

	ArrayList<HashMap<String, DuoMsgDto>> msgAll(DuoMsgDto msgDto);

	void deleteChattRoom(DuoMsgDto duoChattRoomDto);

	DuoSearchDto nowlogin(DuoSearchDto duoSearchDto);

	int delete(DuoSearchDto duoSearchDto);

}
