A, B = map(float, raw_input().split())

div = B/A

porcentagem = abs((1-div)*100)

print("%.2f%%" % (porcentagem))
