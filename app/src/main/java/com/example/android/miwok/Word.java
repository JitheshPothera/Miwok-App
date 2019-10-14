package com.example.android.miwok;



public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private int mSoundResourceID = NO_SOUND_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constant value that represents no sound was provided for this word */
    private static final int NO_SOUND_PROVIDED = -1;


    public Word(String miwokTranslation, String defaultTranslation, int soundResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundResourceID = soundResourceID;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int soundResourceID) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceID = imageResourceID;
        mSoundResourceID = soundResourceID;
    }

    public String getMiwokTraslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTraslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {return mImageResourceID;}
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourceID() { return mSoundResourceID;}

    public boolean hasSound() {
        return mSoundResourceID != NO_SOUND_PROVIDED;
    }

}
