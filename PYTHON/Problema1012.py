A, B, C =  map(float, input().split())

tri = (A*C)/2
cir = 3.14159*C**2
tra = ((A+B)*C)/2
qua = B**2
ret = A*B

print("TRIANGULO = %.3f" % (tri))
print("CIRCULO = %.3f" % (cir))
print("TRAPEZIO = %.3f" % (tra))
print("QUADRADO = %.3f" % (qua))
print("RETANGULO = %.3f" % (ret))
