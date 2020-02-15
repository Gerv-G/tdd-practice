package com.gervin.tddpractice

import spock.lang.Specification

class FrancTest extends Specification {
    def testFrancMultiplication() {
        given:
            Money five = Money.franc(5)

        expect:
            five.times(2) == Money.franc(10)
            five.times(3) == Money.franc(15)
    }

    def testEquality() {
        expect:
            Money.franc(5) == Money.franc(5)
            Money.franc(5) != Money.franc(6)
    }
}
