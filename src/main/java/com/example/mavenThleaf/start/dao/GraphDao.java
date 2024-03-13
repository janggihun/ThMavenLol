package com.example.mavenThleaf.start.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.GraphDto;

@Mapper
public interface GraphDao {

	List<HashMap<String, GraphDto>> itemGraphLine(GraphDto gDto);
	
}
