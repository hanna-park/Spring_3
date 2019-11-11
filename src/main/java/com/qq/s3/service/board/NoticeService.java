package com.qq.s3.service.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.qq.s3.dao.board.NoticeDAO;
import com.qq.s3.model.board.NoticeVO;
import com.qq.s3.util.Pager;
import com.qq.s3.util.RowMaker;

@Service
public class NoticeService {
	
	@Inject
	private NoticeDAO noticeDAO;
	
	public int noticeUpdate(NoticeVO noticeVO) throws Exception{
		return noticeDAO.noticeUpdate(noticeVO);
	}
	
	public List<NoticeVO> noticeList(Pager pager) throws Exception{
		RowMaker rowMaker = pager.makeRow();
		pager.makePager(noticeDAO.noticeCount());
		
		
		return noticeDAO.noticeList(rowMaker);
		
	}
	
	public NoticeVO noticeSelect(int num) throws Exception{
		return noticeDAO.noticeSelect(num);
		
	}
	
	public int noticeInsert(NoticeVO noticeVO) throws Exception{
		return noticeDAO.noticeInsert(noticeVO);

	}
	
	public int noticeDelete(int num) throws Exception{
		return noticeDAO.noticeDelete(num);
	}
	
	
}
