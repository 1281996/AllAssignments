var list1:string[]=[]
class ArrayList{
   
    add(adding:string):void{
       list1[list1.length]=adding
    }
 dis():void{

for(let index=0;index<list1.length;index++){
console.log(list1[index])
}
 

}
delete(del:string):void{


    for(let index=0;index<list1.length;index++){
    if(list1[index]==del){
        list1.splice(index,1)
        break
    }
        }
 
}
addAtSpecificpostion(index1:number,index2:number,add:string):void{

    list1.splice(index1,index2,add)

}
replace(index1:number,index2:number,add:string):void{
list1.splice(index1,index2,add)
}
}
var obj=new ArrayList()
obj.add("mallika")
obj.add("hema")
obj.add("sai")
obj.add("saru")
console.log("----------------------------")
obj.dis()
console.log("----------------------------")
obj.delete("hema")
obj.dis()
console.log("----------------------------")
obj.addAtSpecificpostion(2,0,"chandhna")
obj.dis()
console.log("----------------------------")
console.log(list1.length)
console.log("----------------------------")
obj.replace(1,1,"mallika")
obj.dis()