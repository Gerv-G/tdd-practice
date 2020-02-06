package com.gervin.tddpractice

import spock.lang.Specification

class DollarTest extends Specification {
    def testMultiplication() {
        given:
            Dollar five = new Dollar(5)

        when:
            Dollar product = five.times(2)
        then:
            product.amount == 10

        when:
            product = five.times(3)
        then:
            product.amount == 15
    }
}
