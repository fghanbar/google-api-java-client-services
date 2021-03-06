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

package com.google.api.services.run.v1alpha1.model;

/**
 * CloudPubSubSourceStatus represents the current state of a CloudPubSubSource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudPubSubSourceStatus extends com.google.api.client.json.GenericJson {

  /**
   * Array of observed CloudPubSubSourceConditions, indicating the current state of the
   * CloudPubSubSource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Condition> conditions;

  /**
   * ObservedGeneration is the 'Generation' of the CloudPubSubSource that was last processed by the
   * controller.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * SinkURI is the current active sink URI that has been configured for the Source. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sinkUri;

  /**
   * Array of observed CloudPubSubSourceConditions, indicating the current state of the
   * CloudPubSubSource.
   * @return value or {@code null} for none
   */
  public java.util.List<Condition> getConditions() {
    return conditions;
  }

  /**
   * Array of observed CloudPubSubSourceConditions, indicating the current state of the
   * CloudPubSubSource.
   * @param conditions conditions or {@code null} for none
   */
  public CloudPubSubSourceStatus setConditions(java.util.List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the CloudPubSubSource that was last processed by the
   * controller.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the CloudPubSubSource that was last processed by the
   * controller.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public CloudPubSubSourceStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * SinkURI is the current active sink URI that has been configured for the Source. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getSinkUri() {
    return sinkUri;
  }

  /**
   * SinkURI is the current active sink URI that has been configured for the Source. +optional
   * @param sinkUri sinkUri or {@code null} for none
   */
  public CloudPubSubSourceStatus setSinkUri(java.lang.String sinkUri) {
    this.sinkUri = sinkUri;
    return this;
  }

  @Override
  public CloudPubSubSourceStatus set(String fieldName, Object value) {
    return (CloudPubSubSourceStatus) super.set(fieldName, value);
  }

  @Override
  public CloudPubSubSourceStatus clone() {
    return (CloudPubSubSourceStatus) super.clone();
  }

}
