/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables.records;


import com.iot.baobiao.jooq.tables.UserRoles;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserRolesRecord extends UpdatableRecordImpl<UserRolesRecord> implements Record3<Integer, Integer, String> {

    private static final long serialVersionUID = 311002235;

    /**
     * Setter for <code>nutch.user_roles.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>nutch.user_roles.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>nutch.user_roles.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>nutch.user_roles.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>nutch.user_roles.role</code>.
     */
    public void setRole(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>nutch.user_roles.role</code>.
     */
    public String getRole() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserRoles.USER_ROLES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserRoles.USER_ROLES.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return UserRoles.USER_ROLES.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRolesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRolesRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRolesRecord value3(String value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRolesRecord values(Integer value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRolesRecord
     */
    public UserRolesRecord() {
        super(UserRoles.USER_ROLES);
    }

    /**
     * Create a detached, initialised UserRolesRecord
     */
    public UserRolesRecord(Integer id, Integer userId, String role) {
        super(UserRoles.USER_ROLES);

        set(0, id);
        set(1, userId);
        set(2, role);
    }
}
