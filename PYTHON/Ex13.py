A, B, C = map(int, input().split())

AB = (A+B+abs(A-B))/2
ABC = (AB+C+abs(AB-C))/2

print("%i eh o maior" % (ABC))
