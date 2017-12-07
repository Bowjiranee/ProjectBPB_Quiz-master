package com.example.hp.projectbpb_quiz.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.hp.projectbpb_quiz.R;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "animal.db";
    private static final int DATABASE_VERSION = 21;

    public static final String TABLE_NAME1 = "blood";
    public static final String COL_ID1 = "_id1";
    public static final String COL_NAME1 = "blood";
    public static final String COL_PICTURE1 = "picture1";
    public static final String COL_DETAIL1 = "detail1";


    public static final String TABLE_NAME2 = "zodiac";
    public static final String COL_ID2 = "_id2";
    public static final String COL_NAME2 = "zodiac";
    public static final String COL_PICTURE2= "picture2";
    public static final String COL_DETAIL2 = "detail2";

    public static final String TABLE_NAME3 = "fruit";
    public static final String COL_ID3 = "_id3";
    public static final String COL_NAME3 = "fruit";
    public static final String COL_PICTURE3= "picture3";
    public static final String COL_DETAIL3 = "detail3";

    public static final String SQL_CREATE_TABLE = "CREATE TABLE "+TABLE_NAME1+"("
            +COL_ID1+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +COL_NAME1+" TEXT, "
            +COL_PICTURE1+" TEXT, "
            +COL_DETAIL1+" TEXT"
            +")";
    public static final String SQL_CREATE_TABLE2 = "CREATE TABLE "+TABLE_NAME2+"("
            +COL_ID2+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +COL_NAME2+" TEXT, "
            +COL_PICTURE2+" TEXT, "
            +COL_DETAIL2+" TEXT"
            +")";

    public static final String SQL_CREATE_TABLE3 = "CREATE TABLE "+TABLE_NAME3+"("
            +COL_ID3+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +COL_NAME3+" TEXT, "
            +COL_PICTURE3+" TEXT, "
            +COL_DETAIL3+" TEXT"
            +")";

    private Context mContext;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mContext = context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
        db.execSQL(SQL_CREATE_TABLE2);
        db.execSQL(SQL_CREATE_TABLE3);
        insertInitialData(db);
    }
    private void insertInitialData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        cv.put(COL_NAME1, "คุณเป็นคนเลือดกรุ๊ป A");
        cv.put(COL_PICTURE1, "a.png");
        cv.put(COL_DETAIL1, mContext.getString(R.string.details_a));
        db.insert(TABLE_NAME1,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "คุณเป็นคนเลือดกรุ๊ป B");
        cv.put(COL_PICTURE1, "b.png");
        cv.put(COL_DETAIL1, mContext.getString(R.string.details_b));
        db.insert(TABLE_NAME1,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "คุณเป็นคนเลือดกรุ๊ป O");
        cv.put(COL_PICTURE1, "o.png");
        cv.put(COL_DETAIL1, mContext.getString(R.string.details_o));
        db.insert(TABLE_NAME1,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME1, "คุณเป็นคนเลือดกรุ๊ป AB");
        cv.put(COL_PICTURE1, "ab-1.png");
        cv.put(COL_DETAIL1, mContext.getString(R.string.details_ab));
        db.insert(TABLE_NAME1,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี เมษ (Aries)");
        cv.put(COL_PICTURE2, "aries.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_aries));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี เมถุน (Gemini)");
        cv.put(COL_PICTURE2, "gemini.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_gemini));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี กรกฎ (Cancer)");
        cv.put(COL_PICTURE2, "cancer.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_cancer));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี สิงห์ (Leo)");
        cv.put(COL_PICTURE2, "leo.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_leo));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี กันย์ (Virgo)");
        cv.put(COL_PICTURE2, "virgo.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_virgo));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี ตุลย์ (Libra)");
        cv.put(COL_PICTURE2, "libra.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_libra));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี  พิจิก (Scorpio)");
        cv.put(COL_PICTURE2, "scorpio.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_scorpio));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี ธนู (Sagittarius)");
        cv.put(COL_PICTURE2, "sagittarius.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_sagittarius));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี มังกร (Capricorn)");
        cv.put(COL_PICTURE2, "capricorn.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_capricorn));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี กุมภ์ (Aquarius)");
        cv.put(COL_PICTURE2, "aquarius.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_aquarius));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME2, "คุณเกิดราศี มีน (Pisces)");
        cv.put(COL_PICTURE2, "pisces.png");
        cv.put(COL_DETAIL2, mContext.getString(R.string.details_pisces));
        db.insert(TABLE_NAME2,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ ฝรั่ง");
        cv.put(COL_PICTURE3, "guava.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_guava));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ แตงโม");
        cv.put(COL_PICTURE3, "watermelon.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_watermelon));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ มังคุด");
        cv.put(COL_PICTURE3, "mangosteen.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_mangosteen));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ แอปเปิ้ล");
        cv.put(COL_PICTURE3, "apple.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_longan));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ องุ่น");
        cv.put(COL_PICTURE3, "grape.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_grape));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ ส้ม");
        cv.put(COL_PICTURE3, "orange.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_orange));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ เชอร์รี่");
        cv.put(COL_PICTURE3, "cherry.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_lychee));
        db.insert(TABLE_NAME3,null,cv);

        cv = new ContentValues();
        cv.put(COL_NAME3, "คุณชอบ สับปะรด");
        cv.put(COL_PICTURE3, "pineapple.png");
        cv.put(COL_DETAIL3, mContext.getString(R.string.details_pineapple));
        db.insert(TABLE_NAME3,null,cv);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);

        onCreate(db);
    }
}

