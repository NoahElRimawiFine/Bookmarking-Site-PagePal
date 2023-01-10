package com.bookmarkingsite.pagepal;

import java.util.List;

import com.bookmarkingsite.pagepal.entities.Bookmark;
import com.bookmarkingsite.pagepal.entities.User;
import com.bookmarkingsite.pagepal.managers.BookmarkManager;
import com.bookmarkingsite.pagepal.managers.UserManager;

public class Launch {
	private static List<User> users;
	private static List<List<Bookmark>> bookmarks;
	
	private static void loadData() {
		System.out.println("1. Loading data ...");
		DataStore.loadData();
		
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Printing data ...");
		//PrintUserData();
		//PrintBookmarkData();
	}
	
	private static void PrintBookmarkData() {
		for (List<Bookmark> bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
		
	}

	private static void PrintUserData() {
		for (User user : users) {
			System.out.println(user);
		}
		
	}
	
	private static void start() {
		//System.out.println("\n2. Bookmarking ...");
		for (User user : users) {
			View.browse(user,  bookmarks);
		}
		
	}

	public static void main(String[] args) {
		loadData();
		start();	
	}


}
