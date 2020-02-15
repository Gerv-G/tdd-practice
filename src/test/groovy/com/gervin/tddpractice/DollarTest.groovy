package com.gervin.tddpractice

import spock.lang.Specification

class DollarTest extends Specification {
    def testMultiplication() {
        given:
            Money five = Money.dollar(5)

        expect:
            five.times(2) == Money.dollar(10)
            five.times(3) == Money.dollar(15)
    }

    def testEquality() {
        expect:
            Money.dollar(5) == Money.dollar(5)
            Money.dollar(5) != Money.dollar(6)
    }
}
