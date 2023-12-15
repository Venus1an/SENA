Algoritmo IMC
		Definir masa, estatura, mc Como Real;
		Escribir 'ingresar masa'
		Leer masa
		Escribir 'ingresar estatura'
		Leer estatura
		mc <- masa /(estatura*estatura)
		Si mc < 18.5 Entonces
			Escribir 'necesita aumentar mc'
		SiNo
			Si  mc < 24.4 Entonces
				Escribir 'rango normal'
			SiNo
				Si mc < 29.9 Entonces
					Escribir 'preobesidad'
				SiNo
					Si mc < 34.9 Entonces
						Escribir 'obeso'
					SiNo
						Escribir 'gordura grave'
					FinSi
				FinSi
			FinSi
		FinSi
FinAlgoritmo
