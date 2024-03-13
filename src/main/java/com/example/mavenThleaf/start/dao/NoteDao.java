package com.example.mavenThleaf.start.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.MemberDto;
import com.example.mavenThleaf.start.dto.NoteDto;

@Mapper
public interface NoteDao {

	ArrayList<NoteDto> NoteInfo(MemberDto memberDto);

	int sendNote(NoteDto noteDto);

	void DeleteNote(int num);

	ArrayList<NoteDto> selectNoteById(String sendId);

	int mailsend(NoteDto noteDto);

	int findId(NoteDto noteDto);

	ArrayList<NoteDto> inqMain(String userId);

	ArrayList<NoteDto> adminInq(MemberDto memberDto);

	int sendToallMembers(MemberDto memberDto, NoteDto noteDto);

	int inqAnswer(NoteDto noteDto);

	NoteDto inqDetailView(NoteDto noteDto);

	ArrayList<NoteDto> eventMessage(String userId);


//	int findMsg(NoteDto noteDto);

}
