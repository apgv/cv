/*
 * This file is generated by jOOQ.
*/
package org.jooq.codes.foobar.cv.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.codes.foobar.cv.tables.Employer;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EmployerRecord extends UpdatableRecordImpl<EmployerRecord> implements Record5<Integer, Integer, String, Date, Date> {

    private static final long serialVersionUID = 330866886;

    /**
     * Setter for <code>public.EMPLOYER.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.EMPLOYER.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.EMPLOYER.PERSON_ID</code>.
     */
    public void setPersonId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.EMPLOYER.PERSON_ID</code>.
     */
    public Integer getPersonId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.EMPLOYER.NAME</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.EMPLOYER.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.EMPLOYER.START_DATE</code>.
     */
    public void setStartDate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.EMPLOYER.START_DATE</code>.
     */
    public Date getStartDate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.EMPLOYER.END_DATE</code>.
     */
    public void setEndDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.EMPLOYER.END_DATE</code>.
     */
    public Date getEndDate() {
        return (Date) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Date, Date> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Date, Date> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Employer.EMPLOYER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Employer.EMPLOYER.PERSON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Employer.EMPLOYER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Employer.EMPLOYER.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Employer.EMPLOYER.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getEndDate();
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
        return getPersonId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord value2(Integer value) {
        setPersonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord value4(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord value5(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployerRecord values(Integer value1, Integer value2, String value3, Date value4, Date value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployerRecord
     */
    public EmployerRecord() {
        super(Employer.EMPLOYER);
    }

    /**
     * Create a detached, initialised EmployerRecord
     */
    public EmployerRecord(Integer id, Integer personId, String name, Date startDate, Date endDate) {
        super(Employer.EMPLOYER);

        set(0, id);
        set(1, personId);
        set(2, name);
        set(3, startDate);
        set(4, endDate);
    }
}
