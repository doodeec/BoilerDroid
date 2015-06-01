package com.doodeec.boilerdroid.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.doodeec.boilerdroid.BDroidConfig;
import com.doodeec.boilerdroid.db.schema.PlaceholderDBEntry;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, BDroidConfig.DATABASE_NAME, null, BDroidConfig.DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(PlaceholderDBEntry.SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        int upgradeTo = oldVersion + 1;
        while (upgradeTo <= newVersion) {
            switch (upgradeTo) {
                case 2:
                    //changes in version 2
                    break;
            }
            upgradeTo++;
        }
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}