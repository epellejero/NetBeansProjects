// Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
// La variable A, debe terminar con el valor de la variable B.
Algoritmo Guia3E15Ej1
	Definir a,b,aux Como Entero
	Escribir "Ingrese el primer número A:"
	Leer a
	Escribir "Ingrese el segundo número B:"
	Leer b
	Intercambio(a,b,aux)
	Escribir "El resultado es " a " para A y " b " para B"
FinAlgoritmo

SubProceso Intercambio(a Por Referencia,b Por Referencia,aux Por Referencia)
	aux=a
	a=b
	b=aux
	Escribir "A " a
	Escribir "B " b
FinSubProceso 