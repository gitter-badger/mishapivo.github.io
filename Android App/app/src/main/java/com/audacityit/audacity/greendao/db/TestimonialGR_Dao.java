package com.audacityit.audacity.greendao.db;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import com.audacityit.audacity.greendao.db.TestimonialGR_;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TESTIMONIAL_GR_".
*/
public class TestimonialGR_Dao extends AbstractDao<TestimonialGR_, Long> {

    public static final String TABLENAME = "TESTIMONIAL_GR_";

    /**
     * Properties of entity TestimonialGR_.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Image = new Property(2, String.class, "image", false, "IMAGE");
        public final static Property Project = new Property(3, String.class, "project", false, "PROJECT");
        public final static Property Url = new Property(4, String.class, "url", false, "URL");
        public final static Property Feedback = new Property(5, String.class, "feedback", false, "FEEDBACK");
        public final static Property Testimonial_id = new Property(6, long.class, "testimonial_id", false, "TESTIMONIAL_ID");
    };

    private DaoSession daoSession;

    private Query<TestimonialGR_> testimonialGR_TestimonialGR_ListQuery;

    public TestimonialGR_Dao(DaoConfig config) {
        super(config);
    }
    
    public TestimonialGR_Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TESTIMONIAL_GR_\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"IMAGE\" TEXT," + // 2: image
                "\"PROJECT\" TEXT," + // 3: project
                "\"URL\" TEXT," + // 4: url
                "\"FEEDBACK\" TEXT," + // 5: feedback
                "\"TESTIMONIAL_ID\" INTEGER NOT NULL );"); // 6: testimonial_id
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TESTIMONIAL_GR_\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, TestimonialGR_ entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(3, image);
        }
 
        String project = entity.getProject();
        if (project != null) {
            stmt.bindString(4, project);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
 
        String feedback = entity.getFeedback();
        if (feedback != null) {
            stmt.bindString(6, feedback);
        }
        stmt.bindLong(7, entity.getTestimonial_id());
    }

    @Override
    protected void attachEntity(TestimonialGR_ entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public TestimonialGR_ readEntity(Cursor cursor, int offset) {
        TestimonialGR_ entity = new TestimonialGR_( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // image
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // project
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // url
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // feedback
            cursor.getLong(offset + 6) // testimonial_id
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, TestimonialGR_ entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImage(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProject(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFeedback(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTestimonial_id(cursor.getLong(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(TestimonialGR_ entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(TestimonialGR_ entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "testimonialGR_List" to-many relationship of TestimonialGR. */
    public List<TestimonialGR_> _queryTestimonialGR_TestimonialGR_List(long testimonial_id) {
        synchronized (this) {
            if (testimonialGR_TestimonialGR_ListQuery == null) {
                QueryBuilder<TestimonialGR_> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Testimonial_id.eq(null));
                testimonialGR_TestimonialGR_ListQuery = queryBuilder.build();
            }
        }
        Query<TestimonialGR_> query = testimonialGR_TestimonialGR_ListQuery.forCurrentThread();
        query.setParameter(0, testimonial_id);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getTestimonialGRDao().getAllColumns());
            builder.append(" FROM TESTIMONIAL_GR_ T");
            builder.append(" LEFT JOIN TESTIMONIAL_GR T0 ON T.\"TESTIMONIAL_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected TestimonialGR_ loadCurrentDeep(Cursor cursor, boolean lock) {
        TestimonialGR_ entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        TestimonialGR testimonialGR = loadCurrentOther(daoSession.getTestimonialGRDao(), cursor, offset);
         if(testimonialGR != null) {
            entity.setTestimonialGR(testimonialGR);
        }

        return entity;    
    }

    public TestimonialGR_ loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<TestimonialGR_> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<TestimonialGR_> list = new ArrayList<TestimonialGR_>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<TestimonialGR_> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<TestimonialGR_> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
