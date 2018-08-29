package com.candy.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.candy.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	
	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testInsert() {
		
		for(int i=0; i<20; i++) {
			
			BoardVO vo = new BoardVO();
			vo.setTitle("제목 " + i);
			vo.setContent("내용 " + i);
			vo.setWriter("user " + i);
			
			log.info("insert result :" + mapper.insert(vo));
		}
		
	}
	
	@Test
	public void read() {
		
		log.info("read....."+ mapper.read(19));
	}
	
}
