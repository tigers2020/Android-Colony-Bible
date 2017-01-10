package com.androidnerdcolony.android_colony_bible.download;


import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.BookFilter;
import org.crosswire.jsword.book.install.InstallException;

import java.util.List;

/**
 * Created by tiger on 1/9/2017.
 */

public abstract class RepoBase {

    public abstract List<Book> getRepoBooks(boolean refresh) throws InstallException;
    public abstract String getRepoName();

    public List<Book> getBookList(BookFilter bookFilter, boolean refresh) throws InstallException{
        DownloadManager crossWireDownloadManager = new DownloadManager();

    }

}
