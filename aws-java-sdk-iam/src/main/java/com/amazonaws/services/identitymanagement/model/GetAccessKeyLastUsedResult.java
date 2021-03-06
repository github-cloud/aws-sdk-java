/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GetAccessKeyLastUsed</a> request. It
 * is also returned as a member of the <a>AccessKeyMetaData</a> structure
 * returned by the <a>ListAccessKeys</a> action.
 * </p>
 */
public class GetAccessKeyLastUsedResult implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS IAM user that owns this access key.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Contains information about the last time the access key was used.
     * </p>
     */
    private AccessKeyLastUsed accessKeyLastUsed;

    /**
     * <p>
     * The name of the AWS IAM user that owns this access key.
     * </p>
     * 
     * @param userName
     *        The name of the AWS IAM user that owns this access key.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the AWS IAM user that owns this access key.
     * </p>
     * 
     * @return The name of the AWS IAM user that owns this access key.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the AWS IAM user that owns this access key.
     * </p>
     * 
     * @param userName
     *        The name of the AWS IAM user that owns this access key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetAccessKeyLastUsedResult withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Contains information about the last time the access key was used.
     * </p>
     * 
     * @param accessKeyLastUsed
     *        Contains information about the last time the access key was used.
     */

    public void setAccessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
        this.accessKeyLastUsed = accessKeyLastUsed;
    }

    /**
     * <p>
     * Contains information about the last time the access key was used.
     * </p>
     * 
     * @return Contains information about the last time the access key was used.
     */

    public AccessKeyLastUsed getAccessKeyLastUsed() {
        return this.accessKeyLastUsed;
    }

    /**
     * <p>
     * Contains information about the last time the access key was used.
     * </p>
     * 
     * @param accessKeyLastUsed
     *        Contains information about the last time the access key was used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetAccessKeyLastUsedResult withAccessKeyLastUsed(
            AccessKeyLastUsed accessKeyLastUsed) {
        setAccessKeyLastUsed(accessKeyLastUsed);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getAccessKeyLastUsed() != null)
            sb.append("AccessKeyLastUsed: " + getAccessKeyLastUsed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccessKeyLastUsedResult == false)
            return false;
        GetAccessKeyLastUsedResult other = (GetAccessKeyLastUsedResult) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getAccessKeyLastUsed() == null
                ^ this.getAccessKeyLastUsed() == null)
            return false;
        if (other.getAccessKeyLastUsed() != null
                && other.getAccessKeyLastUsed().equals(
                        this.getAccessKeyLastUsed()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccessKeyLastUsed() == null) ? 0
                        : getAccessKeyLastUsed().hashCode());
        return hashCode;
    }

    @Override
    public GetAccessKeyLastUsedResult clone() {
        try {
            return (GetAccessKeyLastUsedResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
