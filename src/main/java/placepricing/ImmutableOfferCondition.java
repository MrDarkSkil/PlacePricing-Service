/*
 * File Created: Saturday, 27th October 2018
 * Author: HUBERT Léo
 * -----
 * Last Modified: Tuesday, 8th January 2019
 * Modified By: HUBERT Léo
 * -----
 * Copyright - 2018 HUBERT Léo
 * <<licensetext>>
 */

package  placepricing;

import java.util.ArrayList;

import placepricing.ImmutableOfferOperation.LogicalOperator;

public interface ImmutableOfferCondition {

  public String getName();

  public String getDescription();

  public LogicalOperator getLogicalOperator();

  public ArrayList<? extends ImmutableOfferOperation> getImmutableOfferOperations();
}