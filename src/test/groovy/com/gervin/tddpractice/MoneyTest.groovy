package com.gervin.tddpractice

import spock.lang.Specification

class MoneyTest extends Specification {
    def testEquality() {
        expect:
            Money.dollar(5) != Money.franc(5)
    }
}
