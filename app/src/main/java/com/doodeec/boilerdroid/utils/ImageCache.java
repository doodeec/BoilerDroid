package com.doodeec.boilerdroid.utils;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * LRU cache for caching images
 */
public class ImageCache {
    // Get max available VM memory, exceeding this amount will throw an
    // OutOfMemory exception. Stored in kilobytes as LruCache takes an
    // int in its constructor.
    private static int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);

    // Use 1/8th of the available memory for this memory cache.
    private static int cacheSize = maxMemory / 8;

    // internal cache of bitmaps
    private static LruCache<String, Bitmap> mBitmapCache = new LruCache<String, Bitmap>(cacheSize) {
        @Override
        protected int sizeOf(String key, Bitmap bitmap) {
            // The cache size will be measured in kilobytes rather than
            // number of items.
            return bitmap.getByteCount() / 1024;
        }
    };

    /**
     * Adds bitmap to internal cache
     *
     * @param key    bitmap URL to future retrieval
     * @param bitmap bitmap image
     */
    public static void addBitmapToCache(String key, Bitmap bitmap) {
        if (getBitmapFromCache(key) == null) {
            mBitmapCache.put(key, bitmap);
        }
    }

    /**
     * Returns bitmap if it is stored in cache, returns null if it is not present
     *
     * @param key bitmap URL
     * @return Bitmap
     */
    public static Bitmap getBitmapFromCache(String key) {
        return mBitmapCache.get(key);
    }
}
