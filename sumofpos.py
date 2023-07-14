#calculate the sum of odd numbers and even numbers
def calculateODdeve(arr):
    sumeve=0
    sumodd=0
    for i in range(0,len(arr)):

        if arr[i]%2==0:
            sumeve=sumeve+arr[i]
        else:
            sumodd=sumodd+arr[i]
    return (sumeve,sumodd)



arr=[2,4,6,7,-1,3,6]
print(calculateODdeve(arr))
