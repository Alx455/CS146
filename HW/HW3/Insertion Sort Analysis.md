Insertion Sort pseudo:

i ← 1                                     # c1
while i < length(A)                       # N
    j ← i
    while j > 0 and A[j-1] > A[j]         # N 
        swap A[j] and A[j-1]              # c3
        j ← j - 1                         # c4
    end while
    i ← i + 1
end while

The function for insertion sort is 