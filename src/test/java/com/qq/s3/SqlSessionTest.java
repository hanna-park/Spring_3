package com.qq.s3;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class SqlSessionTest extends TestAbstractCase{

	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void sqlTest() {
		assertNotNull(sqlSession);
		
	}

}
