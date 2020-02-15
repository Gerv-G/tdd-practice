package com.gervin.tddpractice

import spock.lang.Specification

class MoneyTest extends Specification {
    def testEquality() {
        expect:
            new Dollar(5) != new Franc(5)
    }
}
