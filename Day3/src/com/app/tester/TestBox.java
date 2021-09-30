package com.app.tester;

import java.util.Scanner;
import com.app.core.Box;

class TestBox {
    public static void main(String[] args) {
        //int data = 100;// data : prim type , value, method local var : stack
        // sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Box dims : w h d");
        Box b1;// b1 : ref type var (address) : class type of ref , method local
        // var : stack : bytes will be allocated as per the JVM specification
        // System.out.println(b1);//javac err :
        b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        // display box dims
        System.out.println(b1.getBoxDims());
        // display box volume
        System.out.println("Box volume " + b1.computeVolume());
        Box b2 = b1;// copy of refs
        System.out.println("Box volume " + b2.computeVolume());
        b1 = b2 = null;// 1 object is marked for GC
        // System.out.println("Box volume " + b1.computeVolume());
        System.out.println("Enter side of a cube");
        Box cube = new Box(sc.nextDouble());
        System.out.println(cube.getBoxDims());
        System.out.println("Cube volume " + cube.computeVolume());
        System.out.println("cntd....");
        sc.close();
    }

}
