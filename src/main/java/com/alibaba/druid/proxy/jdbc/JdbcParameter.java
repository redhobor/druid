/*
 * Copyright 1999-2011 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.proxy.jdbc;

import java.util.Calendar;

/**
 * @author wenshao<szujobs@hotmail.com>
 */
public class JdbcParameter {

    public static final int BinaryInputStream     = 10001;
    public static final int AsciiInputStream      = 10002;
    public static final int CharacterInputStream  = 10003;
    public static final int NCharacterInputStream = 10004;
    public static final int URL                   = 10005;

    private final int       sqlType;
    private final Object    value;
    private final long      length;
    private final Calendar  calendar;

    public JdbcParameter(int sqlType, Object value, long length, Calendar calendar){
        this.sqlType = sqlType;
        this.value = value;
        this.length = length;
        this.calendar = calendar;
    }

    public JdbcParameter(int sqlType, Object value){
        this(sqlType, value, -1, null);
    }

    public JdbcParameter(int sqlType, Object value, long length){
        this(sqlType, value, length, null);
    }

    public JdbcParameter(int sqlType, Object value, Calendar calendar){
        this(sqlType, value, -1, calendar);
    }

    public Object getValue() {
        return value;
    }

    public long getLength() {
        return length;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public int getSqlType() {
        return sqlType;
    }

    public static interface TYPE {

        public static final int BinaryInputStream     = 10001;
        public static final int AsciiInputStream      = 10002;
        public static final int CharacterInputStream  = 10003;
        public static final int NCharacterInputStream = 10004;
        public static final int URL                   = 10005;
        public static final int UnicodeStream         = 10006;
        public static final int BYTES                 = 10007;

    }
}
