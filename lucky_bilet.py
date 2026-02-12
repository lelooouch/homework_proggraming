num = int(input('Введите номер билета:'))
a = [int(i) for i in str(num)]
if sum(a[:3]) == sum(a[3:]) + 1 or sum(a[:3]) == sum(a[3:]) - 1:
    print('True')
else:
    print('False')
