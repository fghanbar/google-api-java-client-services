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

package com.google.api.services.docs.v1.model;

/**
 * A suggested change to the NamedStyles.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestedNamedStyles extends com.google.api.client.json.GenericJson {

  /**
   * A NamedStyles that only includes the changes made in this suggestion. This can be used along
   * with the named_styles_suggestion_state to see which fields have changed and their new values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamedStyles namedStyles;

  /**
   * A mask that indicates which of the fields on the base NamedStyles have been changed in this
   * suggestion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamedStylesSuggestionState namedStylesSuggestionState;

  /**
   * A NamedStyles that only includes the changes made in this suggestion. This can be used along
   * with the named_styles_suggestion_state to see which fields have changed and their new values.
   * @return value or {@code null} for none
   */
  public NamedStyles getNamedStyles() {
    return namedStyles;
  }

  /**
   * A NamedStyles that only includes the changes made in this suggestion. This can be used along
   * with the named_styles_suggestion_state to see which fields have changed and their new values.
   * @param namedStyles namedStyles or {@code null} for none
   */
  public SuggestedNamedStyles setNamedStyles(NamedStyles namedStyles) {
    this.namedStyles = namedStyles;
    return this;
  }

  /**
   * A mask that indicates which of the fields on the base NamedStyles have been changed in this
   * suggestion.
   * @return value or {@code null} for none
   */
  public NamedStylesSuggestionState getNamedStylesSuggestionState() {
    return namedStylesSuggestionState;
  }

  /**
   * A mask that indicates which of the fields on the base NamedStyles have been changed in this
   * suggestion.
   * @param namedStylesSuggestionState namedStylesSuggestionState or {@code null} for none
   */
  public SuggestedNamedStyles setNamedStylesSuggestionState(NamedStylesSuggestionState namedStylesSuggestionState) {
    this.namedStylesSuggestionState = namedStylesSuggestionState;
    return this;
  }

  @Override
  public SuggestedNamedStyles set(String fieldName, Object value) {
    return (SuggestedNamedStyles) super.set(fieldName, value);
  }

  @Override
  public SuggestedNamedStyles clone() {
    return (SuggestedNamedStyles) super.clone();
  }

}
