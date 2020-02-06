package com.gervin.tddpractice

import spock.lang.Specification

class DollarTest extends Specification {
    def testMultiplication() {
        Dollar five = new Dollar(5)
        five.times(2)

        expect:
            five.amount == 10
    }
}
