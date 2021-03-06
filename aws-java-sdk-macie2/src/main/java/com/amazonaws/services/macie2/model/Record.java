/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the location of an occurrence of sensitive data in an Apache Parquet file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/Record" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Record implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The row index, starting from 0, for the row that contains the data.
     * </p>
     */
    private Long recordIndex;

    /**
     * <p>
     * The row index, starting from 0, for the row that contains the data.
     * </p>
     * 
     * @param recordIndex
     *        The row index, starting from 0, for the row that contains the data.
     */

    public void setRecordIndex(Long recordIndex) {
        this.recordIndex = recordIndex;
    }

    /**
     * <p>
     * The row index, starting from 0, for the row that contains the data.
     * </p>
     * 
     * @return The row index, starting from 0, for the row that contains the data.
     */

    public Long getRecordIndex() {
        return this.recordIndex;
    }

    /**
     * <p>
     * The row index, starting from 0, for the row that contains the data.
     * </p>
     * 
     * @param recordIndex
     *        The row index, starting from 0, for the row that contains the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Record withRecordIndex(Long recordIndex) {
        setRecordIndex(recordIndex);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRecordIndex() != null)
            sb.append("RecordIndex: ").append(getRecordIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getRecordIndex() == null ^ this.getRecordIndex() == null)
            return false;
        if (other.getRecordIndex() != null && other.getRecordIndex().equals(this.getRecordIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordIndex() == null) ? 0 : getRecordIndex().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.RecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
