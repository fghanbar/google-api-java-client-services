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

package com.google.api.services.container.v1beta1.model;

/**
 * SetLabelsRequest sets the Google Cloud Platform labels on a Google Container Engine cluster,
 * which will in turn set them for Google Compute Engine resources used by that cluster
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetLabelsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Deprecated. The name of the cluster. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * Required. The fingerprint of the previous set of labels for this resource, used to detect
   * conflicts. The fingerprint is initially generated by Kubernetes Engine and changes after every
   * request to modify or update labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a get() request to the resource to get the latest
   * fingerprint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * The name (project, location, cluster id) of the cluster to set labels. Specified in the format
   * `projects/locations/clusters`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Required. The labels to set for that cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> resourceLabels;

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Required. Deprecated. The name of the cluster. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Required. Deprecated. The name of the cluster. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public SetLabelsRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * Required. The fingerprint of the previous set of labels for this resource, used to detect
   * conflicts. The fingerprint is initially generated by Kubernetes Engine and changes after every
   * request to modify or update labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a get() request to the resource to get the latest
   * fingerprint.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * Required. The fingerprint of the previous set of labels for this resource, used to detect
   * conflicts. The fingerprint is initially generated by Kubernetes Engine and changes after every
   * request to modify or update labels. You must always provide an up-to-date fingerprint hash when
   * updating or changing labels. Make a get() request to the resource to get the latest
   * fingerprint.
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public SetLabelsRequest setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * The name (project, location, cluster id) of the cluster to set labels. Specified in the format
   * `projects/locations/clusters`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster id) of the cluster to set labels. Specified in the format
   * `projects/locations/clusters`.
   * @param name name or {@code null} for none
   */
  public SetLabelsRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Required. Deprecated. The Google Developers Console [project ID or project
   * number](https://developers.google.com/console/help/new/#projectnumber). This field has been
   * deprecated and replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public SetLabelsRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Required. The labels to set for that cluster.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getResourceLabels() {
    return resourceLabels;
  }

  /**
   * Required. The labels to set for that cluster.
   * @param resourceLabels resourceLabels or {@code null} for none
   */
  public SetLabelsRequest setResourceLabels(java.util.Map<String, java.lang.String> resourceLabels) {
    this.resourceLabels = resourceLabels;
    return this;
  }

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Required. Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public SetLabelsRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public SetLabelsRequest set(String fieldName, Object value) {
    return (SetLabelsRequest) super.set(fieldName, value);
  }

  @Override
  public SetLabelsRequest clone() {
    return (SetLabelsRequest) super.clone();
  }

}
