#calcula la suma de los elementos pares y encuentra el valor mínimo de los elementos impares en una lista:
def calcular_suma_pares_y_minimo_impares(lista):
    pares = []
    impares = []
    for num in lista:
        if num % 2 == 0:
            pares.append(num)
        else:
            impares.append(num)

    suma_pares = 0
    for num in pares:
        suma_pares += num

    if impares:
        minimo_impar = impares[0]
        for num in impares:
            if num < minimo_impar:
                minimo_impar = num
    else:
        minimo_impar = None

    return suma_pares, minimo_impar

# Lista de ejemplo
lista = [3, 5, 2, 8, 1, 4, 7, 10]
suma_pares, minimo_impar = calcular_suma_pares_y_minimo_impares(lista)
print(f"Suma de los pares: {suma_pares}")
print(f"Mínimo de los impares: {minimo_impar}")