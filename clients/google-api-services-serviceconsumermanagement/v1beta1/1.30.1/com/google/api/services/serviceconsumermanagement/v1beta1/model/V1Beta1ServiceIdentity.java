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
 * A service identity in the Identity and Access Management API.
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
public final class V1Beta1ServiceIdentity extends com.google.api.client.json.GenericJson {

  /**
   * The email address of the service identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * P4 service identity resource name.
   *
   * An example name would be:
   * `services/serviceconsumermanagement.googleapis.com/projects/123/serviceIdentities/default`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The P4 service identity configuration tag. This must be defined in activation_grants. If not
   * specified when creating the account, the tag is set to "default".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The unique and stable id of the service identity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uniqueId;

  /**
   * The email address of the service identity.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The email address of the service identity.
   * @param email email or {@code null} for none
   */
  public V1Beta1ServiceIdentity setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * P4 service identity resource name.
   *
   * An example name would be:
   * `services/serviceconsumermanagement.googleapis.com/projects/123/serviceIdentities/default`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * P4 service identity resource name.
   *
   * An example name would be:
   * `services/serviceconsumermanagement.googleapis.com/projects/123/serviceIdentities/default`
   * @param name name or {@code null} for none
   */
  public V1Beta1ServiceIdentity setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The P4 service identity configuration tag. This must be defined in activation_grants. If not
   * specified when creating the account, the tag is set to "default".
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * The P4 service identity configuration tag. This must be defined in activation_grants. If not
   * specified when creating the account, the tag is set to "default".
   * @param tag tag or {@code null} for none
   */
  public V1Beta1ServiceIdentity setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The unique and stable id of the service identity.
   * @return value or {@code null} for none
   */
  public java.lang.String getUniqueId() {
    return uniqueId;
  }

  /**
   * The unique and stable id of the service identity.
   * @param uniqueId uniqueId or {@code null} for none
   */
  public V1Beta1ServiceIdentity setUniqueId(java.lang.String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  @Override
  public V1Beta1ServiceIdentity set(String fieldName, Object value) {
    return (V1Beta1ServiceIdentity) super.set(fieldName, value);
  }

  @Override
  public V1Beta1ServiceIdentity clone() {
    return (V1Beta1ServiceIdentity) super.clone();
  }

}
