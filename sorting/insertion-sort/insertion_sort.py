def insertion_sort(a):
  for i in range(1, len(a)):
    key = a[i]
    j = i - 1
    while j > -1 and a[j + 1] < a[j]:
      a[j + 1] = a[j]
      a[j] = key
      j -= 1
  return 

insertion_sort([5, 2, 3, 4, 1])