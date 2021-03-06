/*
 * File Created: Friday, 12th October 2018
 * Author: GASTALDI Rémi
 * -----
 * Last Modified: Tuesday, 8th January 2019
 * Modified By: HUBERT Léo
 * -----
 * Copyright - 2018 GASTALDI Rémi
 * <<licensetext>>
 */

package  placepricing;

import java.io.Serializable;

public class OfferOperation implements ImmutableOfferOperation, Serializable {

  private static final long serialVersionUID = 1L;
  private String _value;
  private RelationalOperator _relationalOperator;
  private LogicalOperator _logicalOperator;

  public OfferOperation(String value, RelationalOperator relationalOperator, LogicalOperator logicalOperator) {
    this._value = value;
    this._relationalOperator = relationalOperator;
    this._logicalOperator = logicalOperator;
  }

  @Override
  public String getValue() {
    return _value;
  }

  @Override
  public RelationalOperator getRelationalOperator() {
    return _relationalOperator;
  }

  @Override
  public LogicalOperator getLogicalOperator() {
    return _logicalOperator;
  }

  public void setValue(String value) {
    this._value = value;
  }

  public void setRelationalOperator(RelationalOperator relationalOperator) {
    this._relationalOperator = relationalOperator;
  }

  public void setLogicalOperator(LogicalOperator logicalOperator) {
    this._logicalOperator = logicalOperator;
  }

};