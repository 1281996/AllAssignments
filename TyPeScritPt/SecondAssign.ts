interface Shape{
    color:string
 area():number
toString()
}

class Circle implements Shape{
color:string
radius:number
constructor(color:string,radius:number){
    this.color=color
    this.radius=radius
}
area():number{
    return 3.14*this.radius*this.radius
}
toString()
{
    console.log(this.color+" "+this.area())
}
}
var circle=new Circle("blue",12)
circle.area()
circle.toString()




 

class Rectangle implements Shape{

    /* o width - number o height - number */
    color:string
width:number
length:number
constructor(color:string,width:number, length:number){
this.color=color
this.length=length
this.width=width
}
area():number{
    return this.length*this.width
}
toString()
{
    console.log(this.color+" "+this.area())
}

} 
var rectangle=new Rectangle("green",12,13)
rectangle.area()
rectangle.toString()


/* color - string 
• area - method that calculates and returns the area of the shape 
• toString - method that returns the name of the shape as well as its color and area */