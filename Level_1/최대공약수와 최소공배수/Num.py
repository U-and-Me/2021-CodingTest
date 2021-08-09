def gcd(x, y) :
    while y > 0 :
        x, y = y, x % y
    return x
    
def solution(n, m):
    
    gcd_num = gcd(n, m)
    lcm_num = (n * m) / gcd_num        
    
    return [gcd_num, lcm_num]
