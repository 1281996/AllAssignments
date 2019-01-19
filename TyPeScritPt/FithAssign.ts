

import { TodoItem } from './main'
export interface TodoItemInterface{
    title:String
    status:boolean
    updatedAt:Date
    //toggleStatus();

    
}

export interface TodoListInterface{
    list:TodoItem[]; 
    addTask(todoItem:TodoItem):number
    listAllTasks():void
    delteTask(remove: TodoItem): number

}

