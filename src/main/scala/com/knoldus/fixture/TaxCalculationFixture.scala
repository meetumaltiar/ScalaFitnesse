package com.knoldus.fixture

import fitlibrary.DoFixture

class TaxCalculationFixture extends DoFixture {

  def theTaxForAnnualIncomeIs(annualIncome: Double, tax: Double): Boolean = {
    val calculatedTax = (annualIncome <= 100000.0) match {
      case true => annualIncome * 0.10
      case false => annualIncome * 0.15
    }
    calculatedTax == tax
  }

}