package com.mallika.autowire.classes;

public class Traingle {
Point pointA;
Point pointB;

public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public void draw(){
	System.out.println(pointA.getX()+" "+pointB.getY()+" "+pointB.getX()+" "+pointB.getY());
	
}
}
