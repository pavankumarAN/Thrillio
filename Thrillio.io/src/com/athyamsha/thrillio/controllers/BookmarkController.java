package com.athyamsha.thrillio.controllers;

import com.athyamsha.thrillio.entities.Bookmark;
import com.athyamsha.thrillio.entities.User;
import com.athyamsha.thrillio.managers.BookmarkManager;

public class BookmarkController {
	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {

	}

	public static BookmarkController getInstance() {
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
	}
}
