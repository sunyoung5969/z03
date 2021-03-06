package org.zerock.service;

import java.util.List;

import org.zerock.dto.PageDTO;
import org.zerock.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> getPageList(PageDTO dto);
	
	public int getTotal();
	
	public void register(BoardVO vo);
}
