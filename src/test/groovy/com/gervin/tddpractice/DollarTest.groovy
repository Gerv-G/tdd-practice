package com.gervin.tddpractice

import spock.lang.Specification

class DollarTest extends Specification {
    def testMultiplication() {
        given:
            Dollar five = new Dollar(5)

        expect:
            five.times(2) == new Dollar(10)
            five.times(3) == new Dollar(15)
    }

    def testEquality() {
        expect:
            new Dollar(5) == new Dollar(5)
            new Dollar(5) != new Dollar(6)
    }
}
