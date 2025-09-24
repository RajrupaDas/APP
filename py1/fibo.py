def fibonacci(n):
    if n <= 0:
        return []
    elif n == 1:
        return [0]
    else:
        list = [0, 1]
        while len(list) < n:
            next_fib = list[-1] + list[-2]
            list.append(next_fib)
        return list

print(fibonacci(10))
