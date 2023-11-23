
//Crear una función con nombre (integracion) que use el método de Simpson para
//calcular el valor aproximado de cualquier función . Se recomienda analizar lo
//siguiente

def integracion(f:Double => Double,a:Double,b:Double): Double = {
  val x:Double = (a + b) / 2
  (b - a) * (f(a) + 4 * f(x) + f(b) ) / 6
}

val f1 =(x:Double) => -Math.pow(x,2) + (8 * x) - 12
integracion(f1,3,5)

val f2 = (x:Double) => 3 * Math.pow(x,2)
integracion(f2,0,2)

val f3 = (x:Double) => (x + 2 * Math.pow(x,2) - Math.pow(x,3) + 5 * Math.pow(x,4))
integracion(f3,-1,1)

val f4 = (x:Double) => (2 * x + 1) / (Math.pow(x,2) + x)
integracion(f4,1,2)

val f5 = (x:Double) => (math.exp(x))
integracion(f5,0,1)

val f6 =(x:Double) => (1) / math.sqrt(x - 1)
integracion(f6,2,3)

val f7 = (x:Double) => 1 / (1 + math.pow(x,2))
integracion(f7,0,1)

def error( valorEsperado:Double,valorObtenido:Double): Double ={
  math.abs(valorEsperado - valorObtenido)
}

error(valorEsperado = 7.33,res0)
error(valorEsperado = 8,res1)
error(valorEsperado =  3.333,res2)
error(valorEsperado = 1.09861,res3)
error(valorEsperado = 1.71828,res4)
error(valorEsperado = 0.828427,res5)
error(valorEsperado = 0.785398,res6)