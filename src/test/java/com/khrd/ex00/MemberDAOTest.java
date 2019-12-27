package com.khrd.ex00;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.khrd.domain.MemberVO;
import com.khrd.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class) //bean 사용 설정
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"}) //경로설정
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO dao;
	
//	@Test
	public void testDAO(){
		System.out.println(dao);
	}
	
//	@Test
	public void testInsert() {
		MemberVO vo = new MemberVO();
		vo.setUserid("user02");
		vo.setUserpw("resu02");
		vo.setUsername("user");
		vo.setEmail("user02@email.com");
		dao.insert(vo);
	}
	
//	@Test
	public void testDelete() {
		dao.delete("user02");
	}
	
//	@Test
	public void testUpdate() {
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("resu00");
		vo.setUsername("user00");
		vo.setEmail("user00@email.com");
		dao.update(vo);
	}
	
	@Test
	public void testSelectList() {
		List<MemberVO> list = dao.selectList();
		System.out.println("===== selectList =====");
		for(MemberVO vo : list) {
			System.out.println(vo);	
		}		
	}
	
//	@Test
	public void testSelectById() {
		MemberVO vo = dao.selectById("user00");
		System.out.println(vo);	
	}
}
