/*
 * This file is generated by jOOQ.
*/
package org.jooq.codes.foobar.cv.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.codes.foobar.cv.tables.Education;
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
public class EducationRecord extends UpdatableRecordImpl<EducationRecord> implements Record6<Integer, Integer, Boolean, Date, Date, String> {

    private static final long serialVersionUID = -116966910;

    /**
     * Setter for <code>public.EDUCATION.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.EDUCATION.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.EDUCATION.PERSON_ID</code>.
     */
    public void setPersonId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.EDUCATION.PERSON_ID</code>.
     */
    public Integer getPersonId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.EDUCATION.COURSE</code>.
     */
    public void setCourse(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.EDUCATION.COURSE</code>.
     */
    public Boolean getCourse() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>public.EDUCATION.START_DATE</code>.
     */
    public void setStartDate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.EDUCATION.START_DATE</code>.
     */
    public Date getStartDate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.EDUCATION.END_DATE</code>.
     */
    public void setEndDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.EDUCATION.END_DATE</code>.
     */
    public Date getEndDate() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>public.EDUCATION.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.EDUCATION.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Boolean, Date, Date, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Boolean, Date, Date, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Education.EDUCATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Education.EDUCATION.PERSON_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return Education.EDUCATION.COURSE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Education.EDUCATION.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Education.EDUCATION.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Education.EDUCATION.DESCRIPTION;
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
    public Boolean component3() {
        return getCourse();
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
    public String component6() {
        return getDescription();
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
    public Boolean value3() {
        return getCourse();
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
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value2(Integer value) {
        setPersonId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value3(Boolean value) {
        setCourse(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value4(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value5(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EducationRecord values(Integer value1, Integer value2, Boolean value3, Date value4, Date value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EducationRecord
     */
    public EducationRecord() {
        super(Education.EDUCATION);
    }

    /**
     * Create a detached, initialised EducationRecord
     */
    public EducationRecord(Integer id, Integer personId, Boolean course, Date startDate, Date endDate, String description) {
        super(Education.EDUCATION);

        set(0, id);
        set(1, personId);
        set(2, course);
        set(3, startDate);
        set(4, endDate);
        set(5, description);
    }
}
