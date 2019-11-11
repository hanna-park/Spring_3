package com.qq.s3.dao.board;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.qq.s3.TestAbstractCase;
import com.qq.s3.model.board.NoticeVO;

public class NoticeDAOTest extends TestAbstractCase{

	@Inject
	private NoticeDAO noticeDAO;
	
	
	//@Test
	public void checkDAO() throws Exception{
		assertNotNull(noticeDAO);
		
	}
	
	@Test
	public void noticeCount() throws Exception{
		
		int result = noticeDAO.noticeCount();
		assertEquals(120, result);
		
	}
	

	//@Test
	public void noticeInsertTest() throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		for(int i=0;i<120;i++) {
			noticeVO.setTitle("aa"+i);
			noticeVO.setWriter("www"+i);
			noticeVO.setContents("caasas"+i);
			
			int result = noticeDAO.noticeInsert(noticeVO);
		}
	}
	
	
	//@Test
	public void noticeDeleteTest() throws Exception{
		
		int num=4;
		int result = noticeDAO.noticeDelete(num);
		
		assertEquals(1, result);
	}
	
	//@Test
	public void noticeSelectTest() throws Exception{
		
		NoticeVO noticeVO = noticeDAO.noticeSelect(1);
		
		assertNotNull(noticeVO);
	}
	
	//@Test
	public void noticeListTest() throws Exception{

		//List<NoticeVO> li =  noticeDAO.noticeList();
		
	}
	
	//@Test
	public void noticeUpdate() throws Exception{
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(9);
		noticeVO.setTitle("ee");
		noticeVO.setContents("ee");
		
				
		int result = noticeDAO.noticeUpdate(noticeVO);
		assertNotNull(result);
	}
	
	
}
