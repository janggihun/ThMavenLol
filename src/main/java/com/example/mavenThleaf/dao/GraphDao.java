package com.example.mavenThleaf.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.project.projectFinal.dto.GraphDto;

@Mapper
public interface GraphDao {

	List<HashMap<String, GraphDto>> itemGraphLine(GraphDto gDto);
	
}
