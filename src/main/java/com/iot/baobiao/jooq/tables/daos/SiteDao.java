/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables.daos;


import com.iot.baobiao.jooq.tables.Site;
import com.iot.baobiao.jooq.tables.records.SiteRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class SiteDao extends DAOImpl<SiteRecord, com.iot.baobiao.jooq.tables.pojos.Site, Integer> {

    /**
     * Create a new SiteDao without any configuration
     */
    public SiteDao() {
        super(Site.SITE, com.iot.baobiao.jooq.tables.pojos.Site.class);
    }

    /**
     * Create a new SiteDao with an attached configuration
     */
    @Autowired
    public SiteDao(Configuration configuration) {
        super(Site.SITE, com.iot.baobiao.jooq.tables.pojos.Site.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.iot.baobiao.jooq.tables.pojos.Site object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.Site> fetchById(Integer... values) {
        return fetch(Site.SITE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.iot.baobiao.jooq.tables.pojos.Site fetchOneById(Integer value) {
        return fetchOne(Site.SITE.ID, value);
    }

    /**
     * Fetch records that have <code>domain IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.Site> fetchByDomain(String... values) {
        return fetch(Site.SITE.DOMAIN, values);
    }

    /**
     * Fetch a unique record that has <code>domain = value</code>
     */
    public com.iot.baobiao.jooq.tables.pojos.Site fetchOneByDomain(String value) {
        return fetchOne(Site.SITE.DOMAIN, value);
    }

    /**
     * Fetch records that have <code>start_url IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.Site> fetchByStartUrl(String... values) {
        return fetch(Site.SITE.START_URL, values);
    }

    /**
     * Fetch records that have <code>sitename IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.Site> fetchBySitename(String... values) {
        return fetch(Site.SITE.SITENAME, values);
    }

    /**
     * Fetch records that have <code>fetch_time IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.Site> fetchByFetchTime(LocalDateTime... values) {
        return fetch(Site.SITE.FETCH_TIME, values);
    }
}
