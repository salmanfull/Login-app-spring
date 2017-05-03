/**
 * 
 */
package com.full.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.full.db.UserDatabase;

/**
 * @author Salmankhan
 * @since 03-May-2017, 1:36:54 PM
 * registration-app-spring
 */
public class UserDao {

	private UserDatabase database;

	@Autowired
	public void setDatabase(UserDatabase database) {
		this.database = database;
	}
	
	public boolean isUserNameAvailable(String username) {
		return database.isUserNameAvailable(username);
	}
	
	public boolean doesPasswordMatch(String password) {
		return database.doesPasswordMatch(password);
	}
	
	public void populateUserData() {
		database.populateUserData();
	}
	
}
