/**
 * 
 */
package com.full.db;

import java.util.HashSet;
import java.util.Set;

import com.full.bean.User;

/**
 * @author Salmankhan
 * @since 03-May-2017, 1:25:03 PM
 * registration-app-spring
 */
public class UserDatabase {

	private Set<User> users;
	private User currentUser;
	
	public UserDatabase() {
		users = new HashSet<>();
	}
	
	public void populateUserData() {
		
		User user1 = new User();
		user1.setUsername("johnson");
		user1.setPassword("datjohn");
		
		User user2 = new User();
		user2.setUsername("salman");
		user2.setPassword("salmankhan");
		
		users.add(user1);
		users.add(user2);
		
	}
	
	public boolean isUserNameAvailable(String username) {
		
		boolean isAvailable = false;
		
		for(User user : users) {
			
			if(username.equals(user.getUsername())) {
				
				setCurrentUser(user);
				isAvailable = true;
				break;
				
			}
			
		}
		
		return isAvailable;
		
	}
	
	public boolean doesPasswordMatch(String password) {
		return password.equals(currentUser.getPassword());
	}
	
	public void setCurrentUser(User user) {
		currentUser = user;
	}
	
}
