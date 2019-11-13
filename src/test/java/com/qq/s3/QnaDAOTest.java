package com.qq.s3;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.qq.s3.dao.board.QnaDAO;
import com.qq.s3.model.board.QnaVO;

public class QnaDAOTest extends TestAbstractCase {

	@Inject
	private QnaDAO qnaDAO;
	
	//@Test
	public void qnaDAOTest(){
		assertNotNull(qnaDAO);
	}
	
	//@Test
	public void qnaListTest() throws Exception{
		
		//List<QnaVO> ar = qnaDAO.qnaList();
		//assertNotEquals(0, ar.size());
		
	}
	
	@Test
	public void qnaInsertTest() throws Exception{
		
		QnaVO qnaVO = new QnaVO();
		for(int i=0;i<100;i++) {
			qnaVO.setWriter("qw"+i);
			qnaVO.setTitle("qt"+i);
			qnaVO.setContents("qc"+i);
			
			//int result = qnaDAO.qnaInsert(qnaVO);
		}
		
	}
	
	
}
