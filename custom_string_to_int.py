list1 = [0, 1,2,3,4,5,6,7,8,9]
list2 = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

def custom_string_to_int(number_str):

    if type(number_str) is not str or number_str == "":
        raise ValueError('Ошибка')

    number_int = 0
    for i in range(len(number_str)):
        for j in range(10):
            if number_str[i] not in '0123456789-':
                raise ValueError('Ошибка')
            elif number_str[i] == list2[j]:
                number_int += list1[j] * 10 ** (len(number_str) - i - 1)
                break

    if number_str[0] == '-':
        number_int = -1 * number_int

    return number_int

print(custom_string_to_int("123"))  # Вывод: 123
print(custom_string_to_int("-456"))  # Вывод: -456
print(custom_string_to_int("0"))  # Вывод: 0
print(custom_string_to_int("-0"))  # Вывод: 0
print(custom_string_to_int("12a3"))  # Должно вызвать ValueError
print(custom_string_to_int(""))  # Должно вызвать ValueError
