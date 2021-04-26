package first_groovy

//assert  is used to check LHS=RHS
//if wrong gives an error
//arithmatic
assert 9.intdiv(5) == 1
assert 2.2.plus(1.1) == 3.3
assert 3 / 2 == 1.5
assert 2 ** 3 == 8
assert 10 % 3 == 1

//unary
assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1


def a = 2
def b = a++ * 3

assert a == 3 && b == 6

def c = 3
def d = c-- * 2

assert c == 2 && d == 6
//