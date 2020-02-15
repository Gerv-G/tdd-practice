package com.gervin.tddpractice

import spock.lang.Specification

class MoneyTest extends Specification {
    def testEquality() {
        expect:
            Money.dollar(5) != Money.franc(5)
    }

    def testDifferentClassEquality() {
        expect:
            new Money(10, "CHF").equals(new Franc(10, "CHF"))
            new Money(10, "USD").equals(new Franc(10, "USD"))
    }
}
