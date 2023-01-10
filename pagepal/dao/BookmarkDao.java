package com.bookmarkingsite.pagepal.dao;

import java.util.List;

import com.bookmarkingsite.pagepal.entities.Bookmark;
import com.bookmarkingsite.pagepal.entities.UserBookmark;
import com.bookmarkingsite.pagepal.DataStore;

public class BookmarkDao {
	public List<List<Bookmark>> getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		DataStore.add(userBookmark);
		
	}
}
