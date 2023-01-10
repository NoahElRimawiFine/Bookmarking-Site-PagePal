package com.bookmarkingsite.pagepal.dao;

import java.util.List;

import com.bookmarkingsite.pagepal.entities.User;
import com.bookmarkingsite.pagepal.DataStore;

public class UserDao {
	public List<User> getUsers() {
		return DataStore.getUsers();
		
	}
}
