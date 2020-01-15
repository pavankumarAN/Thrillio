package com.athyamsha.thrillio.dao;

import com.athyamsha.thrillio.DataStore;
import com.athyamsha.thrillio.entities.Bookmark;
import com.athyamsha.thrillio.entities.UserBookMark;

public class BookmarkDao {
	public Bookmark[][] getBookmarks() {
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookMark userBookmark) {
		DataStore.add(userBookmark);
	}
}
