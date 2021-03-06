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

package com.google.api.services.monitoring.v3.model;

/**
 * Describes a change made to a configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MutationRecord extends com.google.api.client.json.GenericJson {

  /**
   * When the change occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String mutateTime;

  /**
   * The email address of the user making the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mutatedBy;

  /**
   * When the change occurred.
   * @return value or {@code null} for none
   */
  public String getMutateTime() {
    return mutateTime;
  }

  /**
   * When the change occurred.
   * @param mutateTime mutateTime or {@code null} for none
   */
  public MutationRecord setMutateTime(String mutateTime) {
    this.mutateTime = mutateTime;
    return this;
  }

  /**
   * The email address of the user making the change.
   * @return value or {@code null} for none
   */
  public java.lang.String getMutatedBy() {
    return mutatedBy;
  }

  /**
   * The email address of the user making the change.
   * @param mutatedBy mutatedBy or {@code null} for none
   */
  public MutationRecord setMutatedBy(java.lang.String mutatedBy) {
    this.mutatedBy = mutatedBy;
    return this;
  }

  @Override
  public MutationRecord set(String fieldName, Object value) {
    return (MutationRecord) super.set(fieldName, value);
  }

  @Override
  public MutationRecord clone() {
    return (MutationRecord) super.clone();
  }

}
