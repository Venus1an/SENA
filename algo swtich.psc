Algoritmo Operaciones
	Definir opc Como Entero
	Escribir 'MENU'
	Escribir '1.Suma'
	Escribir '2.IML'
	Escribir '3.radio'
	Escribir '4.salir'
	Escribir 'Escoge una opción'
	Leer opc
	Segun opc  Hacer
		1:
			Escribir 'suma'
			Definir a,b,c Como Entero
			Escribir 'ingrese el primer numero'
			Leer a
			Escribir 'ingrese el segundo número'
			Leer b
			c <- (a+b)
			Escribir 'el resultado es: ',c
		2:
			Escribir 'IMC'
			Definir masa,talla,imc Como Real
			Escribir 'digite masa'
			Leer masa
			Escribir 'digite talla'
			Leer talla
			mc <- masa/talla*talla
			Si imc<18.5 Entonces
				Escribir 'Debajo del peso normal'
			SiNo
				Si imc<24.4 Entonces
					Escribir 'Rango normal'
				SiNo
					Si imc<29.9 Entonces
						Escribir 'Preobeso'
					SiNo
						Si imc<34.9 Entonces
							Escribir 'Obeso'
						SiNo
							Escribir 'Obesidad extrema'
						FinSi
					FinSi
				FinSi
			FinSi
		3:
			Escribir "Radio"
			Definir r, c como real
			Escribir "digite circunferencia"
			Leer c
			r <- c/(2*3.1416)
			Escribir "El radio de la circunferencia es: ",r
		4:
	FinSegun
FinAlgoritmo
