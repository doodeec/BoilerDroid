package com.doodeec.boilerdroid.db.schema;

import android.provider.BaseColumns;

public class PlaceholderDBEntry implements BaseColumns {

    public static final String TABLE_NAME = "placeholder";

    public static final String COL_name = "name";
    public static final String COL_surname = "surname";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    _ID + BaseDBContract.TYPE_INT + " PRIMARY KEY," +
                    COL_name + BaseDBContract.TYPE_TEXT + BaseDBContract.COMMA_SEPARATOR +
                    COL_surname + BaseDBContract.TYPE_TEXT + " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}