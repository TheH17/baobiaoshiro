/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables;


import com.iot.baobiao.jooq.Keys;
import com.iot.baobiao.jooq.Nutch;
import com.iot.baobiao.jooq.tables.records.UserRolesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class UserRoles extends TableImpl<UserRolesRecord> {

    private static final long serialVersionUID = -1131272151;

    /**
     * The reference instance of <code>nutch.user_roles</code>
     */
    public static final UserRoles USER_ROLES = new UserRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRolesRecord> getRecordType() {
        return UserRolesRecord.class;
    }

    /**
     * The column <code>nutch.user_roles.id</code>.
     */
    public final TableField<UserRolesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nutch.user_roles.user_id</code>.
     */
    public final TableField<UserRolesRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nutch.user_roles.role</code>.
     */
    public final TableField<UserRolesRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * Create a <code>nutch.user_roles</code> table reference
     */
    public UserRoles() {
        this("user_roles", null);
    }

    /**
     * Create an aliased <code>nutch.user_roles</code> table reference
     */
    public UserRoles(String alias) {
        this(alias, USER_ROLES);
    }

    private UserRoles(String alias, Table<UserRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserRoles(String alias, Table<UserRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Nutch.NUTCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserRolesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserRolesRecord> getPrimaryKey() {
        return Keys.KEY_USER_ROLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserRolesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserRolesRecord>>asList(Keys.KEY_USER_ROLES_PRIMARY, Keys.KEY_USER_ROLES_ID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRoles as(String alias) {
        return new UserRoles(alias, this);
    }

    /**
     * Rename this table
     */
    public UserRoles rename(String name) {
        return new UserRoles(name, null);
    }
}
