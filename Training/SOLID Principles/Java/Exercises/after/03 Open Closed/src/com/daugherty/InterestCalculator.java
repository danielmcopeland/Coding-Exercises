package com.daugherty;

import java.util.ArrayList;

public class InterestCalculator implements IInterestCalculator {
    private ArrayList<IInterestRule> interestRules;

    public InterestCalculator() {
        this.interestRules = new ArrayList<>();
        this.addRule(new InterestRuleOverMillion());
        this.addRule(new InterestRuleOverHalfMillion()); // New rule added
        this.addRule((new InterestRuleOlderTwentyTen()));
        this.addRule(new InterestRuleDefault());
    }

    @Override
    public void addRule(IInterestRule rule) {
        this.interestRules.add(rule);
    }

    @Override
    public double calculateInterest(int yearOfCreation, double balance) {
        for(int i = 0; i < this.interestRules.size(); i++) {
            IInterestRule currentRule = this.interestRules.get(i);
            if(currentRule.isRuleApplicable(yearOfCreation, balance)) {
                return currentRule.getInterestRate();
            }
        }
        // Default case (no rule matched)
        return 0;
    }
}