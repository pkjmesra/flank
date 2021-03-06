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
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * Information about the client which invoked the test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClientInfo extends com.google.api.client.json.GenericJson {

  /**
   * The list of detailed information about client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ClientInfoDetail> clientInfoDetails;

  /**
   * Client name, such as gcloud. Required
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The list of detailed information about client.
   * @return value or {@code null} for none
   */
  public java.util.List<ClientInfoDetail> getClientInfoDetails() {
    return clientInfoDetails;
  }

  /**
   * The list of detailed information about client.
   * @param clientInfoDetails clientInfoDetails or {@code null} for none
   */
  public ClientInfo setClientInfoDetails(java.util.List<ClientInfoDetail> clientInfoDetails) {
    this.clientInfoDetails = clientInfoDetails;
    return this;
  }

  /**
   * Client name, such as gcloud. Required
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Client name, such as gcloud. Required
   * @param name name or {@code null} for none
   */
  public ClientInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ClientInfo set(String fieldName, Object value) {
    return (ClientInfo) super.set(fieldName, value);
  }

  @Override
  public ClientInfo clone() {
    return (ClientInfo) super.clone();
  }

}
