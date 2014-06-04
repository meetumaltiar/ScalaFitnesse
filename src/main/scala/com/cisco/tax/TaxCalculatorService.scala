package com.cisco.tax

class TaxCalculatorService {

  /**
   * If Annual Income is more than 100,000 tax is 15%. If Annual Income is less than equal to 100,000 tax is 10%
   */
  def getTaxForAnnualIncome(annualIncome: Double): Double = (annualIncome <= 100000.0) match {
    case true => annualIncome * 0.10
    case false => annualIncome * 0.15
  }
}