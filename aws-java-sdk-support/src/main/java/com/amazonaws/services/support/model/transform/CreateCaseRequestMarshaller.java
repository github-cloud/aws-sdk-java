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

package com.amazonaws.services.support.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * CreateCaseRequest Marshaller
 */
public class CreateCaseRequestMarshaller implements
        Marshaller<Request<CreateCaseRequest>, CreateCaseRequest> {

    public Request<CreateCaseRequest> marshall(
            CreateCaseRequest createCaseRequest) {

        if (createCaseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateCaseRequest> request = new DefaultRequest<CreateCaseRequest>(
                createCaseRequest, "AWSSupport");
        request.addHeader("X-Amz-Target", "AWSSupport_20130415.CreateCase");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final SdkJsonGenerator jsonGenerator = new SdkJsonGenerator();

            jsonGenerator.writeStartObject();

            if (createCaseRequest.getSubject() != null) {
                jsonGenerator.writeFieldName("subject").writeValue(
                        createCaseRequest.getSubject());
            }
            if (createCaseRequest.getServiceCode() != null) {
                jsonGenerator.writeFieldName("serviceCode").writeValue(
                        createCaseRequest.getServiceCode());
            }
            if (createCaseRequest.getSeverityCode() != null) {
                jsonGenerator.writeFieldName("severityCode").writeValue(
                        createCaseRequest.getSeverityCode());
            }
            if (createCaseRequest.getCategoryCode() != null) {
                jsonGenerator.writeFieldName("categoryCode").writeValue(
                        createCaseRequest.getCategoryCode());
            }
            if (createCaseRequest.getCommunicationBody() != null) {
                jsonGenerator.writeFieldName("communicationBody").writeValue(
                        createCaseRequest.getCommunicationBody());
            }

            com.amazonaws.internal.SdkInternalList<String> ccEmailAddressesList = (com.amazonaws.internal.SdkInternalList<String>) createCaseRequest
                    .getCcEmailAddresses();
            if (!ccEmailAddressesList.isEmpty()
                    || !ccEmailAddressesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ccEmailAddresses");
                jsonGenerator.writeStartArray();
                for (String ccEmailAddressesListValue : ccEmailAddressesList) {
                    if (ccEmailAddressesListValue != null) {
                        jsonGenerator.writeValue(ccEmailAddressesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (createCaseRequest.getLanguage() != null) {
                jsonGenerator.writeFieldName("language").writeValue(
                        createCaseRequest.getLanguage());
            }
            if (createCaseRequest.getIssueType() != null) {
                jsonGenerator.writeFieldName("issueType").writeValue(
                        createCaseRequest.getIssueType());
            }
            if (createCaseRequest.getAttachmentSetId() != null) {
                jsonGenerator.writeFieldName("attachmentSetId").writeValue(
                        createCaseRequest.getAttachmentSetId());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
