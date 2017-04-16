package com.audacityit.audacity.greendao.db;

import com.audacityit.audacity.greendao.db.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GETSTARTED_TAG".
 */
public class GetstartedTag {

    private Long id;
    private String tag;
    private long tag_id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient GetstartedTagDao myDao;

    private GetstartedGR getstartedGR;
    private Long getstartedGR__resolvedKey;


    public GetstartedTag() {
    }

    public GetstartedTag(Long id) {
        this.id = id;
    }

    public GetstartedTag(Long id, String tag, long tag_id) {
        this.id = id;
        this.tag = tag;
        this.tag_id = tag_id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGetstartedTagDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public long getTag_id() {
        return tag_id;
    }

    public void setTag_id(long tag_id) {
        this.tag_id = tag_id;
    }

    /** To-one relationship, resolved on first access. */
    public GetstartedGR getGetstartedGR() {
        long __key = this.tag_id;
        if (getstartedGR__resolvedKey == null || !getstartedGR__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GetstartedGRDao targetDao = daoSession.getGetstartedGRDao();
            GetstartedGR getstartedGRNew = targetDao.load(__key);
            synchronized (this) {
                getstartedGR = getstartedGRNew;
            	getstartedGR__resolvedKey = __key;
            }
        }
        return getstartedGR;
    }

    public void setGetstartedGR(GetstartedGR getstartedGR) {
        if (getstartedGR == null) {
            throw new DaoException("To-one property 'tag_id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.getstartedGR = getstartedGR;
            tag_id = getstartedGR.getId();
            getstartedGR__resolvedKey = tag_id;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}