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
 * An internal checker allows uptime checks to run on private/internal GCP resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InternalChecker extends com.google.api.client.json.GenericJson {

  /**
   * The checker's human-readable name. The display name should be unique within a Stackdriver
   * Workspace in order to make it easier to identify; however, uniqueness is not enforced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The GCP zone the uptime check should egress from. Only respected for internal uptime checks,
   * where internal_network is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcpZone;

  /**
   * A unique resource name for this InternalChecker. The format
   * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID is the stackdriver
   * workspace project for the uptime check config associated with the internal checker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives
   * (ex: "default").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The GCP project_id where the internal checker lives. Not necessary the same as the workspace
   * project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String peerProjectId;

  /**
   * The current operational state of the internal checker.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The checker's human-readable name. The display name should be unique within a Stackdriver
   * Workspace in order to make it easier to identify; however, uniqueness is not enforced.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The checker's human-readable name. The display name should be unique within a Stackdriver
   * Workspace in order to make it easier to identify; however, uniqueness is not enforced.
   * @param displayName displayName or {@code null} for none
   */
  public InternalChecker setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The GCP zone the uptime check should egress from. Only respected for internal uptime checks,
   * where internal_network is specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcpZone() {
    return gcpZone;
  }

  /**
   * The GCP zone the uptime check should egress from. Only respected for internal uptime checks,
   * where internal_network is specified.
   * @param gcpZone gcpZone or {@code null} for none
   */
  public InternalChecker setGcpZone(java.lang.String gcpZone) {
    this.gcpZone = gcpZone;
    return this;
  }

  /**
   * A unique resource name for this InternalChecker. The format
   * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID is the stackdriver
   * workspace project for the uptime check config associated with the internal checker.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A unique resource name for this InternalChecker. The format
   * is:projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID].PROJECT_ID is the stackdriver
   * workspace project for the uptime check config associated with the internal checker.
   * @param name name or {@code null} for none
   */
  public InternalChecker setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives
   * (ex: "default").
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The GCP VPC network (https://cloud.google.com/vpc/docs/vpc) where the internal resource lives
   * (ex: "default").
   * @param network network or {@code null} for none
   */
  public InternalChecker setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * The GCP project_id where the internal checker lives. Not necessary the same as the workspace
   * project.
   * @return value or {@code null} for none
   */
  public java.lang.String getPeerProjectId() {
    return peerProjectId;
  }

  /**
   * The GCP project_id where the internal checker lives. Not necessary the same as the workspace
   * project.
   * @param peerProjectId peerProjectId or {@code null} for none
   */
  public InternalChecker setPeerProjectId(java.lang.String peerProjectId) {
    this.peerProjectId = peerProjectId;
    return this;
  }

  /**
   * The current operational state of the internal checker.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current operational state of the internal checker.
   * @param state state or {@code null} for none
   */
  public InternalChecker setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public InternalChecker set(String fieldName, Object value) {
    return (InternalChecker) super.set(fieldName, value);
  }

  @Override
  public InternalChecker clone() {
    return (InternalChecker) super.clone();
  }

}
