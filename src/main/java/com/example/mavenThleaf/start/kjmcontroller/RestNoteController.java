package com.example.mavenThleaf.start.kjmcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mavenThleaf.start.dto.MemberDto;
import com.example.mavenThleaf.start.dto.NoteDto;
import com.example.mavenThleaf.start.service.MemberService;
import com.example.mavenThleaf.start.service.NoteService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RestNoteController {
	@Autowired
	NoteService noteService;
	@Autowired
	MemberService memberService;
	

	   //문의 보내기
	   @PostMapping("/mailsend")
	   public int mailsend(NoteDto noteDto,HttpSession session,MemberDto memberDto) {
		   String userId = (String) session.getAttribute("userId");
		   memberDto.setUserId(userId);
//		   log.info("========noteDto입니다.={}",noteDto);
		   return noteService.mailsend(noteDto);
	   }
	   
		//쪽찌 자세히보기
//		@GetMapping("/detail")
//		public ArrayList<NoteDto> detailNote(Model model) {
//			ArrayList<NoteDto> maillist= noteService.NoteInfo(null);
//			return maillist;
//		}
		
		@PostMapping("/inqMainInfo")
		public ArrayList<NoteDto> inqMain(HttpSession session) {
			String userId = (String) session.getAttribute("userId");
			return noteService.inqMain(userId);
		}
		
		@PostMapping("/eventMessageinfo")
		public ArrayList<NoteDto> eventMessage(HttpSession session){
			String userId = (String) session.getAttribute("userId");
			return noteService.eventMessage(userId);
		}
		
		//답변하기
		@PostMapping("/inqAnswer")
		public int inqAnswer(NoteDto noteDto) {
			log.info("========{}",noteDto);
			return noteService.inqAnswer(noteDto);
		}
		
		
		//전체 메시지 발송
		@PostMapping("/sendToAllMembers")
		public int sendToallMembers(NoteDto noteDto, HttpSession session, MemberDto memberDto) {
			String userId = (String) session.getAttribute("userId");
			memberDto.setUserId(userId);
			return noteService.sendToallMembers(memberDto,noteDto);
		}
		
		//맴버 불러오기
		@PostMapping("/memberload")
		public ArrayList<MemberDto> memberload(MemberDto memberDto) {
			return memberService.memberload(memberDto);
		}
		
}
