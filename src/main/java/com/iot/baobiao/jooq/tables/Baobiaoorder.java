/**
 * This class is generated by jOOQ
 */
package com.iot.baobiao.jooq.tables;


import com.iot.baobiao.converter.TimestampToLocalDateTimeConverter;
import com.iot.baobiao.jooq.Keys;
import com.iot.baobiao.jooq.Nutch;
import com.iot.baobiao.jooq.tables.records.BaobiaoorderRecord;

import java.time.LocalDateTime;
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
public class Baobiaoorder extends TableImpl<BaobiaoorderRecord> {

    private static final long serialVersionUID = -2127561701;

    /**
     * The reference instance of <code>nutch.baobiaoorder</code>
     */
    public static final Baobiaoorder BAOBIAOORDER = new Baobiaoorder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BaobiaoorderRecord> getRecordType() {
        return BaobiaoorderRecord.class;
    }

    /**
     * The column <code>nutch.baobiaoorder.id</code>.
     */
    public final TableField<BaobiaoorderRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nutch.baobiaoorder.userid</code>.
     */
    public final TableField<BaobiaoorderRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nutch.baobiaoorder.outtradeno</code>.
     */
    public final TableField<BaobiaoorderRecord, String> OUTTRADENO = createField("outtradeno", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>nutch.baobiaoorder.tradeno</code>.
     */
    public final TableField<BaobiaoorderRecord, String> TRADENO = createField("tradeno", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>nutch.baobiaoorder.amount</code>.
     */
    public final TableField<BaobiaoorderRecord, Double> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>nutch.baobiaoorder.time</code>.
     */
    public final TableField<BaobiaoorderRecord, LocalDateTime> TIME = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "", new TimestampToLocalDateTimeConverter());

    /**
     * The column <code>nutch.baobiaoorder.status</code>. 0代表成功支付，1代表等待支付，2代表未付款交易超时关闭，或支付完成后全额退款，3代表未知状态
     */
    public final TableField<BaobiaoorderRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER, this, "0代表成功支付，1代表等待支付，2代表未付款交易超时关闭，或支付完成后全额退款，3代表未知状态");

    /**
     * The column <code>nutch.baobiaoorder.phonenum</code>.
     */
    public final TableField<BaobiaoorderRecord, String> PHONENUM = createField("phonenum", org.jooq.impl.SQLDataType.VARCHAR.length(25), this, "");

    /**
     * Create a <code>nutch.baobiaoorder</code> table reference
     */
    public Baobiaoorder() {
        this("baobiaoorder", null);
    }

    /**
     * Create an aliased <code>nutch.baobiaoorder</code> table reference
     */
    public Baobiaoorder(String alias) {
        this(alias, BAOBIAOORDER);
    }

    private Baobiaoorder(String alias, Table<BaobiaoorderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Baobiaoorder(String alias, Table<BaobiaoorderRecord> aliased, Field<?>[] parameters) {
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
    public Identity<BaobiaoorderRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BAOBIAOORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BaobiaoorderRecord> getPrimaryKey() {
        return Keys.KEY_BAOBIAOORDER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BaobiaoorderRecord>> getKeys() {
        return Arrays.<UniqueKey<BaobiaoorderRecord>>asList(Keys.KEY_BAOBIAOORDER_PRIMARY, Keys.KEY_BAOBIAOORDER_ID_UNIQUE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Baobiaoorder as(String alias) {
        return new Baobiaoorder(alias, this);
    }

    /**
     * Rename this table
     */
    public Baobiaoorder rename(String name) {
        return new Baobiaoorder(name, null);
    }
}
