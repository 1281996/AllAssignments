import { TodoInterface } from './FourthAssign'

class FourthClass implements TodoInterface{
    list1:string[]=[]


    addTask(add: string): number {
       this.list1[this.list1.length]=add
       return this.list1.length
    }   
    
    listAllTasks(): void {
        for(let index=0;index<this.list1.length;index++){
            console.log(this.list1[index])
    }
}



    delteTask(remove: string): number {
        for(let index=0;index<this.list1.length;index++){
            if(this.list1[index]==remove){
                this.list1.splice(index,1)
                return this.list1.length
                break
            }
                }
    }
  


}

var obj=new FourthClass()
console.log(obj.addTask("mallika"))

console.log(obj.addTask("rasad"))
console.log(obj.addTask("santhi"))
console.log(obj.addTask("hema") )
console.log(obj.delteTask("hema"))
obj.listAllTasks();