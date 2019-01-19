"use strict";
exports.__esModule = true;
var list1 = [];
var FourthClass = /** @class */ (function () {
    function FourthClass() {
    }
    FourthClass.prototype.addTask = function (add) {
        list1[list1.length] = add;
        return list1.length;
    };
    FourthClass.prototype.listAllTasks = function () {
        for (var index = 0; index < list1.length; index++) {
            console.log(list1[index]);
        }
    };
    FourthClass.prototype.delteTask = function (remove) {
        for (var index = 0; index < list1.length; index++) {
            if (list1[index] == remove) {
                list1.splice(index, 1);
                return list1.length;
                break;
            }
        }
    };
    return FourthClass;
}());
var obj = new FourthClass();
console.log(obj.addTask("mallika"));
console.log(obj.addTask("rasad"));
console.log(obj.addTask("santhi"));
console.log(obj.addTask("hema"));
console.log(obj.delteTask("hema"));
obj.listAllTasks();
