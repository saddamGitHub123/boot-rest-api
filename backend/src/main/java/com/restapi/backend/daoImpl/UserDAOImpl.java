
package com.restapi.backend.daoImpl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.backend.dao.UserDAO;
import com.restapi.backend.model.User;





@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public User save(User user) {
		
		System.out.println(" Enterring the saving user to database ");
		sessionFactory.getCurrentSession().save(user);
		return user;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserValue() {
		// TODO Auto-generated method stub
		System.out.println("Enterring the getting the list of the value");
		//String name = "saddam3";
		
		 // String selectProductsByShopId = "FROM User";
           List<User> listUser= sessionFactory
					.getCurrentSession()
					//.createCriteria(User.class)
					.createQuery("From User")
					//	.setParameter("name", name)
					.list();

		//return sessionFactory.getCurrentSession().createCriteria(User.class).list();

		//List<User> listUser = sessionFactory.getCurrentSession().createCriteria(User.class)
			//.add(Restrictions.eq("name", name))
			//	.list();
		
			//listUser.add(Projections.property("dob"));
		
	
		
		return listUser;
	}
	
	public String saveImageToLocaiton() {
		
		
		return "Image path successfully save";
	}

}
