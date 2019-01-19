var list1 = [];
var ArrayList = /** @class */ (function () {
    function ArrayList() {
    }
    ArrayList.prototype.add = function (adding) {
        list1[list1.length] = adding;
    };
    ArrayList.prototype.dis = function () {
        for (var index = 0; index < list1.length; index++) {
            console.log(list1[index]);
        }
    };
    ArrayList.prototype["delete"] = function (del) {
        for (var index = 0; index < list1.length; index++) {
            if (list1[index] == del) {
                list1.splice(index, 1);
                break;
            }
        }
    };
    ArrayList.prototype.addAtSpecificpostion = function (index1, index2, add) {
        list1.splice(index1, index2, add);
    };
    ArrayList.prototype.replace = function (index1, index2, add) {
        list1.splice(index1, index2, add);
    };
    return ArrayList;
}());
var obj = new ArrayList();
obj.add("mallika");
obj.add("hema");
obj.add("sai");
obj.add("saru");
console.log("----------------------------");
obj.dis();
console.log("----------------------------");
obj["delete"]("hema");
obj.dis();
console.log("----------------------------");
obj.addAtSpecificpostion(2, 0, "chandhna");
obj.dis();
console.log("----------------------------");
console.log(list1.length);
console.log("----------------------------");
obj.replace(1, 1, "mallika");
obj.dis();
