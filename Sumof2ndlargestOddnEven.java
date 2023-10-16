#sum of second largest odd and even sorted value
array =[]
evenArr = []
oddArr = []

n = int(input("Enter the size of array:"))
for i in range (0,n):
     number = int(input("Enter element at {} index:".format(i)))
     array.append(number)
     if i%2 == 0:
         evenArr.append(array[i])
     else:
         oddArr.append(array[i])
         
evenArr = sorted(evenArr)
print("Sorted even array:", evenArr[0:len(evenArr)])
    
oddArr = sorted(oddArr)
print("Sorted odd array:", oddArr[0:len(oddArr)])
    
print("the sum is:", evenArr[-2] + oddArr[-2])
