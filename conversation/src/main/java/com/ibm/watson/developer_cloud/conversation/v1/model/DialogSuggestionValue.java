/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * An object defining the message input, intents, and entities to be sent to the Conversation service if the user
 * selects the corresponding disambiguation option.
 */
public class DialogSuggestionValue extends GenericModel {

  private InputData input;
  private List<RuntimeIntent> intents;
  private List<RuntimeEntity> entities;

  /**
   * Gets the input.
   *
   * The user input.
   *
   * @return the input
   */
  public InputData getInput() {
    return input;
  }

  /**
   * Gets the intents.
   *
   * An array of intents to be sent along with the user input.
   *
   * @return the intents
   */
  public List<RuntimeIntent> getIntents() {
    return intents;
  }

  /**
   * Gets the entities.
   *
   * An array of entities to be sent along with the user input.
   *
   * @return the entities
   */
  public List<RuntimeEntity> getEntities() {
    return entities;
  }

  /**
   * Sets the input.
   *
   * @param input the new input
   */
  public void setInput(final InputData input) {
    this.input = input;
  }

  /**
   * Sets the intents.
   *
   * @param intents the new intents
   */
  public void setIntents(final List<RuntimeIntent> intents) {
    this.intents = intents;
  }

  /**
   * Sets the entities.
   *
   * @param entities the new entities
   */
  public void setEntities(final List<RuntimeEntity> entities) {
    this.entities = entities;
  }
}
