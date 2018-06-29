package com.restapi.backend.dao;


import java.util.List;

import com.restapi.backend.model.User;

/**
 * @author Sk Saddam Hosan
 */

public interface UserDAO {
	
	//save into database 
	User save(User user);
	
	List<User> getUserValue();

}
