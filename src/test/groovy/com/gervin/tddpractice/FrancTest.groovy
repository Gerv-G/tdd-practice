package com.gervin.tddpractice

import spock.lang.Specification

class FrancTest extends Specification {
    def testFrancMultiplication() {
        given:
            Franc five = new Franc(5)

        expect:
            five.times(2) == new Franc(10)
            five.times(3) == new Franc(15)
    }
}
