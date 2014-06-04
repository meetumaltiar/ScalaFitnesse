package com.cisco.fixture

import fitlibrary.DoFixture
import com.cisco.tax.TaxCalculatorService

/**
 * A Fixture acts as a bridge between Wiki Tests and System Under Test
 */
class TaxCalculationFixture extends DoFixture {
  /**
   * TaxCalculatorService is the System Under Test 
   */
  val taxCalculatorService = new TaxCalculatorService

  def theTaxForAnnualIncomeIs(annualIncome: Double, tax: Double) = taxCalculatorService.getTaxForAnnualIncome(annualIncome) == tax
}