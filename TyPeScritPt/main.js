"use strict";
exports.__esModule = true;
var TodoItem = /** @class */ (function () {
    function TodoItem(title) {
        this.title = title;
        this.status = false;
        this.updatedAt = new Date();
    }
    return TodoItem;
}());
exports.TodoItem = TodoItem;
var ToDo1 = /** @class */ (function () {
    function ToDo1() {
        this.list = [];
    }
    ToDo1.prototype.addTask = function (todoItem) {
        /*  this.list[this.list.length]=todoItem */
        this.list.push(todoItem);
        return this.list.length;
    };
    ToDo1.prototype.listAllTasks = function () {
        for (var index = 0; index < this.list.length; index++) {
            console.log(this.list[index]);
        }
    };
    ToDo1.prototype.delteTask = function (remove) {
        for (var index = 0; index < this.list.length; index++) {
            if (this.list[index] == remove) {
                this.list.splice(index, 1);
                return this.list.length;
                break;
            }
        }
    };
    return ToDo1;
}());
exports.ToDo1 = ToDo1;
var todoItem = new TodoItem("hello");
var todoItem1 = new TodoItem("hello1");
var toDo = new ToDo1();
console.log(toDo.addTask(todoItem));
console.log(toDo.addTask(todoItem1));
toDo.listAllTasks();
console.log(toDo.delteTask(todoItem1));
toDo.listAllTasks();
