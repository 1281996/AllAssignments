import { TodoItemInterface } from './FithAssign'

export class TodoItem implements TodoItemInterface{
    title:String
    status:boolean
    updatedAt:Date
    constructor( title:String)
    {
        this.title=title
        this.status=false
       this.updatedAt=new Date()
    }
} 
import { TodoListInterface } from './FithAssign'
export class ToDo1 implements TodoListInterface{

    list:TodoItem[]=[]
    addTask(todoItem:TodoItem):number{
       /*  this.list[this.list.length]=todoItem */
       this.list.push(todoItem)
        return this.list.length
    }
    listAllTasks(): void {
        for(let index=0;index<this.list.length;index++){
            console.log(this.list[index])
    }
}
delteTask(remove: TodoItem): number {
    for(let index=0;index<this.list.length;index++){
        if(this.list[index]==remove){
            this.list.splice(index,1)
            return this.list.length
            break
        }
            }
} 


}
var todoItem=new TodoItem("hello")
var todoItem1=new TodoItem("hello1")
var toDo=new ToDo1()
console.log(toDo.addTask(todoItem))
console.log(toDo.addTask(todoItem1))
toDo.listAllTasks()
console.log(toDo.delteTask(todoItem1))
toDo.listAllTasks()


