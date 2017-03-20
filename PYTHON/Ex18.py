Din = int(input())
D = Din

cem = D//100
D = D-(cem*100)
ciq = D//50
D = D-(ciq*50)
vin = D//20
D = D-(vin*20)
dez = D//10
D = D-(dez*10)
cin = D//5
D = D-(cin*5)
dois = D//2
D = D-(dois*2)
um = D//1


print("%i" %(Din))
print("%i de nota(s) de R$ 100,00" % (cem))
print("%i de nota(s) de R$ 50,00" % (ciq))
print("%i de nota(s) de R$ 20,00" % (vin))
print("%i de nota(s) de R$ 10,00" % (dez))
print("%i de nota(s) de R$ 5,00" % (cin))
print("%i de nota(s) de R$ 2,00" % (dois))
print("%i de nota(s) de R$ 1,00" % (um))

