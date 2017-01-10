package com.androidnerdcolony.android_colony_bible.download;

import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.BookFilter;
import org.crosswire.jsword.book.install.InstallException;
import org.crosswire.jsword.book.install.InstallManager;
import org.crosswire.jsword.book.install.Installer;

import java.util.ArrayList;
import java.util.List;

import timber.log.Timber;

/**
 * Created by tiger on 1/9/2017.
 */

public class DownloadManager {

    public static final String REPOSITORY_KEY = "repository";

    public DownloadManager(){
        mInstallManager = new InstallManager()
    }

    public List<Book> getDownloadableBooks(BookFilter filter, String repo, boolean refresh) throws InstallException{

        List<Book> documents = new ArrayList<>();

        Installer installer = null;

        try{
            installer = mInstallManager.getInstaller(repo);

            if (installer == null){
                Timber.e("Error getting installer for repo " + repo);

            }
        }
    }


    private InstallManager mInstallManager;


}
