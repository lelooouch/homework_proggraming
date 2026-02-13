from decimal import Decimal, getcontext
from re import finditer


def check_period(num):
    num1 = (str(num).split('.'))[1]

    for i in range(1, len(num1)):

        pat = fr'({num1[-i:]})+'
        for x in finditer(pat, num1):
            #print(x.group())
            if len(x.group()) > i:
                return str(num).replace(x.group(), f'({str(num)[-i:]})')

    pat = fr'({num1})+'
    for x in finditer(pat, num1):
        # print(x.group())
        if len(x.group()) > len(num1):
            return str(num).replace(x.group(), f'({num})')

    return num


def rational_to_decimal(numerator, denominator, precision=10):

    try:
        numerator = int(numerator)
        denominator = int(denominator)
        precision = int(precision)
    except ValueError:
        return 'Неккоректные данные'

    getcontext().prec = 12
    k = ''
    if numerator * denominator < 0:
        numerator = str(abs(numerator))
        denominator = str(abs(denominator))
        k = '-'



    result = Decimal(numerator) / Decimal(denominator)
    #print(result)
    result = check_period(result)
    getcontext().prec = precision
    return k + str(result)
