package Team4Pro;

import Team4Pro.bankingPages.AgentNearBy;
import Team4Pro.claimsPages.ClaimHelp;
import Team4Pro.claimsPages.Contractor;
import Team4Pro.homePage.Claims;
import Team4Pro.insurancePages.BusinessInsuranceClaim;
import base.OurAPI;
import org.testng.annotations.Test;


public class ClaimHelpTest extends OurAPI {

    @Test
    public void autoHelpTest(){
        Claims claims = new Claims(driver);
        ClaimHelp claimHelp = new ClaimHelp(driver);

        claims.setClaimsHeaderInHomePage();
        claims.setClaimsSubTitle_claimHelp();
        claimHelp.setAuto();
        scrollToView(claimHelp.seeStepsForHelp);
        claimHelp.setSeeStepsForHelp();
        claimHelp.setNextStep();
        claimHelp.setPreviousStep();

    }

    @Test
    public void homeHelp(){
        Claims claims = new Claims(driver);
        ClaimHelp claimHelp = new ClaimHelp(driver);
        Contractor contractor = new Contractor(driver);

        claims.setClaimsHeaderInHomePage();
        claims.setClaimsSubTitle_claimHelp();
        claimHelp.setHomeAndProperty();
        waitSeconds(3);
        scrollToView(claimHelp.HomeAndProperty);
        claimHelp.setRepairContractor();
        scrollToView(contractor.findContractorButton);
        contractor.setFindContractorButton();
        waitSeconds(4);
        contractor.setAgreeButton();
        contractor.setSubmitButtonForContractor();

    }

    @Test
    public void healthTest(){
        Claims claims = new Claims(driver);
        ClaimHelp claimHelp = new ClaimHelp(driver);

        claims.setClaimsHeaderInHomePage();
        claims.setClaimsSubTitle_claimHelp();
        claimHelp.setHealthAndLife();
        scrollToView(claimHelp.reportFraud);
        claimHelp.setReportFraud();

    }

    @Test
    public void businessHelpTest(){
        Claims claims = new Claims(driver);
        ClaimHelp claimHelp = new ClaimHelp(driver);
        BusinessInsuranceClaim businessInsuranceClaim = new BusinessInsuranceClaim(driver);
        AgentNearBy agentNearBy = new AgentNearBy(driver);

        claims.setClaimsHeaderInHomePage();
        claims.setClaimsSubTitle_claimHelp();
        claimHelp.setBusinessInsurance();
        claimHelp.setFillingBusinessClaim();
        businessInsuranceClaim.setContactAgent();
        agentNearBy.setZipcodeToFindAgent("11214");
        waitSeconds(4);
        scrollToView(agentNearBy.sammyMartinezDirection);
        waitSeconds(5);
        agentNearBy.setSammyMartinezDirection();

    }

    @Test
    public void liabilityTest(){
        Claims claims = new Claims(driver);
        ClaimHelp claimHelp = new ClaimHelp(driver);

        claims.setClaimsHeaderInHomePage();
        claims.setClaimsSubTitle_claimHelp();
        claimHelp.setLiability();
        scrollToView(claimHelp.claimAgainstYou);
        claimHelp.setClaimAgainstYou();
    }


}
