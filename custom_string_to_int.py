list1 = [1,2,3,4,5,6,7,8,9]
list2 = ['1', '2', '3', '4', '5', '6', '7', '8', '9']

def custom_string_to_int(number_str):

    if type(number_str) is not str or number_str == "":
        raise ValueError('Ошибка')

    number_int = 0
    for i in range(len(number_str)):
        if number_str[i] == '1':
            number_int += 1 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '2':
            number_int += 2 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '3':
            number_int += 3 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '4':
            number_int += 4 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '5':
            number_int += 5 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '6':
            number_int += 6 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '7':
            number_int += 7 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '8':
            number_int += 8 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] == '9':
            number_int += 9 * 10 ** (len(number_str) - i - 1)
        elif number_str[i] != '0' and (number_str[i] != '-' and i != 1):
            raise ValueError('Ошибка')

    if number_str[0] == '-':
        number_int = -1 * number_int

    return number_int

print(custom_string_to_int("123"))  # Вывод: 123
print(custom_string_to_int("-456"))  # Вывод: -456
print(custom_string_to_int("0"))  # Вывод: 0
print(custom_string_to_int("-0"))  # Вывод: 0
print(custom_string_to_int("12a3"))  # Должно вызвать ValueError
print(custom_string_to_int(""))  # Должно вызвать ValueError
