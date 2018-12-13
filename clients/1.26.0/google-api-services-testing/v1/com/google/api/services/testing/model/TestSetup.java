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

package com.google.api.services.testing.model;

/**
 * A description of how to set up the Android device prior to running the test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestSetup extends com.google.api.client.json.GenericJson {

  /**
   * The device will be logged in on this account for the duration of the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Account account;

  /**
   * APKs to install in addition to those being directly tested. Currently capped at 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Apk> additionalApks;

  /**
   * List of directories on the device to upload to GCS at the end of the test; they must be
   * absolute paths under /sdcard or /data/local/tmp. Path names are restricted to characters a-z
   * A-Z 0-9 _ - . + and /
   *
   * Note: The paths /sdcard and /data will be made available and treated as implicit path
   * substitutions. E.g. if /sdcard on a particular device does not map to external storage, the
   * system will replace it with the external storage path prefix for that device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> directoriesToPull;

  /**
   * Environment variables to set for the test (only applicable for instrumentation tests).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnvironmentVariable> environmentVariables;

  /**
   * List of files to push to the device before starting the test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceFile> filesToPush;

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkProfile;

  /**
   * The device will be logged in on this account for the duration of the test.
   * @return value or {@code null} for none
   */
  public Account getAccount() {
    return account;
  }

  /**
   * The device will be logged in on this account for the duration of the test.
   * @param account account or {@code null} for none
   */
  public TestSetup setAccount(Account account) {
    this.account = account;
    return this;
  }

  /**
   * APKs to install in addition to those being directly tested. Currently capped at 100.
   * @return value or {@code null} for none
   */
  public java.util.List<Apk> getAdditionalApks() {
    return additionalApks;
  }

  /**
   * APKs to install in addition to those being directly tested. Currently capped at 100.
   * @param additionalApks additionalApks or {@code null} for none
   */
  public TestSetup setAdditionalApks(java.util.List<Apk> additionalApks) {
    this.additionalApks = additionalApks;
    return this;
  }

  /**
   * List of directories on the device to upload to GCS at the end of the test; they must be
   * absolute paths under /sdcard or /data/local/tmp. Path names are restricted to characters a-z
   * A-Z 0-9 _ - . + and /
   *
   * Note: The paths /sdcard and /data will be made available and treated as implicit path
   * substitutions. E.g. if /sdcard on a particular device does not map to external storage, the
   * system will replace it with the external storage path prefix for that device.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDirectoriesToPull() {
    return directoriesToPull;
  }

  /**
   * List of directories on the device to upload to GCS at the end of the test; they must be
   * absolute paths under /sdcard or /data/local/tmp. Path names are restricted to characters a-z
   * A-Z 0-9 _ - . + and /
   *
   * Note: The paths /sdcard and /data will be made available and treated as implicit path
   * substitutions. E.g. if /sdcard on a particular device does not map to external storage, the
   * system will replace it with the external storage path prefix for that device.
   * @param directoriesToPull directoriesToPull or {@code null} for none
   */
  public TestSetup setDirectoriesToPull(java.util.List<java.lang.String> directoriesToPull) {
    this.directoriesToPull = directoriesToPull;
    return this;
  }

  /**
   * Environment variables to set for the test (only applicable for instrumentation tests).
   * @return value or {@code null} for none
   */
  public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
    return environmentVariables;
  }

  /**
   * Environment variables to set for the test (only applicable for instrumentation tests).
   * @param environmentVariables environmentVariables or {@code null} for none
   */
  public TestSetup setEnvironmentVariables(java.util.List<EnvironmentVariable> environmentVariables) {
    this.environmentVariables = environmentVariables;
    return this;
  }

  /**
   * List of files to push to the device before starting the test.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceFile> getFilesToPush() {
    return filesToPush;
  }

  /**
   * List of files to push to the device before starting the test.
   * @param filesToPush filesToPush or {@code null} for none
   */
  public TestSetup setFilesToPush(java.util.List<DeviceFile> filesToPush) {
    this.filesToPush = filesToPush;
    return this;
  }

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkProfile() {
    return networkProfile;
  }

  /**
   * The network traffic profile used for running the test. Available network profiles can be
   * queried by using the NETWORK_CONFIGURATION environment type when calling
   * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
   * @param networkProfile networkProfile or {@code null} for none
   */
  public TestSetup setNetworkProfile(java.lang.String networkProfile) {
    this.networkProfile = networkProfile;
    return this;
  }

  @Override
  public TestSetup set(String fieldName, Object value) {
    return (TestSetup) super.set(fieldName, value);
  }

  @Override
  public TestSetup clone() {
    return (TestSetup) super.clone();
  }

}
