package br.com.grave.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateUtilTest {
	
	@Test
	public void conectar(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.close();
	}
}
