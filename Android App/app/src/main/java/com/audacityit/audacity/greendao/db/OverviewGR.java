package com.audacityit.audacity.greendao.db;

import java.util.List;
import com.audacityit.audacity.greendao.db.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "OVERVIEW_GR".
 */
public class OverviewGR {

    private Long id;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient OverviewGRDao myDao;

    private List<OverviewitemsGR> overviewitemsGRList;

    public OverviewGR() {
    }

    public OverviewGR(Long id) {
        this.id = id;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getOverviewGRDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<OverviewitemsGR> getOverviewitemsGRList() {
        if (overviewitemsGRList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OverviewitemsGRDao targetDao = daoSession.getOverviewitemsGRDao();
            List<OverviewitemsGR> overviewitemsGRListNew = targetDao._queryOverviewGR_OverviewitemsGRList(id);
            synchronized (this) {
                if(overviewitemsGRList == null) {
                    overviewitemsGRList = overviewitemsGRListNew;
                }
            }
        }
        return overviewitemsGRList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetOverviewitemsGRList() {
        overviewitemsGRList = null;
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