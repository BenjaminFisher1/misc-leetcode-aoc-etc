
# return masked string
def maskify(cc):
    cut = len(cc) - 4
    if cut < 0:
        return cc
    return '#' * cut + cc[cut:cut+4]

    
    