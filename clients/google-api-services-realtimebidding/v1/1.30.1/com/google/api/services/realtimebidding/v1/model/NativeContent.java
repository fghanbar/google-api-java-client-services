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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Native content for a creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NativeContent extends com.google.api.client.json.GenericJson {

  /**
   * The name of the advertiser or sponsor, to be displayed in the ad creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String advertiserName;

  /**
   * The app icon, for app download ads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image appIcon;

  /**
   * A long description of the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String body;

  /**
   * A label for the button that the user is supposed to click.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callToAction;

  /**
   * The URL that the browser/SDK will load when the user clicks the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clickLinkUrl;

  /**
   * The URL to use for click tracking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clickTrackingUrl;

  /**
   * A short title for the ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headline;

  /**
   * A large image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image image;

  /**
   * A smaller image, for the advertiser's logo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Image logo;

  /**
   * The price of the promoted app including currency info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String priceDisplayText;

  /**
   * The app rating in the app store. Must be in the range [0-5].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double starRating;

  /**
   * The URL to fetch a native video ad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoUrl;

  /**
   * The name of the advertiser or sponsor, to be displayed in the ad creative.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdvertiserName() {
    return advertiserName;
  }

  /**
   * The name of the advertiser or sponsor, to be displayed in the ad creative.
   * @param advertiserName advertiserName or {@code null} for none
   */
  public NativeContent setAdvertiserName(java.lang.String advertiserName) {
    this.advertiserName = advertiserName;
    return this;
  }

  /**
   * The app icon, for app download ads.
   * @return value or {@code null} for none
   */
  public Image getAppIcon() {
    return appIcon;
  }

  /**
   * The app icon, for app download ads.
   * @param appIcon appIcon or {@code null} for none
   */
  public NativeContent setAppIcon(Image appIcon) {
    this.appIcon = appIcon;
    return this;
  }

  /**
   * A long description of the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getBody() {
    return body;
  }

  /**
   * A long description of the ad.
   * @param body body or {@code null} for none
   */
  public NativeContent setBody(java.lang.String body) {
    this.body = body;
    return this;
  }

  /**
   * A label for the button that the user is supposed to click.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallToAction() {
    return callToAction;
  }

  /**
   * A label for the button that the user is supposed to click.
   * @param callToAction callToAction or {@code null} for none
   */
  public NativeContent setCallToAction(java.lang.String callToAction) {
    this.callToAction = callToAction;
    return this;
  }

  /**
   * The URL that the browser/SDK will load when the user clicks the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getClickLinkUrl() {
    return clickLinkUrl;
  }

  /**
   * The URL that the browser/SDK will load when the user clicks the ad.
   * @param clickLinkUrl clickLinkUrl or {@code null} for none
   */
  public NativeContent setClickLinkUrl(java.lang.String clickLinkUrl) {
    this.clickLinkUrl = clickLinkUrl;
    return this;
  }

  /**
   * The URL to use for click tracking.
   * @return value or {@code null} for none
   */
  public java.lang.String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  /**
   * The URL to use for click tracking.
   * @param clickTrackingUrl clickTrackingUrl or {@code null} for none
   */
  public NativeContent setClickTrackingUrl(java.lang.String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * A short title for the ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeadline() {
    return headline;
  }

  /**
   * A short title for the ad.
   * @param headline headline or {@code null} for none
   */
  public NativeContent setHeadline(java.lang.String headline) {
    this.headline = headline;
    return this;
  }

  /**
   * A large image.
   * @return value or {@code null} for none
   */
  public Image getImage() {
    return image;
  }

  /**
   * A large image.
   * @param image image or {@code null} for none
   */
  public NativeContent setImage(Image image) {
    this.image = image;
    return this;
  }

  /**
   * A smaller image, for the advertiser's logo.
   * @return value or {@code null} for none
   */
  public Image getLogo() {
    return logo;
  }

  /**
   * A smaller image, for the advertiser's logo.
   * @param logo logo or {@code null} for none
   */
  public NativeContent setLogo(Image logo) {
    this.logo = logo;
    return this;
  }

  /**
   * The price of the promoted app including currency info.
   * @return value or {@code null} for none
   */
  public java.lang.String getPriceDisplayText() {
    return priceDisplayText;
  }

  /**
   * The price of the promoted app including currency info.
   * @param priceDisplayText priceDisplayText or {@code null} for none
   */
  public NativeContent setPriceDisplayText(java.lang.String priceDisplayText) {
    this.priceDisplayText = priceDisplayText;
    return this;
  }

  /**
   * The app rating in the app store. Must be in the range [0-5].
   * @return value or {@code null} for none
   */
  public java.lang.Double getStarRating() {
    return starRating;
  }

  /**
   * The app rating in the app store. Must be in the range [0-5].
   * @param starRating starRating or {@code null} for none
   */
  public NativeContent setStarRating(java.lang.Double starRating) {
    this.starRating = starRating;
    return this;
  }

  /**
   * The URL to fetch a native video ad.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoUrl() {
    return videoUrl;
  }

  /**
   * The URL to fetch a native video ad.
   * @param videoUrl videoUrl or {@code null} for none
   */
  public NativeContent setVideoUrl(java.lang.String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  @Override
  public NativeContent set(String fieldName, Object value) {
    return (NativeContent) super.set(fieldName, value);
  }

  @Override
  public NativeContent clone() {
    return (NativeContent) super.clone();
  }

}
