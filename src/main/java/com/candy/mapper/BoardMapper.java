package com.candy.mapper;

import com.candy.domain.BoardVO;

public interface BoardMapper {

	public int insert(BoardVO vo);
	
	public BoardVO read(int bno);
	
	
	
}
