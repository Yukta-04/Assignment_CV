// B. Perform sorting of an array in descending order.

function sortArray(arr){
    var i=0;
    while(i<arr.length){
        j=i+1;
        while(j<arr.length){
            if(arr[i]<arr[j]){
                var temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        i++;
    }
    return arr
}

var arr=[2,1,8,10,15];
var ans=sortArray(arr);
console.log(ans);
