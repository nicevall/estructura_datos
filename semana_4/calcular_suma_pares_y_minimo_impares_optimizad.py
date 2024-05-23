def calcular_suma_pares_y_minimo_impares_optimizado(lista):
    suma_pares = 0
    minimo_impar = float('inf')  # Inicializar con el mayor valor posible

    for num in lista:
        if num % 2 == 0:
            suma_pares += num
        else:
            if num < minimo_impar:
                minimo_impar = num

    # Verificar si se encontró algún número impar
    if minimo_impar == float('inf'):
        minimo_impar = None

    return suma_pares, minimo_impar

# Lista de ejemplo
lista = [3, 5, 2, 8, 1, 4, 7, 10]
suma_pares, minimo_impar = calcular_suma_pares_y_minimo_impares_optimizado(lista)
print(f"Suma de los pares: {suma_pares}")
print(f"Mínimo de los impares: {minimo_impar}")
