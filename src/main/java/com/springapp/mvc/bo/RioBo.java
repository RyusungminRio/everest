package com.springapp.mvc.bo;

import com.springapp.mvc.repository.RioDB;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Coupang on 2014. 9. 24..
 */
@Service("rioBo")
public class RioBo {
	@Resource
	private SessionFactory sessionFactory;

	public List<RioDB> getAll(){
		Session session = sessionFactory.openSession();
		List<RioDB> empList = (List<RioDB>) session.createCriteria(RioDB.class).list();
		return empList;
	}
	public void add(RioDB rioDB){
		Session session = sessionFactory.openSession();
		session.save(rioDB);
		session.flush();
	}
}
