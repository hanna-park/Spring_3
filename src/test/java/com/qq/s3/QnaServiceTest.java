package com.qq.s3;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.qq.s3.model.board.QnaVO;
import com.qq.s3.service.board.QnaService;
import com.qq.s3.util.Pager;

public class QnaServiceTest extends TestAbstractCase{
	
	@Inject
	private QnaService qnaService;
	
	@Test
	public void qnaListTest() throws Exception {
		Pager pager = new Pager();
		List<QnaVO> ar = qnaService.qnaList(pager);
		pager.makePage(50);
		assertNotEquals(0, ar.size());
		assertEquals(10, (int)pager.getLastRow());
		
		assertEquals(1, (int)pager.getStartNum());
		assertEquals(5, (int)pager.getLastNum());
	}
	
}
