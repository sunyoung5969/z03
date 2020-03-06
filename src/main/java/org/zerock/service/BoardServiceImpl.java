package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.dto.PageDTO;
import org.zerock.mapper.BoardMapper;
import org.zerock.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getPageList(PageDTO dto) {
		
		log.info("-------------------------" + mapper);
		
		return mapper.getList(dto);
	}

	@Override
	public void register(BoardVO vo) {
		
		mapper.insert(vo);
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return mapper.getTotal();
	}

}
