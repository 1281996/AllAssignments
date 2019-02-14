var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        console.log(this.color + " " + this.area());
    };
    return Circle;
}());
var circle = new Circle("blue", 12);
circle.area();
circle.toString();
var Rectangle = /** @class */ (function () {
    function Rectangle(color, width, length) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    Rectangle.prototype.area = function () {
        return this.length * this.width;
    };
    Rectangle.prototype.toString = function () {
        console.log(this.color + " " + this.area());
    };
    return Rectangle;
}());
var rectangle = new Rectangle("green", 12, 13);
rectangle.area();
rectangle.toString();
/* color - string
• area - method that calculates and returns the area of the shape
• toString - method that returns the name of the shape as well as its color and area */ 
