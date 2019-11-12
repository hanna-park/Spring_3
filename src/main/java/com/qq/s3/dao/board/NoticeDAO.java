package com.qq.s3.dao.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.qq.s3.model.board.NoticeVO;
import com.qq.s3.util.Pager;
import com.qq.s3.util.RowMaker;

@Repository
public class NoticeDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE = "noticeMapper.";	//final : 변경되지 않고 상수로 씀
	
	
	public int noticeCount(Pager pager) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE+"noticeCount",pager);
	}
	
	public int noticeUpdate(NoticeVO noticeVO) throws Exception{
		
		return sqlSession.update(NAMESPACE+"noticeUpdate",noticeVO);
	}
	
	
	public List<NoticeVO> noticeList(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"noticeList",pager);
	}
	
	
	public NoticeVO noticeSelect(int num) throws Exception{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("num", num);
		return sqlSession.selectOne(NAMESPACE+"noticeSelect", map);
		
	}
	
	
	public int noticeDelete(int num) throws Exception{
		
		return sqlSession.delete(NAMESPACE+"noticeDelete", num);
	}
	
	public int noticeInsert(NoticeVO noticeVO) throws Exception{
		
		return sqlSession.insert(NAMESPACE+"noticeInsert", noticeVO);
		
	}

}
