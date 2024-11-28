package com.mbc.service;

import java.util.List;

import com.mbc.domain.Criteria;
import com.mbc.domain.ReviewPageDTO;
import com.mbc.domain.ReviewVO;

public interface ReviewService {
	
	public int register(ReviewVO vo);
	
	public ReviewVO get(Long rno);
	
	public int modify(ReviewVO vo);
	
	public int remove(Long rno);
	
	public List<ReviewVO> getList(Criteria cri, Long uno);
	
	public ReviewPageDTO getListPage(Criteria cri, Long uno);
}
