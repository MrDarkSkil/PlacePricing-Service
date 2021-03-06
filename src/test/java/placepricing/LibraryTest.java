/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package placepricing;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void testCreateOffer() {
        Pricing pricingService = new Pricing();

        pricingService.createOffer("toto1", "Je sais pas encore", 50, "PERCENTAGE");
        assertNotNull("getOffer should be not null", pricingService.getOffer("toto1"));
        assertEquals("getOffer getName should return 'toto1'", pricingService.getOffer("toto1").getName(), "toto1");
        assertEquals("getOffer getDescription should return 'Je ne sais pas encore'", pricingService.getOffer("toto1").getDescription(), "Je sais pas encore");
        assertEquals("getOffer getReduction should return '50'", pricingService.getOffer("toto1").getReduction(), 50, 0.001);
        assertEquals("getOffer getReductionType should return 'PERCENTAGE'", pricingService.getOffer("toto1").getReductionType().toString(), "PERCENTAGE");

        pricingService.createOffer("toto2", "Je sais pas encore 2", 42, "AMOUNT");
        assertNotNull("getOffer should be not null", pricingService.getOffer("toto2"));
        assertEquals("getOffer getName should return 'toto2'", pricingService.getOffer("toto2").getName(), "toto2");
        assertEquals("getOffer getDescription should return 'Je ne sais pas encore'", pricingService.getOffer("toto2").getDescription(), "Je sais pas encore 2");
        assertEquals("getOffer getReduction should return '42'", pricingService.getOffer("toto2").getReduction(), 42, 0.001);
        assertEquals("getOffer getReductionType should return 'AMMOUNT'", pricingService.getOffer("toto2").getReductionType().toString(), "AMOUNT");

        pricingService.createOffer("toto4", "Je sais pas encore 4", 0, "PERCENTAGE");
        assertNotNull("getOffer should be not null", pricingService.getOffer("toto4"));
        assertEquals("getOffer getName should return 'toto4'", pricingService.getOffer("toto4").getName(), "toto4");
        assertEquals("getOffer getDescription should return 'Je ne sais pas encore'", pricingService.getOffer("toto4").getDescription(), "Je sais pas encore 4");
        assertEquals("getOffer getReduction should return '0'", pricingService.getOffer("toto4").getReduction(), 0, 0.001);
        assertEquals("getOffer getReductionType should return 'AMMOUNT'", pricingService.getOffer("toto4").getReductionType().toString(), "PERCENTAGE");
    }

    @Test
    public void testCreateOfferCondition() {
        Pricing pricingService = new Pricing();

        pricingService.createOffer("toto1", "Je sais pas encore", 50, "PERCENTAGE");

        pricingService.createOfferCondition("toto1", "totocondition1", "Je ne sais pas non plus", "AND");
        pricingService.createOfferCondition("toto1", "totocondition2", "Je ne sais pas non plus 2", "OR");
        pricingService.createOfferCondition("toto1", "totocondition3", "Je ne sais pas non plus", "NOT");

        assertNotNull("toto1 getOffer should be not null", pricingService.getOffer("toto1"));
        assertNotNull("toto1 getOfferCondition should be not null", pricingService.getImmutableOfferCondition("toto1", "totocondition1"));

        assertEquals("toto1 getOfferConditon totocondition1 getDescription should be 'Je ne sais pas non plus'", pricingService.getImmutableOfferCondition("toto1", "totocondition1").getDescription(), "Je ne sais pas non plus");
        assertEquals("toto1 getOfferConditon totocondition2 getDescription should be 'Je ne sais pas non plus 2'", pricingService.getImmutableOfferCondition("toto1", "totocondition2").getDescription(), "Je ne sais pas non plus 2");

        assertEquals("toto1 getOfferConditon totocondition1 getLogicalOperator should be 'Je ne sais pas non plus'", pricingService.getImmutableOfferCondition("toto1", "totocondition1").getLogicalOperator().toString(), "AND");
        assertEquals("toto1 getOfferConditon totocondition2 getLogicalOperator should be 'Je ne sais pas non plus'", pricingService.getImmutableOfferCondition("toto1", "totocondition2").getLogicalOperator().toString(), "OR");
        assertEquals("toto1 getOfferConditon totocondition3 getLogicalOperator should be 'Je ne sais pas non plus'", pricingService.getImmutableOfferCondition("toto1", "totocondition3").getLogicalOperator().toString(), "NOT");

    }

    @Test
    public void testCreateOfferConditionOperation() {
        Pricing pricingService = new Pricing();

        pricingService.createOffer("toto1", "Je sais pas encore", 50, "PERCENTAGE");
        pricingService.createOfferCondition("toto1", "totocondition1", "Je ne sais pas non plus mdr", "AND");

        pricingService.createOfferConditionOperation("toto1", "totocondition1", "20", "EQUALS", "AND");
        pricingService.createOfferConditionOperation("toto1", "totocondition1", "10", "INFERIOR_OR_EQUALS", "OR");
        pricingService.createOfferConditionOperation("toto1", "totocondition1", "50", "SUPERIOR", "NOT");

        assertNotNull("toto1 getOffer should be not null", pricingService.getOffer("toto1"));
        assertNotNull("toto1 getOfferCondition should be not null", pricingService.getImmutableOfferCondition("toto1", "totocondition1"));
        assertNotNull("toto1 getOfferCondition getOfferConditionOperation should be not null", pricingService.getOfferConditionOperations("toto1", "totocondition1", 0));

        assertEquals("toto1 getOfferCondition getOfferConditionOperation getValue should be '20'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 0).getValue(), "20");
        assertEquals("toto1 getOfferCondition getOfferConditionOperation getValue should be '10'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 1).getValue(), "10");
        assertEquals("toto1 getOfferCondition getOfferConditionOperation getValue should be '50'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 2).getValue(), "50");

        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getLocicalOperator should be 'AND'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 0).getLogicalOperator().toString(), "AND");
        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getLocicalOperator should be 'OR'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 1).getLogicalOperator().toString(), "OR");
        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getLocicalOperator should be 'NOT'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 2).getLogicalOperator().toString(), "NOT");

        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getRelationalOperator should be 'EQUALS'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 0).getRelationalOperator().toString(), "EQUALS");
        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getRelationalOperator should be 'INFERIOR_OR_EQUALS'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 1).getRelationalOperator().toString(), "INFERIOR_OR_EQUALS");
        assertEquals("toto1 getOfferConditon totocondition1 getOfferConditionOperation getRelationalOperator should be 'SUPERIOR'", pricingService.getOfferConditionOperations("toto1", "totocondition1", 2).getRelationalOperator().toString(), "SUPERIOR");
    }
}
