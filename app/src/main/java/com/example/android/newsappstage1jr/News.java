package com.example.android.newsappstage1jr;


import java.util.Date;

public class News {
    /**
     * News title
     */
    private String mTitle;

    /**
     * Section of the news
     */
    private String mSectionName;

    /**
     * Section of the news
     */
    private String mAuthorName;

    /**
     * Date of publication
     */
    private Date mPublicationDate;


    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title          is the title of the news
     * @param sectionName        is the section where the news is locates
     //* @param image             is the thumbnail pic for the news
     * @param authorName      is the name of the author
     * @param publicationDate    is the date of the publicatiom
     * @param url    is the url for the detail of the news
     */
    public News(String title, String sectionName, String authorName, Date publicationDate, String url) {
        mTitle = title;
        mSectionName = sectionName;
        mAuthorName = authorName;
        mPublicationDate = publicationDate;
        mUrl = url;
    }

    /**
     * Returns the title of the news.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the news.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the author´s name.
     */
    public String getAuthorName() {
        return mAuthorName;
    }

    /**
     * Returns the publication date of the news.
     */
    public Date getPublicationDate() {
        return mPublicationDate;
    }

    /**
     *Returns the website URL to find more information about the earthquake.
     *
     */
    public String getUrl() {
        return mUrl;
    }
}

