package com.example.mavenThleaf.start.jghController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mavenThleaf.start.dao.MsgDao;
import com.example.mavenThleaf.start.dto.DuoMsgDto;
import com.example.mavenThleaf.start.dto.DuoSearchDto;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ChattRepository {
	@Autowired
	MsgDao msgDao;

	public DuoSearchDto roomUpdate(DuoSearchDto mDto) {

		
		
		return msgDao.roomUpdate(mDto);

	}

	public DuoMsgDto chattInfo(DuoMsgDto mDto) {

		return msgDao.chattInfo(mDto);

	}

	public DuoSearchDto duoInfo(DuoSearchDto mDto) {
		return msgDao.duoInfo(mDto);
	}

	public DuoMsgDto duoCreateMsgRoom(DuoMsgDto mDto) {

		return msgDao.connectRoom(mDto);
	}

	public void insertMsg(DuoMsgDto mDto) {
		msgDao.insertMsg(mDto);

	}

}
