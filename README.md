# PlacePricing Service

PlacePricing is a Java library that can be used to manage places and offers. It can assign a place to a price and assign many offer to it. Also you can manage offer with an reduction value like `50`, reduction type `PERCENTAGE` or `AMOUT`, description and a name;

An offer can have many offer condition. This allow to give when an offer can be applied for example we can create an offer condition with name set to `age` and a relation operator `OR, AND, NOT` to link this condition with the next condition.

For example if we have two conditions `age` and `handicapped`  and we set relational operator to `AND`, for the offer may be applied two conditions must be valid.

So that one condition may be considered valid, we need to set offer condition operations. It will work like an array of `if`. For example i will take offer condition `age`. And i would like to set this condition valid if the persons who buy the place have more than 70 years old or have under 7 years old.   
For that we need to create two operations:
```
    relationaleOperator: SUPERIOR
    value: 70
    logicalOperator: OR

    -----------
    
    relationaleOperator: INFERIOR
    value: 7
    logicalOperator: AND // Has no effect because is the last condition

```

### Why use PlacePricing ?  
    When you need to manage places with seats  and offers like a concert hall, plane seller plan etc..


## Features 
 - Place
    - Create place
    - Delete Place
    - Edit place infos (price, color)
    - Assign place offer
    - Unassign place offer
- Offer
    - Create Offer
    - Delete Offer
    - Edit Offer infos (reduction, reductionType, description)
    - Add OfferCondition to an offer
    - Delete OfferCondition
    - Edit OfferCondition infos (description, logicalOperator)
    - Add OfferConditioOperation to an offer
    - Delete OfferConditioOperation
    - Edit OfferConditioOperation infos (value, logicalOperator, relationalOperator)


## Installation

Gradle:

```gradle
repositories {
    flatDir {
        dirs '../build/libs' // Path to the jar lib
    }
}

dependencies {
    compile name: 'placepricing'
}
```

## Usage

Don't forget to import the library when you need to use PlacePricing:
```java
import placepricing;
```

Prices Management:
```java
Princing pricingManager = new Pricing();

// Create Place
pricingService.createPlace("placeUUID", "#FFFFFF", 40);

// Edit Place
pricingService.setPlaceRatePrice("placeUUID", 40);
pricingService.setPlaceRateColor("placeUUID", "#FFFFFF");

// Get Place 
pricingService.getPlaceRate("placeUUID");

// Delete Place
pricingService.deletePlaceRate("placeUUID");

// Assign Offer
pricingService.addPlaceRateOffer("placeUUID", "offerName");

// Unsassign Offer
pricingService.removePlaceRateOffer("placeUUID", "offerName");

```

Offers Management:
```java
Princing pricingManager = new Pricing();

// Create Offer
pricingService.createOffer("offerName", "Here offer description", 50, "PERCENTAGE");

// Create Offer Condition
pricingService.createOfferCondition("offerName", "offerConditionName", "Offer condition description", "AND");

// Create Offer Condition Operation
pricingService.createOfferConditionOperation("toto1", "offerConditionName", "20", "EQUALS", "AND");

// Get Offer
pricingService.getOffer("offerName");

// Get Offer Condition
pricingService.getImmutableOfferCondition("offerName", "offerConditionName");

// Get Offer Condition Operation
pricingService.getOfferConditionOperations("offerName", "offerConditionName", 0);
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[GPL3](https://choosealicense.com/licenses/gpl-3.0/)