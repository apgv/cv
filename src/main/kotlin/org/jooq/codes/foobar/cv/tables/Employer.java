/*
 * This file is generated by jOOQ.
*/
package org.jooq.codes.foobar.cv.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.codes.foobar.cv.Indexes;
import org.jooq.codes.foobar.cv.Keys;
import org.jooq.codes.foobar.cv.Public;
import org.jooq.codes.foobar.cv.tables.records.EmployerRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Employer extends TableImpl<EmployerRecord> {

    private static final long serialVersionUID = 479838317;

    /**
     * The reference instance of <code>public.EMPLOYER</code>
     */
    public static final Employer EMPLOYER = new Employer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployerRecord> getRecordType() {
        return EmployerRecord.class;
    }

    /**
     * The column <code>public.EMPLOYER.ID</code>.
     */
    public final TableField<EmployerRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.EMPLOYER.NAME</code>.
     */
    public final TableField<EmployerRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(40).nullable(false), this, "");

    /**
     * The column <code>public.EMPLOYER.STARTED</code>.
     */
    public final TableField<EmployerRecord, Date> STARTED = createField("STARTED", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.EMPLOYER.ENDED</code>.
     */
    public final TableField<EmployerRecord, Date> ENDED = createField("ENDED", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * Create a <code>public.EMPLOYER</code> table reference
     */
    public Employer() {
        this(DSL.name("EMPLOYER"), null);
    }

    /**
     * Create an aliased <code>public.EMPLOYER</code> table reference
     */
    public Employer(String alias) {
        this(DSL.name(alias), EMPLOYER);
    }

    /**
     * Create an aliased <code>public.EMPLOYER</code> table reference
     */
    public Employer(Name alias) {
        this(alias, EMPLOYER);
    }

    private Employer(Name alias, Table<EmployerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employer(Name alias, Table<EmployerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmployerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMPLOYER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployerRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployerRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployerRecord>>asList(Keys.CONSTRAINT_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employer as(String alias) {
        return new Employer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employer as(Name alias) {
        return new Employer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employer rename(String name) {
        return new Employer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employer rename(Name name) {
        return new Employer(name, null);
    }
}
