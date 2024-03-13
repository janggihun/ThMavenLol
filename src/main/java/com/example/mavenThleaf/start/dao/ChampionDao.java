package com.example.mavenThleaf.start.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.ChampionImageDto;
import com.example.mavenThleaf.start.dto.ChampionRankDto;

@Mapper
public interface ChampionDao {

	public List<HashMap<String,String>> champList();

	public List<HashMap<String,String>> searchChamp(ChampionImageDto cDto);

	public List<HashMap<String, String>> champLine(ChampionImageDto cDto);
	
	public List<HashMap<String, String>> reChampList();

	public List<HashMap<String, String>> allChampLine(ChampionImageDto cDto);

	public List<HashMap<String, ChampionRankDto>> champRankTOP();
	
	public List<HashMap<String, ChampionRankDto>> champRankJUG();
	
	public List<HashMap<String, ChampionRankDto>> champRankMID();
	
	public List<HashMap<String, ChampionRankDto>> champRankADC();
	
	public List<HashMap<String, ChampionRankDto>> champRankSUP();

	public String getKRname(ChampionImageDto ciDto);


}
