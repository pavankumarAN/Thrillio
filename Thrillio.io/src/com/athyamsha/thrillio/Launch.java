package com.athyamsha.thrillio;

import com.athyamsha.thrillio.entities.Bookmark;
import com.athyamsha.thrillio.entities.User;
import com.athyamsha.thrillio.managers.BookmarkManager;
import com.athyamsha.thrillio.managers.UserManagers;

public class Launch {
	private static User[] users;
	private static Bookmark[][] bookmarks;

	private static void loadData() {
		System.out.println("1. Loading data");
		DataStore.loadData();
		users = UserManagers.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();

		System.out.println("Printing the data");

		printUserData();
		printBookMarkData();
	}

	private static void printUserData() {
		for (User user : users) {
			System.out.println(user);
		}
	}

	private static void printBookMarkData() {
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
	}

	private static void startBookmarking() {
		System.out.println("\n2. Bookmarking");
		for(User user: users) {
			View.bookmark(user, bookmarks);
		}
	}

	public static void main(String[] args) {
		loadData();
		startBookmarking();
	}
}
