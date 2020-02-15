package com.gervin.tddpractice

import spock.lang.Specification

class CurrencyTest extends Specification {
    def testCurrency() {
        expect:
            Money.dollar(1).currency() == "USD"
            Money.franc(1).currency() == "CHF"
    }
}
