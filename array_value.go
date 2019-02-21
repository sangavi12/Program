package main
import "fmt"
func main(){
	var x,min int
	c:=0
	var str,res string
	 j:=0
	fmt.Scanf("%d",&x)
//	fmt.Println()
	s:=make([]string,x)
	for i:=0;i<x;i++{
	 fmt.Scanf("%s",&s[i])
	 //fmt.Println(s[i])
	 if i==0{
		 min=len(s[i])
	 }else if len(s[i])<min{
		 min=len(s[i])
	 }
	 //fmt.Println(min_len)
	}
	//fmt.Println(s)
	//fmt.Print(min)
    for j<min && c==0{
		i:=0
     for i<x && c==0{
		 for k,v:=range(s[i]){
		     //fmt.Println(s[i])
			 if k==j{
				 if i==0{
					 str=string(v)
				 }else if str!=string(v){
                  c=1
                  break
				 }
			 }
			}
			i++
		 }
		 if(c==0){
		     res+=str
		 }
		 j++
	 }
	 fmt.Printf(res)
	}
