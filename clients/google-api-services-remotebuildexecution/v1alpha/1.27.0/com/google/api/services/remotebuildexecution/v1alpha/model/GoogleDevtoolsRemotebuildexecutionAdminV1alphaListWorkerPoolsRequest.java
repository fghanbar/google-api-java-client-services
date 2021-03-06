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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * Model definition for GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A filter to constrain the pools returned. Filters have the form:
   *
   *    [[AND|OR]   ]...
   *
   *  is the path for a field or map key in the Pool proto message. e.g.
   * "configuration.disk_size_gb" or "configuration.labels.key".  can be one of "<", "<=", ">=",
   * ">", "=", "!=", ":". ":" is a HAS operation for strings and repeated primitive fields.  is the
   * value to test, case-insensitive for strings. "*" stands for any value and can be used to test
   * for key presence. Parenthesis determine AND/OR precedence. In space separated restrictions, AND
   * is implicit, e.g. "a = b x = y" is equivalent to "a = b AND x = y".
   *
   * Example filter: configuration.labels.key1 = * AND (state = RUNNING OR state = UPDATING)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * Optional. A filter to constrain the pools returned. Filters have the form:
   *
   *    [[AND|OR]   ]...
   *
   *  is the path for a field or map key in the Pool proto message. e.g.
   * "configuration.disk_size_gb" or "configuration.labels.key".  can be one of "<", "<=", ">=",
   * ">", "=", "!=", ":". ":" is a HAS operation for strings and repeated primitive fields.  is the
   * value to test, case-insensitive for strings. "*" stands for any value and can be used to test
   * for key presence. Parenthesis determine AND/OR precedence. In space separated restrictions, AND
   * is implicit, e.g. "a = b x = y" is equivalent to "a = b AND x = y".
   *
   * Example filter: configuration.labels.key1 = * AND (state = RUNNING OR state = UPDATING)
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. A filter to constrain the pools returned. Filters have the form:
   *
   *    [[AND|OR]   ]...
   *
   *  is the path for a field or map key in the Pool proto message. e.g.
   * "configuration.disk_size_gb" or "configuration.labels.key".  can be one of "<", "<=", ">=",
   * ">", "=", "!=", ":". ":" is a HAS operation for strings and repeated primitive fields.  is the
   * value to test, case-insensitive for strings. "*" stands for any value and can be used to test
   * for key presence. Parenthesis determine AND/OR precedence. In space separated restrictions, AND
   * is implicit, e.g. "a = b x = y" is equivalent to "a = b AND x = y".
   *
   * Example filter: configuration.labels.key1 = * AND (state = RUNNING OR state = UPDATING)
   * @param filter filter or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Resource name of the instance. Format: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
   * @param parent parent or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest) super.clone();
  }

}
