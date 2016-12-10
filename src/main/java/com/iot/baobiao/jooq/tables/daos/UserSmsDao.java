/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables.daos;


import com.iot.baobiao.jooq.tables.UserSms;
import com.iot.baobiao.jooq.tables.records.UserSmsRecord;

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
public class UserSmsDao extends DAOImpl<UserSmsRecord, com.iot.baobiao.jooq.tables.pojos.UserSms, Integer> {

    /**
     * Create a new UserSmsDao without any configuration
     */
    public UserSmsDao() {
        super(UserSms.USER_SMS, com.iot.baobiao.jooq.tables.pojos.UserSms.class);
    }

    /**
     * Create a new UserSmsDao with an attached configuration
     */
    @Autowired
    public UserSmsDao(Configuration configuration) {
        super(UserSms.USER_SMS, com.iot.baobiao.jooq.tables.pojos.UserSms.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.iot.baobiao.jooq.tables.pojos.UserSms object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.UserSms> fetchById(Integer... values) {
        return fetch(UserSms.USER_SMS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.iot.baobiao.jooq.tables.pojos.UserSms fetchOneById(Integer value) {
        return fetchOne(UserSms.USER_SMS.ID, value);
    }

    /**
     * Fetch records that have <code>phonenum IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.UserSms> fetchByPhonenum(String... values) {
        return fetch(UserSms.USER_SMS.PHONENUM, values);
    }

    /**
     * Fetch records that have <code>smscode IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.UserSms> fetchBySmscode(String... values) {
        return fetch(UserSms.USER_SMS.SMSCODE, values);
    }

    /**
     * Fetch records that have <code>state IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.UserSms> fetchByState(Integer... values) {
        return fetch(UserSms.USER_SMS.STATE, values);
    }

    /**
     * Fetch records that have <code>send_time IN (values)</code>
     */
    public List<com.iot.baobiao.jooq.tables.pojos.UserSms> fetchBySendTime(LocalDateTime... values) {
        return fetch(UserSms.USER_SMS.SEND_TIME, values);
    }
}
