package com.example.mavenThleaf.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mavenThleaf.start.dao.KjmItemDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KjmItemService {
	@Autowired
	KjmItemDao kjmItemDao;
	public Object iteminfo() {
		kjmItemDao.iteminfo();
		return null;
	}

}
