/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.serviceconsumermanagement.v1beta1.model;

/**
 * A custom error rule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomErrorRule extends com.google.api.client.json.GenericJson {

  /**
   * Mark this message as possible payload in error response.  Otherwise, objects of this type will
   * be filtered when they appear in error payload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isErrorType;

  /**
   * Selects messages to which this rule applies.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * Mark this message as possible payload in error response.  Otherwise, objects of this type will
   * be filtered when they appear in error payload.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsErrorType() {
    return isErrorType;
  }

  /**
   * Mark this message as possible payload in error response.  Otherwise, objects of this type will
   * be filtered when they appear in error payload.
   * @param isErrorType isErrorType or {@code null} for none
   */
  public CustomErrorRule setIsErrorType(java.lang.Boolean isErrorType) {
    this.isErrorType = isErrorType;
    return this;
  }

  /**
   * Selects messages to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects messages to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public CustomErrorRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public CustomErrorRule set(String fieldName, Object value) {
    return (CustomErrorRule) super.set(fieldName, value);
  }

  @Override
  public CustomErrorRule clone() {
    return (CustomErrorRule) super.clone();
  }

}
