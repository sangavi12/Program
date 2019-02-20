package main

import (
    "fmt"
    )

func main() {
    j:=0
    count:=0
    var val,val1 int
    var str,str1 string
   fmt.Scanf("%d",&val)
   var arr=make([]string,val)
   for i:=0;i<val;i++{
       fmt.Scanf("%s",&arr[i])
       if i==0{
           val1=len(arr[i])
       }else if len(arr[i])<val{
           val1=len(arr[i])
       }
   }
   for j<val1 && count==0{
       i:=0
       for i<val{
           if(i==0){
               //fmt.Println("hello")
               for k:=0;k<len(arr[i]);k++{
                   if(k==j){
                       str=arr[k]
                       break
                   }
               }
               str=arr[i].charAt(j)
               fmt.Println(str)
           }else if str!=arr[i]{
               count=1
               break
           }
           i++
       } 
       if count==0{
           str1+=str
       }
       j++
   } 
   fmt.Println(str1)
}
