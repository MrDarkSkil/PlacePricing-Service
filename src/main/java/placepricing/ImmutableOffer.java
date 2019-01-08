/*
 * File Created: Friday, 12th October 2018
 * Author: GASTALDI R??mi
 * -----
 * Last Modified: Tuesday, 8th January 2019
 * Modified By: HUBERT Léo
 * -----
 * Copyright - 2018 GASTALDI R??mi
 * <<licensetext>>
 */

package  placepricing;

import java.util.HashMap;

public interface ImmutableOffer {
  public enum ReductionType {
    PERCENTAGE, AMOUNT;
  }

  public String getName();

  public double getReduction();

  public String getDescription();

  public ReductionType getReductionType();

  public HashMap<String, ? extends ImmutableOfferCondition> getOfferConditions();
};