package com.example.mavenThleaf.start.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mavenThleaf.start.dto.ItemDto;
import com.example.mavenThleaf.start.dto.itemInfoDto;
import com.example.mavenThleaf.start.dto.itemToolTipDto;

@Mapper
public interface itemDao {
	
	public List<HashMap<String, ItemDto>> itemBuild(ItemDto iDto);

	public List<HashMap<String, ItemDto>> itemBuildperTier(ItemDto iDto);

	public List<itemToolTipDto> itemToolTip(int itemId);

	public List<HashMap<String, itemInfoDto>> itemInfo(itemInfoDto iIDto);

	public List<itemToolTipDto> allItemTT(int itemId);

}
