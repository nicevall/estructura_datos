import time
import random

# Implementación del algoritmo de búsqueda secuencial
def busqueda_secuencial(arr, x):
    for i in range(len(arr)):
        if arr[i] == x:
            return i
    return -1

# Función para medir el tiempo de ejecución
def medir_tiempo(func, arr, x):
    inicio = time.time()
    func(arr, x)
    fin = time.time()
    return fin - inicio

# Crear arreglos de diferentes tamaños
tamanos = [10, 100, 1000, 10000, 100000, 1000000, 10000000]
resultados = []

# Ejecutar pruebas
for tamano in tamanos:
    arr = [random.randint(0, tamano) for _ in range(tamano)]
    x = random.randint(0, tamano)
    tiempo_ejecucion = medir_tiempo(busqueda_secuencial, arr, x)
    resultados.append((tamano, tiempo_ejecucion))

# Mostrar resultados
print("Resultados del Análisis Empírico de la Búsqueda Secuencial:")
for tamano, tiempo in resultados:
    print(f"Tamaño del arreglo: {tamano}, Tiempo de ejecución: {tiempo:.6f} segundos")
