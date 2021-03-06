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

package com.google.api.services.dfareporting.model;

/**
 * Represents a File resource. A file contains the metadata for a report run. It shows the status of
 * the run and holds the URLs to the generated report data if the run is finished and the status is
 * "REPORT_AVAILABLE".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class File extends com.google.api.client.json.GenericJson {

  /**
   * The date range for which the file has report data. The date range will always be the absolute
   * date range for which the report is run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The filename of the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileName;

  /**
   * The output format of the report. Only available once the file is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The unique ID of this report file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#file".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The timestamp in milliseconds since epoch when this file was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedTime;

  /**
   * The ID of the report this file was generated from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long reportId;

  /**
   * The status of the report file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The URLs where the completed report file can be downloaded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Urls urls;

  /**
   * The date range for which the file has report data. The date range will always be the absolute
   * date range for which the report is run.
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * The date range for which the file has report data. The date range will always be the absolute
   * date range for which the report is run.
   * @param dateRange dateRange or {@code null} for none
   */
  public File setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public File setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The filename of the file.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * The filename of the file.
   * @param fileName fileName or {@code null} for none
   */
  public File setFileName(java.lang.String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The output format of the report. Only available once the file is available.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * The output format of the report. Only available once the file is available.
   * @param format format or {@code null} for none
   */
  public File setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * The unique ID of this report file.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * The unique ID of this report file.
   * @param id id or {@code null} for none
   */
  public File setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#file".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#file".
   * @param kind kind or {@code null} for none
   */
  public File setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The timestamp in milliseconds since epoch when this file was last modified.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  /**
   * The timestamp in milliseconds since epoch when this file was last modified.
   * @param lastModifiedTime lastModifiedTime or {@code null} for none
   */
  public File setLastModifiedTime(java.lang.Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * The ID of the report this file was generated from.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReportId() {
    return reportId;
  }

  /**
   * The ID of the report this file was generated from.
   * @param reportId reportId or {@code null} for none
   */
  public File setReportId(java.lang.Long reportId) {
    this.reportId = reportId;
    return this;
  }

  /**
   * The status of the report file.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the report file.
   * @param status status or {@code null} for none
   */
  public File setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The URLs where the completed report file can be downloaded.
   * @return value or {@code null} for none
   */
  public Urls getUrls() {
    return urls;
  }

  /**
   * The URLs where the completed report file can be downloaded.
   * @param urls urls or {@code null} for none
   */
  public File setUrls(Urls urls) {
    this.urls = urls;
    return this;
  }

  @Override
  public File set(String fieldName, Object value) {
    return (File) super.set(fieldName, value);
  }

  @Override
  public File clone() {
    return (File) super.clone();
  }

  /**
   * The URLs where the completed report file can be downloaded.
   */
  public static final class Urls extends com.google.api.client.json.GenericJson {

    /**
     * The URL for downloading the report data through the API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String apiUrl;

    /**
     * The URL for downloading the report data through a browser.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String browserUrl;

    /**
     * The URL for downloading the report data through the API.
     * @return value or {@code null} for none
     */
    public java.lang.String getApiUrl() {
      return apiUrl;
    }

    /**
     * The URL for downloading the report data through the API.
     * @param apiUrl apiUrl or {@code null} for none
     */
    public Urls setApiUrl(java.lang.String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * The URL for downloading the report data through a browser.
     * @return value or {@code null} for none
     */
    public java.lang.String getBrowserUrl() {
      return browserUrl;
    }

    /**
     * The URL for downloading the report data through a browser.
     * @param browserUrl browserUrl or {@code null} for none
     */
    public Urls setBrowserUrl(java.lang.String browserUrl) {
      this.browserUrl = browserUrl;
      return this;
    }

    @Override
    public Urls set(String fieldName, Object value) {
      return (Urls) super.set(fieldName, value);
    }

    @Override
    public Urls clone() {
      return (Urls) super.clone();
    }

  }
}
