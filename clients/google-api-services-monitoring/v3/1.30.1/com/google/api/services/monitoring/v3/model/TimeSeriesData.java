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
 * Represents the values of a time series associated with a TimeSeriesDescriptor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeSeriesData extends com.google.api.client.json.GenericJson {

  /**
   * The values of the labels in the time series identifier, given in the same order as the
   * label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
   * must have a value of the type given in the corresponding entry of label_descriptors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelValue> labelValues;

  static {
    // hack to force ProGuard to consider LabelValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelValue.class);
  }

  /**
   * The points in the time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PointData> pointData;

  static {
    // hack to force ProGuard to consider PointData used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PointData.class);
  }

  /**
   * The values of the labels in the time series identifier, given in the same order as the
   * label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
   * must have a value of the type given in the corresponding entry of label_descriptors.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelValue> getLabelValues() {
    return labelValues;
  }

  /**
   * The values of the labels in the time series identifier, given in the same order as the
   * label_descriptors field of the TimeSeriesDescriptor associated with this object. Each value
   * must have a value of the type given in the corresponding entry of label_descriptors.
   * @param labelValues labelValues or {@code null} for none
   */
  public TimeSeriesData setLabelValues(java.util.List<LabelValue> labelValues) {
    this.labelValues = labelValues;
    return this;
  }

  /**
   * The points in the time series.
   * @return value or {@code null} for none
   */
  public java.util.List<PointData> getPointData() {
    return pointData;
  }

  /**
   * The points in the time series.
   * @param pointData pointData or {@code null} for none
   */
  public TimeSeriesData setPointData(java.util.List<PointData> pointData) {
    this.pointData = pointData;
    return this;
  }

  @Override
  public TimeSeriesData set(String fieldName, Object value) {
    return (TimeSeriesData) super.set(fieldName, value);
  }

  @Override
  public TimeSeriesData clone() {
    return (TimeSeriesData) super.clone();
  }

}
