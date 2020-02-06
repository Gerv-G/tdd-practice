package com.gervin.tddpractice

import spock.lang.Specification

class DollarTest extends Specification {
    def testMultiplication() {
        given:
            Dollar five = new Dollar(5)

        expect:
            five.times(2).amount == 10
            five.times(3).amount == 15
    }

    def testEquality() {
        expect:
            new Dollar(5) == new Dollar(5)
            new Dollar(5) != new Dollar(6)
    }
}
