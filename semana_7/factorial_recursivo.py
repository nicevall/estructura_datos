def factorial_recursivo(n):
    if n == 0:
        return 1
    else:
        return n * factorial_recursivo(n - 1)

def factorial_iteracion(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

print("Factorial de 5:", factorial_recursivo(5))  # Debería imprimir 120