/*
 * This file is generated by jOOQ.
*/
package org.jooq.codes.foobar.cv.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import org.jooq.codes.foobar.cv.tables.records.ExpertiseRecord;
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
public class Expertise extends TableImpl<ExpertiseRecord> {

    private static final long serialVersionUID = -327164263;

    /**
     * The reference instance of <code>public.EXPERTISE</code>
     */
    public static final Expertise EXPERTISE = new Expertise();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExpertiseRecord> getRecordType() {
        return ExpertiseRecord.class;
    }

    /**
     * The column <code>public.EXPERTISE.ID</code>.
     */
    public final TableField<ExpertiseRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.EXPERTISE.PERSON_ID</code>.
     */
    public final TableField<ExpertiseRecord, Integer> PERSON_ID = createField("PERSON_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.EXPERTISE.LABEL</code>.
     */
    public final TableField<ExpertiseRecord, String> LABEL = createField("LABEL", org.jooq.impl.SQLDataType.VARCHAR(25).nullable(false), this, "");

    /**
     * The column <code>public.EXPERTISE.CONTENT</code>.
     */
    public final TableField<ExpertiseRecord, String> CONTENT = createField("CONTENT", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>public.EXPERTISE</code> table reference
     */
    public Expertise() {
        this(DSL.name("EXPERTISE"), null);
    }

    /**
     * Create an aliased <code>public.EXPERTISE</code> table reference
     */
    public Expertise(String alias) {
        this(DSL.name(alias), EXPERTISE);
    }

    /**
     * Create an aliased <code>public.EXPERTISE</code> table reference
     */
    public Expertise(Name alias) {
        this(alias, EXPERTISE);
    }

    private Expertise(Name alias, Table<ExpertiseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Expertise(Name alias, Table<ExpertiseRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_A, Indexes.PRIMARY_KEY_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExpertiseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXPERTISE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExpertiseRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExpertiseRecord>> getKeys() {
        return Arrays.<UniqueKey<ExpertiseRecord>>asList(Keys.CONSTRAINT_A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExpertiseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExpertiseRecord, ?>>asList(Keys.CONSTRAINT_AE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Expertise as(String alias) {
        return new Expertise(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Expertise as(Name alias) {
        return new Expertise(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Expertise rename(String name) {
        return new Expertise(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Expertise rename(Name name) {
        return new Expertise(name, null);
    }
}
